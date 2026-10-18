package Final;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class gestor {

    Conector bd = new Conector();

    public static void main(String[] args) {

        ventana1 ventanita1 = new ventana1();
        ventanita1.setVisible(true);

    }

    public boolean altaProducto(int codigo, String nombre, int stock, String unidad, String sector) {

        return bd.altaProducto(codigo, nombre, stock, unidad, sector);

    }

    public void listarProductos(DefaultTableModel modelo) {

        bd.listarProductos(modelo);

    }
    
    public boolean bajaProducto(int pd) {
    	return bd.bajaProducto(pd);
    }
    
    public boolean altaPlato(int codigo, String nombre, String vegetariano) {
    	
        return bd.altaPlato(codigo, nombre, vegetariano);

    }

    public void listarPlato(DefaultTableModel modelo) {

        bd.listarPlato(modelo);

    }
    
    public boolean bajaPlato(int pd) {
    	return bd.bajaPlato(pd);
    }
    
   
    
    public boolean altaCompras(String producto, int cantidad, String unidad, String fecha, float precioUnit, String vencimiento, float subtotal) {

        return bd.altaCompras(producto, cantidad, unidad, fecha, precioUnit, vencimiento, subtotal);

    }

    public void listarCompras(DefaultTableModel modelo) {

        bd.listarCompras(modelo);

    }
    
    public boolean bajaCompra(int pd) {
    	return bd.bajaCompra(pd);
    }
    
    public boolean altaMenu(String dia, String turno, String plato, int porciones, String estado) {
    	return bd.altaMenu(dia, turno, plato, porciones, estado);
    }
    
    public void listarMenu(DefaultTableModel modelo) {
    	bd.listarMenu(modelo);
    }
    
    public boolean bajaMenu(int pd) {
    	return bd.bajaMenu(pd);
    }
    
    public void listarPlatosParaMenu(DefaultComboBoxModel<String> modelo) {
    	bd.listarPlatosParaMenu(modelo);
    }
    
}