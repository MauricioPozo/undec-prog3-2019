package ar.edu.undec;

public class Pasajero {
	private Integer idPasajero;
	private String cuilPasajero;
	private String apellidoPasajero;
	private String nombresPasajero;
	private String telefonoPasajero;
	
	public Pasajero(Integer id, String cuil, String apellido, String nombres, String telefono )throws ExcepcionCampoIncorrecto {
		if(cuil.isEmpty()) {
			throw new ExcepcionCampoIncorrecto("El cuil no puede estar vacío");
		}else
			if(cuil.length()<11 || cuil.length()>14) {
				throw new ExcepcionCampoIncorrecto("El cuil esta incorrecto");
			}else {
				this.idPasajero = id;
				this.cuilPasajero = cuil;
				this.apellidoPasajero = apellido;
				this.nombresPasajero = nombres;
				this.telefonoPasajero = telefono;
			}
	}
	
	public void setCuilPasajero(String cuilPasajero) {
		this.cuilPasajero = cuilPasajero;
	}

	public void setApellidoPasajero(String apellidoPasajero) {
		this.apellidoPasajero = apellidoPasajero;
	}

	public void setNombresPasajero(String nombresPasajero) {
		this.nombresPasajero = nombresPasajero;
	}

	public void setTelefonoPasajero(String telefonoPasajero) {
		this.telefonoPasajero = telefonoPasajero;
	}

	public Pasajero () {	
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
