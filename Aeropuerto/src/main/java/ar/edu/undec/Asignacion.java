package ar.edu.undec;

public class Asignacion {
	private Pasajero pasajeroAsignado;
	private Asiento asientoAsignado;
	private String codigoDeAsignacion;
	
	public Asignacion(Pasajero unPasajero, Asiento unAsiento, String codigo) {
		this.pasajeroAsignado = unPasajero;
		this.asientoAsignado = unAsiento;
		this.codigoDeAsignacion = codigo;
	}

	public Pasajero getPasajero() {
		return pasajeroAsignado;
	}
	
	public Asiento getAsiento() {
		return asientoAsignado;
	}
	
	public String getCodigoAsignacion() {
		return codigoDeAsignacion;
	}

}
