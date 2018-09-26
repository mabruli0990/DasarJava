/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;

import java.util.*;

/**
 *
 * @author mabruli
 */
public class Linkedlist {
    public static void main(String[] args){
        LinkedList li = new LinkedList();
        
        li.addAll(Arrays.asList("andi","budi",40));
        
        //untuk menghapus
        //li.remove("andi");
        //li.removeAll(li);
        
        
        Iterator it = li.iterator();
        if(it.hasNext()){
            while(it.hasNext()){
                System.out.println(it.next());
            }
        }else{
            System.out.println("list kosong");
        }
    }
}
