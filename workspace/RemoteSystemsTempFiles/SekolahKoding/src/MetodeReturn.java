/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mabruli
 */
public class MetodeReturn {
    String warna = "putih";
    
    public static void main(String[] args){
        MetodeReturn nama = new MetodeReturn();
        
        System.out.println (nama.test());
    }
    
    String test(){
        //metode mengembalikan nilai
        return warna;
    }
}
