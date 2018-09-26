package edu.adaptive.database.client;

import edu.adaptive.database.model.Course;
import edu.adaptive.database.services.CourseService;
import edu.adaptive.database.services.CourseServiceTmpl;

import java.util.Scanner;

public class CourseInsert {
	
	public void Insert()
	{
		Scanner scan = new Scanner(System.in);
		String strInput = "";
		Course course = new Course();
		CourseService courseService = new CourseServiceTmpl();
		
		System.out.println("Kode mata kuliah : ");
		strInput = scan.nextLine();
		course.setCourseCode(strInput);
		
		System.out.println("Nama mata kuliah : ");
		strInput = scan.nextLine();
		course.setCourseName(strInput);
		
		System.out.println("Aktif [Y / N] : ");
		strInput = scan.nextLine();
		course.setActiveFlag(strInput);
		course.setCreateBy("Admin");
		
		courseService.insert(course);
		System.out.println("Data mata Kuliah " + course.getCourseCode() + " Berhasil Disimpan !");
	}
}