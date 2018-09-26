/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mabruli
 */
public class Encapsulation {
//    tidak boleh mengakses langsung properti tapi hanya metodenya saja
            
    private int tinggi;
    
    public int get_tinggi(){
        return tinggi;
    }
    
    public void set_tinggi(int tinggi){
        this.tinggi = tinggi;
    }
}
