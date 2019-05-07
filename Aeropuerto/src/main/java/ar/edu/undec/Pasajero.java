package ar.edu.undec;

public class Pasajero {
	private Integer idPasajero;
	private String cuilPasajero;
	private String apellidoPasajero;
	private String nombresPasajero;
	private String telefonoPasajero;
	
	public Pasajero(Integer id, String cuil, String apellido, String nombres, String telefono ) {
		this.idPasajero = id;
		this.cuilPasajero = cuil;
		this.apellidoPasajero = apellido;
		this.nombresPasajero = nombres;
		this.telefonoPasajero = telefono;
	}

	public int getIdPasajero() {
		return idPasajero.intValue();
	}

	public String getCuil() {
		return cuilPasajero;
	}

	public String getApellido() {
		return apellidoPasajero;
	}

	public String getNombres() {
		return nombresPasajero;
	}

	public String getTelefono() {
		return telefonoPasajero;
	}

}
