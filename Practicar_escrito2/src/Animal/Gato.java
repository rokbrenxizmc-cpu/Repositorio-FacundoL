package Animal;

public class Gato extends Animal {
	private String tipoPelaje, esDomestico;

	public String getTipoPelaje() {
		return tipoPelaje;
	}

	public void setTipoPelaje(String tipoPelaje) {
		this.tipoPelaje = tipoPelaje;
	}

	public String getEsDomestico() {
		return esDomestico;
	}

	public void setEsDomestico(String esDomestico) {
		this.esDomestico = esDomestico;
	}

	public Gato(String nombre, String peso, int edad, String tipoPelaje, String esDomestico) {
		super(nombre, peso, edad);
		this.tipoPelaje = tipoPelaje;
		this.esDomestico = esDomestico;
	}

	public void mostrarDatos2() {
		System.out.println("Nombre: " + getNombre());
		System.out.println("Nombre: " + getPeso());
		System.out.println("Nombre: " + getEdad());
		System.out.println("Nombre: " + getTipoPelaje());
		System.out.println("Nombre: " + getEsDomestico());
	}
}

