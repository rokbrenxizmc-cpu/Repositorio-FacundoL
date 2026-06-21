package Trabajo_4;

import java.util.Scanner;

public class Gestor {

	public static void main(String[] args) {
		Fotografia fotito = new Fotografia(null, null, 0, false, null);
		Escultura esculturita = new Escultura(null, null, 0, null, 0);
		Pintura pinturita = new Pintura(null, null, 0, null, null);
		Scanner sc = new Scanner(System.in);
		int opcion = 0, opcion2 = 0;
		do {
			System.out.println("Que información desea hacer hoy?: " + "\n1) Guardar info" + "\n2) Mostrar info"
					+ "\n3) Salir" + "\nSeleccione una opción: ");
			opcion = sc.nextInt();
			sc.nextLine();
			switch (opcion) {
			case 1:
				System.out.println(
						"Info de qué desea guardar?: " + "\n1) Fotografia" + "\n2) Escultura" + "\n3) Pintura");
				opcion2 = sc.nextInt();
				sc.nextLine();
				if (opcion2 == 1) {
					System.out.println("\nIngrese el título/nombre de la fotografía: ");
					String tituloFoto = sc.nextLine();
					System.out.println("\nIngrese el autor de la foto: ");
					String autorFoto = sc.nextLine();
					System.out.println("\nEn que año se tomó la fotografía?: ");
					int anioCreacionFoto = sc.nextInt();
					sc.nextLine();
					System.out.println("\nLa foto es a color?: " + "\n(Responda solo con Si o No");
					boolean color = false;
					String respuestaColor = sc.nextLine();
					if (respuestaColor.equalsIgnoreCase("si")) {
						color = true;
					} else if (respuestaColor.equalsIgnoreCase("no")) {
						color = false;
					}
					System.out.println("\nCon qué cámara tomó la foto?: ");
					String camara = sc.nextLine();
					altaFotografia(fotito, tituloFoto, autorFoto, anioCreacionFoto, color, camara);
				}
				if (opcion2 == 2) {
					System.out.println("\nIngrese el título/nombre de la escultura: ");
					String tituloEsc = sc.nextLine();
					System.out.println("\nIngrese el creador de la escultura: ");
					String autorEsc = sc.nextLine();
					System.out.println("\nEn que año se hizo la escultura?: ");
					int anioCreacionEsc = sc.nextInt();
					sc.nextLine();
					System.out.println("\nIngrese el material con el que se hizo: ");
					String material = sc.nextLine();
					System.out.println("\nIngrese la altura de la escultura: ");
					double altura = sc.nextDouble();
					altaEscultura(esculturita, tituloEsc, autorEsc, anioCreacionEsc, material, altura);
				}
				if (opcion2 == 3) {
					System.out.println("\nIngrese el título/nombre de la pintura: ");
					String tituloPint = sc.nextLine();
					System.out.println("\nIngrese el pintor de la obra: ");
					String autorPint = sc.nextLine();
					System.out.println("\nEn que año se pintó la obra?: ");
					int anioCreacionPint = sc.nextInt();
					sc.nextLine();
					System.out.println("\nIngrese la técnica con la que se pintó la obra: ");
					String tecnica = sc.nextLine();
					System.out.println("\nIngrese el soporte en el que se pintó (Lienzo, papel, etc): ");
					String soporte = sc.nextLine();
					altaPintura(pinturita, tituloPint, autorPint, anioCreacionPint, tecnica, soporte);
					
				}
				break;
			case 2:
				listadoObras(fotito, esculturita, pinturita);
				break;
			}
		} while (opcion != 3);
	}

	public static void altaFotografia(Fotografia f, String titulo, String autor, int anio, boolean color,
			String camara) {
		f.setTitulo(titulo);
		f.setAutor(autor);
		f.setAnioCreacion(anio);
		f.setColor(color);
		f.setCamara(camara);
	}

	public static void altaEscultura(Escultura e, String titulo, String autor, int anio, String material,
			double altura) {
		e.setTitulo(titulo);
		e.setAutor(autor);
		e.setAnioCreacion(anio);
		e.setMaterial(material);
		e.setAltura(altura);
	}

	public static void altaPintura(Pintura p, String titulo, String autor, int anio, String tecnica, String soporte) {
		p.setTitulo(titulo);
		p.setAutor(autor);
		p.setAnioCreacion(anio);
		p.setTecnica(tecnica);
		p.setSoporte(soporte);
	}

	public static void listadoObras(Fotografia f, Escultura e, Pintura p) {
		if (f.getTitulo() != null) {
			System.out.println("\n-----FOTOGRAFIA-----"
					+ "\nTítulo: " + f.getTitulo());
			System.out.println("\nAutor: " + f.getAutor());
			System.out.println("\nAño: " + f.getAnioCreacion());
			System.out.println("\nEs a color?: " + f.getColor());
			System.out.println("\nCámara usada: " + f.getCamara());
		} else {
			System.out.println("\nNo se guardó ninguna info sobre alguna fotografía...");
		} 
		if (e.getTitulo() != null) {
			System.out.println("\n-----ESCULTURA-----"
					+ "\nTítulo: " + e.getTitulo());
			System.out.println("\nAutor: " + e.getAutor());
			System.out.println("\nAño: " + e.getAnioCreacion());
			System.out.println("\nMaterial: " + e.getMaterial());
			System.out.println("\nAltura: " + e.getAltura());
		} else {
			System.out.println("\nNo se guardó ninguna info sobre alguna escultura...");
		}
		if (p.getTitulo() != null) {
			System.out.println("\n-----PINTURA-----"
					+ "\nTítulo: " + p.getTitulo());
			System.out.println("\nAutor: " + p.getAutor());
			System.out.println("\nAño: " + p.getAnioCreacion());
			System.out.println("\nTécnica: " + p.getTecnica());
			System.out.println("\nSoporte: " + p.getSoporte());
		} else {
			System.out.println("\nNo se guardó ninguna info sobre alguna pintura...");
		}
	}

}
