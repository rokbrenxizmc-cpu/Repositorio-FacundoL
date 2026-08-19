package calculadora_GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ventana extends JFrame {
	public ventana() {
		setTitle("Calculadora");
		setSize(330, 250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(new GridLayout(3, 1));

		JPanel panelito1 = new JPanel(new GridLayout(2, 2));
		JPanel panelito2 = new JPanel(new GridLayout(1, 2));
		JPanel panelito3 = new JPanel(new FlowLayout());
		JPanel panelito4 = new JPanel(new GridLayout(3, 1));

		JLabel lblNro1 = new JLabel("Primer número: ");
		JTextField txtNro1 = new JTextField(10);
		JLabel lblNro2 = new JLabel("Segundo número: ");
		JTextField txtNro2 = new JTextField(10);
		JLabel txtResultado = new JLabel("Resultado: ");
		JButton sumar = new JButton("+");
		JButton restar = new JButton("-");
		JButton multiplicar = new JButton("*");
		JButton dividir = new JButton("/");
		JLabel resultadoFinal = new JLabel("");
		
		sumar.addActionListener(new ActionListener() {
			

			@Override
			public void actionPerformed(ActionEvent e) {
				String nroSuma1 = txtNro1.getText();
				double numeritoSuma1 = Double.parseDouble(nroSuma1);
				String nroSuma2 = txtNro2.getText();
				double numeritoSuma2 = Double.parseDouble(nroSuma2);
				double total = sumar2(numeritoSuma1, numeritoSuma2);
				resultadoFinal.setText(String.valueOf(total));

			}
		});

		restar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String nroResta1 = txtNro1.getText();
				double numeritoResta1 = Double.parseDouble(nroResta1);
				String nroResta2 = txtNro2.getText();
				double numeritoResta2 = Double.parseDouble(nroResta2);
				double total = restar2(numeritoResta1, numeritoResta2);
				resultadoFinal.setText(String.valueOf(total));
			}
		});

		multiplicar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String nroMultiplicar1 = txtNro1.getText();
				double numeritoMultiplicar1 = Double.parseDouble(nroMultiplicar1);
				String nroMultiplicar2 = txtNro2.getText();
				double numeritoMultiplicar2 = Double.parseDouble(nroMultiplicar2);
				double total = multiplicar2(numeritoMultiplicar1, numeritoMultiplicar2);
				resultadoFinal.setText(String.valueOf(total));
			}
		});

		dividir.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String nroDividir1 = txtNro1.getText();
				double numeritoDividir1 = Double.parseDouble(nroDividir1);
				String nroDividir2 = txtNro2.getText();
				double numeritoDividir2 = Double.parseDouble(nroDividir2);
				double total = dividir2(numeritoDividir1, numeritoDividir2);
				resultadoFinal.setText(String.valueOf(total));
			}
		});

		this.add(panelito1);
		this.add(panelito2);
		this.add(panelito3);
		this.add(panelito4);
		panelito1.add(lblNro1);
		panelito1.add(txtNro1);
		panelito1.add(lblNro2);
		panelito1.add(txtNro2);
		panelito2.add(txtResultado);
		panelito2.add(resultadoFinal);
		panelito3.add(sumar);
		panelito3.add(restar);
		panelito3.add(multiplicar);
		panelito3.add(dividir);
		panelito4.add(panelito1);
		panelito4.add(panelito2);
		panelito4.add(panelito3);
		this.setLayout(new BorderLayout());
		this.add(panelito4, BorderLayout.CENTER);
		

	}
	public Double sumar2(double numeritoSuma1, double numeritoSuma2) {
		double resultado = (numeritoSuma1 + numeritoSuma2);
		return resultado;
	}
	public Double restar2(double numeritoSuma1, double numeritoSuma2) {
		double resultado = (numeritoSuma1 - numeritoSuma2);
		return resultado;
	}
	public Double multiplicar2(double numeritoSuma1, double numeritoSuma2) {
		double resultado = (numeritoSuma1 * numeritoSuma2);
		return resultado;
	}
	public Double dividir2(double numeritoSuma1, double numeritoSuma2) {
		double resultado = (numeritoSuma1 / numeritoSuma2);
		return resultado;
	}
}
