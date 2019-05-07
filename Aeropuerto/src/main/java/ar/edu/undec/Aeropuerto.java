package ar.edu.undec;

public class Aeropuerto {
	private Integer idAeropuerto;
	private String nombreAeropuerto;
	private Ciudad ciudadDelAeropuerto;
	private String codigoAeropuerto;

	public Aeropuerto(Integer id, String nombre, Ciudad ciudad, String codigo) {
		this.idAeropuerto = id;
		this.nombreAeropuerto = nombre;
		this.ciudadDelAeropuerto = ciudad;
		this.codigoAeropuerto = codigo;
	}

	public int getIdAeropuerto() {
		return idAeropuerto.intValue();
	}

	public String getNombreAeropuerto() {
		return nombreAeropuerto;
	}

	public Ciudad getCiudad() {
		return ciudadDelAeropuerto;
	}

	public String getCodigoAeropuerto() {
		return codigoAeropuerto;
	}

}
