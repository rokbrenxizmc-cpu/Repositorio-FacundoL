package Final;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
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
import javax.swing.JTextField;

public class ventana1 extends JFrame {

	public ventana1() {

		this.setTitle("Sistema de Gestión del Comedor");
		this.setSize(760, 430);
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
		nombrePrograma.setPreferredSize(new Dimension(610, 35));

		panelTitulo.add(nombrePrograma);
		panelTitulo.add(nombreInstitucion);

		// Formulario a la izquierda, dividido en cuatro filas
		JPanel panelInicio = new JPanel();
		panelInicio.setLayout(new GridLayout(4, 1));
		panelInicio.setPreferredSize(new Dimension(245, 100));

		JPanel panelIniciar = new JPanel();
		JPanel panelCedula = new JPanel();
		JPanel panelContra = new JPanel();
		JPanel panelBoton = new JPanel();

		panelIniciar.setLayout(new FlowLayout(FlowLayout.LEFT));
		panelCedula.setLayout(new FlowLayout(FlowLayout.LEFT));
		panelContra.setLayout(new FlowLayout(FlowLayout.LEFT));
		panelBoton.setLayout(new FlowLayout(FlowLayout.CENTER));

		JLabel tituloInicio = new JLabel("Iniciar sesión");
		tituloInicio.setPreferredSize(new Dimension(220, 40));

		JLabel txtIniciar = new JLabel("Ingrese la cédula del usuario:");
		JTextField Fcedula = new JTextField(20);
		JLabel txtContra = new JLabel("Ingrese la contraseña:");
		JTextField FContra = new JTextField(20);

		JButton BtnInicio = new JButton("Iniciar sesión");
		BtnInicio.setPreferredSize(new Dimension(130, 30));

		panelIniciar.add(tituloInicio);
		panelCedula.add(txtIniciar);
		panelCedula.add(Fcedula);
		panelContra.add(txtContra);
		panelContra.add(FContra);
		panelBoton.add(BtnInicio);

		panelInicio.add(panelIniciar);
		panelInicio.add(panelCedula);
		panelInicio.add(panelContra);
		panelInicio.add(panelBoton);

		// Panel liso en el lugar de la foto
		JPanel panelComedor = new JPanel();
		panelComedor.setBackground(Color.LIGHT_GRAY);

		// Opción de crear cuenta debajo del formulario
		JPanel panelPie = new JPanel();
		panelPie.setLayout(new BorderLayout());
		panelPie.setBackground(Color.cyan);
		panelPie.setPreferredSize(new Dimension(100, 50));

		JPanel panelCuenta = new JPanel();
		panelCuenta.setLayout(new FlowLayout(FlowLayout.CENTER));
		panelCuenta.setBackground(Color.cyan);
		panelCuenta.setPreferredSize(new Dimension(245, 50));

		JLabel txtCrearCuenta = new JLabel("¿No tienes una cuenta?");
		JButton btnCreaCuenta = new JButton("<html><u>Créala</u></html>");
		btnCreaCuenta.setPreferredSize(new Dimension(220, 20));
		btnCreaCuenta.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCreaCuenta.setBorderPainted(false);
		btnCreaCuenta.setContentAreaFilled(false);
		btnCreaCuenta.setFocusPainted(false);
		btnCreaCuenta.setOpaque(false);

		panelCuenta.add(txtCrearCuenta);
		panelCuenta.add(btnCreaCuenta);
		panelPie.add(panelCuenta, BorderLayout.WEST);

		this.add(panelTitulo, BorderLayout.NORTH);
		this.add(panelInicio, BorderLayout.WEST);
		this.add(panelComedor, BorderLayout.CENTER);
		this.add(panelPie, BorderLayout.SOUTH);

		// Usuario de prueba, como en el ejercicio de inicio de sesión.
		BtnInicio.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				String cedula = Fcedula.getText();
				String clave = FContra.getText();
				String cedulaPrueba = "44325923";
				String clavePrueba = "1234";

				if (cedula.equals(cedulaPrueba) && clave.equals(clavePrueba)) {
					dispose();
					ventana3 compra = new ventana3();
					compra.setVisible(true);
				} else {
					JOptionPane.showMessageDialog(BtnInicio, "Cédula o contraseña incorrectas.");
				}
			}

		});

		btnCreaCuenta.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				ventana2 crear = new ventana2();
				crear.setVisible(true);
				setVisible(false);
			}

		});
	}
}