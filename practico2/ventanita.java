package practico2;
import javax.swing.*;
import java.awt.*;
public class ventanita extends JFrame{
	
	public ventanita() {
		setTitle("Registrar Usuario");
		setSize(320, 380);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); 
        setResizable(true);
		
        setLayout(new BorderLayout(15, 15));
        
        JPanel panelForm = new JPanel(new GridLayout(5, 2));

        JLabel lblNombre = new JLabel("Nombre:");
        JTextField txtNombre = new JTextField();
        JLabel lblApellido = new JLabel("Apellido:");
        JTextField txtApellido = new JTextField();
        JLabel lblCedula = new JLabel("Cédula:");
        JTextField txtCedula = new JTextField();
        JLabel lblEdad = new JLabel("Edad:");
        JTextField txtEdad = new JTextField();
        JLabel lblRol = new JLabel("Rol:");
        String[] opcionesRol = {"Seleccione:", "Administrador", "Usuario"};
        JComboBox<String> comboRol = new JComboBox<>(opcionesRol);
		
        panelForm.add(lblNombre);
        panelForm.add(txtNombre);
        panelForm.add(lblApellido);
        panelForm.add(txtApellido);
        panelForm.add(lblCedula);
        panelForm.add(txtCedula);
        panelForm.add(lblEdad);
        panelForm.add(txtEdad);
        panelForm.add(lblRol);
        panelForm.add(comboRol);
		
        JPanel panelBoton = new JPanel();
        JButton btnRegistrar = new JButton("Registrar");
        panelBoton.add(btnRegistrar);

        add(panelForm, BorderLayout.CENTER);
        add(panelBoton, BorderLayout.WEST);
        add(panelBoton, BorderLayout.SOUTH);
	}
}
