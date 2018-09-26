package edu.adaptive.database.service;

import java.sql.Timestamp;
import java.util.List;

import edu.adaptive.database.dao.CourseDAO;
import edu.adaptive.database.dao.CourseDAOImpl;

import edu.adaptive.database.model.Course;

public class CourseServiceImpl implements CourseService{
	
	private CourseDAO courseDAO = new CourseDAOImpl();
	
	
	public void insert(Course course) {
		// TODO Auto-generated method stub
		course.setCreateOn(new Timestamp(System.currentTimeMillis()));
		courseDAO.insert(course);
	}

	
	public void update(Course course) {
		// TODO Auto-generated method stub
		Course courseOri = null;
		
		courseOri = courseDAO.findById(course.getCourseCode());
		courseOri.setCourseName(course.getCourseName());
		courseOri.setActiveFlag(course.getActiveFlag());
		courseOri.setUpdateBy(course.getUpdateBy());
		courseOri.setUpdateOn(new Timestamp(System.currentTimeMillis()));
		courseDAO.update(courseOri);
		
		
	}

	
	public void delete(String courseCode) {
		// TODO Auto-generated method stub
		courseDAO.delete(courseCode);
	}

	
	public Course findById(String courseCode) {
		// TODO Auto-generated method stub
		return courseDAO.findById(courseCode);
	}

	
	public Course findByUk(String courseCode) {
		// TODO Auto-generated method stub
		return courseDAO.findByUk(courseCode);
	}

	
	public List<Course> search() {
		// TODO Auto-generated method stub
		return courseDAO.search();
	}

}