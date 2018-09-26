/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mabruli
 */
class orangutan{
    int umur = 10;
    
    int get_umur(){
        return umur;
    }
    
}

class OverridingSuper extends orangutan{
    int umur = 40;
    
    int get_umur(){
//        return umur;
        
        //untuk mengakses metode extends
        
        return super.umur;
    }
    public static void main(String[] args){
        OverridingSuper sinta = new OverridingSuper();
//        sinta.umur = 20;
        System.out.println(sinta.get_umur());
    }
}
