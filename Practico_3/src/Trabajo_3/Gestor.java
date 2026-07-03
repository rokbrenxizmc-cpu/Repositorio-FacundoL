package Trabajo_3;

import java.util.Scanner;

public class Gestor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Antes de empezar: ¿Cuantas publicaciones desea poder guardar de cada una?: ");
		int cantidadCadaEdificio = sc.nextInt();

		Apartamento arregloApart[] = new Apartamento[cantidadCadaEdificio];
		Casa arregloCasa[] = new Casa[cantidadCadaEdificio];

		int opcion = 0;
		int opcion2 = 0;
		int opcion3 = 0;
		do {
			System.out.println("Que hará hoy?" + "\n1) Ingresar datos del edificio" + "\n2) Mostrar datos actuales"
					+ "\n3) Eliminar edificio" + "\n4) Modificar edificio" + "\n5) Salir");
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
					altaApart(arregloApart, direccionApart, cantidadHabApart, superficieApart, numeroPiso,
							gastosCom);

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
					altaCasa(arregloCasa, direccionCasa, cantidadHabCasa, superficieCasa, jardin, garage,
							numeroPisosCasa);

				}
				break;
			case 2:
				listadoApart(arregloApart);
				listadoCasa(arregloCasa);
				break;
			case 3:
				System.out.println("¿Qué edificio desea eliminar?" + "\n1) Apartamento" + "\n2) Casa" + "\n3) Volver");

				opcion3 = sc.nextInt();
				sc.nextLine();
				if (opcion3 == 1) {
					System.out.println("Para eliminar un edificio, ingrese el número del piso en el que se encuentra: ");
					int nroPiso = sc.nextInt();
					bajaApart(arregloApart, nroPiso);
					break;
				} else if (opcion3 == 2) {
					System.out.println("Para eliminar una casa, ingrese la dirección de la misma: ");
					String direccionCasa = sc.nextLine();
					bajaCasa(arregloCasa, direccionCasa);
					break;
					}
			case 4:
				System.out.println(
						"Que producto desea modificar?: " + "\n1) Apartamento" + "\n2) Casa" + "\n3) Volver");
				int opcion4 = sc.nextInt();
				sc.nextLine();
				if (opcion4 == 1) {
					System.out.println("Ingrese el número del piso del apartamento: ");
					int nroPisoApart = sc.nextInt();
					modifApart(arregloApart, nroPisoApart);
				} else if (opcion4 == 2) {
					System.out.println("Ingrese la dirección de la casa: ");
					String direccionCasa = sc.nextLine();
					modifCasa(arregloCasa, direccionCasa);
				}
				break;
			}
		} while (opcion != 5);
		System.out.println("Saliendo...");
	}

	public static void altaApart(Apartamento a[], String direccion, int cantidadHabitaciones, double superficie,
			int nroPiso, double gastosCom) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == null) {
				a[i] = new Apartamento(direccion, cantidadHabitaciones, superficie, nroPiso, gastosCom);
				System.out.println("Apartamento guardado");
				break;
			}
		}
	}

	public static void altaCasa(Casa c[], String direccion, int cantidadHabitaciones, double superficie, String jardin,
			String garage, int nroPisosCasa) {
		for (int i = 0; i < c.length; i++) {
			if (c[i] == null) {
				c[i] = new Casa(direccion, cantidadHabitaciones, superficie, jardin, garage, nroPisosCasa);
				System.out.println("Casa guardada");
				break;
			}
		}
	}

	public static void listadoApart(Apartamento a[]) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] != null) {
				System.out.println("-----LISTADO APARTAMENTOS-----");
				System.out.println("Dirección: " + a[i].getDireccion());
				System.out.println("Cantidad de habitaciones: " + a[i].getCantidadHabitaciones());
				System.out.println("Superficie: " + a[i].getSuperficie());
				System.out.println("Número del piso en el que se encuentra: " + a[i].getNumeroPiso());
				System.out.println("Gastos comunes: " + a[i].getGastosComunes());
			}

		}
	}

	public static void listadoCasa(Casa c[]) {
		for (int i = 0; i < c.length; i++) {
			if (c[i] != null) {
				System.out.println("-----LISTADO CASAS-----");
				System.out.println("Dirección: " + c[i].getDireccion());
				System.out.println("Cantidad de habitaciones: " + c[i].getCantidadHabitaciones());
				System.out.println("Superficie: " + c[i].getSuperficie());
				System.out.println("¿Tiene jardín?: " + c[i].getTieneJardin());
				System.out.println("¿Tiene garage?: " + c[i].getTieneGarage());
				System.out.println("Cantidad de pisos de la casa: " + c[i].getCantidadPisos());
			}

		}
	}

	public static void bajaApart(Apartamento a[], int nroPiso) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] != null && a[i].getNumeroPiso() == nroPiso) {
				a[i] = null;
				System.out.println("Apartamento eliminado");
				break;
			}
		}
	}

	public static void bajaCasa(Casa c[], String direccion) {
		for (int i = 0; i < c.length; i++) {
			if (c[i] != null && c[i].getDireccion().equals(direccion)) {
				c[i] = null;
				System.out.println("Casa eliminada");
				break;
			}
		}
	}

	public static void modifApart(Apartamento a[], int nroPiso) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			if (a[i] != null && a[i].getNumeroPiso() == nroPiso) {
				int o = 0;
				System.out.println("¿Qué desea modificar?" + "\n1) Dirección" + "\n2) Cantidad de habitaciones" + "\n3) Superficie"
						+ "\n4) Número de piso" + "\n5) Gastos comunes");
				o = sc.nextInt();
				sc.nextLine();

				switch (o) {

				case 1:
					System.out.println("Nueva dirección: ");
					a[i].setDireccion(sc.nextLine());
					break;
				case 2:
					System.out.println("Nueva cantidad de habitaciones: ");
					a[i].setCantidadHabitaciones(sc.nextInt());
					break;
				case 3:
					System.out.println("Nueva superficie: ");
					a[i].setSuperficie(sc.nextDouble());
					break;
				case 4:
					System.out.println("Nuevo número de piso: ");
					a[i].setNumeroPiso(sc.nextInt());
					break;
				case 5:
					System.out.println("Nuevos gastos comunes: ");
					a[i].setGastosComunes(sc.nextDouble());
					break;
				}
				break;
			}
		}
	}

	public static void modifCasa(Casa c[], String direccion) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < c.length; i++) {
			if (c[i] != null && c[i].getDireccion().equals(direccion)) {
				int o = 0;
				System.out.println("¿Qué desea modificar?" + "\n1) Dirección" + "\n2) Cantidad de habitaciones" + "\n3) Superficie"
						+ "\n4) Número de piso" + "\n5) Gastos comunes");
				o = sc.nextInt();
				sc.nextLine();

				switch (o) {

				case 1:
					System.out.println("Nueva dirección: ");
					c[i].setDireccion(sc.nextLine());
					break;
				case 2:
					System.out.println("Nueva cantidad de habitaciones: ");
					c[i].setCantidadHabitaciones(sc.nextInt());
					break;
				case 3:
					System.out.println("Nueva superficie: ");
					c[i].setSuperficie(sc.nextDouble());
					break;
				case 4:
					System.out.println("Tiene jardín?: ");
					c[i].setTieneJardin(sc.nextLine());
					break;
				case 5:
					System.out.println("Tiene garage?: ");
					c[i].setTieneGarage(sc.nextLine());
					break;
				}
				break;
			}
		}
	}

}
