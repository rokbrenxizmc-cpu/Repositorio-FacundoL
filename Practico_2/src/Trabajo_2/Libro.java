package Trabajo_2;

public class Libro extends Publicacion{
	private String isbn, genero, formato;
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getFormato() {
		return formato;
	}
	public void setFormato(String formato) {
		this.formato = formato;
	}
	public Libro(String titulo, String autor, String fechaPublicacion, String idioma, String isbn, String genero, String formato) {
		super(titulo, autor, fechaPublicacion, idioma);
		this.isbn = isbn;
		this.genero = genero;
		this.formato = formato;
	}
	
}
