package edu.adaptive.database.dao;

import java.util.List;
import edu.adaptive.database.model.Course;

public interface CourseDAO {
	void insert (Course course);
	void update (Course course);
	void delete (String courseCode);
	Course findById (String courseCode);
	Course findByUk (String courseCode);
	Long getNextCourseId();
	List<Course> search();
}