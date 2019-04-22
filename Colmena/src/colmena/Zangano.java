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
public class Zangano extends Abeja implements MostrarInfoAbeja{

    public Zangano(double jaleaPor, double polenPor, double mielPor, String res) {
        super(jaleaPor, polenPor, mielPor, "Fecundar a la Abeja Reina");
    }

    @Override
    public void mostrarInfo() {
        System.out.println("El Zangano consume:"+
               "\nUn porcentaje de jalea igual a " + PorcentajeJalea + 
               "\nun porcentaje de polen igual a " + PorcentajePolen + 
               "\nun porcentaje de miel igual a " + PorcentajeMiel +
               "\ny su respansabilidad es: " + Responsabilidad);
    }

    @Override
    public void vuelo() {
        System.out.println("Los Zanganos vuelan en trayectorías rectas, hasta que"
                + "alguno de estos consiga fecundar a la Reina.");
    }
    
}
