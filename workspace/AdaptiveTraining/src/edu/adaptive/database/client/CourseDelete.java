package edu.adaptive.database.client;

import edu.adaptive.database.model.Course;
import edu.adaptive.database.services.CourseService;
import edu.adaptive.database.services.CourseServiceTmpl;

import java.util.Scanner;

public class CourseDelete {
	
	public void Delete()
	{
		Scanner scan = new Scanner(System.in);
		String strInput = "";
		Course course = null;
		CourseService courseService = new CourseServiceTmpl();
		
		System.out.println("Kode Mata Kuliah : ");
		strInput = scan.nextLine();
		
		course = courseService.findByUk(strInput);
		
		if(course != null)
		{
			courseService.delete(course.getCourseCode());
			System.out.println("Data Mata Kuliah " + strInput + "Berhasil dihapus !");
		}
		else
		{
			System.out.print("Data mata Kuliah " + strInput + "tidak ditemukan !");
		}
	}
}
