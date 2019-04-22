/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colmena;

/**
 *
 * @Mauricio Pozo
 */
public class Zangano extends Abeja{

    public Zangano(double jaleaPor, double polenPor, double mielPor, String res) {
        super(jaleaPor, polenPor, mielPor, "Fecundar a la Abeja Reina");
    }

    @Override
    public void Informacion() {
        System.out.println("El Zangano consume:"+
               "\nUn porcentaje de jalea igual a " + jaleaPor + 
               "\nun porcentaje de polen igual a " + polenPor + 
               "\nun porcentaje de miel igual a " + mielPor +
               "\ny su respansabilidad es: " + res);
    }

    @Override
    public void Volar() {
        System.out.println("Los Zanganos vuelan en trayectorías rectas, hasta que"
                + "alguno de estos consiga fecundar a la Reina.");
    }
    
}
