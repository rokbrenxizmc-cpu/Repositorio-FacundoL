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
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ventana2 extends JFrame {

	public ventana2() {

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

		// Formulario a la izquierda, dividido en cinco filas
		JPanel panelRegistro = new JPanel();
		panelRegistro.setLayout(new GridLayout(5, 1));
		panelRegistro.setPreferredSize(new Dimension(245, 100));

		JPanel panelCrear = new JPanel();
		JPanel panelCedula = new JPanel();
		JPanel panelContra = new JPanel();
		JPanel panelRepetirContra = new JPanel();
		JPanel panelBoton = new JPanel();

		panelCrear.setLayout(new FlowLayout(FlowLayout.LEFT));
		panelCedula.setLayout(new FlowLayout(FlowLayout.LEFT));
		panelContra.setLayout(new FlowLayout(FlowLayout.LEFT));
		panelRepetirContra.setLayout(new FlowLayout(FlowLayout.LEFT));
		panelBoton.setLayout(new FlowLayout(FlowLayout.CENTER));

		JLabel tituloCrear = new JLabel("Crear cuenta");
		tituloCrear.setPreferredSize(new Dimension(220, 40));

		JLabel txtCedula = new JLabel("Ingrese la cédula del usuario:");
		JTextField Fcedula = new JTextField(20);
		JLabel txtContra = new JLabel("Ingrese la contraseña:");
		JTextField FContra = new JTextField(20);
		JLabel txtRepetirContra = new JLabel("Ingrese la contraseña nuevamente:");
		JTextField FRepetirContra = new JTextField(20);

		JButton BtnCrear = new JButton("Crear cuenta");
		BtnCrear.setPreferredSize(new Dimension(130, 30));

		panelCrear.add(tituloCrear);
		panelCedula.add(txtCedula);
		panelCedula.add(Fcedula);
		panelContra.add(txtContra);
		panelContra.add(FContra);
		panelRepetirContra.add(txtRepetirContra);
		panelRepetirContra.add(FRepetirContra);
		panelBoton.add(BtnCrear);

		panelRegistro.add(panelCrear);
		panelRegistro.add(panelCedula);
		panelRegistro.add(panelContra);
		panelRegistro.add(panelRepetirContra);
		panelRegistro.add(panelBoton);

		// Panel liso en el lugar de la foto
		JPanel panelComedor = new JPanel();
		panelComedor.setBackground(Color.LIGHT_GRAY);

		// Opción de volver al inicio de sesión
		JPanel panelPie = new JPanel();
		panelPie.setLayout(new BorderLayout());
		panelPie.setBackground(Color.cyan);
		panelPie.setPreferredSize(new Dimension(100, 50));

		JPanel panelCuenta = new JPanel();
		panelCuenta.setLayout(new FlowLayout(FlowLayout.CENTER));
		panelCuenta.setBackground(Color.cyan);
		panelCuenta.setPreferredSize(new Dimension(245, 50));

		JLabel txtIniciarSesion = new JLabel("¿Ya tienes una cuenta?");
		JButton btnIniciarSesion = new JButton("<html><u>Inicia sesión</u></html>");
		btnIniciarSesion.setPreferredSize(new Dimension(220, 20));
		btnIniciarSesion.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnIniciarSesion.setBorderPainted(false);
		btnIniciarSesion.setContentAreaFilled(false);
		btnIniciarSesion.setFocusPainted(false);
		btnIniciarSesion.setOpaque(false);

		panelCuenta.add(txtIniciarSesion);
		panelCuenta.add(btnIniciarSesion);
		panelPie.add(panelCuenta, BorderLayout.WEST);

		this.add(panelTitulo, BorderLayout.NORTH);
		this.add(panelRegistro, BorderLayout.WEST);
		this.add(panelComedor, BorderLayout.CENTER);
		this.add(panelPie, BorderLayout.SOUTH);

		btnIniciarSesion.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				ventana1 inicio = new ventana1();
				inicio.setVisible(true);
				setVisible(false);
			}

		});
	}
}
