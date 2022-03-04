package aula20220304.calculadora;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Calculadora {

	public double somar(double v1, double v2) {
		//return 20.25;
		return v1 + v2;
	}

	public double subtrair(double v1, double v2) {
		return v1 - v2;
	}

	public double dividir(double v1, double v2) {
<<<<<<< HEAD
		if(v2 == 0) {
			throw new DivisãoPorZeroException();
		}
=======
>>>>>>> d539e2d3f50cb59fd379a2456b8d3da5479152ee
		BigDecimal aux = new BigDecimal(v1 / v2);
		aux = aux.setScale(6, RoundingMode.DOWN);
		return aux.doubleValue();
	}

	public double multiplicar(double v1, double v2) {
		return v1 * v2;
	}
<<<<<<< HEAD
	
	
=======
>>>>>>> d539e2d3f50cb59fd379a2456b8d3da5479152ee

}
