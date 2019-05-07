package ar.edu.undec;

public class Asiento {
	private Integer idAsiento;
	private String numeroAsiento;
	
	public Asiento(Integer id, String numero) {
		this.idAsiento = id;
		this.numeroAsiento = numero;
	}

	public int getIdAsiento() {
		return idAsiento.intValue();
	}

	public String getNumeroAsiento() {
		return numeroAsiento;
	}

}
