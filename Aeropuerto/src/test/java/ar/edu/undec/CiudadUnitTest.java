package ar.edu.undec;

import static org.junit.Assert.*;

import org.junit.Test;

public class CiudadUnitTest {
	@Test
	public void instanciarCiudad_TodosLosAtributos_Correctos() throws ExcepcionCampoIncorrecto {
		Ciudad unaCiudad = new Ciudad(1,"Chilecito","5360");
		assertEquals(1, unaCiudad.getIdCiudad());
		assertEquals("Chilecito", unaCiudad.getNombreCiudad());
		assertEquals("5360", unaCiudad.getCodigoPostal());
		
	}
	
	@Test
	public void instanciarCiudad_TodosLosAtributos_Incorrectos()throws ExcepcionCampoIncorrecto {
		Ciudad unaCiudad = new Ciudad(1,"Chilecito","5360");
		assertNotEquals(2, unaCiudad.getIdCiudad());
		assertNotEquals("Anguinan", unaCiudad.getNombreCiudad());
		assertNotEquals("5363", unaCiudad.getCodigoPostal());
		
	}
	
	@Test
	public void instanciarCiudad_CiudadyCodigo_Incorrectos()throws ExcepcionCampoIncorrecto {
		Ciudad unaCiudad = new Ciudad(1,"Chilecito","5360");
		assertEquals(1, unaCiudad.getIdCiudad());
		assertNotEquals("Anguinan", unaCiudad.getNombreCiudad());
		assertNotEquals("5363", unaCiudad.getCodigoPostal());
		
	}
	
	@Test
	public void instanciarCiudad_IdyCiudad_Incorrectos()throws ExcepcionCampoIncorrecto {
		Ciudad unaCiudad = new Ciudad(1,"Chilecito","5360");
		assertNotEquals(0, unaCiudad.getIdCiudad());
		assertNotEquals("Anguinan", unaCiudad.getNombreCiudad());
		assertEquals("5360", unaCiudad.getCodigoPostal());
		
	}
	@Test
	public void instanciarCiudad_IdyCodigo_Incorrectos()throws ExcepcionCampoIncorrecto {
		Ciudad unaCiudad = new Ciudad(1,"Chilecito","5360");
		assertNotEquals(0, unaCiudad.getIdCiudad());
		assertEquals("Chilecito", unaCiudad.getNombreCiudad());
		assertNotEquals("5363", unaCiudad.getCodigoPostal());
		
	}
	
}
