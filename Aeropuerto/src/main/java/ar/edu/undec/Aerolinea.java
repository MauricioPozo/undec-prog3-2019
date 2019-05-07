package ar.edu.undec;

public class Aerolinea {
	private Integer idAerolinea;
	private String nombreAerolinea;
	
	public Aerolinea(Integer id, String nombre) {
		this.idAerolinea =id;
		this.nombreAerolinea = nombre;
	}
	public Integer getIdAerolinea() {
		return idAerolinea;
	}
	public Object getNombre() {
		return nombreAerolinea;
	}

}
