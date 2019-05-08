package ar.edu.undec;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class VueloUnitTest {
	
	
	@Test
	public void intanciarUnVuelo_TodosLosAtributos_Correctos() {
		Ciudad CiudadAeropuertoSalida = new Ciudad(23, "Buenos Aires", "1011");
		Ciudad CiudadAeropuertoArribo = new Ciudad(15, "Córdoba", "5010");
		Aeropuerto aeropuertoDeSalida = new Aeropuerto(1,"Ezeiza",CiudadAeropuertoSalida,"aNtehsafT2220055");
		Aeropuerto aeropuertoDeArribo = new Aeropuerto(1,"Ezeiza",CiudadAeropuertoArribo,"aBhgyUUT2220055");
		LocalDate fechaSalida = LocalDate.of(2019, 2, 3);
		LocalDate fechaArribo = LocalDate.of(2019, 2, 3);
		Aerolinea unaAerolinea = new Aerolinea(1,"Avianca");
		List<Piloto> pilotos = new ArrayList<>();
		List<Pasajero> pasajeros = new ArrayList<>();
		List<Asiento> asientosDelAvion = new ArrayList<>();
		for(int i=1 ; i<=10 ; i++){
			asientosDelAvion.add(new Asiento(i, "A"+i));
		}
		Avion unAvion = new Avion(1,"Boeing","B78F9",asientosDelAvion);
		pilotos.add(new Piloto(1,"Apellido1", "Nombres1", "Documento1", LocalDate.of(1993, 8, 26)));
		pilotos.add(new Piloto(2,"Apellido2", "Nombres2", "Documento2", LocalDate.of(1989, 11, 4)));
		pasajeros.add(new Pasajero(1,"22382226306","Pozo","Mauricio Gabriel","3825550019"));
		pasajeros.add(new Pasajero(2,"20374929330","Paez","Daniel Marcelo","3825416602"));
		Vuelo nuevoVuelo = new Vuelo("YgRTcv582", aeropuertoDeSalida,fechaSalida,aeropuertoDeArribo,fechaArribo, unaAerolinea, pilotos, unAvion, pasajeros);
		assertEquals("YgRTcv582", nuevoVuelo.getCodigoDeVuelo());
		assertEquals(fechaSalida, nuevoVuelo.getFechaHoraSalidaVuelo());
		assertEquals(aeropuertoDeSalida, nuevoVuelo.getAeropuertoDeSalida());
		assertEquals(aeropuertoDeArribo, nuevoVuelo.getAeropuertoDeArribo());
		assertEquals(fechaArribo, nuevoVuelo.getFechaHoraArriboVuelo());
		assertEquals(unaAerolinea, nuevoVuelo.getAerolineaDelVuelo());
		assertEquals(pilotos, nuevoVuelo.getPilotosDelVuelo());
		assertEquals(pasajeros, nuevoVuelo.getPasajerosDelVuelo());
		assertEquals(unAvion, nuevoVuelo.getAvionDelVuelo());		
	}

}
