/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mabruli
 */
public class ParameterMetode {
    public static void main(String[] args){
        ParameterMetode udin = new ParameterMetode();
        udin.berjalan("tik tok", 20);
    }
    void berjalan(String suara, int jarak){
        System.out.println("Suaranya " + suara + " Jaraknya " + jarak + " KM");
    }
}
