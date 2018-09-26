package edu.adaptive.database.client;

import java.util.Scanner;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import edu.adaptive.database.model.Student;
import edu.adaptive.database.services.StudentService;
import edu.adaptive.database.services.StudentServiceImpl;

public class StudentInsert {
	public void Insert()
	{
		Scanner scan = new Scanner(System.in);
		String strInput = null;
		Student student = new Student();
		StudentService studentService = new StudentServiceImpl();
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		
		System.out.print("No Pelajar : ");
		strInput = scan.nextLine();
		student.setStudentNo(strInput);
		
		System.out.print("Nama Pelajar : ");
		strInput = scan.nextLine();
		student.setStudentName(strInput);
		
		System.out.print("Gender : ");
		strInput = scan.nextLine();
		student.setGender(strInput);
		
		System.out.print("Birth Place : ");
		strInput = scan.nextLine();
		student.setBirthPlace(strInput);
		
//		System.out.print("Birth Date : ");
//		strInput = scan.nextLine();
//		
//		try
//		{
//			student.setBirtDate(sdf.parse(strInput));
//		}
//		catch(ParseException e)
//		{
//			e.printStackTrace();
//		}
		
		System.out.print("Address : ");
		strInput = scan.nextLine();
		student.setAddress(strInput);
		
		System.out.print("Active Flag [Y / N] : ");
		strInput = scan.nextLine();
		student.setActiveFlag(strInput);
		
		student.setCreateBy("Admin");
		student.setCreateOn(new Timestamp(System.currentTimeMillis()));
		
		studentService.insert(student);
		System.out.println("Data mata Kuliah " + student.getStudentName() + " Berhasil Disimpan !");
	}
}
