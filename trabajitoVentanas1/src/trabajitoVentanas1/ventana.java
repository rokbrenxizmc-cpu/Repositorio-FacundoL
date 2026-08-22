package trabajitoVentanas1;
import javax.swing.*;
import java.awt.*;
public class ventana extends JFrame{
	ventana(){
		setTitle("Ventana de prueba");
		setSize(330, 250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(new GridLayout(3, 1));
		
		JPanel panelito1 = new JPanel();
		JPanel panelito2 = new JPanel(new GridLayout(1, 2));
		JPanel panelito3 = new JPanel();
		
		JLabel texto = new JLabel("Bienvenido al programa");
		JLabel nombrelbl = new JLabel("Nombre: ");
		JTextField nombretxt = new JTextField(10);
		JButton aceptar = new JButton("Aceptar");
		
		this.add(panelito1);
		this.add(panelito2);
		this.add(panelito3);
		panelito1.add(texto);
		panelito2.add(nombrelbl);
		panelito2.add(nombretxt);
		panelito3.add(aceptar);
	}
}
