/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mabruli
 */

class hewan{
    void suara(){
        System.out.println("Suara Hewan Biasa");
    }
}

class kucing extends hewan{
    void suara(){
        System.out.println("Suara Miaw Miau");
    }
}

class anjing extends hewan{
    void suara(){
        System.out.println("Suara Guk guk");
    }
}

public class Polimorfisme {
    public static void main(String[] args){
        hewan h = new hewan();
        hewan k = new kucing();
        hewan a = new anjing();
        
        h.suara();
        k.suara();
        a.suara();
    }
}
