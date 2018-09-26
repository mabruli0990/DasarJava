/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mabruli
 */
public class Pewarisan {
   int umur;
   String warna;
   
   int get_umur(){
    return umur;
    }
}

class orang extends Pewarisan {
    public static void main(String[] args){
        orang sinta = new orang();
        
        sinta.set_umur(30);
        System.out.println(sinta.get_umur());
        
    }
    
    void set_umur(int umur){
        this.umur = umur;
    }
}
