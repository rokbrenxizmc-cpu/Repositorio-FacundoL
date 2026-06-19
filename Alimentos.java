package Trabajo;

public class Alimentos extends Producto{
	private String fechaVencimiento, peso, calorias;

	public String getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(String fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public String getPeso() {
		return peso;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}

	public String getCalorias() {
		return calorias;
	}

	public void setCalorias(String calorias) {
		this.calorias = calorias;
	}

	public Alimentos(String nombre, String codigo, double precio, String fechaVencimiento, String peso, String calorias) {
		super(nombre, codigo, precio);
		this.fechaVencimiento = fechaVencimiento;
		this.peso = peso;
		this.calorias = calorias;
	}
	
}
