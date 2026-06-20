package Trabajo_2;

public class Articulo extends Publicacion{
	private String doi, areaInvestigacion;
	private int cantidadAutores;
	public String getDoi() {
		return doi;
	}
	public void setDoi(String doi) {
		this.doi = doi;
	}
	public String getAreaInvestigacion() {
		return areaInvestigacion;
	}
	public void setAreaInvestigacion(String areaInvestigacion) {
		this.areaInvestigacion = areaInvestigacion;
	}
	public int getCantidadAutores() {
		return cantidadAutores;
	}
	public void setCantidadAutores(int cantidadAutores) {
		this.cantidadAutores = cantidadAutores;
	}
	public Articulo(String titulo, String autor, String fechaPublicacion, String idioma, String doi, String areaInvestigacion, int cantidadAutores) {
		super(titulo, autor, fechaPublicacion, idioma);
		this.doi = doi;
		this.areaInvestigacion = areaInvestigacion;
		this.cantidadAutores = cantidadAutores;
	}
	
}
