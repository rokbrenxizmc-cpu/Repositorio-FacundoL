package a1062026;

public class Auto {
	public int nroChasis;
	public String marca;
	
	public int getNroChasis() {
		return nroChasis;
	}

	public void setNroChasis(int nroChasis) {
		this.nroChasis = nroChasis;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Auto(int nroChasis, String marca) {
		super();
		this.nroChasis = nroChasis;
		this.marca = marca;
	}
	

}
