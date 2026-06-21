package Trabajo_3;

public abstract class Edificio {
	private String direccion;
	private int cantidadHabitaciones;
	private double superficie;
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getCantidadHabitaciones() {
		return cantidadHabitaciones;
	}
	public void setCantidadHabitaciones(int cantidadHabitaciones) {
		this.cantidadHabitaciones = cantidadHabitaciones;
	}
	public double getSuperficie() {
		return superficie;
	}
	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}
	public Edificio(String direccion, int cantidadHabitaciones, double superficie) {
		super();
		this.direccion = direccion;
		this.cantidadHabitaciones = cantidadHabitaciones;
		this.superficie = superficie;
	}
	
}
