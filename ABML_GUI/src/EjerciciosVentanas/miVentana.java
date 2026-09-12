package EjerciciosVentanas;

import java.util.ArrayList;
import java.util.Scanner;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class miVentana extends JFrame {

	// Arreglo de tipo Usuario de nombre listaUsuarios
	ArrayList<Usuario> listaUsuarios = new ArrayList<>();

	public miVentana() {

		this.setTitle("Window");
		this.setSize(700, 400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(true);
		this.setLayout(new BorderLayout());

		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();

		JLabel lblCi = new JLabel("CI");
		JLabel lblNombre = new JLabel("Nombre");
		JLabel lblApellido = new JLabel("Apellido");

		JTextField fieldCi = new JTextField(10);
		JTextField fieldNombre = new JTextField(10);
		JTextField fieldApellido = new JTextField(10);

		panel2.add(lblCi);
		panel2.add(fieldCi);
		panel2.add(lblNombre);
		panel2.add(fieldNombre);
		panel2.add(lblApellido);
		panel2.add(fieldApellido);

		JButton botonRegist = new JButton("Registrar");
		JButton botonActual = new JButton("Actualizar");

		String[] columnas = { "CI", "NOMBRE", "APELLIDO" };

		DefaultTableModel tabla = new DefaultTableModel(columnas, 0);
		
		JTable tablita = new JTable(tabla);

		JScrollPane scroll = new JScrollPane(tablita);
		panel3.add(scroll);

		panel2.setBackground(Color.cyan);

		panel2.add(botonRegist);
		panel2.add(botonActual);

		this.add(panel2, BorderLayout.WEST);

		this.add(panel3, BorderLayout.EAST);

		

		panel2.setPreferredSize(new Dimension(170, 400));
		

		botonRegist.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				String c = fieldCi.getText();
				
				String nombre = fieldNombre.getText();
				String apellido = fieldApellido.getText();
				
				if(fieldCi.getText().isEmpty() || fieldNombre.getText().isEmpty() || fieldApellido.getText().isEmpty()) {
					
					JOptionPane.showMessageDialog(null, "Error, existe un campo vacio");
					
				}else {
					
				int ci = Integer.parseInt(c);
				altaUsuario(ci, nombre, apellido);
				actualizar(tabla);

			}
			}
		});

		botonActual.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				actualizar(tabla);

			}
		});

	}

	public void altaUsuario(int c, String n, String a) {
		
		Usuario u = new Usuario(c, n, a);
		listaUsuarios.add(u);
		
		
	}

	public void actualizar(DefaultTableModel tabla) {
		
		tabla.setRowCount(0);
		for(Usuario u: listaUsuarios) {
			
			Object[] fila = {u.getCi(), u.getNombre(), u.getApellido()};
			tabla.addRow(fila);
			
			
		}

	}

}
