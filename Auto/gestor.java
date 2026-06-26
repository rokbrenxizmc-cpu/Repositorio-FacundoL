package a1062026;

import java.util.Scanner;

public class gestor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Auto arregloAutos[] = new Auto[3];

		Auto auto1 = new Auto(0, null);
		int fun = 0;
		int nro = 0;
		String marca = "0";
		int op = 0;
		while (op != 5) {
			switch (op) {
			case 0:
				System.out.println(
						"Bemvenido a meu programa\n1-Alta de auto\n2-Listar los autos \n3-Dar de baja un auto \n4-Cambiar dato de un auto\n5-Salir");
				op = sc.nextInt();
				break;

			case 1:
				System.out.println("Ingresa nro chasis:");
				nro = sc.nextInt();
				System.out.println("Ingresa la marca:\nEn caso de querer usar espacios, escriba '_'");
				marca = sc.next();
				altaAutos(arregloAutos, nro, marca);

				System.out.println("Datos agregados con éxito\n");
				op = 0;
				break;

			case 2:
				System.out.println("Número de chasis / Marca");
				listarAutos(arregloAutos);
				op = 0;
				break;
			case 3:
				System.out.println("Baja de autos\nEliminar auto\nEscriba el número de chasis del auto que desea eliminar: ");
				int chasis = sc.nextInt();
				bajaAutos(chasis, arregloAutos);
				op = 0;
				break;
			case 4:
				System.out.println("Cambiar valor de Auto\nIngrese el número de chasis del auto que quiera modificar:");
				int cha = sc.nextInt();
				modificarAutos(cha, arregloAutos);
				op = 0;
				break;

			default:
				System.out.println("Por acá no es");
				op = 0;
				break;

			}
		}

	}

	public static void altaAutos(Auto[] a, int n, String m) {

		if (m.length() > 2) {

			for (int i = 0; i < a.length; i++) {
				if (a[i] != null) {
					System.out.print("");

				} else {
					if (a[i] == null) {
						a[i] = new Auto(n, m);
						System.out.println("numero de espacio: " + i);
						System.out.println("Auto guardado");
						break;
					}

				}
			}

		} else {
			System.out.println("Anun shad besdig e: \n");
		}
	}

	public static void listarAutos(Auto[] ar) {

		for (int i = 0; i < ar.length; i++) {
			if (ar[i] != null) {

				System.out.print(ar[i].getNroChasis() + " / ");
				System.out.println(ar[i].getMarca() + "\n");
			}

		}

	}

	public static void bajaAutos(int cha, Auto[] arg) {

		for (int i = 0; i < arg.length; i++) {
			if (arg[i].getNroChasis() == cha) {
				arg[i] = null;
				System.out.println(
						"Auto borrado definitivamente y no hay vuelta atrás, \nhas eliminado un porcentaje del conocimiento global \n(0 es un número),lo que traerá el declive de la \nsociedad tal y como la conocemos.\n \nGracias por usar nuestro programa!!!!>w<\n");
				break;
			}
		}

	}

	public static void modificarAutos(int cha, Auto[] arge) {

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arge.length; i++) {
			

			if (arge[i]!=null && arge[i].getNroChasis() == cha) {
				int oi = 0;

				System.out.println("Seleccione el atributo que quiera modificar: \n1.Número de chasis \n2.Marca");
				oi = sc.nextInt();

				if (oi == 1) {

					System.out.println("Cambiando dato de chasis \nIngrese el chasis deseado: ");
					int cd = sc.nextInt();
					arge[i].setNroChasis(cd);
					System.out.println("Dato cambiado");
					break;
				}

				if (oi == 2) {
					System.out.println("Cambiando dato de marca \\nIngrese la marca deseada: ");
					String mar = sc.next();
					arge[i].setMarca(mar);
					System.out.println("Dato cambiado");
					break;
				}
				if (oi != 1 && oi != 2) {
					System.out.println("Seleccione una opcion correcta");
					break;
				}
			}else {
				System.out.println("Vacío");
			}

		}
	}
}
