package Jardel;

public class Calculadora {

	public double somar(int v1, double v2) {
		//return 20.25;
		return v1 + v2;
	}
	public double sub(int v1, double v2) {
		//return 0.25;
		return v1 - v2;
	}
	public double div(int v1, double v2) {
		if(v2 == 0) {
			throw new DivisãoPorZeroException();
		}
		//return 0.95;
		return v1 / v2;
	}
	public double mult(int v1, double v2) {
		//return 105.00;
		return v1 * v2;
	}
}
