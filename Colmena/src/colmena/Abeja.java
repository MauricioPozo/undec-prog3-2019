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
abstract class Abeja {
    protected double jaleaPor;
    protected double polenPor;
    protected double mielPor;
    protected String res;

    public Abeja(double jaleaPor, double polenPor, double mielPor, String res) {
        this.jaleaPor = jaleaPor;
        this.polenPor = polenPor;
        this.mielPor = mielPor;
        this.res=res;
    }

    public double getJaleaPor() {
        return jaleaPor;
    }

    public void setJaleaPor(double jaleaPor) {
        this.jaleaPor = jaleaPor;
    }

    public double getPolenPor() {
        return polenPor;
    }

    public void setPolenPor(double polenPor) {
        this.polenPor = polenPor;
    }

    public double getMielPor() {
        return mielPor;
    }

    public void setMielPor(double mielPor) {
        this.mielPor = mielPor;
    }   

    public String getRes() {
        return res;
    }
    
    public abstract void Informacion();
    
    public abstract void Volar();
}
