package ar.edu.undec;

import static org.junit.Assert.*;

import org.junit.Test;

public class PasajeroUnitTest {

	@Test
	public void instanciarPasajero_TodosLosAtributos_Correctos() throws ExcepcionCampoIncorrecto{
		Pasajero unPasajero = new Pasajero(1,"22382226306","Pozo","Mauricio Gabriel","3825550019");
		assertEquals(1, unPasajero.getIdPasajero());
		assertEquals("22382226306", unPasajero.getCuil());
		assertEquals("Pozo", unPasajero.getApellido());
		assertEquals("Mauricio Gabriel", unPasajero.getNombres());
		assertEquals("3825550019", unPasajero.getTelefono());
	}
	
	@Test
	public void instanciarPasajero_TodosLosAtributos_Incorrectos() throws ExcepcionCampoIncorrecto {
		Pasajero unPasajero = new Pasajero(1,"22382226306","Pozo","Mauricio Gabriel","3825550019");
		assertNotEquals(0, unPasajero.getIdPasajero());
		assertNotEquals("27382226306", unPasajero.getCuil());
		assertNotEquals("Castro", unPasajero.getApellido());
		assertNotEquals("Mauricio Damian", unPasajero.getNombres());
		assertNotEquals("3825675846", unPasajero.getTelefono());
	}

}
