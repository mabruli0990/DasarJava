package adaptive.zk.dao;

import java.util.List;

import adaptive.zk.domain.Student;

public interface StudentMapper {

	void insert(Student student);
	Student findByUk(String studentCode);
	List<Student> searchCriteria(Student student);
	void update(Student student);
	void delete(String studentNo);
}