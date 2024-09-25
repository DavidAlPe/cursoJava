package test.java;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import es.cursojava.inicio.Funciones.Utilidades;

public class PruebasTestJunit {
	//Patron AAA (Arrange,act, Assert)
	Utilidades utils;
	
	@Before
	public void preparacion() {
		System.out.println("Preparando");
		utils = new Utilidades();
		
	}
	
	@Test 
	public void validarEmailTest () {
		System.err.println("validarEmailTest");
		boolean valido = Utilidades.validarEmail("hola@hola.es");
		assertTrue (valido);
	}
	
	@Test (timeout =2000)
	public void validarEmailIncorrectoTest () {
		System.err.println("validarEmailIncorrectoTest");
		boolean valido = Utilidades.validarEmail("hola.es");
		assertFalse (valido);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void validaFuncionSuma() {
		Utilidades utils =new Utilidades();
		int resultado = utils.suma(5,3);
		
		assertEquals (8,resultado);
	}
	
	@Test
	public void validacionResta() {
		Utilidades utils =new Utilidades();
		int resultado = utils.resta(5,3);
		
		assertEquals (2,resultado);
	}
	@Test
	public void validacionMultiplica() {
		Utilidades utils =new Utilidades();
		int resultado = utils.multiplica(5,3);
		
		assertEquals (15,resultado);
	}
	
}
