/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colmena;

/**
 *
 * @author Administrador
 */
public class AbejaObrera extends Abeja{

    public AbejaObrera(double jaleaPor, double polenPor, double mielPor, String res) {
        super(jaleaPor, polenPor, mielPor, "Alimentar a las Larvas");
    }
    @Override
    public void Volar() {
        System.out.println("Las Abejas obreras vuelan en forma helicoidal (como un resorte).");
    }
    @Override
    public void Informacion() {
         System.out.println("La Abeja Obrera consume:"+
               "\nUn porcentaje de jalea igual a " + jaleaPor + 
               "\nun porcentaje de polen igual a " + polenPor + 
               "\nun porcentaje de miel igual a " + mielPor +
               "\ny su respansabilidad es: " + res);
    }
    
}
