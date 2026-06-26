package Trabajo;

import java.util.Scanner;

public class Gestor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Antes de empezar: ¿Cuantos productos desea poder guardar de cada uno?: ");
		int cantidadCadaProducto = sc.nextInt();
		Electronica arregloElec[] = new Electronica[cantidadCadaProducto];
		Alimentos arregloAlimentos[] = new Alimentos[cantidadCadaProducto];
		Ropa arregloRopa[] = new Ropa[cantidadCadaProducto];


		int opcion = 0;
		int opcion2 = 0;
		int opcion3 = 0;
		do {
			System.out.println(
					"1) Ingresar producto" + "\n2) Mostrar producto/s" + "\n3) Eliminar producto" + "\n4) Modificar datos" + "\n5) Salir");
			System.out.println("Elija una opción: ");
			opcion = sc.nextInt();

			switch (opcion) {

			case 1:

				System.out.println("Que es lo que va a ingresar? " + "\n1) Electrónicos" + "\n2) Alimentos"
						+ "\n3) Ropa" + "\n4) Volver");
				opcion2 = sc.nextInt();
				sc.nextLine();
				if (opcion2 == 1) {
					System.out.println("-----ELECTRÓNICA-----" + "\nIngrese el nombre del electrónico: ");
					String nombreElec = sc.nextLine();
					System.out.println("Ingrese el código del producto: ");
					String codigoElec = sc.nextLine();
					System.out.println("Ingrese el precio del producto: ");
					double precioElec = sc.nextDouble();
					sc.nextLine();
					System.out.println("Ingrese la marca del electrónico: ");
					String marcaElec = sc.nextLine();
					System.out.println("Ingrese la cantidad de meses de garantía: ");
					String garantiaElec = sc.nextLine();
					System.out.println("Ingrese el voltaje que recibe el producto: ");
					String voltaje = sc.nextLine();
					altaElectronica(arregloElec, nombreElec, codigoElec, precioElec, marcaElec, garantiaElec, voltaje);

				} else if (opcion2 == 2) {
					System.out.println("-----ALIMENTOS-----" + "\nIngrese el nombre del alimento: ");
					String nombreAli = sc.nextLine();
					System.out.println("Ingrese el código de producto del alimento: ");
					String codigoAli = sc.nextLine();
					System.out.println("Ingrese el precio del alimento: ");
					double precioAli = sc.nextDouble();
					sc.nextLine();
					System.out.println("Ingrese la fecha de vencimiento del producto: ");
					String fechaVencimiento = sc.nextLine();
					System.out.println("Ingrese el peso del alimento: ");
					String peso = sc.nextLine();
					System.out.println("Ingrese las calorías del alimento: ");
					String calorias = sc.nextLine();
					altaAlimentos(arregloAlimentos, nombreAli, codigoAli, precioAli, fechaVencimiento, peso, calorias);

				} else if (opcion2 == 3) {
					System.out.println("-----ROPA-----" + "\nIngrese el nombre de la prenda: ");
					String nombreRopa = sc.nextLine();
					System.out.println("Ingrese el código de la prenda: ");
					String codigoRopa = sc.nextLine();
					System.out.println("Ingrese el precio de la prenda: ");
					double precioRopa = sc.nextDouble();
					sc.nextLine();
					System.out.println("Ingrese la talla de la ropa: ");
					String talla = sc.nextLine();
					System.out.println("Ingrese el color de la prenda: ");
					String color = sc.nextLine();
					System.out.println("Ingrese el material de la prenda: ");
					String material = sc.nextLine();
					altaRopa(arregloRopa, nombreRopa, codigoRopa, precioRopa, talla, color, material);
				}
				break;

			case 2:
				listadoElectronica(arregloElec);
				listadoAlimentos(arregloAlimentos);
				listadoRopa(arregloRopa);
				break;

			case 3:
				System.out.println("Que producto desearía eliminar?: " + "\n1) Electrónico" + "\n2) Alimento"
						+ "\n3) Ropa" + "\n4) Volver");
				opcion3 = sc.nextInt();
				sc.nextLine();
				if (opcion3 == 1) {
					System.out.println("Para eliminar un electrónico, ingrese el código de producto del mismo: ");
					String codigoProducto = sc.nextLine();
					bajaElectronica(arregloElec, codigoProducto);
					break;
				} else if (opcion3 == 2) {
					System.out.println("Para eliminar un alimento, ingrese el código de producto del mismo: ");
					String codigoProducto2 = sc.nextLine();
					bajaAlimentos(arregloAlimentos, codigoProducto2);
					break;
				} else if (opcion3 == 3) {
					System.out.println("Para eliminar una prenda, ingrese el código de producto del mismo: ");
					String codigoProducto3 = sc.nextLine();
					bajaRopa(arregloRopa, codigoProducto3);
				}
				break;
			
			case 4:
				System.out.println("Que producto desea modificar?: "
						+ "\n1) Electrónico"
						+ "\n2) Alimento"
						+ "\n3) Ropa");
				int opcion4 = sc.nextInt();
				sc.nextLine();
				if (opcion4 == 1) {
					System.out.println("Ingrese el código del electrónico: ");
					String codigo1 = sc.nextLine();
					modifElec(arregloElec, codigo1);
				} else if (opcion4 == 2) {
					System.out.println("Ingrese el código del alimento: ");
					String codigo2 = sc.nextLine();
					modifAlim(arregloAlimentos, codigo2);
				} else if (opcion4 == 3) {
					System.out.println("Ingrese el código de la prenda: ");
					String codigo3 = sc.nextLine();
					modifRopa(arregloRopa, codigo3);
				}
				break;
			}
		} while (opcion != 5);
		System.out.println("Saliendo...");

	}

	public static void altaElectronica(Electronica[] a, String nom, String cod, Double precio, String marca,
			String garantia, String v) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] != null) {
				System.out.println("");
			} else {
				if (a[i] == null) {
					a[i] = new Electronica(nom, cod, precio, marca, garantia, v);
					System.out.println("Numero de espacio: " + i);
					System.out.println("Electronico guardado");
					break;
				}
			}
		}
	}

	public static void altaAlimentos(Alimentos[] c, String nom, String cod, Double precio, String fecha, String peso,
			String cal) {
		for (int i = 0; i < c.length; i++) {
			if (c[i] != null) {
				System.out.println("");
			} else {
				if (c[i] == null) {
					c[i] = new Alimentos(nom, cod, precio, fecha, peso, cal);
					System.out.println("Numero de espacio: " + i);
					System.out.println("Electronico guardado");
					break;
				}
			}
		}
	}

	public static void altaRopa(Ropa[] r, String nom, String cod, Double precio, String talla, String color,
			String material) {
		for (int i = 0; i < r.length; i++) {
			if (r[i] != null) {
				System.out.println("");
			} else {
				if (r[i] == null) {
					r[i] = new Ropa(nom, cod, precio, talla, color, material);
					System.out.println("Numero de espacio: " + i);
					System.out.println("Electronico guardado");
					break;
				}
			}
		}
	}

	public static void listadoElectronica(Electronica[] a) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] != null) {
				System.out.println("-----LISTADO DE ELECTRONICA-----");
				System.out.println("===ELECTRONICO " + i + "===");
				System.out.println("\nNombre: " + a[i].getNombre());
				System.out.println("\nCodigo: " + a[i].getCodigo());
				System.out.println("\nPrecio: " + a[i].getPrecio());
				System.out.println("\nMarca: " + a[i].getMarca());
				System.out.println("\nGarantia: " + a[i].getGarantiaMeses());
				System.out.println("\nVoltaje: " + a[i].getVoltaje());
			}
		}
	}

	public static void listadoAlimentos(Alimentos[] c) {
		for (int i = 0; i < c.length; i++) {
			if (c[i] != null) {
				System.out.println("-----LISTADO DE ALIMENTOS-----");
				System.out.println("===ALIMENTO " + i + "===");
				System.out.println("\nNombre: " + c[i].getNombre());
				System.out.println("\nCodigo: " + c[i].getCodigo());
				System.out.println("\nPrecio: " + c[i].getPrecio());
				System.out.println("\nFecha de vencimiento: " + c[i].getFechaVencimiento());
				System.out.println("\nPeso: " + c[i].getPeso());
				System.out.println("\nCalorias: " + c[i].getCalorias());
			}
		}
	}

	public static void listadoRopa(Ropa[] r) {
		for (int i = 0; i < r.length; i++) {
			if (r[i] != null) {
				System.out.println("-----LISTADO DE ROPA-----");
				System.out.println("===PRENDA " + i + "===");
				System.out.println("\nNombre: " + r[i].getNombre());
				System.out.println("\nCodigo: " + r[i].getCodigo());
				System.out.println("\nPrecio: " + r[i].getPrecio());
				System.out.println("\nTalla: " + r[i].getTalla());
				System.out.println("\nColor: " + r[i].getColor());
				System.out.println("\nMaterial: " + r[i].getMaterial());
			}
		}
	}

	public static void bajaElectronica(Electronica[] a, String cod2) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] != null && a[i].getCodigo().equals(cod2)) {
				a[i] = null;
				System.out.println("Electronico eliminado por completo...");
			}
		}
	}

	public static void bajaAlimentos(Alimentos[] c, String cod2) {
		for (int i = 0; i < c.length; i++) {
			if (c[i] != null && c[i].getCodigo().equals(cod2)) {
				c[i] = null;
				System.out.println("Alimento eliminado por completo...");
			}
		}
	}

	public static void bajaRopa(Ropa[] r, String cod2) {
		for (int i = 0; i < r.length; i++) {
			if (r[i] != null && r[i].getCodigo().equals(cod2)) {
				r[i] = null;
				System.out.println("Prenda eliminada por completo...");
			}
		}
	}

	public static void modifElec(Electronica[] a, String cod2) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			if (a[i] != null && a[i].getCodigo().equals(cod2)) {
				int o = 0;
				System.out.println("Seleccione el atributo que desea modificar: " + "\n1) Nombre" + "\n2) Código"
						+ "\n3) Precio" + "\n4) Marca" + "\n5) Garantía" + "\n6) Voltaje");
				o = sc.nextInt();
				sc.nextLine();
				if (o == 1) {
					System.out.println("Ingrese el nuevo nombre: ");
					String nombre = sc.nextLine();
					a[i].setNombre(nombre);
					System.out.println("\nNombre cambiado...");
					break;
				} else if (o == 2) {
					System.out.println("Ingrese el nuevo código: ");
					String codigo = sc.nextLine();
					a[i].setCodigo(codigo);
					System.out.println("Código cambiado...");
					break;
				} else if (o == 3) {
					System.out.println("Ingrese el nuevo precio: ");
					double precio = sc.nextDouble();
					sc.nextLine();
					a[i].setPrecio(precio);
					System.out.println("Precio cambiado...");
					break;
				} else if (o == 4) {
					System.out.println("Ingrese la nueva marca: ");
					String marca = sc.nextLine();
					a[i].setMarca(marca);
					System.out.println("Marca cambiada...");
					break;
				} else if (o == 5) {
					System.out.println("Ingrese la nueva garantía: ");
					String garantia = sc.nextLine();
					a[i].setGarantiaMeses(garantia);
					System.out.println("Garantía cambiada...");
					break;
				} else if (o == 6) {
					System.out.println("Ingrese el nuevo voltaje: ");
					String voltaje = sc.nextLine();
					a[i].setVoltaje(voltaje);
					System.out.println("Voltaje cambiado...");
					break;
				}
			}
		}
	}

	public static void modifAlim(Alimentos[] c, String cod2) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < c.length; i++) {
			if (c[i] != null && c[i].getCodigo().equals(cod2)) {
				int o = 0;
				System.out.println("Seleccione el atributo que desea modificar: " + "\n1) Nombre" + "\n2) Código"
						+ "\n3) Precio" + "\n4) Fecha de vencimiento" + "\n5) Peso" + "\n6) Calorías");
				o = sc.nextInt();
				sc.nextLine();
				if (o == 1) {
					System.out.println("Ingrese el nuevo nombre: ");
					String nombre = sc.nextLine();
					c[i].setNombre(nombre);
					System.out.println("\nNombre cambiado...");
					break;
				} else if (o == 2) {
					System.out.println("Ingrese el nuevo código: ");
					String codigo = sc.nextLine();
					c[i].setCodigo(codigo);
					System.out.println("Código cambiado...");
					break;
				} else if (o == 3) {
					System.out.println("Ingrese el nuevo precio: ");
					double precio = sc.nextDouble();
					sc.nextLine();
					c[i].setPrecio(precio);
					System.out.println("Precio cambiado...");
					break;
				} else if (o == 4) {
					System.out.println("Ingrese la nueva fecha de vencimiento: ");
					String fechaVencimiento = sc.nextLine();
					c[i].setFechaVencimiento(fechaVencimiento);
					System.out.println("Fecha de vencimiento cambiada...");
					break;
				} else if (o == 5) {
					System.out.println("Ingrese el nuevo peso: ");
					String peso = sc.nextLine();
					c[i].setPeso(peso);
					System.out.println("Peso cambiado...");
					break;
				} else if (o == 6) {
					System.out.println("Ingrese las nuevas calorías: ");
					String calorias = sc.nextLine();
					c[i].setCalorias(calorias);
					System.out.println("Calorías cambiadas...");
					break;
				}
			}
		}
	}

	public static void modifRopa(Ropa[] r, String cod2) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < r.length; i++) {
			if (r[i] != null && r[i].getCodigo().equals(cod2)) {
				int o = 0;
				System.out.println("Seleccione el atributo que desea modificar: " + "\n1) Nombre" + "\n2) Código"
						+ "\n3) Precio" + "\n4) Talla" + "\n5) Color" + "\n6) Material");
				o = sc.nextInt();
				if (o == 1) {
					System.out.println("Ingrese el nuevo nombre: ");
					String nombre = sc.nextLine();
					r[i].setNombre(nombre);
					System.out.println("\nNombre cambiado...");
					break;
				} else if (o == 2) {
					System.out.println("Ingrese el nuevo código: ");
					String codigo = sc.nextLine();
					r[i].setCodigo(codigo);
					System.out.println("Código cambiado...");
					break;
				} else if (o == 3) {
					System.out.println("Ingrese el nuevo precio: ");
					double precio = sc.nextDouble();
					sc.nextLine();
					r[i].setPrecio(precio);
					System.out.println("Precio cambiado...");
					break;
				} else if (o == 4) {
					System.out.println("Ingrese la nueva talla: ");
					String talla = sc.nextLine();
					r[i].setTalla(talla);
					System.out.println("Talla cambiada...");
					break;
				} else if (o == 5) {
					System.out.println("Ingrese el nuevo color: ");
					String color = sc.nextLine();
					r[i].setColor(color);
					System.out.println("Color cambiado...");
					break;
				} else if (o == 6) {
					System.out.println("Ingrese el nuevo material: ");
					String material = sc.nextLine();
					r[i].setMaterial(material);
					System.out.println("Material cambiado...");
					break;
				}
			}
		}
	}
}