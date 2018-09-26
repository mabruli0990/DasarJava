/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 *
 * @author mabruli
 */
public class Arraylist2 {
    public static void main(String[] args){
        ArrayList al = new ArrayList();
    
        //String[] nama = new String[]{"andi", "budi"};
    
        al.addAll(Arrays.asList("andi","budi",20));
        
        Iterator it = al.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        
        
    }
    
}
