package adaptive.zk.controller;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zk.ui.select.annotation.WireVariable;

import org.zkoss.zul.Textbox;
import adaptive.zk.domain.Student;
import adaptive.zk.service.StudentService;

import org.zkoss.zul.ListModelList;
import org.zkoss.zul.Listbox;
import org.zkoss.zul.Listitem;

import java.util.HashMap;
import java.util.List;

import java.util.Map;
import org.zkoss.zul.Window;

import org.zkoss.zk.ui.event.ForwardEvent;
import org.zkoss.zul.Messagebox;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.event.SerializableEventListener;


public class StudentComposer extends SelectorComposer<Component> {

	StudentService studentServices = new StudentService();
	 
	@Wire
    private Textbox txtSearchStudentCode;

	@Wire
    private Textbox txtSearchStudentName;
	
	@Wire
    private Listbox studentListbox;
	
	@Wire
    private List studentsList;
	
	@Wire
    Window modalAddEditStudent;
	
	private Student selected;
	
	
	@Override
    public void doAfterCompose(Component comp) throws Exception
    {
        super.doAfterCompose(comp);
        
    }
	
	@Listen("onClick = #searchButton")
    public void search(){
    	Student student= new Student();
    	student.setStudentNo(txtSearchStudentCode.getValue());
    	student.setStudentName(txtSearchStudentName.getValue());
        List<Student> result = studentServices.searchCriteria(student);
        
        studentListbox.setModel(new ListModelList<Student>(result));
    }
	
	@Listen("onClick = #clearButton")
    public void clear()
    {
		txtSearchStudentCode.setText("");
		txtSearchStudentName.setText("");
		search();
    }
	
	@Listen("onClick= #addButton")
   	public void addButton(){
   		Window win = (Window)Executions.createComponents("AddEditStudent.zul", 
   				getSelf().getParent(), null);
   		win.doModal();
	}
	
	@Listen("onDelete= #winStudent")
	public void onDelete(ForwardEvent event){
		final Student student = (Student) event.getData();
		Messagebox.show("Are you sure want to delete this data?", "Confirmation", 
				Messagebox.YES | Messagebox.NO, null, 
				new SerializableEventListener<Event>() {

			public void onEvent(Event event) throws Exception {
				int resultButton = (int) event.getData();
				
				if(resultButton == Messagebox.YES) {
					try {
						StudentService studentService= new StudentService();
						studentService.delete(student.getStudentNo());
				        alert("Prossess Delete successfully");
						
						search();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
	}
	
	@Listen("onEdit= #winStudent")
	public void onEdit(ForwardEvent event){
		Student student = (Student) event.getData();
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("student", student);
		Window win = (Window)Executions.createComponents("AddEditStudent.zul", 
				getSelf().getParent(), param);
		win.doModal();
	}

}