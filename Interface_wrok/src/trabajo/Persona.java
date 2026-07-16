package trabajo;

public abstract class Persona implements accion{
	int idTrabajador;

	public int getIdTrabajador() {
		return idTrabajador;
	}

	public void setIdTrabajador(int idTrabajador) {
		this.idTrabajador = idTrabajador;
	}

	public Persona(int idTrabajador) {
		super();
		this.idTrabajador = idTrabajador;
	}
	
}