package ar.edu.undec;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.Period;

import org.junit.Test;

public class PilotoUnitTest {
	LocalDate fechaNacimientoPiloto = LocalDate.of(1994, 7, 18);
	LocalDate otraFechaNacimientoPiloto = LocalDate.of(1995, 7, 18);
	@Test
	public void instanciarPiloto_TodosLosAtributos_Correctos() {
		Piloto unPiloto = new Piloto(1,"Apellido", "Nombres", "Documento", fechaNacimientoPiloto);
		assertEquals(1, unPiloto.getIdPiloto());
		assertEquals("Apellido", unPiloto.getApellidoPiloto());
		assertEquals("Nombres", unPiloto.getNombresPiloto());
		assertEquals("Documento", unPiloto.getDocumentoPiloto());
		assertEquals(fechaNacimientoPiloto, unPiloto.getFechaNacimientoPiloto());		
	}
	
	@Test
	public void instanciarPiloto_TodosLosAtributos_Incorrectos() {
		Piloto unPiloto = new Piloto(2,"Apellidos", "Nombre", "Documentos", fechaNacimientoPiloto);
		assertNotEquals(1, unPiloto.getIdPiloto());
		assertNotEquals("Apellido", unPiloto.getApellidoPiloto());
		assertNotEquals("Nombres", unPiloto.getNombresPiloto());
		assertNotEquals("Documento", unPiloto.getDocumentoPiloto());
		assertNotEquals(otraFechaNacimientoPiloto, unPiloto.getFechaNacimientoPiloto());		
	}
	@Test
	public void instanciarPiloto_todosLosAtributos_MayorDeEdad() {
		LocalDate fechaHoy = LocalDate.now();
		Piloto unPiloto = new Piloto(0, "Pozo", "Mauricio Gabriel", "38222630", fechaNacimientoPiloto);
		Period edad = Period.between(unPiloto.getFechaNacimientoPiloto(), fechaHoy);		
		assertTrue(edad.getYears() >= 18);
	}
}
