package edu.adaptive.database.client;

import java.sql.Timestamp;
import java.util.Scanner;

import edu.adaptive.database.model.StudentCourse;
import edu.adaptive.database.services.StudentCourseService;
import edu.adaptive.database.services.StudentCourseServiceImpl;

public class StudentCourseInsert {
	public void Insert()
	{
		Scanner scan = new Scanner(System.in);
		String strInput = "";
		StudentCourse studentCourse = new StudentCourse();
		StudentCourseService studentCourseService = new StudentCourseServiceImpl();
		
		System.out.print("Student No: ");
		strInput = scan.nextLine();
		studentCourse.setStudentNo(strInput);
		
		System.out.print("Course Code : ");
		strInput = scan.nextLine();
		studentCourse.setCourseCode(strInput);
		
		System.out.print("Semester : ");
		strInput = scan.nextLine();
		studentCourse.setSemester(strInput);
		
		System.out.print("Result : ");
		strInput = scan.nextLine();
		int intInput = Integer.parseInt(strInput);
		studentCourse.setResult(intInput);
		
		
		studentCourse.setCreateBy("Admin");
		studentCourse.setCreateOn(new Timestamp(System.currentTimeMillis()));
		
		studentCourseService.insert(studentCourse);
		System.out.println("Data mata Kuliah " + studentCourse.getCourseCode() + " Berhasil Disimpan !");
	}
}
