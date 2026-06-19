package Trabajo;

public class Electronica extends Producto{
	private String marca, garantiaMeses, voltaje;

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getGarantiaMeses() {
		return garantiaMeses;
	}

	public void setGarantiaMeses(String garantiaMeses) {
		this.garantiaMeses = garantiaMeses;
	}

	public String getVoltaje() {
		return voltaje;
	}

	public void setVoltaje(String voltaje) {
		this.voltaje = voltaje;
	}

	public Electronica(String nombre, String codigo, double precio, String marca, String garantiaMeses, String voltaje) {
		super(nombre, codigo, precio);
		this.marca = marca;
		this.garantiaMeses = garantiaMeses;
		this.voltaje = voltaje;
	}
	 
}
