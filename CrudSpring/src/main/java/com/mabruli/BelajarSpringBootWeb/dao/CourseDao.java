package com.mabruli.BelajarSpringBootWeb.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mabruli.BelajarSpringBootWeb.model.Course;
import com.mabruli.BelajarSpringBootWeb.service.CourseService;

@Service
public class CourseDao implements CourseService {
	
	@Autowired
	private EntityManagerFactory emf;

	@Override
	public List<Course> listCourse() {
		// TODO Auto-generated method stub
		EntityManager em = emf.createEntityManager();
		return em.createQuery("from Course ", Course.class ).getResultList();
		
	}

	@Override
	public Course addOrUpdate(Course course) {
		// TODO Auto-generated method stub
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Course add = em.merge(course);
		em.getTransaction().commit();
		return add;
	}

	@Override
	public Course getCourseCode(String courseCode) {
		// TODO Auto-generated method stub
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Course course = em.find(Course.class, courseCode);
		em.getTransaction().commit();
		return course;
	}

	@Override
	public void removeCourse(String courseCode) {
		// TODO Auto-generated method stub
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.remove(em.find(Course.class, courseCode));
		em.getTransaction().commit();
		
	}

}
