package ar.edu.undec;

public class Aeropuerto {
	private Integer idAeropuerto;
	private String nombreAeropuerto;
	private Ciudad ciudadDelAeropuerto;
	private String codigoAeropuerto;

	public Aeropuerto() {
		
	}
	
	public Aeropuerto(Integer id, String nombre, Ciudad ciudad, String codigo)throws ExcepcionCampoIncorrecto {
		if(codigo.isEmpty()) {
			throw new ExcepcionCampoIncorrecto("El código de un aeropuerto no puede estar vacío");
		}else {
			if(nombre.isEmpty()) {
				throw new ExcepcionCampoIncorrecto("El nombre no debe estar vacía");
			}else {
				this.idAeropuerto = id;
				this.nombreAeropuerto = nombre;
				this.ciudadDelAeropuerto = ciudad;
				this.codigoAeropuerto = codigo;
			}
		}		
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

	public void setNombreAeropuerto(String nombreAeropuerto) {
		this.nombreAeropuerto = nombreAeropuerto;
	}

}
