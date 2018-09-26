/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertama;

import kedua.TingkatAksesKelas1; // cara import

class TingkatAksesKelas2 {
    //tingkat akses kelas : default || public
    //default : hanya bisa diakses di package yang sama
    //public : bisa diakses dimana saja
    
   
    public static void main(String[] args){
        TIngkatAksesKelas3 orang = new TIngkatAksesKelas3();
        TingkatAksesKelas1 orang2 = new TingkatAksesKelas1();
        
        System.out.println(orang.tinggi);
        System.out.println(orang2.warna);
    }
}
