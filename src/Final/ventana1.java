package Final;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ventana1 extends JFrame {
	public ventana1() {
		this.setTitle("Ventana 1");
		this.setSize(1366, 688);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		JLabel tituloIniciarSesion = new JLabel("Iniciar sesión");
		tituloIniciarSesion.setFont(new Font("Arial", Font.BOLD, 30));
		tituloIniciarSesion.setBounds(64, 25, 200, 100);
		JLabel ingresarC = new JLabel("Ingrese la cédula del usuario:");
		ingresarC.setFont(new Font("Arial", Font.BOLD, 14));
		ingresarC.setBounds(20, 55, 300, 200);
		JTextField cedulaTF = new JTextField(20);
		cedulaTF.setBounds(20, 180, 275, 35);
		JLabel ingresarCont = new JLabel("Ingrese la contraseña:");
		ingresarCont.setFont(new Font("Arial", Font.BOLD, 14));
		ingresarCont.setBounds(20, 180, 300, 200);
		JTextField contraTF = new JTextField(20);
		contraTF.setBounds(20, 305, 275, 35);
		
		JButton IniciarSesion = new JButton("Iniciar Sesión");
		IniciarSesion.setText("<html><u>Iniciar Sesión</u></html>");
		IniciarSesion.setBounds(23, 385, 275, 65);
		IniciarSesion.setBackground(Color.WHITE);
		
		IniciarSesion.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				String cedula = cedulaTF.getText();
				String clave = contraTF.getText();
				String cedulaPrueba = "1234";
				String clavePrueba = "1234";

				if (cedula.equals(cedulaPrueba) && clave.equals(clavePrueba)) {
					dispose();
					ventana3 ventana = new ventana3();
					ventana.setVisible(true);
				} else {
					JOptionPane.showMessageDialog(null, "Cédula o contraseña incorrectas.");
				}
			}

		});
		
		JPanel panelito = new JPanel(new BorderLayout());
		JPanel rectanguloBlanco = new JPanel();
		rectanguloBlanco.setLayout(null);
		rectanguloBlanco.setPreferredSize(new Dimension(318, 0));
		JPanel contenido = new JPanel();
		contenido.setLayout(null);
		JPanel panelito8 = new JPanel();
		panelito8.setLayout(null);
		panelito8.setPreferredSize(new Dimension(0, 75));
		JPanel rectanguloAzul = new JPanel(null);
		rectanguloAzul.setBackground(new Color(47, 85, 151));
		rectanguloAzul.setBounds(0, 0, 1500, 1500);
		JPanel rectanguloAzul2 = new JPanel(null);
		rectanguloAzul2.setBackground(new Color(47, 85, 151));
		rectanguloAzul2.setBounds(0, 500, 318, 75);
		rectanguloBlanco.setBackground(new Color(255, 255, 255));

		JLabel barraSuperior = new JLabel("Sistema de Gestión del Comedor");
		barraSuperior.setFont(new Font("Arial", Font.BOLD, 24));
		barraSuperior.setBounds(30, 20, 500, 40);
		barraSuperior.setForeground(Color.WHITE);
		JLabel barraSuperior2 = new JLabel("UTU Arrayanes");
		barraSuperior2.setBounds(1215, 20, 250, 40);
		barraSuperior2.setForeground(Color.WHITE);
		
		JLabel subTNoCuenta = new JLabel("¿No tienes una cuenta?");
		subTNoCuenta.setFont(new Font("Arial", Font.BOLD, 15));
		subTNoCuenta.setBounds(70, 505, 500, 40);
		subTNoCuenta.setForeground(Color.WHITE);
		
		JButton creala = new JButton("Créala");
		creala.setText("<html><u>Créala</u></html>");
		creala.setForeground(Color.WHITE);
		creala.setBounds(100, 525, 100, 40);
		creala.setContentAreaFilled(false);
		creala.setBorderPainted(false);
		
		creala.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				ventana2 ventana = new ventana2();
				ventana.setVisible(true);
				
			}
		});
		
		ImageIcon cocina = new ImageIcon("coso.jpeg");
		JLabel imagenLbl = new JLabel(cocina);
		imagenLbl.setBounds(0, 0, 1035, 575);

		this.add(panelito);
		panelito8.add(barraSuperior);
		panelito8.add(barraSuperior2);
		panelito8.add(rectanguloAzul);
		
		rectanguloBlanco.add(tituloIniciarSesion);
		rectanguloBlanco.add(ingresarC);
		rectanguloBlanco.add(cedulaTF);
		rectanguloBlanco.add(ingresarCont);
		rectanguloBlanco.add(contraTF);
		rectanguloBlanco.add(IniciarSesion);
		rectanguloBlanco.add(subTNoCuenta);
		rectanguloBlanco.add(creala);
		rectanguloBlanco.add(rectanguloAzul2);
		contenido.add(imagenLbl);
		
		panelito.add(contenido, BorderLayout.CENTER);
		panelito.add(panelito8, BorderLayout.NORTH);
		panelito.add(rectanguloBlanco, BorderLayout.WEST);
	}

	@Override
	public void paint(Graphics g) {

		super.paint(g);

		g.setColor(Color.BLACK);
		g.drawRect(0, 105, 325, 574);

		g.setColor(Color.BLACK);
		g.drawRect(0, 0, 1366, 105);

		Graphics2D g2d = (Graphics2D) g;
		GradientPaint degradado = new GradientPaint(0, 400, new Color(47, 85, 151, 100), 0, 200,
				new Color(47, 85, 151, 0));
		g2d.setPaint(degradado);
		g2d.fillRect(326, 0, getWidth(), getHeight());

	}
}