package ar.edu.undec;

public class Aerolinea {
	private Integer idAerolinea;
	private String nombreAerolinea;
	
	public Aerolinea(Integer id, String nombre) {
		this.idAerolinea =id;
		this.nombreAerolinea = nombre;
	}
	public int getIdAerolinea() {
		return idAerolinea.intValue();
	}
	public String getNombre() {
		return nombreAerolinea;
	}

}
