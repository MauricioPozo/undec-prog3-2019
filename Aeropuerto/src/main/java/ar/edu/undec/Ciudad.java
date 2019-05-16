package ar.edu.undec;

public class Ciudad {

	private Integer idCiudad;
	private String nombreCiudad;
	private String codigoPotal;

	public Ciudad() {
		
	}
	
	public Ciudad(Integer id, String nombre, String codigo)throws ExcepcionCampoIncorrecto {
		if(codigo.isEmpty()) {
			throw new ExcepcionCampoIncorrecto("El c�digo postal no puede estar vac�o");
		}else {
			if(nombre.isEmpty()) {
				throw new ExcepcionCampoIncorrecto("La Ciudad no debe estar vac�a");
			}else {
				this.idCiudad = id;
				this.nombreCiudad = nombre;
				this.codigoPotal = codigo;
			}
		}
	}
	
	public void setNombreCiudad(String nombreCiudad) {
		this.nombreCiudad = nombreCiudad;
	}

	public void setCodigoPotal(String codigoPotal) {
		this.codigoPotal = codigoPotal;
	}

	public int getIdCiudad() {
		return idCiudad.intValue();
	}
	public String getNombreCiudad() {
		return nombreCiudad;
	}
	public String getCodigoPostal() {
		return codigoPotal;
	}
	
}
