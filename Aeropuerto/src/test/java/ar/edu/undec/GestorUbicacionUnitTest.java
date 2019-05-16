package ar.edu.undec;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class GestorUbicacionUnitTest {
	GestorUbicaciones gestor = new GestorUbicaciones();
	
	@Test
	public void crearCiudad_TodosLosAtributos_Correctos(){
		assertTrue(gestor.agregarCiudad("La Rioja", "5300"));
	}
	@Test
	public void crearCiudad_TodosLosAtributos_Vacios(){
		assertFalse(gestor.agregarCiudad("", ""));
	}
	@Test
	public void crearCiudad_CodigoPostalVacio(){
		assertFalse(gestor.agregarCiudad("La Rioja", ""));
	}
	@Test
	public void crearCiudad_CodigoPostalExistente(){
		assertTrue(gestor.agregarCiudad("La Rioja", "5300"));
		assertFalse(gestor.agregarCiudad("Cordoba", "5300"));
	}
	@Test
	public void buscarCiudadConCodigoPostalExistente(){
		assertTrue(gestor.agregarCiudad("La Rioja", "5300"));
		assertTrue(gestor.consultarCiudadSiExiste("5300"));
	}
	@Test
	public void buscarCiudadConCodigoPostalNoExistente(){
		assertTrue(gestor.agregarCiudad("La Rioja", "5300"));
		assertFalse(gestor.consultarCiudadSiExiste("5100"));
	}
	
	
	@Test
	public void actualizarCiudad_EnviarCodigoPostalYNombre_AfirmarCambioPorCiudadExistente() {
		assertTrue(gestor.agregarCiudad("Chilecito", "5360"));
		assertTrue(gestor.modificarCiudad("5360", "Chile Cito", "5360"));
	}
	
	@Test
	public void actualizarCiudad_EnviarCodigoPostalYNombre_NegarCambioPorCiudadInexistente() {
		assertTrue(gestor.agregarCiudad("Chilecito", "5360"));
		assertFalse(gestor.modificarCiudad("5860", "Chile Cito", "5860"));
	}
	
	@Test
	public void eliminarCiudad_EnviarCodigoPostal_AfirmarEliminacion() {
		assertTrue(gestor.agregarCiudad("Chilecito", "5360"));
		assertTrue(gestor.eliminarCiudadPorCP("5360"));
	}
	
	@Test
	public void eliminarCiudad_EnviarCodigoPostal_NegarEliminacionPorCiudadInexistente() {
		assertTrue(gestor.agregarCiudad("Chilecito", "5360"));
		assertFalse(gestor.eliminarCiudadPorCP("5860"));
	}
	
	@Test
	public void crearAeropuerto_TodosLosAtributos_Correctos() {
		assertTrue(gestor.agregarCiudad("Chilecito", "5360"));
		Ciudad almacenar = gestor.traerCiudadPorCP("5360");
		assertTrue(gestor.agregarAeropuerto("San Buena Aventura", almacenar, "25FG14"));
	}
	
	@Test
	public void crearAeropuerto_TodosLosAtributos_CodigoVacio() {
		assertTrue(gestor.agregarCiudad("Chilecito", "5360"));
		Ciudad almacenar = gestor.traerCiudadPorCP("5360");
		assertFalse(gestor.agregarAeropuerto("San Buena Aventura", almacenar, ""));
	}
	
	@Test
	public void consultarAeropuerto_EnviarNombre_AfirmarExistencia() {
		assertTrue(gestor.agregarCiudad("Chilecito", "5360"));
		Ciudad almacenar = gestor.traerCiudadPorCP("5360");
		assertTrue(gestor.agregarAeropuerto("San Buena Aventura", almacenar, "25FG14"));
		assertTrue(gestor.consultarAeropuertoSiExiste("25FG14"));
	}
	
	@Test
	public void consultarAeropuerto_EnviarNombre_NegarExistencia() {
		assertFalse(gestor.consultarAeropuertoSiExiste("25GF41"));
	}
	
	@Test
	public void actualizarAeropuerto_EnviarCodigoYNombre_AfirmarCambioPorAeropuertoExistente() {
		assertTrue(gestor.agregarCiudad("Chilecito", "5360"));
		Ciudad almacenar = gestor.traerCiudadPorCP("5360");
		assertTrue(gestor.agregarAeropuerto("San Buena Aventura", almacenar, "25FG14"));
		assertTrue(gestor.modificarNombreAeropuento("25FG14", "San Juan Pedegrin"));
	}
	
	@Test
	public void actualizarAeropuerto_EnviarCodigoYNombre_NegarCambioPorAeropuertoExistente() {
		assertTrue(gestor.agregarCiudad("Chilecito", "5360"));
		Ciudad almacenar = gestor.traerCiudadPorCP("5360");
		assertTrue(gestor.agregarAeropuerto("San Buena Aventura", almacenar, "25FG14"));
		assertFalse(gestor.modificarNombreAeropuento("28FG14", "San Juan Pedegrin"));
	}
	
	@Test
	public void eliminarAeropuerto_EnviarCodigo_AfirmarEliminacion() {
		assertTrue(gestor.agregarCiudad("Chilecito", "5360"));
		Ciudad almacenar = gestor.traerCiudadPorCP("5360");
		assertTrue(gestor.agregarAeropuerto("San Buena Aventura", almacenar, "25FG14"));
		assertTrue(gestor.eliminarAeropuertoPorCodigo("25FG14"));
	}
	
	@Test
	public void eliminarAeropuerto_EnviarCodigo_NegarEliminacionPorAeropuertoInexistente() {
		assertTrue(gestor.agregarCiudad("Chilecito", "5360"));
		Ciudad almacenar = gestor.traerCiudadPorCP("5360");
		assertTrue(gestor.agregarAeropuerto("San Buena Aventura", almacenar, "25FG14"));
		assertFalse(gestor.eliminarAeropuertoPorCodigo("28FG14"));
	}
}
