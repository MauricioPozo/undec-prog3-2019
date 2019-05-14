package ar.edu.undec;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

public class GestorPasajerosUnitTest {
	GestorDePasajeros gestor = new GestorDePasajeros();
	
	@Test
	public void agregarPasajero_TodosLosAtribiutos_Correcto() throws ExcepcionCampoIncorrecto {
		assertTrue(gestor.agregarUnPasajero("25-23302555-7","Zalazar","Kevin Nicolas","+5493825416602"));
	}
	@Test
	public void agregarPasajero_TodosLosAtributos_CuilExistente() throws ExcepcionCampoIncorrecto {
		gestor.agregarUnPasajero("25-23302555-7", "Zalazar", "Kevin Nicolas", "+5493825416602");
		assertFalse(gestor.agregarUnPasajero("25-23302555-7", "Zalazar", "Kevin Nicolas", "+5493825416602"));
	}
	
	@Test
	public void agregarPasajero_TodosLosAtributos_CuilVacio() throws ExcepcionCampoIncorrecto {
		assertFalse(gestor.agregarUnPasajero("", "Zalazar", "Kevin Nicolas", "+5493825416602"));
	}
	
	@Test
	public void consultarPasajero_EnviarCuil_Correcto() throws ExcepcionCampoIncorrecto {
		assertTrue(gestor.agregarUnPasajero("25-23302555-7", "Zalazar", "Kevin Nicolas", "+5493825416602"));
		Pasajero comparar  = gestor.traerPasajeroPorCuil("25-23302555-7");
		assertEquals(1, comparar.getIdPasajero());
		assertEquals("25-23302555-7", comparar.getCuil());
		assertEquals("Zalazar", comparar.getApellido());
		assertEquals("Kevin Nicolas", comparar.getNombres());
		assertEquals("+5493825416602", comparar.getTelefono());
	}
	@Test
	public void consultarPasajero_EnviarCuil_Incorrecto() throws ExcepcionCampoIncorrecto {
		assertTrue(gestor.agregarUnPasajero("25-23302555-7", "Zalazar", "Kevin Nicolas", "+5493825416602"));
		assertFalse(gestor.consultarExistenciaPasajero("25-23302555-6"));
	}
	@Test
	public void eliminarPasajero_EnviarCuil_Correcto()throws ExcepcionCampoIncorrecto{
		assertTrue(gestor.agregarUnPasajero("25-23302555-7", "Zalazar", "Kevin Nicolas", "+5493825416602"));
		assertTrue(gestor.agregarUnPasajero("25-23302555-4", "Zalazar", "Kevin Nicolas", "+5493825416602"));
		assertTrue(gestor.eliminarPasajero("25-23302555-4"));
	}
	@Test
	public void eliminarPasajero_EnviarCuil_Inorrecto()throws ExcepcionCampoIncorrecto{
		assertTrue(gestor.agregarUnPasajero("25-23302555-7", "Zalazar", "Kevin Nicolas", "+5493825416602"));
		assertTrue(gestor.agregarUnPasajero("25-23302555-4", "Zalazar", "Kevin Nicolas", "+5493825416602"));
		assertFalse(gestor.eliminarPasajero("25-23302555-9"));
	}
	@Test
	public void ModificarPasajero() throws ExcepcionCampoIncorrecto{
		assertTrue(gestor.agregarUnPasajero("25-23302555-7", "Zalazar", "Kevin Nicolas", "+5493825416602"));
		assertTrue(gestor.modificarPasajeroPorCuil("25-23302555-7", "25-23302555-4", "Lopez", "Kevin Manuel", "+5493825434455"));
	}
	
}
