package Final;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Menu_List extends JFrame {

	//Referencia al gestor

	gestor g = new gestor();

	public Menu_List() {

		//Configuración de la ventana

		this.setTitle("Menu List");
		this.setSize(1366, 688);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);

		//JLabels y sus configuraciones

		JLabel tituloInicio = new JLabel("Menús");
		tituloInicio.setBounds(30, 25, 300, 35);
		tituloInicio.setFont(new Font("Arial", Font.BOLD, 24));

		JLabel barraSuperior = new JLabel("Sistema de Gestión del Comedor");
		barraSuperior.setFont(new Font("Arial", Font.BOLD, 24));
		barraSuperior.setBounds(30, 20, 500, 40);
		barraSuperior.setForeground(Color.WHITE);

		JLabel barraSuperior2 = new JLabel("UTU Arrayanes");
		barraSuperior2.setBounds(1215, 20, 250, 40);
		barraSuperior2.setForeground(Color.WHITE);

		//JButtons, action listeners y configuraciones

		JButton inicioBut = new JButton("Inicio");
		inicioBut.setBackground(new Color(140, 182, 255));
		inicioBut.setFont(new Font("Arial", Font.BOLD, 15));
		ImageIcon iconoOriginal = new ImageIcon("icons/home.png");

        Image imagen = iconoOriginal.getImage().getScaledInstance(
            15, 15, Image.SCALE_SMOOTH
        );

        inicioBut.setIcon(new ImageIcon(imagen));
        inicioBut.setHorizontalAlignment(SwingConstants.CENTER);
        inicioBut.setIconTextGap(5);

		JButton productosBut = new JButton("Productos");
		productosBut.setBackground(new Color(140, 182, 255));
		productosBut.setFont(new Font("Arial", Font.BOLD, 13));
		ImageIcon iconoOriginal2 = new ImageIcon("icons/box.png");

        Image imagen2 = iconoOriginal2.getImage().getScaledInstance(
            15, 15, Image.SCALE_SMOOTH
        );

        productosBut.setIcon(new ImageIcon(imagen2));
        productosBut.setHorizontalAlignment(SwingConstants.CENTER);
        productosBut.setIconTextGap(5);

		JButton comprasBut = new JButton("Compras");
		comprasBut.setBackground(new Color(140, 182, 255));
		comprasBut.setFont(new Font("Arial", Font.BOLD, 15));
		ImageIcon iconoOriginal3 = new ImageIcon("icons/shopping cart.png");

        Image imagen3 = iconoOriginal3.getImage().getScaledInstance(
            15, 15, Image.SCALE_SMOOTH
        );

        comprasBut.setIcon(new ImageIcon(imagen3));
        comprasBut.setHorizontalAlignment(SwingConstants.CENTER);
        comprasBut.setIconTextGap(5);

		JButton platosBut = new JButton("Platos");
		platosBut.setBackground(new Color(140, 182, 255));
		platosBut.setFont(new Font("Arial", Font.BOLD, 15));
		ImageIcon iconoOriginal4 = new ImageIcon("icons/dish.png");

        Image imagen4 = iconoOriginal4.getImage().getScaledInstance(
            15, 15, Image.SCALE_SMOOTH
        );

        platosBut.setIcon(new ImageIcon(imagen4));
        platosBut.setHorizontalAlignment(SwingConstants.CENTER);
        platosBut.setIconTextGap(5);

		JButton menusBut = new JButton("Menús");
		menusBut.setBackground(new Color(140, 182, 255));
		menusBut.setFont(new Font("Arial", Font.BOLD, 15));
		ImageIcon iconoOriginal5 = new ImageIcon("icons/menu.png");

        Image imagen5 = iconoOriginal5.getImage().getScaledInstance(
            15, 15, Image.SCALE_SMOOTH
        );

        menusBut.setIcon(new ImageIcon(imagen5));
        menusBut.setHorizontalAlignment(SwingConstants.CENTER);
        menusBut.setIconTextGap(5);

		JButton salirBut = new JButton("Salir");
		salirBut.setBackground(new Color(140, 182, 255));
		salirBut.setFont(new Font("Arial", Font.BOLD, 15));
		ImageIcon iconoOriginal6 = new ImageIcon("icons/quit door.png");

        Image imagen6 = iconoOriginal6.getImage().getScaledInstance(
            15, 15, Image.SCALE_SMOOTH
        );

        salirBut.setIcon(new ImageIcon(imagen6));
        salirBut.setHorizontalAlignment(SwingConstants.CENTER);
        salirBut.setIconTextGap(5);

		JButton AgregarMBut = new JButton("Agregar Menú");
		AgregarMBut.setBackground(new Color(148, 255, 140));
		AgregarMBut.setFont(new Font("Arial", Font.BOLD, 15));
        ImageIcon iconoOriginal7 = new ImageIcon("icons/plus sign.png");
        Image imagen7 = iconoOriginal7.getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH);
        AgregarMBut.setIcon(new ImageIcon(imagen7));
        AgregarMBut.setHorizontalAlignment(SwingConstants.CENTER);
        AgregarMBut.setIconTextGap(5);

		JButton PrepararMBut = new JButton("Preparar Menú");
		PrepararMBut.setBackground(new Color(255, 255, 255));
		PrepararMBut.setFont(new Font("Arial", Font.BOLD, 15));

		JButton ActualizarMBut = new JButton("Actualizar");
		ActualizarMBut.setBackground(new Color(255, 236, 140));
		ActualizarMBut.setFont(new Font("Arial", Font.BOLD, 15));
ImageIcon iconoOriginal8 = new ImageIcon("icons/refresh.png");

        Image imagen8 = iconoOriginal8.getImage().getScaledInstance(19, 19, Image.SCALE_SMOOTH);

        ActualizarMBut.setIcon(new ImageIcon(imagen8));
        ActualizarMBut.setHorizontalAlignment(SwingConstants.CENTER);
        ActualizarMBut.setIconTextGap(5);

		JButton EliminarMBut = new JButton("Eliminar");
		EliminarMBut.setBackground(new Color(255, 140, 140));
		EliminarMBut.setFont(new Font("Arial", Font.BOLD, 15));
		ImageIcon iconoOriginal9 = new ImageIcon("icons/trash can.png");

        Image imagen9 = iconoOriginal9.getImage().getScaledInstance(19, 19, Image.SCALE_SMOOTH);

        EliminarMBut.setIcon(new ImageIcon(imagen9));
        EliminarMBut.setHorizontalAlignment(SwingConstants.CENTER);
        EliminarMBut.setIconTextGap(5);

		JButton VolverIBut = new JButton("Volver al Inicio");
        VolverIBut.setBackground(new Color(140, 182, 255));
        VolverIBut.setFont(new Font("Arial", Font.BOLD, 15));
ImageIcon iconoOriginal10 = new ImageIcon("icons/backwars arrow.png");

        Image imagen10 = iconoOriginal10.getImage().getScaledInstance(19, 19, Image.SCALE_SMOOTH);

        VolverIBut.setIcon(new ImageIcon(imagen10));
        VolverIBut.setHorizontalAlignment(SwingConstants.CENTER);
        VolverIBut.setIconTextGap(5);

		//Ubicación de los botones

		inicioBut.setBounds(20, 25, 120, 40);
		productosBut.setBounds(20, 70, 120, 40);
		comprasBut.setBounds(20, 115, 120, 40);
		platosBut.setBounds(20, 160, 120, 40);
		menusBut.setBounds(20, 205, 120, 40);
		salirBut.setBounds(20, 250, 120, 40);
		AgregarMBut.setBounds(50, 360, 200, 55);
		ActualizarMBut.setBounds(300, 360, 200, 55);
		EliminarMBut.setBounds(550, 360, 200, 55);
		VolverIBut.setBounds(800, 360, 200, 55);

		//JTable y modelo de datos

		String[] columnas = { "Dia", "Turno", "Plato", "Porciones", "Estado", "pd" };
		DefaultTableModel modeloTabl = new DefaultTableModel(columnas, 0);
		JTable tabla = new JTable(modeloTabl);
		JScrollPane scroll = new JScrollPane(tabla);
		tabla.removeColumn(tabla.getColumnModel().getColumn(5));
        tabla.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scroll.setBounds(30, 80, 1000, 250);

		tabla.setRowHeight(50);

		//Action Listeners y funcionamiento de los botones

		comprasBut.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				Food_List ventana = new Food_List();
				ventana.setVisible(true);

			}
		});

		platosBut.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				Dish_List ventana = new Dish_List();
				ventana.setVisible(true);
			}
		});

		productosBut.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				Product_List ventana = new Product_List();
				ventana.setVisible(true);

			}
		});

		/*
		 * PrepararMBut.addActionListener(new ActionListener() {
		 * 
		 * @Override public void actionPerformed(ActionEvent e) { dispose(); ventana14
		 * ventana = new ventana14(); ventana.setVisible(true);
		 * 
		 * } });
		 */

		inicioBut.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				Home ventana = new Home();
				ventana.setVisible(true);
			}
		});

		AgregarMBut.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Menu_Input(Menu_List.this).setVisible(true);

			}
		});

		salirBut.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				Logout ventana = new Logout();
				ventana.setVisible(true);

			}
		});

		VolverIBut.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Home ventana = new Home();
                ventana.setVisible(true);
            }
        });

ActualizarMBut.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				g.listarMenu(modeloTabl);

			}
		});

	EliminarMBut.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			int fila = tabla.getSelectedRow();
			if (fila != -1) {
				int filaModelo = tabla.convertRowIndexToModel(fila);
				int pd = (int)modeloTabl.getValueAt(filaModelo, 5);
				int respuesta = JOptionPane.showConfirmDialog(null, "¿Está seguro de que desea eliminar este producto?", "Confirmar eliminación",
						JOptionPane.YES_NO_OPTION);
				if (respuesta == JOptionPane.YES_OPTION) {
					boolean eliminado = g.bajaMenu(pd);
					if (eliminado) {
						g.listarMenu(modeloTabl);
					}
				}
			}

		}
	});

		//JPanels y sus configuraciones

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

		//adds

		this.add(panelito);

		panelito7.add(inicioBut);
		panelito7.add(productosBut);
		panelito7.add(comprasBut);
		panelito7.add(platosBut);
		panelito7.add(menusBut);
		panelito7.add(salirBut);

		contenido.add(tituloInicio);
		contenido.add(AgregarMBut);
		contenido.add(scroll);
		contenido.add(ActualizarMBut);
		contenido.add(EliminarMBut);
		contenido.add(VolverIBut);

		panelito8.add(barraSuperior);
		panelito8.add(barraSuperior2);
		panelito8.add(rectanguloAzul);
		panelito7.add(rectanguloAzul2);

		panelito.add(panelito7, BorderLayout.WEST);
		panelito.add(contenido, BorderLayout.CENTER);
		panelito.add(panelito8, BorderLayout.NORTH);

		g.listarMenu(modeloTabl);
	}

	//Gráficos y aporte visual

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
		GradientPaint degradado = new GradientPaint(0, 750, new Color(47, 85, 151, 0), 0, 300,
				new Color(47, 85, 151, 0));
		g2d.setPaint(degradado);
		g2d.fillRect(0, 0, getWidth(), getHeight());

	}
}