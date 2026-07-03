package Trabajo_2;

import java.util.Scanner;

public class Gestor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Antes de empezar: ¿Cuantas publicaciones desea poder guardar de cada una?: ");
		int cantidadCadaPublicacion = sc.nextInt();

		Libro arregloLibros[] = new Libro[cantidadCadaPublicacion];
		Revista arregloRevistas[] = new Revista[cantidadCadaPublicacion];
		Articulo arregloArticulos[] = new Articulo[cantidadCadaPublicacion];

		int opcion = 0;
		int opcion2 = 0;
		int opcion3 = 0;

		do {
			System.out.println("1) Ingresar info de una publicacion" + "\n2) Mostrar info" + "\n3) Eliminar publicación"
					+ "\n4) Modificar datos" + "\n5) Salir" + "\nElige una opción: ");

			opcion = sc.nextInt();
			sc.nextLine();

			switch (opcion) {

			case 1:

				System.out.println("Datos de que desea ingresar?" + "\n1) Libro" + "\n2) Revista"
						+ "\n3) Articulo Científico" + "\n4) Volver");

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

					altaLibro(arregloLibros, nombreLibro, autorLibro, fechaPublicacionLibro, idiomaLibro, isbn, genero,
							formato);

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

					altaRevista(arregloRevistas, nombreRevista, autorRevista, fechaPublicacionRevista, idiomaRevista,
							issn, volumen, edicion);

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
					sc.nextLine();

					altaArticulo(arregloArticulos, nombreArticulo, autorArticulo, fechaPublicacionArticulo,
							idiomaArticulo, doi, areaInvestigacion, multiplesAutores);
				}

				break;

			case 2:

				listadoLibro(arregloLibros);
				listadoRevista(arregloRevistas);
				listadoArticulo(arregloArticulos);

				break;

			case 3:
				System.out.println("¿Qué publicación desea eliminar?" + "\n1) Libro" + "\n2) Revista"
						+ "\n3) Articulo Científico" + "\n4) Volver");

				opcion3 = sc.nextInt();
				sc.nextLine();
				if (opcion3 == 1) {
					System.out.println("Para eliminar un libro, ingrese el isbn: ");
					String isbn = sc.nextLine();
					bajaLibro(arregloLibros, isbn);
					break;
				} else if (opcion3 == 2) {
					System.out.println("Para eliminar una revista, ingrese el issn: ");
					String issn = sc.nextLine();
					bajaRevista(arregloRevistas, issn);
					break;
				} else if (opcion3 == 3) {
					System.out.println("Para eliminar un artículo, ingrese el código DOI del mismo: ");
					String doi = sc.nextLine();
					bajaArticulo(arregloArticulos, doi);
				}
				break;

			case 4:
				System.out.println(
						"Que publicación desea modificar?: " + "\n1) Libro" + "\n2) Revista" + "\n3) Artículo");
				int opcion4 = sc.nextInt();
				sc.nextLine();
				if (opcion4 == 1) {
					System.out.println("Ingrese el isbn del libro: ");
					String isbn = sc.nextLine();
					modifLibro(arregloLibros, isbn);
				} else if (opcion4 == 2) {
					System.out.println("Ingrese el issn de la revista: ");
					String issn = sc.nextLine();
					modifRevista(arregloRevistas, issn);
				} else if (opcion4 == 3) {
					System.out.println("Ingrese el doi del artículo: ");
					String doi = sc.nextLine();
					modifArticulo(arregloArticulos, doi);
				}
				break;

			}

		} while (opcion != 5);

		System.out.println("Saliendo del programa...");
	}

	public static void altaLibro(Libro l[], String nom, String autor, String fecha, String idioma, String isbn,
			String genero, String formato) {
		for (int i = 0; i < l.length; i++) {
			if (l[i] == null) {
				l[i] = new Libro(nom, autor, fecha, idioma, isbn, genero, formato);
				System.out.println("Libro guardado");
				break;
			}
		}
	}

	public static void altaRevista(Revista r[], String nom, String autor, String fecha, String idioma, String issn,
			int volumen, int edicion) {
		for (int i = 0; i < r.length; i++) {
			if (r[i] == null) {
				r[i] = new Revista(nom, autor, fecha, idioma, issn, edicion, volumen);
				System.out.println("Revista guardada");
				break;
			}
		}
	}

	public static void altaArticulo(Articulo a[], String nom, String autor, String fecha, String idioma, String doi,
			String area, int autores) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == null) {
				a[i] = new Articulo(nom, autor, fecha, idioma, doi, area, autores);
				System.out.println("Artículo guardado");
				break;
			}
		}
	}

	public static void listadoLibro(Libro l[]) {
		for (int i = 0; i < l.length; i++) {
			if (l[i] != null) {
				System.out.println("-----LISTADO LIBROS-----");
				System.out.println("Nombre: " + l[i].getTitulo());
				System.out.println("Autor: " + l[i].getAutor());
				System.out.println("Fecha de publicación: " + l[i].getFechaPublicacion());
				System.out.println("Idioma: " + l[i].getIdioma());
				System.out.println("ISBN: " + l[i].getIsbn());
				System.out.println("Genero: " + l[i].getGenero());
				System.out.println("Formato: " + l[i].getFormato());
			}

		}
	}

	public static void listadoRevista(Revista r[]) {
		for (int i = 0; i < r.length; i++) {
			if (r[i] != null) {
				System.out.println("-----LISTADO REVISTAS-----");
				System.out.println("Nombre: " + r[i].getTitulo());
				System.out.println("Autor: " + r[i].getAutor());
				System.out.println("Fecha de publicación: " + r[i].getFechaPublicacion());
				System.out.println("Idioma: " + r[i].getIdioma());
				System.out.println("ISSN: " + r[i].getIssn());
				System.out.println("Volumen: " + r[i].getVolumen());
				System.out.println("Edición: " + r[i].getNumeroEdicion());
			}

		}
	}

	public static void listadoArticulo(Articulo a[]) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] != null) {
				System.out.println("-----LISTADO ARTICULOS-----");
				System.out.println("Nombre: " + a[i].getTitulo());
				System.out.println("Autor: " + a[i].getAutor());
				System.out.println("Fecha de publicación: " + a[i].getFechaPublicacion());
				System.out.println("Idioma: " + a[i].getIdioma());
				System.out.println("DOI: " + a[i].getDoi());
				System.out.println("Área de investigación: " + a[i].getAreaInvestigacion());
				System.out.println("Cantidad de autores: " + a[i].getCantidadAutores());
			}

		}
	}

	public static void bajaLibro(Libro l[], String isbn) {
		for (int i = 0; i < l.length; i++) {
			if (l[i] != null && l[i].getIsbn().equals(isbn)) {
				l[i] = null;
				System.out.println("Libro eliminado");
				break;
			}
		}
	}

	public static void bajaRevista(Revista r[], String issn) {
		for (int i = 0; i < r.length; i++) {
			if (r[i] != null && r[i].getIssn().equals(issn)) {
				r[i] = null;
				System.out.println("Revista eliminada");
				break;
			}
		}
	}

	public static void bajaArticulo(Articulo a[], String doi) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] != null && a[i].getDoi().equals(doi)) {
				a[i] = null;
				System.out.println("Artículo eliminado");
				break;
			}
		}
	}

	public static void modifLibro(Libro l[], String isbn) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < l.length; i++) {
			if (l[i] != null && l[i].getIsbn().equals(isbn)) {
				int o = 0;
				System.out.println("¿Qué desea modificar?" + "\n1) Título" + "\n2) Autor" + "\n3) Fecha de publicación"
						+ "\n4) Idioma" + "\n5) ISBN" + "\n6) Género" + "\n7) Formato");
				o = sc.nextInt();
				sc.nextLine();

				switch (o) {

				case 1:
					System.out.println("Nuevo título:"); // Acá me apoyé un poco en google y me salió que podía usar el
					l[i].setTitulo(sc.nextLine());		// sc.nextLine() ya adentro del paréntesis del set
					break;
				case 2:
					System.out.println("Nuevo autor:");
					l[i].setAutor(sc.nextLine());
					break;
				case 3:
					System.out.println("Nueva fecha:");
					l[i].setFechaPublicacion(sc.nextLine());
					break;
				case 4:
					System.out.println("Nuevo idioma:");
					l[i].setIdioma(sc.nextLine());
					break;
				case 5:
					System.out.println("Nuevo ISBN:");
					l[i].setIsbn(sc.nextLine());
					break;
				case 6:
					System.out.println("Nuevo género:");
					l[i].setGenero(sc.nextLine());
					break;
				case 7:
					System.out.println("Nuevo formato:");
					l[i].setFormato(sc.nextLine());
					break;
				}
				break;
			}
		}
	}

	public static void modifRevista(Revista r[], String issn) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < r.length; i++) {
			if (r[i] != null && r[i].getIssn().equals(issn)) {
				int o = 0;
				System.out.println("¿Qué desea modificar?" + "\n1) Título" + "\n2) Autor" + "\n3) Fecha de publicación"
						+ "\n4) Idioma" + "\n5) ISSN" + "\n6) Volumen" + "\n7) Número de edición");
				o = sc.nextInt();
				sc.nextLine();

				switch (o) {

				case 1:
					System.out.println("Nuevo título:");
					r[i].setTitulo(sc.nextLine());
					break;
				case 2:
					System.out.println("Nuevo autor:");
					r[i].setAutor(sc.nextLine());
					break;
				case 3:
					System.out.println("Nueva fecha:");
					r[i].setFechaPublicacion(sc.nextLine());
					break;
				case 4:
					System.out.println("Nuevo idioma:");
					r[i].setIdioma(sc.nextLine());
					break;
				case 5:
					System.out.println("Nuevo ISSN:");
					r[i].setIssn(sc.nextLine());
					break;
				case 6:
					System.out.println("Nuevo volumen:");
					r[i].setVolumen(sc.nextInt());
					break;
				case 7:
					System.out.println("Nuevo número de edición:");
					r[i].setNumeroEdicion(sc.nextInt());
					break;
				}

				break;
			}
		}
	}

	public static void modifArticulo(Articulo a[], String doi) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			if (a[i] != null && a[i].getDoi().equals(doi)) {
				int o = 0;
				System.out.println("¿Qué desea modificar?" + "\n1) Título" + "\n2) Autor" + "\n3) Fecha de publicación"
						+ "\n4) Idioma" + "\n5) DOI" + "\n6) Área de investigación" + "\n7) Cantidad de autores");
				o = sc.nextInt();
				sc.nextLine();

				switch (o) {

				case 1:
					System.out.println("Nuevo título:");
					a[i].setTitulo(sc.nextLine());
					break;
				case 2:
					System.out.println("Nuevo autor:");
					a[i].setAutor(sc.nextLine());
					break;
				case 3:
					System.out.println("Nueva fecha:");
					a[i].setFechaPublicacion(sc.nextLine());
					break;
				case 4:
					System.out.println("Nuevo idioma:");
					a[i].setIdioma(sc.nextLine());
					break;
				case 5:
					System.out.println("Nuevo DOI:");
					a[i].setDoi(sc.nextLine());
					break;
				case 6:
					System.out.println("Nueva área de investigación:");
					a[i].setAreaInvestigacion(sc.nextLine());
					break;
				case 7:
					System.out.println("Nueva cantidad de autores:");
					a[i].setCantidadAutores(sc.nextInt());
					break;
				}
				break;
			}
		}
	}
}