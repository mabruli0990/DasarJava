/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mabruli
 */
public class Konstruktor {
    int tinggi;
    String warna;
    
    public Konstruktor(int tinggi, String warna){
        this.tinggi = tinggi;
        this.warna = warna;
    }
    
    public static void main(String[] args){
        Konstruktor orang = new Konstruktor(120,"aaaasep");
        System.out.println(orang.tinggi);
    }
}
