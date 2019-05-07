package ar.edu.undec;

import static org.junit.Assert.*;

import java.util.List;

import javax.swing.text.StyledEditorKit.ForegroundAction;

import java.util.ArrayList;

import org.junit.Test;

public class AvionUnitTest {

	@Test
	public void instanciarAvion_TodosLosAtributos_Correctos() {
		List<Asiento> asientosDelAvion = new ArrayList<>();
		for(int i=1 ; i<=10 ; i++){
			asientosDelAvion.add(new Asiento(i, "A"+i));
		}
		Avion unAvion = new Avion(1,"Boeing","B78F9",asientosDelAvion);
		assertEquals(1, unAvion.getIdAvion());
		assertEquals("Boeing", unAvion.getModeloDelAvion());
		assertEquals("B78F9", unAvion.getMatriculaDelAvion());
		assertEquals(asientosDelAvion, unAvion.getAsientosDelAvion());
	}
	@Test
	public void instanciarAvion_TodosLosAtributos_Incorrectos() {
		List<Asiento> asientosDelAvion = new ArrayList<>();
		List<Asiento> asientosDeOtroAvion = new ArrayList<>();
		for(int i=1 ; i<=10 ; i++){
			asientosDelAvion.add(new Asiento(i, "A"+i));
			asientosDeOtroAvion.add(new Asiento(i, "B"+i));
		}
		Avion unAvion = new Avion(1,"Boeing","B78F9",asientosDelAvion);
		assertNotEquals(0, unAvion.getIdAvion());
		assertNotEquals("Boeing 2", unAvion.getModeloDelAvion());
		assertNotEquals("B78C9", unAvion.getMatriculaDelAvion());
		assertNotEquals(asientosDeOtroAvion, unAvion.getAsientosDelAvion());
	}

}
