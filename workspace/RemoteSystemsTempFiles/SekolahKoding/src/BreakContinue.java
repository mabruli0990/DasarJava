/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mabruli
 */
public class BreakContinue {
    public static void main(String[] args){
        //break menghentikan , continue melompati
        for(int i=0; i<5; i++){
            if(i==2){
                //break;
                continue;
            }
            System.out.println(i);
        }
    }
}
