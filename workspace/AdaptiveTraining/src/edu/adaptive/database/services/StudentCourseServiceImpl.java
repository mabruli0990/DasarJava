package edu.adaptive.database.services;

import java.util.List;

import edu.adaptive.database.model.Course;
import edu.adaptive.database.model.StudentCourse;

import java.sql.Timestamp;
import java.util.List;


import edu.adaptive.database.dao.StudentCourseDAO;
import edu.adaptive.database.dao.StudentCourseDAOImpl;


public class StudentCourseServiceImpl implements  StudentCourseService{
	
	private StudentCourseDAO studentCourseDAO = new StudentCourseDAOImpl();

	
	public void insert(StudentCourse studentCourse) {
		// TODO Auto-generated method stub
		
		studentCourseDAO.insert(studentCourse);
		
	}

	@Override
	public void update(StudentCourse studentCourse) {
		// TODO Auto-generated method stub
		StudentCourse courseOri = null;
		
		courseOri = studentCourseDAO.findById(studentCourse.getStudentNo(), studentCourse.getCourseCode(), studentCourse.getSemester());
		
		courseOri.setResult(studentCourse.getResult());
		courseOri.setUpdateBy(studentCourse.getUpdateBy());
		courseOri.setUpdateOn(new Timestamp(System.currentTimeMillis()));
		studentCourseDAO.update(courseOri);
		
	}

	
	public void delete(String studentNo, String courseCode, String semester) {
		// TODO Auto-generated method stub
		studentCourseDAO.delete(studentNo, courseCode, semester);
		
	}

	@Override
	public StudentCourse findById(String studentNo, String courseCode, String semester) {
		// TODO Auto-generated method stub
		
		return studentCourseDAO.findById(studentNo, courseCode, semester);
	}

	@Override
	public StudentCourse findByUk(String studentNo, String courseCode, String semester) {
		// TODO Auto-generated method stub
		return studentCourseDAO.findByUk(studentNo, courseCode,  semester);
	}

	@Override
	public Long getNextCourseId() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public List<StudentCourse> search() {
		// TODO Auto-generated method stub
		return studentCourseDAO.search();
	}
	

}
