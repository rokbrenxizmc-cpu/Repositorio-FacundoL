package Persona;

public class Profesor extends Persona {
	private String materia;
	private int antiguedad;
	private double salario;

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Profesor(String nombre, String apellido, String cedula, int edad, String materia, int antiguedad,
			double salario) {
		super(nombre, apellido, cedula, edad);
		this.materia = materia;
		this.antiguedad = antiguedad;
		this.salario = salario;
	}

}
