package Final;

import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class gestor {

    //Referencia al conector

    Conector bd = new Conector();


    //Configuración del programa

    public static void main(String[] args) {

        Login ventanita1 = new Login();
        ventanita1.setVisible(true);

    }


    //Métodos relacionados con Productos

    public boolean altaProducto(int codigo, String nombre, int stock, String unidad, String sector) {

        return bd.altaProducto(codigo, nombre, stock, unidad, sector);

    }

    public void listarProductos(DefaultTableModel modelo) {

        bd.listarProductos(modelo);

    }

    public boolean bajaProducto(int pd) {
        return bd.bajaProducto(pd);
    }

    public boolean modificarStock(int pd, int cantidad) {
        return bd.modificarStock(pd, cantidad);
    }

    public int contarProductos() {
        return bd.contarProductos();
    }


    //Métodos relacionados con Compras

    public boolean altaCompras(String producto, int cantidad, String unidad, String fecha, float precioUnit, String vencimiento, float subtotal) {

        return bd.altaCompras(producto, cantidad, unidad, fecha, precioUnit, vencimiento, subtotal);

    }

    public void listarCompras(DefaultTableModel modelo) {

        bd.listarCompras(modelo);

    }

    public boolean bajaCompra(int pd) {
        return bd.bajaCompra(pd);
    }

    public int contarCompras() {
        return bd.contarCompras();
    }


    //Métodos relacionados con Platos

    public boolean altaPlato(int codigo, String nombre, String vegetariano) {

        return bd.altaPlato(codigo, nombre, vegetariano);

    }

    public void listarPlato(DefaultTableModel modelo) {

        bd.listarPlato(modelo);

    }

    public boolean bajaPlato(int pd) {
        return bd.bajaPlato(pd);
    }

    public int contarPlatos() {
        return bd.contarPlatos();
    }


    //Métodos relacionados con Menús

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

    public int contarMenus() {
        return bd.contarMenus();
    }


    //Métodos relacionados con Usuarios

    public boolean altaUsuario(int cedula, String contrasena) {
        return bd.altaUsuario(cedula, contrasena);
    }

    public boolean verificaUsuario(int cedula, String contrasena) {
        return bd.verificaUsuario(cedula, contrasena);
    }

    public void listarUsuario(DefaultTableModel modelo) {
        bd.listarUsuario(modelo);
    }

    public boolean bajaUsuario(int pd) {
        return bd.bajaUsuario(pd);
    }

    public boolean verificaEliminarUsuario(String contrasena) {
        return bd.verificaEliminarUsuario(contrasena);
    }

}