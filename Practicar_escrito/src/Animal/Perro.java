package Animal;

public class Perro extends Animal {
	private String raza, color;

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Perro(String nombre, String peso, int edad, String raza, String color) {
		super(nombre, peso, edad);
		this.raza = raza;
		this.color = color;
	}
	
	public void mostrarDatos() {
		System.out.println("Nombre: " + getNombre());
		System.out.println("Nombre: " + getPeso());
		System.out.println("Nombre: " + getEdad());
		System.out.println("Nombre: " + getRaza());
		System.out.println("Nombre: " + getColor());


	}
}
