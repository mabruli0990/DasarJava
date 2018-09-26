package com.mabruli.BelajarSpringBootWeb.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mabruli.BelajarSpringBootWeb.model.Student;
import com.mabruli.BelajarSpringBootWeb.service.StudentService;

@Service
public class StudentDao implements StudentService {

	@Autowired
	private EntityManagerFactory emf;

	@Override
	public List<Student> listStudent() {

		EntityManager em = emf.createEntityManager();
		return em.createQuery("from Student", Student.class).getResultList();

	}

	@Override
	public Student addEditStudent(Student student) {
		// TODO Auto-generated method stub
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Student saved = em.merge(student);
		em.getTransaction().commit();
		return saved;
	}

	@Override
	public Student getStudentNo(String studentNo) {
		// TODO Auto-generated method stub
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Student edit = em.find(Student.class, studentNo);
		em.getTransaction().commit();
		return edit;
	}

	@Override
	public void removeStudent(String studentNo) {
		// TODO Auto-generated method stub
		
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Student st = em.find(Student.class, studentNo);
		em.remove(st);
		em.getTransaction().commit();
	}



}
