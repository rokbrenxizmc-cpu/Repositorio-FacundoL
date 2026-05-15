package ejercicio2;

public class Auto extends Vehiculo {
	private int cantidadPuertas;
	private String tipoCombustible;

	public int getCantidadPuertas() {
		return cantidadPuertas;
	}

	public void setCantidadPuertas(int cantidadPuertas) {
		this.cantidadPuertas = cantidadPuertas;
	}

	public String getTipoCombustible() {
		return tipoCombustible;
	}

	public void setTipoCombustible(String tipoCombustible) {
		this.tipoCombustible = tipoCombustible;
	}

	public Auto(String marca, String modelo, double velocidad, int cantidadPuertas, String tipoCombustible) {
		super(marca, modelo, velocidad);
		this.cantidadPuertas = cantidadPuertas;
		this.tipoCombustible = tipoCombustible;
	}

}
