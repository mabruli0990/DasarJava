package edu.adaptive.database.client;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


public class CourseClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int input;
		String strInput;
		System.out.println("1. Tampilkan daftar kursus");
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
					CourseSearch search = new CourseSearch();
					search.Search();
				}
				
				else if(input==2)
				{
					CourseInsert insert = new CourseInsert();
					insert.Insert();
				}
				
				else if(input==3)
				{
					CourseUpdate update = new CourseUpdate();
					update.Update();
				}
				
				else if(input==4)
				{
					CourseDelete delete = new CourseDelete();
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
