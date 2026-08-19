package practico1Ventanas;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ventana extends JFrame{
	public ventana() {
		setTitle("Título de la ventana");
		setSize(330, 250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(true);
		setLayout(new FlowLayout());
		
		JPanel panelito1 = new JPanel(new GridLayout(2, 2));
		JPanel panelito2 = new JPanel();
		JPanel panelito3 = new JPanel(new GridLayout(2, 1));
		
		JLabel nombre = new JLabel("Nombre: ");
		JTextField txtNombre = new JTextField(10);
		JLabel contra = new JLabel("Contraseña: ");
		JTextField txtContra = new JTextField(10);
		JButton registro = new JButton("Registrar en consola");
		
		registro.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String nombre2 = txtNombre.getText();
				String contra2 = txtContra.getText();
				System.out.println(nombre2);
				System.out.println(contra2);
				
			}
		});
		
		this.add(panelito1);
		this.add(panelito2);
		this.add(panelito3);
		panelito1.add(nombre);
		panelito1.add(txtNombre);
		panelito1.add(contra);
		panelito1.add(txtContra);
		panelito2.add(registro);
		panelito3.add(panelito1);
		panelito3.add(panelito2);
	}
}
