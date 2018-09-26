/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author mabruli
 */
public class Arraylist {
    public static void main(String[] args){
        //penulisan non generic
        ArrayList al = new ArrayList();
        al.add("hilman");
        al.add("endi");
        al.add(30);
        
        //cara print pertama
//        for(Object nama : al){
//            System.out.println(nama);
//        }
        
        //cara print Iterator
        Iterator it = al.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        
        
        
        
        
        //penulisan generic
        ArrayList<String> al2 = new ArrayList<String>();
        al2.add("budi");
        al2.add("rudi");
        for(String nama2 : al2){
            System.out.println(nama2);
        }
    }
    
}
