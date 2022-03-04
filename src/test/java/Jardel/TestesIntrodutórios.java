package Jardel;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestesIntrodutórios {

	@Test
	public void teste_de_soma() {
		Calculadora calc = new Calculadora();
		double total = calc.somar(10, 10.25);		
		assertEquals(20.25, total, 0);
		
		total = calc.somar(15, 77.10);		
		assertEquals(92.10, total, 0);

	}
	@Test
	public void teste_sub() {
		Calculadora calc = new Calculadora();
		double total = calc.sub(10, 10.25);		
		assertEquals(-0.25, total, 0);
		
		total = calc.sub(15, 77.0);		
		assertEquals(-62.0, total, 0);
	}
	@Test(expected = DivisãoPorZeroException.class)
	public void teste3() {
		Calculadora calc = new Calculadora();
		double total = calc.div(10, 10.0);		
		assertEquals(1.0, total, 0);
		
		total = calc.div(15, 3.0);		
		assertEquals(5.0, total, 0);
	}
	@Test
	public void teste4() {
		Calculadora calc = new Calculadora();
		double total = calc.mult(10, 10.5);		
		assertEquals(105.00, total, 0);
		
		total = calc.mult(15, 3.10);		
		assertEquals(46.50, total, 0);
	}

}
