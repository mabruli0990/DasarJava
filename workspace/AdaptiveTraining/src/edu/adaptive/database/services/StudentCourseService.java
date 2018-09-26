package edu.adaptive.database.services;

import java.util.List;

import edu.adaptive.database.model.StudentCourse;

public interface StudentCourseService {
	void insert (StudentCourse studentCourse);
	void update (StudentCourse studentCourse);
	void delete (String studentNo, String courseCode, String semester);
	StudentCourse findById (String studentNo, String courseCode, String semester);
	StudentCourse findByUk (String studentNo, String courseCode, String semester);
	Long getNextCourseId();
	List<StudentCourse> search();
}