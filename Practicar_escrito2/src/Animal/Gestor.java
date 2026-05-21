package Animal;

import java.util.Scanner;

public class Gestor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		Gato gato1 = null;
		Perro perro1 = null;
		while (opcion != 5) {
			System.out.println("ELIJA UNA OPCION:");
			System.out.println("1) Registrar Perro");
			System.out.println("2) Registrar Gato");
			System.out.println("3) Ver Perro");
			System.out.println("4) Ver Gato");
			System.out.println("5) Salir");
			opcion = sc.nextInt();
			sc.nextLine();
			switch (opcion) {
			case 1:

				System.out.println("Ingrese el nombre: ");
				String nombre = sc.nextLine();

				System.out.println("Ingrese el peso: ");
				String peso = sc.nextLine();
				System.out.println("Ingrese la edad: ");
				int edad = sc.nextInt();
				sc.nextLine();
				System.out.println("Ingrese la raza: ");
				String raza = sc.nextLine();
				System.out.println("Ingrese el color: ");
				String color = sc.nextLine();
				perro1 = new Perro(nombre, peso, edad, raza, color);
				break;

			case 2:

				System.out.println("Ingrese el nombre: ");
				String nombre1 = sc.nextLine();
				System.out.println("Ingrese el peso: ");
				String peso1 = sc.nextLine();
				System.out.println("Ingrese la edad: ");
				int edad1 = sc.nextInt();
				sc.nextLine();
				System.out.println("Ingrese el tipo de pelaje: ");
				String tipoPelaje = sc.nextLine();
				System.out.println("Ingrese si es domestico: ");
				String domestico = sc.nextLine();
				gato1 = new Gato(nombre1, peso1, edad1, tipoPelaje, domestico);

				break;

			case 3:
				perro1.mostrarDatos();
				break;

			case 4:
				gato1.mostrarDatos2();
				break;

			case 5:
				System.out.println("Programa finalizado...");
				break;

			default:
				System.err.println("Opción inválida");
				break;
			}
		}

	}

}
