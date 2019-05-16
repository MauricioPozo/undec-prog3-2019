package ar.edu.undec;

import static org.junit.Assert.*;

import org.junit.Test;

public class AeropuertoUnitTest {
	
	@Test
	public void instanciaAeropuesto_TodosLosAtributos_Correctos() throws ExcepcionCampoIncorrecto{
		Ciudad unaCiudad = new Ciudad(23, "Buenos Aires", "1011");
		Aeropuerto unAeropuerto = new Aeropuerto(1,"Ezeiza",unaCiudad,"aNtehsafT2220055");
		assertEquals(1, unAeropuerto.getIdAeropuerto());
		assertEquals("Ezeiza", unAeropuerto.getNombreAeropuerto());
		assertEquals(unaCiudad, unAeropuerto.getCiudad());
		assertEquals("aNtehsafT2220055", unAeropuerto.getCodigoAeropuerto());
	}
	@Test
	public void instanciaAeropuesto_TodosLosAtributos_Inorrectos() throws ExcepcionCampoIncorrecto{
		Ciudad unaCiudad = new Ciudad(23, "Buenos Aires", "1011");
		Ciudad otraCiudad = new Ciudad(15, "Córdoba", "5010");
		Aeropuerto unAeropuerto = new Aeropuerto(1,"Ezeiza",unaCiudad,"aNtehsafT2220055");
		assertNotEquals(0, unAeropuerto.getIdAeropuerto());
		assertNotEquals("La Rioja", unAeropuerto.getNombreAeropuerto());
		assertNotEquals(otraCiudad, unAeropuerto.getCiudad());
		assertNotEquals("aNtBhsafT2220055", unAeropuerto.getCodigoAeropuerto());
	}

}
