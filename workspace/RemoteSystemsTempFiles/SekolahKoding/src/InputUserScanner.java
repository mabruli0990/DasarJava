
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mabruli
 */
public class InputUserScanner {
    public static void main(String[] args){
       Scanner scan = new Scanner(System.in);
       
       System.out.print("Namanya Siapa : ");
       String nama = scan.nextLine();
       
        System.out.println("");
        
       System.out.print("Kalo umur : ");
       int umur = scan.nextInt();
       
       System.out.println("Nama saya : " + nama + ", Umurnya : " + umur);
    }
    
    
}
