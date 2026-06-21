package Trabajo_4;

public abstract class ObraArte {
	private String titulo, autor;
	private int anioCreacion;
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getAnioCreacion() {
		return anioCreacion;
	}
	public void setAnioCreacion(int anioCreacion) {
		this.anioCreacion = anioCreacion;
	}
	public ObraArte(String titulo, String autor, int anioCreacion) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.anioCreacion = anioCreacion;
	}
	
}
