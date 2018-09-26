/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;

import java.util.Arrays;
import java.util.LinkedList;

/**
 *
 * @author mabruli
 */
public class Linkedlist2 {
    public static void main(String[] args){
      LinkedList li = new LinkedList();
      
      
      li.addAll(Arrays.asList("andi","budi","sess"));
      li.add("medi");
      
      //mengeluarkan semua
//      for(Object nama : li){
//          System.out.println(nama);
//      }

        //mengedit
        li.set(0, "sinta");
        
        //mengeluarkan satu
        System.out.println(li.get(0));
      
     
        
    }
}
