package Trabajo_4;

public class Pintura extends ObraArte{
	private String tecnica, soporte;

	public String getTecnica() {
		return tecnica;
	}

	public void setTecnica(String tecnica) {
		this.tecnica = tecnica;
	}

	public String getSoporte() {
		return soporte;
	}

	public void setSoporte(String soporte) {
		this.soporte = soporte;
	}

	public Pintura(String titulo, String autor, int anioCreacion, String tecnica, String soporte) {
		super(titulo, autor, anioCreacion);
		this.tecnica = tecnica;
		this.soporte = soporte;
	}
	
}
