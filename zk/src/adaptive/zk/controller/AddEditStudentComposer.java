package adaptive.zk.controller;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zul.Datebox;
import org.zkoss.zul.Listbox;
import org.zkoss.zul.Listitem;
import org.zkoss.zul.Textbox;
import org.zkoss.zul.Window;
import org.zkoss.zul.Messagebox;

import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;

import adaptive.zk.domain.Student;
import adaptive.zk.service.StudentService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.zkoss.zk.ui.select.annotation.WireVariable;

public class AddEditStudentComposer extends SelectorComposer<Component> {

	
	StudentService studentServices = new StudentService();
	
	@Wire
    Window modalAddEditStudent;
    
    @Wire
    private Textbox txtAddEditStudentCode;
    @Wire
    private Textbox txtAddEditStudentName;
    @Wire
    private Listbox cmbGender;
    @Wire
    private Datebox dtBirthDate;
    @Wire
    private Textbox txtAddEditBirthPlace;
    @Wire
    private Textbox txtAddEditAddress;
    @Wire
    private Listbox cmbActiveFlag;
    
    private String mode;
    
    private Student selected;
    
    @WireVariable("arg")
    private Map<String, Object> arg;
	
    public void doAfterCompose(Component comp) throws Exception
    {
        super.doAfterCompose(comp);
        
        selected = (Student) arg.get("student");
        if(selected!=null)
        {
        	loadStudent();
        }
    }
	
    @Listen("onClick = #saveButton")
    public void save(){
   	
		Student student = new Student();
		student.setStudentNo(txtAddEditStudentCode.getValue());
		student.setStudentName(txtAddEditStudentName.getValue());
		student.setGender(cmbGender.getSelectedItem().getValue().toString());
		student.setAddress(txtAddEditAddress.getValue());
		student.setBirthPlace(txtAddEditBirthPlace.getValue());
		student.setBirthDate(dtBirthDate.getValue());
		student.setAddress(txtAddEditAddress.getValue());
		student.setActiveFlag(cmbActiveFlag.getSelectedItem().getValue().toString());
		
		Student newStudent = 
				(Student)studentServices.findByUk(txtAddEditStudentCode.getValue());
		
		if(newStudent == null)
		{
			studentServices.insert(student);
		}
		else
		{
			studentServices.update(student);
		}
		
		Messagebox.show("Data Has been save");
		Executions.createComponents("Student.zul", modalAddEditStudent, null);
		getSelf().detach(); 
   }

    @Listen("onClick = #cancelButton")
    public void back()
    {
		modalAddEditStudent.detach();
    }
    
    private void loadStudent() {
		selected = (Student) arg.get("student");
		if(selected != null) {
			txtAddEditStudentCode.setValue(selected.getStudentNo());
			txtAddEditStudentCode.setReadonly(true);
			txtAddEditStudentName.setValue(selected.getStudentName());
		
			for(int i=1;i< cmbGender.getItemCount();i++){
				Listitem val = (Listitem)cmbGender.getItems().get(i);
				
				if(val.getValue().toString().equals(selected.getGender())){
					cmbGender.setSelectedIndex(i);
				}
				
			}
			
			txtAddEditAddress.setValue(selected.getAddress());
			txtAddEditBirthPlace.setValue(selected.getBirthPlace());
			dtBirthDate.setValue(selected.getBirthDate());
			
			for(int j=0; j< cmbActiveFlag.getItemCount();j++){
				Listitem val1 = (Listitem)cmbActiveFlag.getItems().get(j);
				
				if(val1.getValue().toString().equals(selected.getActiveFlag())){
					cmbActiveFlag.setSelectedIndex(j);
				}
				
			}
		}
	}

}