package com.mabruli.BelajarSpringBootWeb.service;

import java.util.List;

import com.mabruli.BelajarSpringBootWeb.model.Course;

public interface CourseService {
	
	List<Course> listCourse();
	
	Course addOrUpdate(Course course);
	
	Course getCourseCode(String courseCode);
	
	void removeCourse(String courseCode);

}
