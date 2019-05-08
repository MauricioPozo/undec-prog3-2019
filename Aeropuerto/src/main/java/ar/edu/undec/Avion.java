package ar.edu.undec;
import java.util.ArrayList;
import java.util.List;

public class Avion {
	private Integer idAvion;
	private String modeloDelAvion;
	private String matriculaDelAvion;
	private List<Asiento> asientosDelAvion;

	public Avion(Integer id, String modelo, String matricula, List<Asiento> asientos) {
		this.idAvion = id;
		this.modeloDelAvion = modelo;
		this.matriculaDelAvion = matricula;
		this.asientosDelAvion = asientos;
	}

	public int getIdAvion() {
		return idAvion.intValue();
	}

	public String getModeloDelAvion() {
		return modeloDelAvion;
	}

	public String getMatriculaDelAvion() {
		return matriculaDelAvion;
	}

	public List<Asiento> getAsientosDelAvion() {
		return asientosDelAvion;
	}
	
}
