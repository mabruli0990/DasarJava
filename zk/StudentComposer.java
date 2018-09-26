package adaptive_zk.controller;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.Execution;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zk.ui.select.annotation.WireVariable;

import org.zkoss.zul.Textbox;
import adaptive_zk.domain.Student;
import adaptive_zk.service.StudentService;

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

public class StudentComposer extends SelectorComposer<Component>
{
	StudentService studentServices = new StudentService();
	
	@Wire
	private Textbox txtSearchStudentNo;
	
	@Wire
	private Textbox txtSearchStudentName;
	
	@Wire
	private Listbox studentListbox;
	
	@Wire
	private List studentList;
	
	@Wire
	Window modalAddEditStudent;
	
	private Student selected;
	
	@WireVariable("arg")
	private Map<String, Object> arg;
	
	@Override
	public void doAfterCompose (Component comp) throws Exception
	{
		super.doAfterCompose(comp);
		search();
		
		String selected = (String) arg.get("search");
		if(selected != null)
		{
			search();
		}
	}
	
	@Listen("onClick = #searchButton")
	public void search()
	{
		Student student = new Student();
		student.setStudentNo(txtSearchStudentNo.getValue());
		student.setStudentName(txtSearchStudentName.getValue());
		List<Student> result = studentServices.searchCriteria(student);
		
		studentListbox.setModel(new ListModelList<Student> (result));
	}
	
	@Listen("onClick = #clearButton")
	public void clear()
	{
		txtSearchStudentNo.setText("");
		txtSearchStudentName.setText("");
	}
	
	@Listen("onclick = #addButton")
	public void addButton(){
		Map<String,Object> param = new HashMap<String,Object>();
		param.put("add", false);
		Window win = (Window)Executions.createComponents("addEditStudent.zul",
				getSelf().getParent(), param);
		win.doModal();
	}
	
	@Listen("onDelete = #WinStudent")
	public void onDelete (ForwardEvent event)
	{
		final Student student = (Student) event.getData();
		Messagebox.show("Are you sure to delete ?", "confirmation",
				Messagebox.YES | Messagebox.NO, null,
				new SerializableEventListener<Event>(){
			
			private static final long serialVersionUID = 1L;
		
		public void onEvent(Event event) throws Exception
		{
			int resultButton = (int) event.getData();
			if(resultButton == Messagebox.YES)
			{
				try
				{
					StudentService studentService = new StudentService();
					studentService.delete(student.getStudentNo());
					alert("Prosess Delete successfully");
					
					search();
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		}
		});
	}
	
	@Listen("onEdit = #winStudent")
	public void onEdit(ForwardEvent event)
	{
		Student studentNo = (Student) event.getData();
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("StudentNo", studentNo);
		Window win = (Window)Executions.createComponents("addEditStudent.zul", getSelf(), param);
		win.doModal();
	}
}


