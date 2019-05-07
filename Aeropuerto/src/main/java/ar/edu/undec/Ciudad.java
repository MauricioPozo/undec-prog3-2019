package ar.edu.undec;

public class Ciudad {

	private Integer idCiudad;
	private String nombreCiudad;
	private String codigoPotal;

	public Ciudad(Integer id, String nombre, String codigo) {
		this.idCiudad = id;
		this.nombreCiudad = nombre;
		this.codigoPotal = codigo;
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
