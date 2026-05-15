package Persona;

public class Alumno extends Persona {
	private String grado, grupo;
	private double promedio;

	public String getGrado() {
		return grado;
	}

	public void setGrado(String grado) {
		this.grado = grado;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public double getPromedio() {
		return promedio;
	}

	public void setPromedio(double promedio) {
		this.promedio = promedio;
	}

	public Alumno(String nombre, String apellido, String cedula, int edad, String grado, String grupo,
			double promedio) {
		super(nombre, apellido, cedula, edad);
		this.grado = grado;
		this.grupo = grupo;
		this.promedio = promedio;
	}

}
