package Trabajo_3;

public class Apartamento extends Edificio{
	private int numeroPiso;
	private double gastosComunes;
	public int getNumeroPiso() {
		return numeroPiso;
	}
	public void setNumeroPiso(int numeroPiso) {
		this.numeroPiso = numeroPiso;
	}
	public double getGastosComunes() {
		return gastosComunes;
	}
	public void setGastosComunes(double gastosComunes) {
		this.gastosComunes = gastosComunes;
	}
	public Apartamento(String direccion, int cantidadHabitaciones, double superficie, int numeroPiso, double gastosComunes) {
		super(direccion, cantidadHabitaciones, superficie);
		this.numeroPiso = numeroPiso;
		this.gastosComunes = gastosComunes;
	}
	
}
