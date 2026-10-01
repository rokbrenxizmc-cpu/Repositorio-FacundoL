package Final;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Desktop.Action;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ventana9 extends JFrame {

	public ventana9() {

		this.setTitle("Sistema de Gestión del Comedor");
		this.setSize(1000, 700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setLayout(new BorderLayout());

		// Título de la ventana
		JPanel panelTitulo = new JPanel();
		panelTitulo.setLayout(new FlowLayout(FlowLayout.LEFT));
		panelTitulo.setBackground(Color.cyan);
		panelTitulo.setPreferredSize(new Dimension(100, 45));

		JLabel nombrePrograma = new JLabel("Sistema de Gestión del Comedor");
		JLabel nombreInstitucion = new JLabel("UTU Arrayanes");
		nombrePrograma.setPreferredSize(new Dimension(850, 35));

		panelTitulo.add(nombrePrograma);
		panelTitulo.add(nombreInstitucion);

		// Menú a la izquierda
		JPanel panelMenu = new JPanel();
		panelMenu.setLayout(new FlowLayout(FlowLayout.LEFT));
		panelMenu.setPreferredSize(new Dimension(150, 100));
		panelMenu.setBackground(Color.LIGHT_GRAY);

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
				ventana7 ventana = new ventana7();
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

		JLabel tituloDetalle = new JLabel("Detalle de compra");
		tituloDetalle.setPreferredSize(new Dimension(800, 35));

		JPanel panelDatos = new JPanel();
		panelDatos.setLayout(new GridLayout(2, 1));
		panelDatos.setPreferredSize(new Dimension(800, 55));

		JLabel datosCompra = new JLabel("N.º compra: 1     Fecha: 01/08/2026");
		JLabel productosCompra = new JLabel("Productos incluidos en la compra");
		panelDatos.add(datosCompra);
		panelDatos.add(productosCompra);

		String[] columnas = { "Producto", "Cantidad", "Unidad", "Precio unit.", "Vencimiento", "Subtotal" };
		DefaultTableModel modelo = new DefaultTableModel(columnas, 0);
		JTable tabla = new JTable(modelo);
		JScrollPane scrollTabla = new JScrollPane(tabla);
		scrollTabla.setPreferredSize(new Dimension(800, 120));

		// Datos de ejemplo y total fijo para mostrar el diseño de la ventana.
		modelo.addRow(new Object[] { "Arroz", "20", "kg", "$45", "25/09/2026", "$900" });
		modelo.addRow(new Object[] { "Leche", "15", "litros", "$50", "20/08/2026", "$750" });
		modelo.addRow(new Object[] { "Huevos", "10", "docenas", "$100", "18/08/2026", "$1000" });

		JLabel totalCompra = new JLabel("Total compra: $2.650");
		totalCompra.setPreferredSize(new Dimension(800, 30));
		JButton btnVolver = new JButton("Volver a compras");

		panelGeneral.add(tituloDetalle);
		panelGeneral.add(panelDatos);
		panelGeneral.add(scrollTabla);
		panelGeneral.add(totalCompra);
		panelGeneral.add(btnVolver);

		this.add(panelTitulo, BorderLayout.NORTH);
		this.add(panelMenu, BorderLayout.WEST);
		this.add(panelGeneral, BorderLayout.CENTER);

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

		btnVolver.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				ventana8 registrar = new ventana8(null);
				registrar.setVisible(true);
				setVisible(false);
			}

		});
	}
}
