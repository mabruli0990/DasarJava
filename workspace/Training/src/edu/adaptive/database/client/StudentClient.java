package edu.adaptive.database.client;

import java.util.Scanner;

public class StudentClient {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int input;
		String strInput;
		System.out.println("1. Tampilkan daftar pelajar");
		System.out.println("2. tambah data pelajar");
		System.out.println("3. Update data pelajar");
		System.out.println("4. Hapus data pelajar");
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
					StudentSearch search = new StudentSearch();
					search.Search();
				}
				
				if(input==2)
				{
					StudentInsert insert = new StudentInsert();
					insert.Insert();
				}
				
				
			}
			catch(NumberFormatException e)
			{
				System.out.println("Inputan harus angka ");
			}
		}
	}
}
