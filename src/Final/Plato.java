package Final;

public class Plato {
	int codigo;
	String nombre;
	String vegetariano;

	public Plato(int codigo, String nombre, String vegetariano) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.vegetariano = vegetariano;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getVegetariano() {
		return vegetariano;
	}

	public void setVegetariano(String vegetariano) {
		this.vegetariano = vegetariano;
	}
}