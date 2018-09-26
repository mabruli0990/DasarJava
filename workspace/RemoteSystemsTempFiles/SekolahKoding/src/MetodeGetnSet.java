/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mabruli
 */
public class MetodeGetnSet {
    String warna = "putih";
    
    public static void main(String[] args){
        MetodeGetnSet andi = new MetodeGetnSet();
        
        //sebelum di set 
        System.out.println(andi.warna);
        
        //sesudah diset
        andi.setwarna("hitam");
        System.out.println(andi.warna);
        
        //metode get
        System.out.println(andi.getwarna());
    }
    
    //metode set dan get
    
    //metode set = void
    void setwarna(String warnaparameter){
        warna = warnaparameter;
    }
    
    //metode get = return
    String getwarna(){
        String warna = "hijau";
        return warna;
    }
}
