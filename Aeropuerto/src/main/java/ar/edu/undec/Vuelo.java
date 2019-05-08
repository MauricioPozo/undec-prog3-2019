package ar.edu.undec;

import java.time.LocalDate;
import java.util.List;

public class Vuelo {
	private String codigoDeVuelo;
	private Aeropuerto salidaDelVuelo;
	private LocalDate fechaHoraSalidaVuelo;
	private Aeropuerto arriboDelVuelo;
	private LocalDate fechaHoraArriboVuelo;
	private Aerolinea aerolineaDelVuelo;
	private List<Piloto> pilotosDelVuelo;
	private Avion avionDelVuelo;
	private List<Pasajero> pasajerosDelVuelo;
	
	public Vuelo(String codigoDeVuelo, Aeropuerto salidaDelVuelo, LocalDate fechaHoraSalidaVuelo,
			Aeropuerto arriboDelVuelo, LocalDate fechaHoraArriboVuelo, Aerolinea aerolineaDelVuelo,
			List<Piloto> pilotosDelVuelo, Avion avionDelVuelo, List<Pasajero> pasajerosDelVuelo) {
		this.codigoDeVuelo = codigoDeVuelo;
		this.salidaDelVuelo = salidaDelVuelo;
		this.fechaHoraSalidaVuelo = fechaHoraSalidaVuelo;
		this.arriboDelVuelo = arriboDelVuelo;
		this.fechaHoraArriboVuelo = fechaHoraArriboVuelo;
		this.aerolineaDelVuelo = aerolineaDelVuelo;
		this.pilotosDelVuelo = pilotosDelVuelo;
		this.avionDelVuelo = avionDelVuelo;
		this.pasajerosDelVuelo = pasajerosDelVuelo;
	}

	public String getCodigoDeVuelo() {
		return codigoDeVuelo;
	}

	public Aeropuerto getAeropuertoDeSalida() {
		return salidaDelVuelo;
	}

	public LocalDate getFechaHoraSalidaVuelo() {
		return fechaHoraSalidaVuelo;
	}

	public Aeropuerto getAeropuertoDeArribo() {
		return arriboDelVuelo;
	}

	public LocalDate getFechaHoraArriboVuelo() {
		return fechaHoraArriboVuelo;
	}

	public Aerolinea getAerolineaDelVuelo() {
		return aerolineaDelVuelo;
	}

	public List<Piloto> getPilotosDelVuelo() {
		return pilotosDelVuelo;
	}

	public Avion getAvionDelVuelo() {
		return avionDelVuelo;
	}

	public List<Pasajero> getPasajerosDelVuelo() {
		return pasajerosDelVuelo;
	}
}
