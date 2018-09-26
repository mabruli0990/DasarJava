/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mabruli
 */

//cara akses kelas didalam kelas
public class InnerClass {
    private int x = 10;
    
    class InnerClassDalam{
        void tebak(){
            System.out.println(x);
        }
    }
    
    void tampilkan(){
        InnerClassDalam sinto = new InnerClassDalam();
        sinto.tebak();
    }
    
}

class test{
    public static void main(String[] args){
        InnerClass santi = new InnerClass();
        
        santi.tampilkan();
    }
}
