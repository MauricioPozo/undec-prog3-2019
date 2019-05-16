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

	public List<Piloto> traerPilotosPorApellido(String apellidoBuscar){
		List<Piloto> pilotosPorApellidos = new ArrayList<>();
		for (Piloto piloto : pilotos) {
			if(piloto.getApellidoPiloto().equals(apellidoBuscar)) {
				pilotosPorApellidos.add(piloto);
			}
		}
		return pilotosPorApellidos;
	} 
	
	public boolean modificarPilotoPorDocumento(String docBuscar, String apellidoModificar, String nombresModificar,String docModificar, LocalDate fechNacModificar ){
		int i = 0;
		for(; i < pilotos.size();i++) {
			if(pilotos.get(i).getDocumentoPiloto().equals(docBuscar)) {		
				pilotos.get(i).setDocumentoPiloto(docModificar);
				pilotos.get(i).setApellidoPiloto(apellidoModificar);
				pilotos.get(i).setNombresPiloto(nombresModificar);
				pilotos.get(i).setFechaNacimiento(fechNacModificar);
				return true;
			}		
		}
		return false;
	}
}