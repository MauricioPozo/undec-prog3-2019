package ar.edu.undec;

import java.time.LocalDate;

public class Piloto {
	private Integer idPiloto;
	private	String apellidoPiloto;
	private String nombresPiloto;
	private String documentoPiloto;
	private LocalDate fechaNacimiento;

	public Piloto(Integer id, String apellido, String nombre, String documento, LocalDate fechaNacimiento) {
		this.idPiloto = id;
		this.apellidoPiloto = apellido;
		this.nombresPiloto = nombre;
		this.documentoPiloto = documento;
		this.fechaNacimiento = fechaNacimiento;
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
}
