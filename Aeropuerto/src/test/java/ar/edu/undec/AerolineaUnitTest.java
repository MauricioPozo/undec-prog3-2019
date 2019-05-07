package ar.edu.undec;

import static org.junit.Assert.*;

import org.junit.Test;

public class AerolineaUnitTest {

	@Test
	public void intanciarAerolinea_TodoslosAtributos_Correctos() {
		Aerolinea unaAerolinea = new Aerolinea(1,"Avianca");
		assertEquals (1, unaAerolinea.getIdAerolinea().intValue());
		assertEquals ("Avianca", unaAerolinea.getNombre());
	}
	@Test
	public void intanciarAerolinea_TodosLosAtributos_IdIncorrexto() {
		Aerolinea unaAerolinea = new Aerolinea(1,"Avianca");
		assertEquals("Avianca", unaAerolinea.getNombre());
		assertNotEquals(0, unaAerolinea.getIdAerolinea().intValue());
	}
	@Test
	public void intanciarAerolinea_TodosLosAtributos_NombreIncorrexto() {
		Aerolinea unaAerolinea = new Aerolinea(1,"Avianca");
		assertNotEquals("Aerolineas AR", unaAerolinea.getNombre());
		assertEquals(1, unaAerolinea.getIdAerolinea().intValue());
	}
	@Test
	public void intanciarAerolinea_TodosLosAtributos_Incorrectos() {
		Aerolinea unaAerolinea = new Aerolinea(1,"Avianca");
		assertNotEquals("Aerolineas AR", unaAerolinea.getNombre());
		assertNotEquals(0, unaAerolinea.getIdAerolinea().intValue());
	}
}
