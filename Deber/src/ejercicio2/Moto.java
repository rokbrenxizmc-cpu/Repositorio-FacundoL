package ejercicio2;

public class Moto extends Vehiculo {
	String cilindrada, tieneBaulera;

	public String getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(String cilindrada) {
		this.cilindrada = cilindrada;
	}

	public String getTieneBaulera() {
		return tieneBaulera;
	}

	public void setTieneBaulera(String tieneBaulera) {
		this.tieneBaulera = tieneBaulera;
	}

	public Moto(String marca, String modelo, double velocidad, String cilindrada, String tieneBaulera) {
		super(marca, modelo, velocidad);
		this.cilindrada = cilindrada;
		this.tieneBaulera = tieneBaulera;
	}

}