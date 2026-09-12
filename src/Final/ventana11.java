package Final;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ventana11 extends JFrame {
	public ventana11() {
		String[] vegetariano = {"Si", "No"};
		this.setTitle("Ventana 11");
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

		JLabel tituloInicio = new JLabel("Agregar Plato");
		tituloInicio.setBounds(30, 25, 300, 35);
		tituloInicio.setFont(new Font("Arial", Font.BOLD, 24));
		JLabel tituloConfirmP = new JLabel("Datos del plato");
		tituloConfirmP.setBounds(65, 92, 300, 35);
		tituloConfirmP.setFont(new Font("Arial", Font.BOLD, 20));
		JLabel subTCodigo = new JLabel("Código:");
		subTCodigo.setBounds(45, 140, 300, 35);
		JTextField codigo = new JTextField(20);
		codigo.setBounds(100, 140, 160, 40);
		JLabel subTNombre = new JLabel("Nombre:");
		subTNombre.setBounds(280, 140, 300, 40);
		JTextField nombre = new JTextField(20);
		nombre.setBounds(340, 140, 160, 40);
		JLabel subTVeget = new JLabel("Vegetariano:");
		subTVeget.setBounds(515, 140, 300, 40);
		JComboBox Vegeta = new JComboBox(vegetariano);
		Vegeta.setBounds(595, 140, 160, 40);
		JLabel subTDescont = new JLabel("Ingredientes necesarios por porción");
		subTDescont.setFont(new Font("Arial", Font.BOLD, 14));
		subTDescont.setBounds(65, 180, 300, 40);
		
		
		
		
		
		JLabel subTRest1 = new JLabel("Cantidad necesaria = cantidad del producto usada para preparar una");
		subTRest1.setBounds(55, 270, 400, 290);
		subTRest1.setForeground(Color.GRAY);
		JLabel subTRest2 = new JLabel("porción del plato.");
		subTRest2.setBounds(55, 285, 400, 290);
		subTRest2.setForeground(Color.GRAY);
		JLabel subTRest3 = new JLabel("Al preparar el menú, el sistema multiplica por las porciones y descuenta el stock.");
		subTRest3.setBounds(55, 303, 400, 290);
		subTRest3.setForeground(Color.GRAY);
		JLabel subTRest4 = new JLabel("y descuenta el stock.");
		subTRest4.setBounds(55, 318, 400, 290);
		subTRest4.setForeground(Color.GRAY);
		JLabel ej1 = new JLabel("Ejemplo: 80 porciones = 16 kg");
		ej1.setFont(new Font("Arial", Font.BOLD, 13));
		ej1.setBounds(500, 373, 200, 100);
		JLabel ej2 = new JLabel("bondiola + 20 kg papas");
		ej2.setFont(new Font("Arial", Font.BOLD, 13));
		ej2.setBounds(523, 393, 200, 100);
		
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
		JButton AgregarIBut = new JButton("Agregar ingrediente");
		AgregarIBut.setText("<html><u>Agregar ingrediente</u></html>");
		AgregarIBut.setBackground(new Color(255, 255, 255));
		AgregarIBut.setFont(new Font("Arial", Font.BOLD, 15));
		JButton GuardarPBut = new JButton("Guardar plato");
		GuardarPBut.setText("<html><u>Guardar plato</u></html>");
		GuardarPBut.setBackground(new Color(255, 255, 255));
		GuardarPBut.setFont(new Font("Arial", Font.BOLD, 15));
		JButton CancelarPBut = new JButton("Cancelar");
		CancelarPBut.setText("<html><u>Cancelar</u></html>");
		CancelarPBut.setBackground(new Color(255, 255, 255));
		CancelarPBut.setFont(new Font("Arial", Font.BOLD, 15));
		
		inicioBut.setBounds(20, 25, 120, 40);
		productosBut.setBounds(20, 70, 120, 40);
		comprasBut.setBounds(20, 115, 120, 40);
		platosBut.setBounds(20, 160, 120, 40);
		menusBut.setBounds(20, 205, 120, 40);
		salirBut.setBounds(20, 250, 120, 40);
		AgregarIBut.setBounds(50, 500, 200, 55);
		GuardarPBut.setBounds(300, 500, 200, 55);
		CancelarPBut.setBounds(550, 500, 200, 55);
		
		
		 comprasBut.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					dispose();
					ventana7 ventana = new ventana7();
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
productosBut.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				ventana4 ventana = new ventana4();
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
        salirBut.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				ventana15 ventana = new ventana15();
				ventana.setVisible(true);
				
			}
		});
		
		CancelarPBut.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				ventana7 ventana = new ventana7();
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
		
		GuardarPBut.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				ventana10 ventana = new ventana10();
				ventana.setVisible(true);
				
			}
		});
		
		productosBut.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				ventana4 ventana = new ventana4();
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

	String[] columnas = {"Producto", "Cantidad por porción", "Unidad", "Observación"};
	Object[][] datos = {
		{"Producto", "Cantidad por porción", "Unidad", "Observación"},
		{"Bondiola", 0.2, "kg", "Se descuenta del stock"},
		{"Papas", 0.25, "kg", "Se descuenta del stock"},
		{"Aceite", 0.02, "litros", "Se descuenta del stock"},
		{"+ agregar otro ingrediente", "", "", ""}
		};

		JTable tabla = new JTable(datos, columnas);
		tabla.setBounds(45, 220, 680, 175);
		tabla.setRowHeight(35);

		this.add(panelito);
		panelito7.add(inicioBut);
		panelito7.add(productosBut);
		panelito7.add(comprasBut);
		panelito7.add(platosBut);
		panelito7.add(menusBut);
		panelito7.add(salirBut);

		contenido.add(tituloInicio);
		contenido.add(AgregarIBut);
		contenido.add(tabla);
		contenido.add(CancelarPBut);
		contenido.add(tituloConfirmP);
		contenido.add(subTCodigo);
		contenido.add(codigo);
		contenido.add(subTNombre);
		contenido.add(nombre);
		contenido.add(subTDescont);
		contenido.add(subTRest1);
		contenido.add(subTRest2);
		contenido.add(subTRest3);
		contenido.add(subTRest4);
		contenido.add(subTVeget);
		contenido.add(Vegeta);
		contenido.add(ej1);
		contenido.add(ej2);
		contenido.add(GuardarPBut);
		
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
		g.drawRect(205, 185, 750, 400);
		
		g.setColor(Color.BLACK);
		g.drawRect(220, 325, 680, 175);
		
		g.setColor(Color.GREEN);
		g.drawRect(650, 515, 250, 50);
	}
}