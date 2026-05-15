package Persona;

public class Director extends Persona {
	private int aniosDireccion;
	private String oficina, turno;

	public int getAniosDireccion() {
		return aniosDireccion;
	}

	public void setAniosDireccion(int añosDireccion) {
		this.aniosDireccion = añosDireccion;
	}

	public String getOficina() {
		return oficina;
	}

	public void setOficina(String oficina) {
		this.oficina = oficina;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public Director(String nombre, String apellido, String cedula, int edad, int aniosDireccion, String oficina,
			String turno) {
		super(nombre, apellido, cedula, edad);
		this.aniosDireccion = aniosDireccion;
		this.oficina = oficina;
		this.turno = turno;
	}

}
