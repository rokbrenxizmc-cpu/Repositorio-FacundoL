package Trabajo_4;

public class Escultura extends ObraArte {
	private String material;
	private double altura;
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public Escultura(String titulo, String autor, int anioCreacion, String material, double altura) {
		super(titulo, autor, anioCreacion);
		this.material = material;
		this.altura = altura;
	}
	
}
