/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mabruli
 */
public class Array {
    public static void main(String[] args){
        //penulisan pertama
        int[] kotak = new int[3];
        kotak[0]=100;
        kotak[1]=200;
        kotak[2]=300;
        
        //penulisan kedua
        int[] kotak2 = {100,200,300,400};
        
        for(int i=0; i<kotak2.length; i++){
            System.out.println(kotak2[i]);
        }
    }
}
