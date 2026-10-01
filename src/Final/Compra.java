package Final;

public class Compra {
	String producto;
	int cantidad;
	String unidad;
	String fecha;
	float precioUnit;
	String vencimiento;
	float subtotal;
	public String getProducto() {
		return producto;
	}
	public void setProducto(String producto) {
		this.producto = producto;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public String getUnidad() {
		return unidad;
	}
	public void setUnidad(String unidad) {
		this.unidad = unidad;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public float getPrecioUnit() {
		return precioUnit;
	}
	public void setPrecioUnit(float precioUnit) {
		this.precioUnit = precioUnit;
	}
	public String getVencimiento() {
		return vencimiento;
	}
	public void setVencimiento(String vencimiento) {
		this.vencimiento = vencimiento;
	}
	public float getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(float subtotal) {
		this.subtotal = subtotal;
	}
	public Compra(String producto, int cantidad, String unidad, String fecha, float precioUnit, String vencimiento,
			float subtotal) {
		super();
		this.producto = producto;
		this.cantidad = cantidad;
		this.unidad = unidad;
		this.fecha = fecha;
		this.precioUnit = precioUnit;
		this.vencimiento = vencimiento;
		this.subtotal = subtotal;
	}
	
}
