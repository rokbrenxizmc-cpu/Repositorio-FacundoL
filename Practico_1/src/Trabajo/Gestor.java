package Trabajo;

import java.util.Scanner;

public class Gestor {

	public static void main(String[] args) {
		Electronica aparatito = new Electronica(null, null, 0, null, null, null);
		Alimentos comidita = new Alimentos(null, null, 0, null, null, null);
		Ropa ropita = new Ropa(null, null, 0, null, null, null);
		Scanner sc = new Scanner(System.in);

		int opcion = 0;
		int opcion2 = 0;
		do {
			System.out.println("1) Ingresar producto" + "\n2) Mostrar producto/s" + "\n3) Salir");
			System.out.println("Elija una opción: ");
			opcion = sc.nextInt();

			switch (opcion) {

			case 1:
				
				System.out.println("Que es lo que va a ingresar? "
						+ "\n1) Electrónicos"
						+ "\n2) Alimentos"
						+ "\n3) Ropa");
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
					altaElectronica(aparatito, nombreElec, codigoElec, precioElec, marcaElec, garantiaElec, voltaje);
					
				}else if (opcion2 == 2) {
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
					altaAlimentos(comidita, nombreAli, codigoAli, precioAli, fechaVencimiento, peso, calorias);
					
				}else if (opcion2 == 3) {
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
					altaRopa(ropita, nombreRopa, codigoRopa, precioRopa, talla, color, material);
				}
				break;
				
			case 2:
				listadoTodo(aparatito, comidita, ropita);
				break;

			}
		} while (opcion != 3);
		System.out.println("Saliendo...");

	}

	public static void altaElectronica(Electronica a, String nom, String cod, Double precio, String marca,
			String garantia, String v) {
		a.setNombre(nom);
		a.setCodigo(cod);
		a.setPrecio(precio);
		a.setMarca(marca);
		a.setGarantiaMeses(garantia);
		a.setVoltaje(v);
	}
	public static void altaAlimentos(Alimentos c, String nom, String cod, Double precio, String fecha, String peso, String cal) {
		c.setNombre(nom);
		c.setCodigo(cod);
		c.setPrecio(precio);
		c.setFechaVencimiento(fecha);
		c.setPeso(peso);
		c.setCalorias(cal);
	}
	public static void altaRopa(Ropa r, String nom, String cod, Double precio, String talla, String color, String material) {
		r.setNombre(nom);
		r.setCodigo(cod);
		r.setPrecio(precio);
		r.setTalla(talla);
		r.setColor(color);
		r.setMaterial(material);
	}
	public static void listadoTodo(Electronica a, Alimentos c, Ropa r) {
		if (a.getNombre() != null) {
		System.out.println("-----LISTADO ELECTRONICOS-----"
				+ "\nNombre: " + a.getNombre());
		System.out.println("\nCódigo de producto: " + a.getCodigo());
		System.out.println("\nPrecio: " + a.getPrecio());
		System.out.println("\nMarca: " + a.getMarca());
		System.out.println("\nMeses de garantía: " + a.getGarantiaMeses());
		System.out.println("\nVoltaje: " + a.getVoltaje());
		}else {
			System.out.println("\nNo se han ingresado productos electrónicos...");
		}
		if (c.getNombre() != null) {
		System.out.println("\n-----LISTADO ALIMENTOS-----"
				+ "\nNombre: " + c.getNombre());
		System.out.println("\nCódigo de producto: " + c.getCodigo());
		System.out.println("\nPrecio: " + c.getPrecio());
		System.out.println("\nFecha de vencimiento: " + c.getFechaVencimiento());
		System.out.println("\nPeso: " + c.getPeso());
		System.out.println("\nCalorías que aporta: " + c.getCalorias());
		}else {
			System.out.println("\nNo se han ingresado productos comestibles...");
		}
		if (r.getNombre() != null) {
		System.out.println("\n-----LISTADO ROPA-----"
				+ "\nNombre: " + r.getNombre());
		System.out.println("\nCódigo de producto: " + r.getCodigo());
		System.out.println("\nPrecio: " + r.getPrecio());
		System.out.println("\nTalla: " + r.getTalla());
		System.out.println("\nColor: " + r.getColor());
		System.out.println("\nMaterial: " + r.getMaterial());
		}else {
			System.out.println("No se han ingresado prendas de ropa...");
		}
	}
	
}