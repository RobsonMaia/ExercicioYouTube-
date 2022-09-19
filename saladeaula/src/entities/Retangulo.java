package entities;

public class Retangulo {

	public int v;
	public int h;

	public int perimetro() {
		return 2 * (v + h);
	}

	public int area() {
		return v * h;
	}

	public double diagonal() {
		return Math.sqrt(v * v + h * h);
	}

}
