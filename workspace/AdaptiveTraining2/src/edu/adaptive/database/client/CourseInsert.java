package edu.adaptive.database.client;

import java.util.Scanner;

import edu.adaptive.database.service.*;

import edu.adaptive.database.model.Course;

public class CourseInsert {
	public void Insert()
	{
		Scanner scan = new Scanner(System.in);
		String strInput = null;
		Course course = new Course();
		CourseService courseService = new CourseServiceImpl();
		
		System.out.print("Kode Mata Pelajaran : ");
		strInput = scan.nextLine();
		course.setCourseCode(strInput);
		
		System.out.print("Nama Mata Pelajaran : ");
		strInput = scan.nextLine();
		course.setCourseName(strInput);
		
		System.out.print("Aktif [ Y / N ] :");
		strInput = scan.nextLine();
		course.setActiveFlag(strInput);
		course.setCreateBy("Admin");
		
		courseService.insert(course);
		System.out.println(" Data mata pelajaran " + course.getCourseCode() + " Berhasil di tambahkan !");
		
		
	}
}
