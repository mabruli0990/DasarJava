/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/**
 *
 * @author mabruli
 */
public class Hashset {
    public static void main(String[] args) {
        //set : uniq/ menampilkan satu dari data kembar
        
        // 1 HashSet : tidak berurutan
        //HashSet hs = new HashSet();
        
        // 2 LinkedSet : sesuai array nya
        //LinkedHashSet hs = new LinkedHashSet();
        
        //3 TreeSet : mengurutkan sesuai abjad
        TreeSet hs = new TreeSet();
        
        hs.addAll(Arrays.asList("tika","andi","budi", "tika"));
        
        Iterator it = hs.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
