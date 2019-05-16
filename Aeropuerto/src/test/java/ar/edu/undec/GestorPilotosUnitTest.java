package ar.edu.undec;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.time.LocalDate;
import org.junit.Test;

public class GestorPilotosUnitTest {
	GestorDePilotos gestor = new GestorDePilotos();
	
	@Test
	public void agregarPiloto_TodosLosAtribiutos_Correcto() throws ExcepcionCampoIncorrecto {
		assertTrue(gestor.agregarUnPiloto("Zalazar", "Pedro Nicolas", "12659847", LocalDate.of(1988, 5, 11)));
	}
	@Test
	public void agregarPiloto_TodosLosAtribiutos_DocumentoIncorrecto() throws ExcepcionCampoIncorrecto {
		assertFalse(gestor.agregarUnPiloto("Zalazar", "Pedro Nicolas", "", LocalDate.of(1988, 5, 11)));
	}
	@Test
	public void agregarPiloto_TodosLosAtribiutos_FechaNacimientoIncorrecta() throws ExcepcionCampoIncorrecto {
		assertFalse(gestor.agregarUnPiloto("Zalazar", "Pedro Nicolas", "12659847", LocalDate.of(2011, 5, 11)));
	}
	@Test
	public void existePiloto_PorDocumento() throws ExcepcionCampoIncorrecto {
		assertTrue(gestor.agregarUnPiloto("Zalazar", "Pedro Nicolas", "12659847", LocalDate.of(1988, 5, 11)));
		assertTrue(gestor.consultarExistenciaPiloto("12659847"));
	}
	@Test
	public void TraerUnPiloto_PorDocumento() throws ExcepcionCampoIncorrecto {
		Piloto unPiloto = new Piloto();
		assertTrue(gestor.agregarUnPiloto("Zalazar", "Pedro Nicolas", "12659847", LocalDate.of(1988, 5, 11)));
		unPiloto = gestor.traerPilotoPorDocumento("12659847");
		assertEquals(unPiloto, gestor.traerPilotoPorDocumento("12659847"));
	}
	@Test
	public void eliminarPiloto_DocumentoCorrecto()throws ExcepcionCampoIncorrecto{
		assertTrue(gestor.agregarUnPiloto("Zalazar", "Pedro Nicolas", "12659847", LocalDate.of(1988, 5, 11)));
		assertTrue(gestor.eliminarPiloto("12659847"));
	}
	@Test
	public void eliminarPiloto_DocumentoIncorrecto()throws ExcepcionCampoIncorrecto{
		assertTrue(gestor.agregarUnPiloto("Zalazar", "Pedro Nicolas", "12659847", LocalDate.of(1988, 5, 11)));
		assertFalse(gestor.eliminarPiloto("12595447"));
	}
	@Test
	public void ModificarPiloto() throws ExcepcionCampoIncorrecto{
		assertTrue(gestor.agregarUnPiloto("Zalazar", "Pedro Nicolas", "12659847", LocalDate.of(1988, 5, 11)));
		assertTrue(gestor.modificarPilotoPorDocumento("12659847", "Perez", "Pedro Nicolas", "12659847", LocalDate.of(1989, 5, 11)));
	}
}
