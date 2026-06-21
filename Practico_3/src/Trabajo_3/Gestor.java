package Trabajo_3;

import java.util.Scanner;

public class Gestor {

	public static void main(String[] args) {
		Casa casita = new Casa(null, 0, 0, null, null, 0);
		Apartamento apartamentito = new Apartamento(null, 0, 0, 0, 0);
		Scanner sc = new Scanner(System.in);
		int opcion = 0, opcion2 = 0;
		do {
			System.out.println("Que hará hoy?" + "\n1) Ingresar datos del edificio" + "\n2) Mostrar datos actuales"
					+ "\n3) Salir");
			System.out.println("Seleccione una opción: ");
			opcion = sc.nextInt();
			sc.nextLine();

			switch (opcion) {
			case 1:
				System.out.println("Que ingresará?" + "\n1) Apartamento" + "\n2) Casa");
				opcion2 = sc.nextInt();
				sc.nextLine();
				if (opcion2 == 1) {
					System.out.println("Ingrese la dirección del apartamento: ");
					String direccionApart = sc.nextLine();
					System.out.println("Ingrese la cantidad de habitaciones que tiene: ");
					int cantidadHabApart = sc.nextInt();
					sc.nextLine();
					System.out.println("Ingrese la superficie en m²: ");
					double superficieApart = sc.nextDouble();
					sc.nextLine();
					System.out.println("Ingrese el piso en el que se encuentra: ");
					int numeroPiso = sc.nextInt();
					sc.nextLine();
					System.out.println("Ingrese los gastos comunes: ");
					double gastosCom = sc.nextDouble();
					sc.nextLine();
					altaApartamento(apartamentito, direccionApart, cantidadHabApart, superficieApart, numeroPiso, gastosCom);

				} else if (opcion2 == 2) {
					System.out.println("Ingrese la dirección de la casa: ");
					String direccionCasa = sc.nextLine();
					System.out.println("Ingrese la cantidad de habitaciones que tiene: ");
					int cantidadHabCasa = sc.nextInt();
					sc.nextLine();
					System.out.println("Ingrese la superficie en m²: ");
					double superficieCasa = sc.nextDouble();
					sc.nextLine();
					System.out.println("Tiene jardín?: ");
					String jardin = sc.nextLine();
					System.out.println("Tiene garage?: ");
					String garage = sc.nextLine();
					System.out.println("Cuántos pisos tiene su casa?: ");
					int numeroPisosCasa = sc.nextInt();
					sc.nextLine();
					altaCasa(casita, direccionCasa, cantidadHabCasa, superficieCasa, jardin, garage, numeroPisosCasa);
					
				}
				break;
			case 2:
				listadoEdificios(apartamentito, casita);
				break;
			}
		} while (opcion != 3);
		System.out.println("Saliendo...");
	}

	public static void altaApartamento(Apartamento a, String direccion, int cantHabitaciones, double superficie,
			int numeroPisos, double gastos) {
		a.setDireccion(direccion);
		a.setCantidadHabitaciones(cantHabitaciones);
		a.setSuperficie(superficie);
		a.setNumeroPiso(numeroPisos);
		a.setGastosComunes(gastos);
	}

	public static void altaCasa(Casa c, String direccion, int cantHabitaciones, double superficie, String jardin,
			String garage, int numeroPisosCasa) {
		c.setDireccion(direccion);
		c.setCantidadHabitaciones(cantHabitaciones);
		c.setSuperficie(superficie);
		c.setTieneJardin(jardin);
		c.setTieneGarage(garage);
		c.setCantidadPisos(numeroPisosCasa);
	}
	public static void listadoEdificios(Apartamento a, Casa c) {
		if (a.getDireccion() != null) {
			System.out.println("s\n-----APARTAMENTO-----");
			System.out.println("\nDirección: " + a.getDireccion());
			System.out.println("\nCantidad de habitaciones: " + a.getCantidadHabitaciones());
			System.out.println("\nSuperficie (m²): " + a.getSuperficie());
			System.out.println("\nCantidad de pisos: " + a.getNumeroPiso());
			System.out.println("\nGastos comunes: " + a.getGastosComunes());
		} else {
			System.out.println("\nNo se han guardado apartamentos aún...");
		}
		if (c.getDireccion() != null) {
			System.out.println("\n-----CASA-----");
			System.out.println("\nDirección: " + c.getDireccion());
			System.out.println("\nCantidad de habitaciones: " + c.getCantidadHabitaciones());
			System.out.println("\nSuperficie (m²): " + c.getSuperficie());
			System.out.println("\nTiene jardín?: " + c.getTieneJardin());
			System.out.println("\nTiene garage?: " + c.getTieneGarage());
			System.out.println("\nCuantos pisos tiene la casa?: " + c.getCantidadPisos());
		} else {
			System.out.println("\nNo se han guardado casas aún...");
		}
	}

}
