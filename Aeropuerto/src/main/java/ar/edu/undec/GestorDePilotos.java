package ar.edu.undec;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.junit.internal.requests.SortingRequest;

public class GestorDePilotos{
	
	private List<Piloto> pilotos= new ArrayList<>();

	public boolean agregarUnPiloto(String apellido, String nombres, String documento, LocalDate fechaNacimiento) throws ExcepcionCampoIncorrecto {
		boolean existe = true;
		for (Piloto piloto : pilotos) {
			if(piloto.getDocumentoPiloto().equals(documento)) {
				existe = false;
			}
		}
		try{
			if(existe) {
				pilotos.add(new Piloto(pilotos.size()+1,apellido,nombres,documento,fechaNacimiento));
				return existe;
			}else return false;
		}catch (ExcepcionCampoIncorrecto e) {
			System.err.println(e.getMessage());
			return false;
		}
	}
	public boolean consultarExistenciaPiloto(String documento) {
		for (Piloto piloto : pilotos) {
			if(piloto.getDocumentoPiloto().equals(documento))
				return true;
		}
		return false;
	}
	
	public Piloto traerPilotoPorDocumento(String documento) {
		for (Piloto piloto : pilotos) {
			if(piloto.getDocumentoPiloto().equals(documento))
				return piloto;
		}
		return null;
	}
	
	public List<Piloto> traerTodosLosPilotos() {
		return pilotos;
	}
	
	public boolean eliminarPiloto( String documento){
		Piloto pilotoBorrar = new Piloto();
		for(int i = 0; i < pilotos.size(); i++) {
			if(pilotos.get(i).getDocumentoPiloto().equals(documento)) {
					pilotoBorrar = pilotos.get(i);
				}
		}
		return pilotos.remove(pilotoBorrar);
	}

}