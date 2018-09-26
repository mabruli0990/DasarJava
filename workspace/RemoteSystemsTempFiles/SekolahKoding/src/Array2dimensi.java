/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mabruli
 */
public class Array2dimensi {
    public static void main(String[] args){
        //array 2d
        String[][] kotak = new String[][]{
                            {"serang","pandeglang"},
                            {"merak","cilegon"},
                            {"petir","cikesal","asp"}
                        };
        
        
        for(int x=0; x<kotak.length; x++){
            System.out.println(x);
//            System.out.println(kotak[x].length);
            for(int y=0; y<kotak[x].length; y++){
//                System.out.println(kotak[x][y]);
            }
        }
        
    }
}
