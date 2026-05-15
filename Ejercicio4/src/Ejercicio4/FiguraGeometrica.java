package Ejercicio4;

public abstract class FiguraGeometrica {
	private String color;
	private double area, perimetro;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getPerimetro() {
		return perimetro;
	}

	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}

	public FiguraGeometrica(String color, double area, double perimetro) {
		super();
		this.color = color;
		this.area = area;
		this.perimetro = perimetro;
	}

}
