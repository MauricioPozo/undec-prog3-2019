package ar.edu.undec;

import java.util.ArrayList;
import java.util.List;

import javax.swing.plaf.synth.SynthInternalFrameUI;

import org.junit.jupiter.engine.execution.ExtensionValuesStore;

public class GestorUbicaciones {
	
	private List<Ciudad> ciudades = new ArrayList<>();
	private List<Aeropuerto> aeropuertos= new ArrayList<>();
	
	public boolean agregarCiudad(String nombreCiudad, String codPostal) {
		boolean existe = true;
		for (Ciudad ciudad : ciudades) {
			if(ciudad.getCodigoPostal().equals(codPostal)) {
				existe = false;
			}
		}
		try{
			if(existe) {
				ciudades.add(new Ciudad(ciudades.size()+1, nombreCiudad,codPostal));
				return existe;
			}else return false;
		}catch (ExcepcionCampoIncorrecto e) {
			System.err.println(e.getMessage());
			return false;
		}
	}

	public boolean consultarCiudadSiExiste(String codPostal) {
		boolean existe = false;
		for(Ciudad ciudad : ciudades) {
			if(ciudad.getCodigoPostal().equals(codPostal)) {
				existe = true;
			}
		}
		return existe;
	}
	
	public List<Ciudad> obtenerTodasLasCiudades(){
		return ciudades;
	}

	public Ciudad traerCiudadPorCP(String codPostal) {
		for (Ciudad ciudad : ciudades) {
			if(ciudad.getCodigoPostal().equals(codPostal)) {
				return ciudad;
			}
		}
		return null;
	}

	public boolean eliminarCiudadPorCP(String codPostal) {
		Ciudad ciudadBorrar = new Ciudad();
		for(int i = 0; i < ciudades.size(); i++) {
			if(ciudades.get(i).getCodigoPostal().equals(codPostal)) {
					ciudadBorrar = ciudades.get(i);
				}
		}
		return ciudades.remove(ciudadBorrar);
	}

	public List<Ciudad> traerCiudadesPorNombre(String nombre) {
		List<Ciudad> ciudadesMismoNombre = new ArrayList<>();
		for (Ciudad ciudad : ciudades) {
			if(ciudad.getNombreCiudad().equals(nombre)) {
				ciudadesMismoNombre.add(ciudad);
			}
		}
		return ciudadesMismoNombre;
		
	}

	public boolean modificarCiudad(String codPBuscar, String nombreModificar, String codPModificar) {
		int i = 0;
		for(; i < ciudades.size();i++) {
			if(ciudades.get(i).getCodigoPostal().equals(codPBuscar)) {		
				ciudades.get(i).setNombreCiudad(nombreModificar);
				ciudades.get(i).setCodigoPotal(codPModificar);
				return true;
			}		
		}
		return false;
		
	}

	public boolean agregarAeropuerto(String nombre, Ciudad ciudad,String codigo) {
		boolean existe = true;
		for (Aeropuerto aero : aeropuertos) {
			if(aero.getCodigoAeropuerto().equals(codigo)) {
				existe = false;
			}
		}
		try{
			if(existe) {
				aeropuertos.add(new Aeropuerto(aeropuertos.size()+1, nombre ,ciudad, codigo));
				return existe;
			}else return false;
		}catch (ExcepcionCampoIncorrecto e) {
			System.err.println(e.getMessage());
			return false;
		}
	}

	public boolean consultarAeropuertoSiExiste(String codAero) {
		boolean existe = false;
		for(Aeropuerto aero : aeropuertos) {
			if(aero.getCodigoAeropuerto().equals(codAero)) {
				existe = true;
			}
		}
		return existe;
	}

	public List<Aeropuerto> obtenerTodosLosAeropuertos(){
		return aeropuertos;
	}

	public Aeropuerto traerAeropuertoPorCodigo (String codAero) {
		for (Aeropuerto aero : aeropuertos) {
			if(aero.getCodigoAeropuerto().equals(codAero)) {
				return aero;
			}
		}
		return null;
	}

	public boolean eliminarAeropuertoPorCodigo(String codAero) {
		Aeropuerto aeropuertoBorrar = new Aeropuerto();
		for(int i = 0; i < aeropuertos.size(); i++) {
			if(aeropuertos.get(i).getCodigoAeropuerto().equals(codAero)) {
					aeropuertoBorrar = aeropuertos.get(i);
				}
		}
		return aeropuertos.remove(aeropuertoBorrar);
	}
	
	public List<Aeropuerto> traerAeropuertosPorNombredeCiudad(String nombreCiudad) {
		List<Aeropuerto> aeropuertosPorNombre = new ArrayList<>();
		for (Aeropuerto aero : aeropuertos) {
			if(aero.getCiudad().getNombreCiudad().equals(nombreCiudad)) {
				aeropuertosPorNombre.add(aero);
			}
		}
		return aeropuertosPorNombre;
		
	}

	public boolean modificarNombreAeropuento(String codAerBuscar, String nombreModificar) {
		int i = 0;
		for(; i < aeropuertos.size();i++) {
			if(aeropuertos.get(i).getCodigoAeropuerto().equals(codAerBuscar)) {		
				aeropuertos.get(i).setNombreAeropuerto(nombreModificar);
				return true;
			}		
		}
		return false;
		
	}
	
}