package ar.edu.undec;

import java.util.ArrayList;
import java.util.List;

import org.junit.internal.requests.SortingRequest;

public class GestorDePasajeros {
	private List<Pasajero> pasajeros= new ArrayList<>();
	
	public boolean agregarUnPasajero(String cuil, String apellido, String nombres, String telefono) throws ExcepcionCampoIncorrecto {
		boolean existe = true;
		for (Pasajero pasajero : pasajeros) {
			if(pasajero.getCuil().equals(cuil)) {
				existe = false;
			}
		}
		try{
			if(existe) {
				pasajeros.add(new Pasajero(pasajeros.size()+1,cuil,apellido,nombres,telefono));
				return existe;
			}else return false;
		}catch (ExcepcionCampoIncorrecto e) {
			System.err.println(e.getMessage());
			return false;
		}
	}
	
	public boolean consultarExistenciaPasajero(String cuil) {
		for (Pasajero pasajero : pasajeros) {
			if(pasajero.getCuil() == cuil)
				return true;
		}
		return false;
	}
	
	public Pasajero traerPasajeroPorCuil(String cuil) {
		for (Pasajero pasajero : pasajeros) {
			if(pasajero.getCuil().equals(cuil)) {
				return pasajero;
			}
		}
		return null;
	}
	
	public List<Pasajero> traerTodosLosPasajero() {
		return pasajeros;
	}

	public boolean eliminarPasajero( String cuil){
		Pasajero pasajeroBorrar = new Pasajero();
		for(int i = 0; i < pasajeros.size(); i++) {
			if(pasajeros.get(i).getCuil().equals(cuil)) {
					pasajeroBorrar = pasajeros.get(i);
				}
		}
		return pasajeros.remove(pasajeroBorrar);
	}

	public List<Pasajero> traerPasajerosPorApellido(String apellidoBuscar){
		List<Pasajero> pasajerosPorApellidos = new ArrayList<>();
		for (Pasajero pasajero : pasajeros) {
			if(pasajero.getApellido().equals(apellidoBuscar)) {
				pasajerosPorApellidos.add(pasajero);
			}
		}
		return pasajerosPorApellidos;
	} 

	public boolean modificarPasajeroPorCuil(String cuilBuscar, String cuilModificar, String apellidoModificar, String nombresModificar, String telefonoModificar ){
		int i = 0;
		for(; i < pasajeros.size();i++) {
			if(pasajeros.get(i).getCuil().equals(cuilBuscar)) {		
				pasajeros.get(i).setCuilPasajero(cuilModificar);
				pasajeros.get(i).setApellidoPasajero(apellidoModificar);
				pasajeros.get(i).setNombresPasajero(nombresModificar);
				pasajeros.get(i).setTelefonoPasajero(telefonoModificar);
				return true;
			}		
		}
		return false;
	}
}
