package com.mabruli.BelajarSpringBootWeb.service;

import java.util.List;

import com.mabruli.BelajarSpringBootWeb.model.Student;

public interface StudentService {
	
	List<Student> listStudent();
	
	Student addEditStudent(Student student);
	
	Student getStudentNo(String studentNo);
	
	void removeStudent(String studentNo);

}
