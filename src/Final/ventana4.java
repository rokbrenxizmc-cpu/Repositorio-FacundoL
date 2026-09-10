package Final;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ventana4 extends JFrame {
	public ventana4() {
		this.setTitle("Ventana 4");
		this.setSize(1366, 688);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);

		JPanel panelito = new JPanel(new BorderLayout());
		JPanel panelito7 = new JPanel();
		panelito7.setLayout(null);
		panelito7.setPreferredSize(new Dimension(168, 0));
		JPanel contenido = new JPanel();
		contenido.setLayout(null);
		JPanel panelito8 = new JPanel();
		panelito8.setLayout(null);
		panelito8.setPreferredSize(new Dimension(0, 75));
		JPanel rectanguloAzul = new JPanel(null);
		rectanguloAzul.setBackground(new Color(47, 85, 151));
		rectanguloAzul.setBounds(0, 0, 1500, 1500);
		JPanel rectanguloAzul2 = new JPanel(null);
		rectanguloAzul2.setBackground(new Color(80, 112, 167));
		rectanguloAzul2.setBounds(0, 0, 1700, 1700);

		JLabel tituloInicio = new JLabel("Productos");
		tituloInicio.setBounds(30, 25, 300, 35);
		tituloInicio.setFont(new Font("Arial", Font.BOLD, 24));

		JLabel barraSuperior = new JLabel("Sistema de Gestión del Comedor");
		barraSuperior.setFont(new Font("Arial", Font.BOLD, 24));
		barraSuperior.setBounds(30, 20, 500, 40);
		barraSuperior.setForeground(Color.WHITE);
		JLabel barraSuperior2 = new JLabel("UTU Arrayanes");
		barraSuperior2.setBounds(1215, 20, 250, 40);
		barraSuperior2.setForeground(Color.WHITE);
		JButton inicioBut = new JButton("Inicio");
		inicioBut.setText("<html><u>Inicio</u></html>");
		inicioBut.setBackground(new Color(130, 152, 189));
		inicioBut.setFont(new Font("Arial", Font.BOLD, 15));
		JButton productosBut = new JButton("Productos");
		productosBut.setText("<html><u>Productos</u></html>");
		productosBut.setBackground(new Color(130, 152, 189));
		productosBut.setFont(new Font("Arial", Font.BOLD, 15));
		JButton comprasBut = new JButton("Compras");
		comprasBut.setText("<html><u>Compras</u></html>");
		comprasBut.setBackground(new Color(130, 152, 189));
		comprasBut.setFont(new Font("Arial", Font.BOLD, 15));
		JButton platosBut = new JButton("Platos");
		platosBut.setText("<html><u>Platos</u></html>");
		platosBut.setBackground(new Color(130, 152, 189));
		platosBut.setFont(new Font("Arial", Font.BOLD, 15));
		JButton menusBut = new JButton("Menús");
		menusBut.setText("<html><u>Menús</u></html>");
		menusBut.setBackground(new Color(130, 152, 189));
		menusBut.setFont(new Font("Arial", Font.BOLD, 15));
		JButton salirBut = new JButton("Salir");
		salirBut.setText("<html><u>Salir</u></html>");
		salirBut.setBackground(new Color(130, 152, 189));
		salirBut.setFont(new Font("Arial", Font.BOLD, 15));
		JButton AgregarPBut = new JButton("Agregar Producto");
		AgregarPBut.setText("<html><u>Agregar Producto</u></html>");
		AgregarPBut.setBackground(new Color(255, 255, 255));
		AgregarPBut.setFont(new Font("Arial", Font.BOLD, 15));
		JButton VolverIBut = new JButton("Volver al Inicio");
		VolverIBut.setText("<html><u>Volver al Inicio</u></html>");
		VolverIBut.setBackground(new Color(255, 255, 255));
		VolverIBut.setFont(new Font("Arial", Font.BOLD, 15));

		inicioBut.setBounds(20, 25, 120, 40);
		productosBut.setBounds(20, 70, 120, 40);
		comprasBut.setBounds(20, 115, 120, 40);
		platosBut.setBounds(20, 160, 120, 40);
		menusBut.setBounds(20, 205, 120, 40);
		salirBut.setBounds(20, 250, 120, 40);
		AgregarPBut.setBounds(50, 360, 200, 55);
		VolverIBut.setBounds(300, 360, 200, 55);
		
		 comprasBut.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					dispose();
					ventana8 ventana = new ventana8();
					ventana.setVisible(true);
					
				}
			});
platosBut.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				ventana10 ventana = new ventana10();
				ventana.setVisible(true);
			}
		});
		menusBut.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				ventana12 ventana = new ventana12();
				ventana.setVisible(true);
			}
		});
		
		VolverIBut.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				ventana3 ventana = new ventana3();
		        ventana.setVisible(true);
			}
		});
		inicioBut.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			dispose();	
				ventana3 ventana = new ventana3();
				ventana.setVisible(true);
			}
		});
		AgregarPBut.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				ventana5 ventana = new ventana5();
				ventana.setVisible(true);
				
			}
		});
salirBut.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				ventana15 ventana = new ventana15();
				ventana.setVisible(true);
				
			}
		});
		
		String[] columnas = { "Código", "Nombre", "Stock", "Unidad", "Sector" };

		Object[][] datos = { { "Código", "Nombre", "Stock", "Unidad", "Sector" }, { 1, "Arroz", 25, "kg", "Despensa" },
				{ 2, "Leche", 15, "litros", "Cámara" }, { 3, "Papas", 30, "kg", "Freezer" },
				{ 4, "Huevos", 12, "docenas", "Cámara" }

		};

		JTable tabla = new JTable(datos, columnas);
		tabla.setBounds(30, 80, 1000, 250);
		tabla.setRowHeight(50);

		this.add(panelito);
		panelito7.add(inicioBut);
		panelito7.add(productosBut);
		panelito7.add(comprasBut);
		panelito7.add(platosBut);
		panelito7.add(menusBut);
		panelito7.add(salirBut);

		contenido.add(tituloInicio);
		contenido.add(AgregarPBut);
		contenido.add(VolverIBut);
		contenido.add(tabla);

		panelito8.add(barraSuperior);
		panelito8.add(barraSuperior2);
		panelito8.add(rectanguloAzul);
		panelito7.add(rectanguloAzul2);
		panelito.add(panelito7, BorderLayout.WEST);
		panelito.add(contenido, BorderLayout.CENTER);
		panelito.add(panelito8, BorderLayout.NORTH);
	}

	@Override
	public void paint(Graphics g) {

		super.paint(g);

		g.setColor(new Color(60, 90, 140));
		g.fillRect(200, 163, 1085, 3);

		g.setColor(Color.BLACK);
		g.drawRect(0, 0, 1366, 105);
		
		g.setColor(Color.BLACK);
		g.drawRect(205, 185, 1000, 250);

		Graphics2D g2d = (Graphics2D) g;
		GradientPaint degradado = new GradientPaint(0, 750, new Color(47, 85, 151, 0), 0, 300, new Color(47, 85, 151, 0));
		g2d.setPaint(degradado);
		g2d.fillRect(0, 0, getWidth(), getHeight());

	}
}