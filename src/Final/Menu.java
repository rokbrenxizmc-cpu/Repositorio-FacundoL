package Final;

public class Menu {
	String dia;
	String turno;
	String plato;
	int porciones;
	String estado;

	public Menu(String dia, String turno, String plato, int porciones, String estado) {
		super();
		this.dia = dia;
		this.turno = turno;
		this.plato = plato;
		this.porciones = porciones;
		this.estado = estado;
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public String getPlato() {
		return plato;
	}

	public void setPlato(String plato) {
		this.plato = plato;
	}

	public int getPorciones() {
		return porciones;
	}

	public void setPorciones(int porciones) {
		this.porciones = porciones;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
}