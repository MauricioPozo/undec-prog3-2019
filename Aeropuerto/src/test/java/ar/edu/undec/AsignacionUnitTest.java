package ar.edu.undec;

import static org.junit.Assert.*;

import org.junit.Test;

public class AsignacionUnitTest {
	Asiento unAsiento = new Asiento(1,"A113");
	
	@Test
	public void instanciarAsignacion_TodosLosAtributos_Correctos() throws ExcepcionCampoIncorrecto {
		Pasajero unPasajero = new Pasajero(1,"22382226306","Pozo","Mauricio Gabriel","3825550019");
		Asignacion unaAsignacion = new Asignacion(unPasajero, unAsiento,"AhgstJKUsh254");
		assertEquals(unPasajero, unaAsignacion.getPasajero());
		assertEquals(unAsiento, unaAsignacion.getAsiento());
		assertEquals("AhgstJKUsh254", unaAsignacion.getCodigoAsignacion());
	}
}
