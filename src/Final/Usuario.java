package Final;

public class Usuario {

	//Atributos de la clase

	int cedula;

	String contrasena;


	//Constructor

	public Usuario(int cedula, String contrasena) {

		super();

		this.cedula = cedula;

		this.contrasena = contrasena;

	}


	//Getters y setters

	public int getCedula() {

		return cedula;

	}

	public void setCedula(int cedula) {

		this.cedula = cedula;

	}

	public String getContrasena() {

		return contrasena;

	}

	public void setContrasena(String contrasena) {

		this.contrasena = contrasena;

	}

}