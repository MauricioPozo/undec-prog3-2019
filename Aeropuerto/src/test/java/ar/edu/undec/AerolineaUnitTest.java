package ar.edu.undec;

import static org.junit.Assert.*;

import org.junit.Test;

public class AerolineaUnitTest {

	@Test
	public void intanciarAerolinea_TodoslosAtributos_correctos() {
		Aerolinea unaAerolinea = new Aerolinea(1,"Avianca");
		assertEquals (1, unaAerolinea.getIdAerolinea());
		assertEquals ("Avianca", unaAerolinea.getNombre());
	}
}
