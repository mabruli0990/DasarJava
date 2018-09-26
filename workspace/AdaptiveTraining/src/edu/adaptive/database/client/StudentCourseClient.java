package edu.adaptive.database.client;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class StudentCourseClient {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int input;
		String strInput;
		System.out.println("1. Tampilkan daftar student_course");
		System.out.println("2. tambah data kursus");
		System.out.println("3. Update data kursus");
		System.out.println("4. Hapus data kursus");
		System.out.println("5. Keluar");
		
		boolean isTrue = false;
		while(!isTrue)
		{
			System.out.print("\n Pilih menu : ");
			strInput = scan.nextLine();
			try
			{
				input = Integer.parseInt(strInput);
				
				if(input==1)
				{
					StudentCourseSearch search = new StudentCourseSearch();
					search.Search();
				}
				
				else if(input==2)
				{
					StudentCourseInsert insert = new StudentCourseInsert();
					insert.Insert();
				}
				
				else if(input==3)
				{
					StudentCourseUpdate update = new StudentCourseUpdate();
					update.Update();
				}
				
				else if(input==4)
				{
					StudentCourseDelete delete = new StudentCourseDelete();
					delete.Delete();
				}
				
				else if(input==5)
				{
					System.out.println("Keluar...");
					isTrue = true;
				}
			}
			catch(NumberFormatException e)
			{
				System.out.println("Inputan harus angka ");
			}
		}
	}
}
