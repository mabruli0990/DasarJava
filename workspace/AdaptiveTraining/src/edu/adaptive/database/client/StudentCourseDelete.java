package edu.adaptive.database.client;

import java.util.Scanner;

import edu.adaptive.database.model.StudentCourse;
import edu.adaptive.database.services.StudentCourseService;
import edu.adaptive.database.services.StudentCourseServiceImpl;

public class StudentCourseDelete {
	public void Delete()
	{
		Scanner scan = new Scanner(System.in);
		String strInput1 = "";
		String strInput2 = "";
		String strInput3 = "";
		StudentCourse studentCourse = null;
		StudentCourseService studentCourseService = new StudentCourseServiceImpl();
		
		System.out.println("Student_NO : ");
		strInput1 = scan.nextLine();
		
		System.out.println("Course_Code : ");
		strInput2 = scan.nextLine();
		
		System.out.println("Semester : ");
		strInput3 = scan.nextLine();
		
		studentCourse = studentCourseService.findByUk(strInput1, strInput2, strInput3);
		
		if(studentCourse != null)
		{
			studentCourseService.delete(studentCourse.getStudentNo(), studentCourse.getCourseCode(), studentCourse.getSemester());
			System.out.println("Data Mata Kuliah " + strInput1 + strInput2 + strInput3 +"Berhasil dihapus !");
		}
		else
		{
			System.out.print("Data mata Kuliah " + strInput1 + strInput2 + strInput3 + "tidak ditemukan !");
		}
	}
}
