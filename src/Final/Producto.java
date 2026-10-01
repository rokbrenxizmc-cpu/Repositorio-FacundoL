package Final;

public class Producto {
	 int codigo;
	    String nombre;
	    int stock;
	    String unidad;
	    String sector;
		public Producto(int codigo, String nombre, int stock, String unidad, String sector) {
			super();
			this.codigo = codigo;
			this.nombre = nombre;
			this.stock = stock;
			this.unidad = unidad;
			this.sector = sector;
		}
		public int getStock() {
			return stock;
		}
		public void setStock(int stock) {
			this.stock = stock;
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
		public String getUnidad() {
			return unidad;
		}
		public void setUnidad(String unidad) {
			this.unidad = unidad;
		}
		public String getSector() {
			return sector;
		}
		public void setSector(String sector) {
			this.sector = sector;
		}
}
