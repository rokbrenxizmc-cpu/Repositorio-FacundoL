package ejercicio2;

public abstract class Vehiculo {
	public String marca, modelo;
	public double velocidad;

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}

	public Vehiculo(String marca, String modelo, double velocidad) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.velocidad = velocidad;
	}

}
