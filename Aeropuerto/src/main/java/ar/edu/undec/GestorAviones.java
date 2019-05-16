package ar.edu.undec;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BooleanSupplier;

public class GestorAviones {
	
		private List<Avion> aviones;
		
		public GestorAviones() {
			aviones = new ArrayList<>();
		}

		public boolean agregarAvion(String modelo, String matricula, List<Asiento> asientosDelAvion) {
			boolean existe = true;
			for (Avion avion : aviones) {
				if(avion.getMatriculaDelAvion().equals(matricula)) {
					existe = false;
				}
			}
			try{
				if(existe) {
					aviones.add(new Avion(aviones.size()+1,modelo,matricula,asientosDelAvion));
					return existe;
				}else return false;
			}catch (ExcepcionCampoIncorrecto e) {
				System.err.println(e.getMessage());
				return false;
			}
		}
		

		public boolean consultarSiAvionExiste(String matricula) {
			boolean existe = false;
			for (Avion avion : aviones) {
				if(avion.getMatriculaDelAvion().equals(matricula)) {
					existe = true;
				}
			}
			return existe;
		}

		public Avion devolverAvionPorMatricula(String matricula) {
			for (Avion avion : aviones) {
				if(avion.getMatriculaDelAvion().equals(matricula)) {
					return avion;
				}
			}
			return null;
		}

		public List<Avion> devolverTodosLosAviones() {
			return aviones;			
		}

		public boolean eliminarAvionPorMatricula(String matricula) {
			Avion avionBorrar = new Avion();
			for (int i =0; i< aviones.size(); i++) {
				if(aviones.get(i).getMatriculaDelAvion().equals(matricula)) {
					avionBorrar = aviones.get(i);
				}
			}
			return aviones.remove(avionBorrar);
		}

		public boolean modificarAvionPorMatricula(String matriculaBuscar, String modelo ){
			int i = 0;
			for(; i < aviones.size();i++) {
				if(aviones.get(i).getMatriculaDelAvion().equals(matriculaBuscar)) {		
					aviones.get(i).setModeloDelAvion(modelo);
					return true;
				}		
			}
			return false;
		}

}
