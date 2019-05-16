package ar.edu.undec;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Avion {
	private Integer idAvion;
	private String modeloDelAvion;
	private String matriculaDelAvion;
	private List<Asiento> asientosDelAvion;

	public Avion() {
		
	}
	
	public Avion(Integer id, String modelo, String matricula, List<Asiento> asientos)throws ExcepcionCampoIncorrecto{
		if(matricula.isEmpty()) {
			throw new ExcepcionCampoIncorrecto("La matricula no puede estar vacía");
		}else{
			if(asientos.isEmpty()) {
				throw new ExcepcionCampoIncorrecto("El Avion debe terner asientos");
			}else {
				this.idAvion = id;
				this.modeloDelAvion = modelo;
				this.matriculaDelAvion = matricula;
				this.asientosDelAvion = asientos;
			}
		}
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

	public void setModeloDelAvion(String modeloDelAvion) {
		this.modeloDelAvion = modeloDelAvion;
	}
	
}
