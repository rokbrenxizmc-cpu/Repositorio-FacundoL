package Final;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ventana13 extends JFrame {
	public ventana13() {
		this.setTitle("Ventana 13");
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

		JLabel tituloInicio = new JLabel("Preparar Menú");
		tituloInicio.setBounds(30, 25, 300, 35);
		tituloInicio.setFont(new Font("Arial", Font.BOLD, 24));
		JLabel tituloConfirmP = new JLabel("Confirmar preparación");
		tituloConfirmP.setBounds(65, 92, 300, 35);
		tituloConfirmP.setFont(new Font("Arial", Font.BOLD, 20));
		JLabel subTPlato = new JLabel("Plato:");
		subTPlato.setBounds(65, 140, 300, 35);
		JTextField comida = new JTextField(20);
		comida.setBounds(120, 140, 160, 40);
		JLabel subTPorciones = new JLabel("Porciones preparadas:");
		subTPorciones.setBounds(65, 190, 300, 40);
		JTextField porciones = new JTextField(20);
		porciones.setBounds(220, 190, 160, 40);
		JLabel subTDescont = new JLabel("Stock que se descontará");
		subTDescont.setFont(new Font("Arial", Font.BOLD, 14));
		subTDescont.setBounds(65, 230, 300, 40);
		
		JLabel subTRest = new JLabel("Al confirmar, estas cantidades se restan del stock actual.");
		subTRest.setBounds(55, 250, 400, 290);
		subTRest.setForeground(Color.GRAY);
		JLabel subTAviso1 = new JLabel("Se calcula usando los ingredientes del");
		subTAviso1.setBounds(490, 160, 400, 290);
		subTAviso1.setForeground(Color.GRAY);
		JLabel subTAviso2 = new JLabel("plato y las porciones preparadas.");
		subTAviso2.setBounds(500, 180, 400, 290);
		subTAviso2.setForeground(Color.GRAY);
		
		
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
		JButton ConfirmPBut = new JButton("Confirmar preparación");
		ConfirmPBut.setText("<html><u>Confirmar preparación</u></html>");
		ConfirmPBut.setBackground(new Color(255, 255, 255));
		ConfirmPBut.setFont(new Font("Arial", Font.BOLD, 15));
		JButton PrepararMBut = new JButton("Cancelar");
		PrepararMBut.setText("<html><u>Cancelar</u></html>");
		PrepararMBut.setBackground(new Color(255, 255, 255));
		PrepararMBut.setFont(new Font("Arial", Font.BOLD, 15));
		
		inicioBut.setBounds(20, 25, 120, 40);
		productosBut.setBounds(20, 70, 120, 40);
		comprasBut.setBounds(20, 115, 120, 40);
		platosBut.setBounds(20, 160, 120, 40);
		menusBut.setBounds(20, 205, 120, 40);
		salirBut.setBounds(20, 250, 120, 40);
		ConfirmPBut.setBounds(50, 500, 200, 55);
		PrepararMBut.setBounds(300, 500, 200, 55);
		
		
platosBut.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				ventana10 ventana = new ventana10();
				ventana.setVisible(true);
			}
		});
		
		PrepararMBut.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				ventana14 ventana = new ventana14();
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
		ConfirmPBut.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				ventana12 ventana = new ventana12();
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

		String[] columnas = { "Producto", "Cantidad" };

		Object[][] datos = { {"Producto", "Cantidad"},
				{ "Bondiola", "16 kg" },
				{ "Papas", "20 kg" },
				{ "Aceite", "1,6 litros" }

		};

		JTable tabla = new JTable(datos, columnas);
		tabla.setBounds(45, 270, 400, 100);
		tabla.setRowHeight(25);

		this.add(panelito);
		panelito7.add(inicioBut);
		panelito7.add(productosBut);
		panelito7.add(comprasBut);
		panelito7.add(platosBut);
		panelito7.add(menusBut);
		panelito7.add(salirBut);

		contenido.add(tituloInicio);
		contenido.add(ConfirmPBut);
		contenido.add(tabla);
		contenido.add(PrepararMBut);
		contenido.add(tituloConfirmP);
		contenido.add(subTPlato);
		contenido.add(comida);
		contenido.add(subTPorciones);
		contenido.add(porciones);
		contenido.add(subTDescont);
		contenido.add(subTRest);
		contenido.add(subTAviso1);
		contenido.add(subTAviso2);
		
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
		g.drawRect(220, 375, 400, 100);
		
		g.setColor(Color.GREEN);
		g.drawRect(650, 385, 250, 75);
	}
}