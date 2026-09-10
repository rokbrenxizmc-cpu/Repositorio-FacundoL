package Final;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class ventana8 extends JFrame {

	public ventana8() {

		this.setTitle("Sistema de Gestión del Comedor");
		this.setSize(1000, 700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setLayout(new BorderLayout());

		// Barra superior
		JPanel panelTitulo = new JPanel();
		panelTitulo.setLayout(new FlowLayout(FlowLayout.LEFT));
		panelTitulo.setBackground(Color.cyan);
		panelTitulo.setPreferredSize(new Dimension(100, 45));

		JLabel nombrePrograma = new JLabel("Sistema de Gestión del Comedor");
		JLabel nombreInstitucion = new JLabel("UTU Arrayanes");
		nombrePrograma.setPreferredSize(new Dimension(850, 35));

		panelTitulo.add(nombrePrograma);
		panelTitulo.add(nombreInstitucion);

		// Menú lateral
		JPanel panelMenu = new JPanel();
		panelMenu.setLayout(new FlowLayout(FlowLayout.LEFT));
		panelMenu.setBackground(Color.LIGHT_GRAY);
		panelMenu.setPreferredSize(new Dimension(150, 100));

		JButton btnInicio = new JButton("Inicio");
		JButton btnProductos = new JButton("Productos");
		JButton btnCompras = new JButton("Compras");
		JButton btnPlatos = new JButton("Platos");
		JButton btnMenus = new JButton("Menús");
		JButton btnSalir = new JButton("Salir");

		btnInicio.setPreferredSize(new Dimension(130, 30));
		btnProductos.setPreferredSize(new Dimension(130, 30));
		btnCompras.setPreferredSize(new Dimension(130, 30));
		btnPlatos.setPreferredSize(new Dimension(130, 30));
		btnMenus.setPreferredSize(new Dimension(130, 30));
		btnSalir.setPreferredSize(new Dimension(130, 30));
		btnCompras.setBackground(Color.cyan);

		panelMenu.add(btnInicio);
		panelMenu.add(btnProductos);
		panelMenu.add(btnCompras);
		panelMenu.add(btnPlatos);
		panelMenu.add(btnMenus);
		panelMenu.add(btnSalir);
		
btnInicio.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				ventana3 ventana = new ventana3();
				ventana.setVisible(true);
				
			}
		});
		btnProductos.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				ventana4 ventana = new ventana4();
				ventana.setVisible(true);
				
			}
		});
		btnCompras.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				ventana8 ventana = new ventana8();
				ventana.setVisible(true);
				
			}
		});
		btnPlatos.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				ventana10 ventana = new ventana10();
				ventana.setVisible(true);
				
			}
		});
		btnMenus.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				ventana12 ventana = new ventana12();
				ventana.setVisible(true);
				
			}
		});
		btnSalir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				ventana15 ventana = new ventana15();
				ventana.setVisible(true);
			}
		});

		// Datos de la compra
		JPanel panelGeneral = new JPanel();
		panelGeneral.setLayout(new FlowLayout(FlowLayout.LEFT));

		JLabel tituloCompra = new JLabel("Registrar compra");
		tituloCompra.setPreferredSize(new Dimension(800, 35));

		JPanel panelDatos = new JPanel();
		panelDatos.setLayout(new FlowLayout(FlowLayout.LEFT));
		panelDatos.setPreferredSize(new Dimension(800, 65));

		JLabel txtDatos = new JLabel("Datos de la compra");
		txtDatos.setPreferredSize(new Dimension(790, 20));
		JLabel txtNumero = new JLabel("N.º compra:");
		JTextField Fnumero = new JTextField(10);
		JLabel txtFecha = new JLabel("Fecha:");
		JTextField Ffecha = new JTextField(10);

		// Valores de ejemplo para mostrar el diseño de la ventana
		Fnumero.setText("Automático");
		Ffecha.setText("12/08/2026");

		panelDatos.add(txtDatos);
		panelDatos.add(txtNumero);
		panelDatos.add(Fnumero);
		panelDatos.add(txtFecha);
		panelDatos.add(Ffecha);

		// Tabla de productos, como en el ejercicio de las ventanas
		JLabel txtProductos = new JLabel("Detalle de productos comprados");
		txtProductos.setPreferredSize(new Dimension(800, 20));

		String[] columnas = { "Producto", "Cantidad", "Unidad", "Precio unit.", "Vencimiento", "Subtotal" };
		DefaultTableModel modelo = new DefaultTableModel(columnas, 0);
		JTable tabla = new JTable(modelo);
		JScrollPane scrollTabla = new JScrollPane(tabla);
		scrollTabla.setPreferredSize(new Dimension(800, 140));

		modelo.addRow(new Object[] { "Arroz", "20", "kg", "$45", "25/09/2026", "$900" });
		modelo.addRow(new Object[] { "Leche", "15", "litros", "$50", "20/08/2026", "$750" });
		modelo.addRow(new Object[] { "Huevos", "10", "docenas", "$100", "18/08/2026", "$1000" });

		JPanel panelTotal = new JPanel();
		panelTotal.setLayout(new FlowLayout(FlowLayout.LEFT));
		panelTotal.setPreferredSize(new Dimension(800, 40));

		JButton btnAgregar = new JButton("+ Agregar otro producto");
		btnAgregar.setPreferredSize(new Dimension(200, 30));
		// El total es fijo porque estas filas son de ejemplo.
		JLabel txtTotal = new JLabel("Total compra: $2.650");

		panelTotal.add(btnAgregar);
		panelTotal.add(txtTotal);

		// Guardar y cancelar quedan pendientes; el detalle muestra los datos de ejemplo.
		JPanel panelBotones = new JPanel();
		panelBotones.setLayout(new FlowLayout(FlowLayout.LEFT));
		panelBotones.setPreferredSize(new Dimension(800, 40));

		JButton btnGuardar = new JButton("Guardar compra");
		JButton btnCancelar = new JButton("Cancelar");
		JButton btnVerDetalle = new JButton("Ver detalle de ejemplo");
		btnGuardar.setPreferredSize(new Dimension(140, 30));
		btnCancelar.setPreferredSize(new Dimension(100, 30));
		btnVerDetalle.setPreferredSize(new Dimension(190, 30));

		panelBotones.add(btnGuardar);
		panelBotones.add(btnCancelar);
		panelBotones.add(btnVerDetalle);

		panelGeneral.add(tituloCompra);
		panelGeneral.add(panelDatos);
		panelGeneral.add(txtProductos);
		panelGeneral.add(scrollTabla);
		panelGeneral.add(panelTotal);
		panelGeneral.add(panelBotones);

		this.add(panelTitulo, BorderLayout.NORTH);
		this.add(panelMenu, BorderLayout.WEST);
		this.add(panelGeneral, BorderLayout.CENTER);

		btnVerDetalle.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				ventana9 detalle = new ventana9();
				detalle.setVisible(true);
				setVisible(false);
			}

		});

		// Volver al inicio de sesión solamente si confirma que quiere salir.
		/*btnSalir.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				int respuesta = JOptionPane.showConfirmDialog(btnSalir,
						"¿Está seguro de que desea cerrar sesión?", "Salir", JOptionPane.YES_NO_OPTION);

				if (respuesta == JOptionPane.YES_OPTION) {
					ventana1 inicio = new ventana1();
					inicio.setVisible(true);
					setVisible(false);
				}
			}

		});*/
	}
}
