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
public class AbejaReina extends Abeja{

    public AbejaReina(double jaleaPor, double polenPor, double mielPor, String res) {
        super(jaleaPor, polenPor, mielPor, "Cuidan la Colmena");    }

    @Override
    public void Volar() {
        System.out.println("La abeja reina vuela desde la base de la colmena hacia la cima de esta en círculos concéntricos,"
                + "hasta ser alcanzada por un Zangano");
    }

    @Override
    public void Informacion() {
       System.out.println("La Abeja Reina consume:"+
               "\nUn porcentaje de jalea igual a " + jaleaPor + 
               "\nun porcentaje de polen igual a " + polenPor + 
               "\nun porcentaje de miel igual a " + mielPor +
               "\ny su respansabilidad es: " + res);
    }
    
}
