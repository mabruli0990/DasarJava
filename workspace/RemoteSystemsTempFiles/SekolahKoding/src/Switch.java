/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mabruli
 */
public class Switch {
    public static void main(String[] args){
        int x = 6;
        
        switch(x){
            case 1:
                System.out.print("x nya 1");
                break;
            case 5:
                System.out.print("x nya 5");
                break;
            case 10:
                System.out.print("x nya 10");
                break;
            case 15:
                System.out.print("x nya 15");
                break;
            default:
                System.out.print("Tidak ada yang memenuhi");
        }
    }
}
