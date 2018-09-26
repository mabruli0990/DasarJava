package edu.adaptive.database.services;

import java.util.List;
import edu.adaptive.database.model.Course;
public interface CourseService {
	
	void insert (Course course);
	void update (Course course);
	void delete (String courseCode);
	Course findById(String courseCode);
	Course findByUk (String courseCode);
	List<Course> search();
}
