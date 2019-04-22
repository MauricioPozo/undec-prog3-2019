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
    protected double PorcentajeJalea;
    protected double PorcentajePolen;
    protected double PorcentajeMiel;
    protected String Responsabilidad;

    public Abeja(double PorcentajeJalea, double PorcentajePolen, double PorcentajeMiel, String Responsabilidad) {
        this.PorcentajeJalea = PorcentajeJalea;
        this.PorcentajePolen = PorcentajePolen;
        this.PorcentajeMiel = PorcentajeMiel;
        this.Responsabilidad = Responsabilidad;
    }

    public double getPorcentajeJalea() {
        return PorcentajeJalea;
    }

    public void setPorcentajeJalea(double PorcentajeJalea) {
        this.PorcentajeJalea = PorcentajeJalea;
    }

    public double getPorcentajePolen() {
        return PorcentajePolen;
    }

    public void setPorcentajePolen(double PorcentajePolen) {
        this.PorcentajePolen = PorcentajePolen;
    }

    public double getPorcentajeMiel() {
        return PorcentajeMiel;
    }

    public void setPorcentajeMiel(double PorcentajeMiel) {
        this.PorcentajeMiel = PorcentajeMiel;
    }

    public String getResponsabilidad() {
        return Responsabilidad;
    }

    public void setResponsabilidad(String Responsabilidad) {
        this.Responsabilidad = Responsabilidad;
    }

        
 
}
