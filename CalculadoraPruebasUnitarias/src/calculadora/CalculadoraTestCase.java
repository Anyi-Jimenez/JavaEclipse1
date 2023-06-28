package calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class CalculadoraTestCase {

	@Test
	void testSumar() {
		
		//Para esta prueba espero que la suma
		int resultado = Calculadora.sumar(2,3);
		assertEquals(5, resultado);//Lo que espero y o que tengo
		
		
		

	}//test sumar
	
	
	@Test
	void testMultiplicar() {
		int resultado = Calculadora.multiplicar(2, 3);
		assertEquals(6, resultado);//Lo que espero y lo que tengo
	}
	
	@Test
	void testDividir() {
		float resultado = Calculadora.dividir(6.0f,2.0f);//3
		assertEquals(3.0,resultado);// Lo que espero y lo que tengo
	}//Test dividir
	
	/*
	@Test(expected = ArithmeticException.class)
	void testDividir() {
		float resultado = Calculadora.dividir(6.0f,2.0f);//3
		assertEquals(3.0,resultado);// Lo que espero y lo que tengo
	}//Test dividir
	*/


}
