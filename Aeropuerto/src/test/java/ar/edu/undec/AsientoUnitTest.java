package ar.edu.undec;

import static org.junit.Assert.*;

import org.junit.Test;

public class AsientoUnitTest {

	@Test
	public void instanciarAsiento_TodosLosAtributos_Correctos(){
		Asiento unAsiento = new Asiento(1,"A113");
		assertEquals(1, unAsiento.getIdAsiento());
		assertEquals("A113", unAsiento.getNumeroAsiento());
	}
	@Test
	public void instanciarAsiento_TodosLosAtributos_Incorrectos(){
		Asiento unAsiento = new Asiento(1,"A113");
		assertNotEquals(2, unAsiento.getIdAsiento());
		assertNotEquals("B113", unAsiento.getNumeroAsiento());
	}

}
