/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colmena;

import java.util.ArrayList;

/**
 *
 * @Mauricio Pozo
 */
public class Colmena {
    private int r=0;
    private AbejaReina reina;
    private ArrayList<Abeja> abejasOyZan = new ArrayList<>();
    
    public void agregarReina(AbejaReina rein){
        if(r==0){
            reina=rein;
            r=1;
        }
    }
    public void agregarDemasAbejas(Abeja abja){
        abejasOyZan.add(abja);
    }  
    
}
