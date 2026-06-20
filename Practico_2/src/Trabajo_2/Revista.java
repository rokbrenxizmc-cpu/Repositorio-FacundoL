package Trabajo_2;

public class Revista extends Publicacion {
	private String issn;
	private int numeroEdicion, volumen;

	public String getIssn() {
		return issn;
	}

	public void setIssn(String issn) {
		this.issn = issn;
	}

	public int getNumeroEdicion() {
		return numeroEdicion;
	}

	public void setNumeroEdicion(int numeroEdicion) {
		this.numeroEdicion = numeroEdicion;
	}

	public int getVolumen() {
		return volumen;
	}

	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}

	public Revista(String titulo, String autor, String fechaPublicacion, String idioma, String issn, int numeroEdicion,
			int volumen) {
		super(titulo, autor, fechaPublicacion, idioma);
		this.issn = issn;

		this.numeroEdicion = numeroEdicion;
		this.volumen = volumen;
	}

}
