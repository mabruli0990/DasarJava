/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mabruli
 */
public class Objek {
    int tinggi = 170;
    String warna = "putih";
    
        public static void main(String[] args){
        Objek udin = new Objek();
        udin.berjalan();
    }
    void berjalan(){
        System.out.println(tinggi + " " + warna);
    }
    

}
