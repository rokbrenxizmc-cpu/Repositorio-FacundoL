package Trabajo_4;

public class Fotografia extends ObraArte {
	private boolean color;
	private String camara;
	public boolean isColor() {
		return color;
	}
	public void setColor(boolean color) {
		this.color = color;
	}
	public boolean getColor() {
		return color;
	}
	public String getCamara() {
		return camara;
	}
	public void setCamara(String camara) {
		this.camara = camara;
	}
	public Fotografia(String titulo, String autor, int anioCreacion, boolean color, String camara) {
		super(titulo, autor, anioCreacion);
		this.color = color;
		this.camara = camara;
	}
	
}
