package aula20220304.calculadora;

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
	public void teste_de_subtração() {
		Calculadora calc = new Calculadora();
		double total = calc.subtrair(10, 10.25);		
		assertEquals(-0.25, total, 0);
		
		total = calc.subtrair(77, 15);		
		assertEquals(62, total, 0);

	}
	@Test
	public void teste_de_divisão() {
		Calculadora calc = new Calculadora();
<<<<<<< HEAD
		double total = calc.dividir(35, 7);		
		assertEquals(5, total, 0);
		
		total = calc.dividir(27, 3);		
		assertEquals(9, total, 0);
=======
		double total = calc.dividir(10, 2);		
		assertEquals(5, total, 0);
		
		total = calc.dividir(15, 3);		
		assertEquals(5, total, 0);
>>>>>>> d539e2d3f50cb59fd379a2456b8d3da5479152ee
		
		total = calc.dividir(16, 3.3);		
		assertEquals(4.848484, total, 0);


	}
	@Test
	public void teste_de_multiplicação() {
		Calculadora calc = new Calculadora();
		double total = calc.multiplicar(10, 3.5);		
		assertEquals(35, total, 0);
		
		total = calc.multiplicar(15, 3);		
		assertEquals(45, total, 0);
<<<<<<< HEAD
	}
	
	@Test(expected = DivisãoPorZeroException.class)
	public void teste_de_div_zero() {
		Calculadora calc = new Calculadora();
		double total = calc.div(10, 0);		
				
=======

	}
>>>>>>> d539e2d3f50cb59fd379a2456b8d3da5479152ee

}
