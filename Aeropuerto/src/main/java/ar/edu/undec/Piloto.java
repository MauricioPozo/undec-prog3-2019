package ar.edu.undec;

import java.time.LocalDate;
import java.time.Period;

public class Piloto {
	private Integer idPiloto;
	private	String apellidoPiloto;
	private String nombresPiloto;
	private String documentoPiloto;
	private LocalDate fechaNacimiento;

	public Piloto(Integer id, String apellido, String nombres, String documento, LocalDate fechaNacimiento) throws ExcepcionCampoIncorrecto{
		if(documento.isEmpty()) {
			throw new ExcepcionCampoIncorrecto("El Documento no puede estar vacío");
		}else
			if(Period.between(fechaNacimiento, LocalDate.now()).getYears() < 18) {
				throw new ExcepcionCampoIncorrecto("El Piloto no puede ser menor de edad");
			}else {
					this.idPiloto = id;
					this.documentoPiloto= documento;
					this.apellidoPiloto = apellido;
					this.nombresPiloto = nombres;
					this.fechaNacimiento = fechaNacimiento;
				}
	}
	
	public Piloto() {	
	}
	
	public int getIdPiloto() {
		return idPiloto.intValue();
	}
	
	public String getApellidoPiloto() {
		return apellidoPiloto;
	}
	public String getNombresPiloto() {
		return nombresPiloto;
	}
	public String getDocumentoPiloto() {
		return documentoPiloto;	
	}
	public LocalDate getFechaNacimientoPiloto() {
		return fechaNacimiento;	
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public void setApellidoPiloto(String apellidoPiloto) {
		this.apellidoPiloto = apellidoPiloto;
	}

	public void setNombresPiloto(String nombresPiloto) {
		this.nombresPiloto = nombresPiloto;
	}

	public void setDocumentoPiloto(String documentoPiloto) {
		this.documentoPiloto = documentoPiloto;
	}
	
	
}
