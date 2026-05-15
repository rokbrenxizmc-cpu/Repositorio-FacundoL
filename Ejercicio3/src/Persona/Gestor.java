package Persona;

public class Gestor {

	public static void main(String[] args) {

		Alumno alumno1 = new Alumno("Alejandro", "Guevara", "3434343", 16, "Segundo informatica", "3B", 8.5);
		Profesor profesor1 = new Profesor("Martín", "Batista", "8657393", 35, "Redes informáticas", 3, 50000);
		Director director1 = new Director("Javier", "Ramos", "5947204", 37, 7, "2A", "Matutino");
		System.out.println("---------- ALUMNO ----------");
		System.out.println("Nombre: " + alumno1.getNombre());
		System.out.println("Apellido: " + alumno1.getApellido());
		System.out.println("Cedula: " + alumno1.getCedula());
		System.out.println("Edad: " + alumno1.getEdad());
		System.out.println("Grado: " + alumno1.getGrado());
		System.out.println("Grupo: " + alumno1.getGrupo());
		System.out.println("Promedio: " + alumno1.getPromedio());

		System.out.println("\n---------- PROFESOR ---------");
		System.out.println("Nombre: " + profesor1.getNombre());
		System.out.println("Apellido: " + profesor1.getApellido());
		System.out.println("Cedula: " + profesor1.getCedula());
		System.out.println("Edad: " + profesor1.getEdad());
		System.out.println("Materia: " + profesor1.getMateria());
		System.out.println("Años enseñando: " + profesor1.getAntiguedad());
		System.out.println("Salario: " + profesor1.getSalario());

		System.out.println("\n---------- DIRECTOR ---------");
		System.out.println("Nombre: " + director1.getNombre());
		System.out.println("Apellido: " + director1.getApellido());
		System.out.println("Cedula: " + director1.getCedula());
		System.out.println("Edad: " + director1.getEdad());
		System.out.println("Años de experiencia: " + director1.getAniosDireccion());
		System.out.println("Oficina: " + director1.getOficina());
		System.out.println("Turno: " + director1.getTurno());

	}

}
