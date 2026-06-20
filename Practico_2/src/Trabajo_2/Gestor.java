package Trabajo_2;

import java.util.Scanner;

public class Gestor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Libro librito = new Libro(null, null, null, null, null, null, null);
		Revista revistita = new Revista(null, null, null, null, null, 0, 0);
		Articulo articulito = new Articulo(null, null, null, null, null, null, 0);
		int opcion = 0;
		int opcion2 = 0;

		do {
			System.out.println("1) Ingresar info de una publicacion" + "\n2) Mostrar info" + "\n3) Salir"
					+ "\nElige una opción: ");
			opcion = sc.nextInt();
			sc.nextLine();
			switch (opcion) {

			case 1:
				System.out.println(
						"Datos de que desea ingresar?" + "\n1) Libro" + "\n2) Revista" + "\n3) Articulo Científico");
				opcion2 = sc.nextInt();
				sc.nextLine();
				if (opcion2 == 1) {
					System.out.println("-----LIBROS-----" + "\nIngrese el título: ");
					String nombreLibro = sc.nextLine();
					System.out.println("\nIngrese el autor: ");
					String autorLibro = sc.nextLine();
					System.out.println("\nIngrese la fecha en la que se publicó: ");
					String fechaPublicacionLibro = sc.nextLine();
					System.out.println("\nIngrese el idioma en el que está la publicación: ");
					String idiomaLibro = sc.nextLine();
					System.out.println("\nIngrese el ISBN (código único identificador) del libro: ");
					String isbn = sc.nextLine();
					System.out.println("\nIngrese el género del libro: ");
					String genero = sc.nextLine();
					System.out.println("\nIngrese el formato del libro: ");
					String formato = sc.nextLine();
					altaLibro(librito, nombreLibro, autorLibro, fechaPublicacionLibro, idiomaLibro, isbn, genero, formato);
					opcion = 0;
					
				} else if (opcion2 == 2) {
					System.out.println("-----REVISTA-----" + "\nIngrese el título de la revista:");
					String nombreRevista = sc.nextLine();
					System.out.println("\nIngrese el autor de la revista: ");
					String autorRevista = sc.nextLine();
					System.out.println("\nIngrese la fecha en la que se publicó la revista: ");
					String fechaPublicacionRevista = sc.nextLine();
					System.out.println("\nIngrese el idioma en el que está la revista: ");
					String idiomaRevista = sc.nextLine();
					System.out.println("\nIngrese el ISSN: ");
					String issn = sc.nextLine();
					System.out.println("\nIngrese el volumen de la revista: ");
					int volumen = sc.nextInt();
					sc.nextLine();
					System.out.println("\nIngrese el número de edicion de la revista: ");
					int edicion = sc.nextInt();
					sc.nextLine();
					altaRevista(revistita, nombreRevista, autorRevista, fechaPublicacionRevista, idiomaRevista, issn, volumen, edicion);
					opcion = 0;
					
				} else if (opcion2 == 3) {
					System.out.println("-----ARTICULO CIENTIFICO-----" + "\nIngrese el título del artículo: ");
					String nombreArticulo = sc.nextLine();
					System.out.println("\nIngrese el/los autor/es del artículo: ");
					String autorArticulo = sc.nextLine();
					System.out.println("\nIngrese la fecha de publicación del artículo: ");
					String fechaPublicacionArticulo = sc.nextLine();
					System.out.println("\nIngrese el idioma en el que está el artículo: ");
					String idiomaArticulo = sc.nextLine();
					System.out.println("\nIngresa el DOI (código único identificador) del artículo: ");
					String doi = sc.nextLine();
					System.out.println("\nIngresa el área de investigación en el que se realizó: ");
					String areaInvestigacion = sc.nextLine();
					System.out.println("\nIngresa la cantidad de autores que trabajaron en ello: ");
					int multiplesAutores = sc.nextInt();
					altaArticulo(articulito, nombreArticulo, autorArticulo, fechaPublicacionArticulo, idiomaArticulo, doi, areaInvestigacion, multiplesAutores);
					opcion = 0;
				}
				break;

			case 2:
				listadoPublicaciones(librito, revistita, articulito);
				break;

			}

		} while (opcion != 3);
		System.out.println("Saliendo del programa...");
	}

	public static void altaLibro(Libro l, String nom, String autor, String fecha, String idioma, String isbn,
			String genero, String formato) {
		l.setTitulo(nom);
		l.setAutor(autor);
		l.setFechaPublicacion(fecha);
		l.setIdioma(idioma);
		l.setIsbn(isbn);
		l.setGenero(genero);
		l.setFormato(formato);
	}

	public static void altaRevista(Revista r, String nom, String autor, String fecha, String idioma, String issn,
			int volumen, int edicion) {
		r.setTitulo(nom);
		r.setAutor(autor);
		r.setFechaPublicacion(fecha);
		r.setIdioma(idioma);
		r.setIssn(issn);
		r.setVolumen(volumen);
		r.setNumeroEdicion(edicion);
	}

	public static void altaArticulo(Articulo a, String nom, String autor, String fecha, String idioma, String doi,
			String area, int autores) {
		a.setTitulo(nom);
		a.setAutor(autor);
		a.setFechaPublicacion(fecha);
		a.setIdioma(idioma);
		a.setDoi(doi);
		a.setAreaInvestigacion(area);
		a.setCantidadAutores(autores);

	}

	public static void listadoPublicaciones(Libro l, Revista r, Articulo a) {
		if (l.getTitulo() != null) {
			System.out.println("-----LISTADO LIBROS-----" + "\nNombre: " + l.getTitulo());
			System.out.println("\nAutor: " + l.getAutor());
			System.out.println("\nFecha de publicación: " + l.getFechaPublicacion());
			System.out.println("\nIdioma: " + l.getIdioma());
			System.out.println("\nISBN: " + l.getIsbn());
			System.out.println("\nGenero: " + l.getGenero());
			System.out.println("\nFormato: " + l.getFormato());
		} else {
			System.out.println("No se han registrado libros aún...");
		}
		if (r.getTitulo() != null) {
			System.out.println("-----LISTADO REVISTAS-----" + "\nNombre: " + r.getTitulo());
			System.out.println("\nAutor: " + r.getAutor());
			System.out.println("\nFecha de publicación: " + r.getFechaPublicacion());
			System.out.println("\nIdioma: " + r.getIdioma());
			System.out.println("\nISSN: " + r.getIssn());
			System.out.println("\nVolumen: " + r.getVolumen());
			System.out.println("\nEdición: " + r.getNumeroEdicion());
		} else {
			System.out.println("No se han registrado revistas aún...");
		}
		if (a.getTitulo() != null) {
			System.out.println("-----LISTADO ARTICULOS-----" + "\nNombre: " + a.getTitulo());
			System.out.println("\nAutor: " + a.getAutor());
			System.out.println("\nFecha de publicación: " + a.getFechaPublicacion());
			System.out.println("\nIdioma: " + a.getIdioma());
			System.out.println("\nDOI: " + a.getDoi());
			System.out.println("\nÁrea de investigación: " + a.getAreaInvestigacion());
			System.out.println("\nCantidad de autores: " + a.getCantidadAutores());
		}else {
			System.out.println("No se han registrado artículos aún...");

		}

	}
}
