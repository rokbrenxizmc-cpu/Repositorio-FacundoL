package Trabajo_3;

public class Casa extends Edificio{
	private String tieneJardin, tieneGarage;
	private int cantidadPisos;
	public String getTieneJardin() {
		return tieneJardin;
	}
	public void setTieneJardin(String tieneJardin) {
		this.tieneJardin = tieneJardin;
	}
	public String getTieneGarage() {
		return tieneGarage;
	}
	public void setTieneGarage(String tieneGarage) {
		this.tieneGarage = tieneGarage;
	}
	public int getCantidadPisos() {
		return cantidadPisos;
	}
	public void setCantidadPisos(int cantidadPisos) {
		this.cantidadPisos = cantidadPisos;
	}
	public Casa(String direccion, int cantidadHabitaciones, double superficie, String tieneJardin, String tieneGarage,
			int cantidadPisos) {
		super(direccion, cantidadHabitaciones, superficie);
		this.tieneJardin = tieneJardin;
		this.tieneGarage = tieneGarage;
		this.cantidadPisos = cantidadPisos;
	}
	
}