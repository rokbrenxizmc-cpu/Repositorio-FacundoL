package Final;

import javax.swing.DefaultComboBoxModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Conector {

    //Configuración de la conexión a la base de datos

    private final String DB_URL = "jdbc:mysql://localhost:3306/gestor";
    private final String DB_USER = "root";
    private final String DB_PASS = "";

    private Connection getConnection() throws SQLException {

        return DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);

    }


    //Métodos relacionados con Productos

    public boolean altaProducto(int codigo, String nombre, int stock, String unidad, String sector) {

        String sentencia = "INSERT INTO Producto (codigo, nombre, stock, unidad, sector) VALUES (?, ?, ?, ?, ?)";

        try (Connection conexion = getConnection();
             PreparedStatement declaracionSQL = conexion.prepareStatement(sentencia)) {

            declaracionSQL.setInt(1, codigo);
            declaracionSQL.setString(2, nombre);
            declaracionSQL.setInt(3, stock);
            declaracionSQL.setString(4, unidad);
            declaracionSQL.setString(5, sector);

            int filas = declaracionSQL.executeUpdate();

            return filas == 1;

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al guardar: " + ex.getMessage());
            return false;

        }
    }


    public void listarProductos(DefaultTableModel modelo) {

        String sentencia = "SELECT codigo, nombre, stock, unidad, sector, pd FROM Producto";

        try (Connection conexion = getConnection();
             PreparedStatement declaracionSQL = conexion.prepareStatement(sentencia);
             ResultSet rs = declaracionSQL.executeQuery()) {

            modelo.setRowCount(0);

            while (rs.next()) {

                int codigo = rs.getInt(1);
                String nombre = rs.getString(2);
                int stock = rs.getInt(3);
                String unidad = rs.getString(4);
                String sector = rs.getString(5);
                int pd = rs.getInt(6);

                Object[] fila = {codigo, nombre, stock, unidad, sector, pd};

                modelo.addRow(fila);
            }

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al listar: " + ex.getMessage()); }
    }


    public boolean bajaProducto(int pd) {
        String sentencia = "DELETE FROM Producto WHERE pd = ?";
        try (Connection conexion = getConnection();
             PreparedStatement declaracionSQL = conexion.prepareStatement(sentencia)){
            declaracionSQL.setInt(1, pd);
            int filas = declaracionSQL.executeUpdate();
            return filas == 1;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al eliminar: " + ex.getMessage());
            return false;
        }
    }


    public boolean modificarStock(int pd, int cantidad) {

        String sentencia = "UPDATE Producto SET stock = stock + ? WHERE pd = ? AND stock + ? >= 0";

        try (Connection conexion = getConnection();
             PreparedStatement declaracionSQL = conexion.prepareStatement(sentencia)) {

            declaracionSQL.setInt(1, cantidad);
            declaracionSQL.setInt(2, pd);
            declaracionSQL.setInt(3, cantidad);

            int filas = declaracionSQL.executeUpdate();

            return filas == 1;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al modificar stock: " + ex.getMessage());
            return false;
        }
    }


    //Métodos relacionados con Compras

    public boolean altaCompras(String producto, int cantidad, String unidad, String fecha, float precioUnit, String vencimiento, float subtotal) {

        String sentencia = "INSERT INTO Compra (producto, cantidad, unidad, fecha, precioUnit, vencimiento, subtotal) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (Connection conexion = getConnection();
             PreparedStatement declaracionSQL = conexion.prepareStatement(sentencia)) {

            declaracionSQL.setString(1, producto);
            declaracionSQL.setInt(2, cantidad);
            declaracionSQL.setString(3, unidad);
            declaracionSQL.setString(4, fecha);
            declaracionSQL.setFloat(5, precioUnit);
            declaracionSQL.setString(6, vencimiento);
            declaracionSQL.setFloat(7, subtotal);

            int filas = declaracionSQL.executeUpdate();

            return filas == 1;

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al guardar: " + ex.getMessage());
            return false;
        }
    }


    public void listarCompras(DefaultTableModel modelo) {

        String sentencia = "SELECT producto, cantidad, unidad, fecha, precioUnit, vencimiento, subtotal, pd FROM Compra";

        try (Connection conexion = getConnection();
             PreparedStatement declaracionSQL = conexion.prepareStatement(sentencia);
             ResultSet rs = declaracionSQL.executeQuery()) {

            modelo.setRowCount(0);

            while (rs.next()) {

                String producto = rs.getString(1);
                int cantidad = rs.getInt(2);
                String unidad = rs.getString(3);
                String fecha = rs.getString(4);
                float precioUnit = rs.getFloat(5);
                String vencimiento = rs.getString(6);
                float subtotal = rs.getFloat(7);
                int pd = rs.getInt(8);

                Object[] fila = {producto, cantidad, unidad, fecha, precioUnit, vencimiento, subtotal, pd};

                modelo.addRow(fila);
            }

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al listar: " + ex.getMessage());

        }
    }


    public boolean bajaCompra(int pd) {
        String sentencia = "DELETE FROM Compra WHERE pd = ?";
        try (Connection conexion = getConnection();
             PreparedStatement declaracionSQL = conexion.prepareStatement(sentencia)){
            declaracionSQL.setInt(1, pd);
            int filas = declaracionSQL.executeUpdate();
            return filas == 1;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al eliminar: " + ex.getMessage());
            return false;
        }
    }


    //Métodos relacionados con Platos

    public boolean altaPlato(int codigo, String nombre, String vegetariano) {

        String sentencia = "INSERT INTO Plato (codigo, nombre, vegetariano) VALUES (?, ?, ?)";

        try (Connection conexion = getConnection();
             PreparedStatement declaracionSQL = conexion.prepareStatement(sentencia)) {

            declaracionSQL.setInt(1, codigo);
            declaracionSQL.setString(2, nombre);
            declaracionSQL.setString(3,vegetariano);

            int filas = declaracionSQL.executeUpdate();

            return filas == 1;

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al guardar: " + ex.getMessage());
            return false;

        }
    }


    public void listarPlato(DefaultTableModel modelo) {

        String sentencia = "SELECT codigo, nombre, vegetariano, pd FROM Plato";

        try (Connection conexion = getConnection();
             PreparedStatement declaracionSQL = conexion.prepareStatement(sentencia);
             ResultSet rs = declaracionSQL.executeQuery()) {

            modelo.setRowCount(0);

            while (rs.next()) {

                int codigo = rs.getInt(1);
                String nombre = rs.getString(2);
                String vegetariano = rs.getString(3);
                int pd = rs.getInt(4);

                Object[] fila = {codigo, nombre, vegetariano, pd};

                modelo.addRow(fila);
            }

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al listar: " + ex.getMessage());

        }
    }


    public boolean bajaPlato(int pd) {
        String sentencia = "DELETE FROM Plato WHERE pd = ?";
        try (Connection conexion = getConnection();
             PreparedStatement declaracionSQL = conexion.prepareStatement(sentencia)){
            declaracionSQL.setInt(1, pd);
            int filas = declaracionSQL.executeUpdate();
            return filas == 1;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al eliminar: " + ex.getMessage());
            return false;
        }
    }


    //Métodos relacionados con Menús

    public boolean altaMenu(String dia, String turno, String plato, int porciones, String estado) {

        String sentencia = "INSERT INTO Menu (dia, turno, plato, porciones, estado) VALUES (?, ?, ?, ?, ?)";

        try (Connection conexion = getConnection();
             PreparedStatement declaracionSQL = conexion.prepareStatement(sentencia)) {

            declaracionSQL.setString(1, dia);
            declaracionSQL.setString(2, turno);
            declaracionSQL.setString(3,plato);
            declaracionSQL.setInt(4, porciones);
            declaracionSQL.setString(5, estado);

            int filas = declaracionSQL.executeUpdate();

            return filas == 1;

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al guardar: " + ex.getMessage());
            return false;

        }
    }


    public void listarMenu(DefaultTableModel modelo) {

        String sentencia = "SELECT dia, turno, plato, porciones, estado, pd FROM Menu";

        try (Connection conexion = getConnection();
             PreparedStatement declaracionSQL = conexion.prepareStatement(sentencia);
             ResultSet rs = declaracionSQL.executeQuery()) {

            modelo.setRowCount(0);

            while (rs.next()) {

                String dia = rs.getString(1);
                String turno = rs.getString(2);
                String plato = rs.getString(3);
                int porciones = rs.getInt(4);
                String estado = rs.getString(5);
                int pd = rs.getInt(6);

                Object[] fila = {dia, turno, plato, porciones, estado, pd};

                modelo.addRow(fila);
            }

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al listar: " + ex.getMessage());
        }
    }


    public boolean bajaMenu(int pd) {
        String sentencia = "DELETE FROM Menu WHERE pd = ?";
        try (Connection conexion = getConnection();
             PreparedStatement declaracionSQL = conexion.prepareStatement(sentencia)){
            declaracionSQL.setInt(1, pd);
            int filas = declaracionSQL.executeUpdate();
            return filas == 1;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al eliminar: " + ex.getMessage());
            return false;
        }
    }


    //Método para cargar los platos en el menú desplegable

    public void listarPlatosParaMenu(DefaultComboBoxModel<String> modelo) {
        String sentencia = "SELECT nombre FROM plato";
        try (Connection conexion = getConnection();
             PreparedStatement declaracionSQL = conexion.prepareStatement(sentencia);
             ResultSet rs = declaracionSQL.executeQuery()){
            modelo.removeAllElements();
            while (rs.next()) {
                String nombre = rs.getString(1);
                modelo.addElement(nombre);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar platos: " + ex.getMessage());
        }
    }


    //Métodos relacionados con Usuarios

    public boolean altaUsuario(int cedula, String contrasena) {

        String sentencia = "INSERT INTO Usuario (cedula, contraseña) VALUES (?, ?)";

        try (Connection conexion = getConnection();
             PreparedStatement declaracionSQL = conexion.prepareStatement(sentencia)) {

            declaracionSQL.setInt(1, cedula);
            declaracionSQL.setString(2, contrasena);


            int filas = declaracionSQL.executeUpdate();

            return filas == 1;

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al registrar: " + ex.getMessage());
            return false;

        }
    }


    public boolean verificaUsuario(int cedula, String contrasena) {

        String sentencia = "SELECT * FROM Usuario WHERE cedula = ? AND contraseña = ?";

        try (Connection conexion = getConnection();
             PreparedStatement declaracionSQL = conexion.prepareStatement(sentencia)) {

            declaracionSQL.setInt(1, cedula);
            declaracionSQL.setString(2, contrasena);


            ResultSet resultado = declaracionSQL.executeQuery();

            return resultado.next();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al registrar: " + ex.getMessage());
            return false;

        }
    }


    public void listarUsuario(DefaultTableModel modelo) {

        String sentencia = "SELECT cedula, contraseña, pd FROM Usuario";

        try (Connection conexion = getConnection();
             PreparedStatement declaracionSQL = conexion.prepareStatement(sentencia);
             ResultSet rs = declaracionSQL.executeQuery()) {

            modelo.setRowCount(0);

            while (rs.next()) {

                int cedula = rs.getInt(1);
                String contrasena = rs.getString(2);
                int pd = rs.getInt(3);

                Object[] fila = {cedula, contrasena, pd};

                modelo.addRow(fila);
            }

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al listar: " + ex.getMessage());

        }
    }


    public boolean bajaUsuario(int pd) {
        String sentencia = "DELETE FROM Usuario WHERE pd = ?";
        try (Connection conexion = getConnection();
             PreparedStatement declaracionSQL = conexion.prepareStatement(sentencia)){
            declaracionSQL.setInt(1, pd);
            int filas = declaracionSQL.executeUpdate();
            return filas == 1;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al eliminar: " + ex.getMessage());
            return false;
        }
    }


    public boolean verificaEliminarUsuario(String contrasena) {

        String sentencia = "SELECT * FROM Usuario WHERE contraseña = ?";

        try (Connection conexion = getConnection();
             PreparedStatement declaracionSQL = conexion.prepareStatement(sentencia)) {

            declaracionSQL.setString(1, contrasena);


            ResultSet resultado = declaracionSQL.executeQuery();

            return resultado.next();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al registrar: " + ex.getMessage());
            return false;

        }
    }


    //Métodos para contar los registros de cada tabla

    public int contarProductos() {

        String sentencia = "SELECT COUNT(*) FROM Producto";

        try (Connection conexion = getConnection();
             PreparedStatement declaracionSQL = conexion.prepareStatement(sentencia);
             ResultSet resultado = declaracionSQL.executeQuery()) {

            if (resultado.next()) {
                return resultado.getInt(1);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al contar productos: " + ex.getMessage());
        }

        return 0;
    }


    public int contarCompras() {

        String sentencia = "SELECT COUNT(*) FROM Compra";

        try (Connection conexion = getConnection();
             PreparedStatement declaracionSQL = conexion.prepareStatement(sentencia);
             ResultSet resultado = declaracionSQL.executeQuery()) {

            if (resultado.next()) {
                return resultado.getInt(1);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al contar compras: " + ex.getMessage());
        }

        return 0;
    }


    public int contarPlatos() {

        String sentencia = "SELECT COUNT(*) FROM Plato";

        try (Connection conexion = getConnection();
             PreparedStatement declaracionSQL = conexion.prepareStatement(sentencia);
             ResultSet resultado = declaracionSQL.executeQuery()) {

            if (resultado.next()) {
                return resultado.getInt(1);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al contar platos: " + ex.getMessage());
        }

        return 0;
    }


    public int contarMenus() {

        String sentencia = "SELECT COUNT(*) FROM Menu";

        try (Connection conexion = getConnection();
             PreparedStatement declaracionSQL = conexion.prepareStatement(sentencia);
             ResultSet resultado = declaracionSQL.executeQuery()) {

            if (resultado.next()) {
                return resultado.getInt(1);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al contar menus: " + ex.getMessage());
        }

        return 0;
    }
}