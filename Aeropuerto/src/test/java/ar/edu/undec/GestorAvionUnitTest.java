package ar.edu.undec;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class GestorAvionUnitTest {
	GestorAviones gestor = new GestorAviones();
	
	@Test
	void agregarAvion_TodoLosAtributos_Correctos() {
		List<Asiento> asientosDelAvion = new ArrayList<>();
		for(int i=1 ; i<=10 ; i++)
			asientosDelAvion.add(new Asiento(i, "A"+i));
		assertTrue(gestor.agregarAvion("Boeing","B78F9",asientosDelAvion));
	}
	
	@Test
	void agregarAvion_TodoLosAtributos_MatriculaVacia() {
		List<Asiento> asientosDelAvion = new ArrayList<>();
		for(int i=1 ; i<=10 ; i++)
			asientosDelAvion.add(new Asiento(i, "A"+i));
		assertFalse(gestor.agregarAvion("Boeing","",asientosDelAvion));
	}
	
	@Test
	void agregarAvion_TodoLosAtributos_SinAsientos() {
		List<Asiento> asientosDelAvion = new ArrayList<>();
		assertFalse(gestor.agregarAvion("Boeing","B78F9",asientosDelAvion));
	}

	@Test
	void consultarAvionSiExistePorMatricula() {
		List<Asiento> asientosDelAvion = new ArrayList<>();
		for(int i=1 ; i<=10 ; i++)
			asientosDelAvion.add(new Asiento(i, "A"+i));
		assertTrue(gestor.agregarAvion("Boeing","B78F9",asientosDelAvion));
		assertTrue(gestor.consultarSiAvionExiste("B78F9"));
	}
	
	@Test
	void consultarAvionSiExistePorMatriculaInexistente() {
		List<Asiento> asientosDelAvion = new ArrayList<>();
		for(int i=1 ; i<=10 ; i++)
			asientosDelAvion.add(new Asiento(i, "A"+i));
		assertTrue(gestor.agregarAvion("Boeing","B78F9",asientosDelAvion));
		assertFalse(gestor.consultarSiAvionExiste("B78F5"));
	}
	
	@Test
	void devolverAvionSiExistePorMatricula() {
		List<Asiento> asientosDelAvion = new ArrayList<>();
		for(int i=1 ; i<=10 ; i++)
			asientosDelAvion.add(new Asiento(i, "A"+i));
		assertTrue(gestor.agregarAvion("Boeing","B78F9",asientosDelAvion));
		Avion avionComparar = gestor.devolverAvionPorMatricula("B78F9");
		assertEquals(avionComparar, gestor.devolverAvionPorMatricula("B78F9"));
	}

	@Test
	public void eliminarAvionPorSuMatricula() {
		List<Asiento> asientosDelAvion = new ArrayList<>();
		for(int i=1 ; i<=10 ; i++)
			asientosDelAvion.add(new Asiento(i, "A"+i));
		assertTrue(gestor.agregarAvion("Boeing","B78F9",asientosDelAvion));
		assertTrue(gestor.eliminarAvionPorMatricula("B78F9"));
	}
	
	@Test
	public void eliminarAvionPorSuMatriculaInexistente() {
		List<Asiento> asientosDelAvion = new ArrayList<>();
		for(int i=1 ; i<=10 ; i++)
			asientosDelAvion.add(new Asiento(i, "A"+i));
		assertTrue(gestor.agregarAvion("Boeing","B78F9",asientosDelAvion));
		assertFalse(gestor.eliminarAvionPorMatricula("B78L9"));
	}
	
}
