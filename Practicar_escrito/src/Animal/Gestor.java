package Animal;

import java.util.Scanner;

public class Gestor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Perro perro1 = new Perro("Francho", "16.4kg", 8, "Golden Retriever", "Naranja");
		Gato gato1 = new Gato("José", "4.5kg", 5, "Esponjoso", "Si");

		int opcion = 0;

		while (opcion != 3) {

			System.out.println("ELIJA UNA OPCION:");
			System.out.println("1) Ver Perro");
			System.out.println("2) Ver Gato");
			System.out.println("3) Salir");

			opcion = sc.nextInt();

			switch (opcion) {

			case 1:
				perro1.mostrarDatos();
				break;

			case 2:
				gato1.mostrarDatos2();
				break;

			case 3:
				System.out.println("Programa finalizado");
				break;

			default:
				System.out.println("Opción inválida");
			}
		}
	}
}
