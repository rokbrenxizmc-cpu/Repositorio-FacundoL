package Trabajo;

public class Ropa extends Producto{
	private String talla, color, material;

	public String getTalla() {
		return talla;
	}

	public void setTalla(String talla) {
		this.talla = talla;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public Ropa(String nombre, String codigo, double precio, String talla, String color, String material) {
		super(nombre, codigo, precio);
		this.talla = talla;
		this.color = color;
		this.material = material;
	}
	
}
