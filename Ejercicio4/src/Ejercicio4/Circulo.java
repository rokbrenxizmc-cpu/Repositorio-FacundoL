package Ejercicio4;

public class Circulo extends FiguraGeometrica {
	private double radio, diametro, circunferencia;

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public double getDiametro() {
		return diametro;
	}

	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}

	public double getCircunferencia() {
		return circunferencia;
	}

	public void setCircunferencia(double circunferencia) {
		this.circunferencia = circunferencia;
	}

	public Circulo(String color, double area, double perimetro, double radio, double diametro, double circunferencia) {
		super(color, area, perimetro);
		this.radio = radio;
		this.diametro = diametro;
		this.circunferencia = circunferencia;
	}

}