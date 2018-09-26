package edu.adaptive.database.dao;

import java.util.List;

import edu.adaptive.database.model.Student;

public interface StudentDAO {
	void insert (Student student);
	void update (Student student);
	void delete (String studentNo);
	Student findById (String studentNo);
	Student findByUk (String studentNo);
	Long getNextCourseId();
	List<Student> search();
}
