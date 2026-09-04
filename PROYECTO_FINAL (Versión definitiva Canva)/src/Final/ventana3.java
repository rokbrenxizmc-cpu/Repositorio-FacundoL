package Final;
import javax.swing.*;
import java.awt.*;
public class ventana3 extends JFrame{
	public ventana3() {
		this.setTitle("Ventana 3");
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
        
		
		JLabel tituloInicio = new JLabel("Inicio");
		tituloInicio.setBounds(30, 25, 300, 35);
		tituloInicio.setFont(new Font("Arial", Font.BOLD, 24));
		JLabel bienvenida1 = new JLabel("Bienvenido al sistema");
		bienvenida1.setBounds(50, 90, 300, 30);
		bienvenida1.setFont(new Font("Arial", Font.BOLD, 24));
		JLabel bienvenida2 = new JLabel("Desde este programa se pueden registrar productos, compras, platos y menús del comedor.");
		bienvenida2.setBounds(50, 125, 650, 30);
		JLabel productosReg = new JLabel("Productos registrados: ");
		productosReg.setBounds(70, 200, 200, 30);
		JLabel productosReg2 = new JLabel("4");
		productosReg2.setBounds(130, 240, 200, 40);			
		productosReg2.setFont(new Font("Arial", Font.BOLD, 24));
		JLabel comprasReg = new JLabel("Compras registradas: ");
		comprasReg.setBounds(320, 200, 200, 30);
		JLabel comprasReg2 = new JLabel("2");
		comprasReg2.setBounds(380, 240, 200, 40);		
		comprasReg2.setFont(new Font("Arial", Font.BOLD, 24));
		JLabel menusReg = new JLabel("Menús registrados: ");
		menusReg.setBounds(570, 200, 200, 30);
		JLabel menusReg2 = new JLabel("3");
		menusReg2.setBounds(620, 240, 200, 40);			
		menusReg2.setFont(new Font("Arial", Font.BOLD, 24));
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
		
		inicioBut.setBounds(20, 25, 120, 40);
        productosBut.setBounds(20, 70, 120, 40);
        comprasBut.setBounds(20, 115, 120, 40);
        platosBut.setBounds(20, 160, 120, 40);
        menusBut.setBounds(20, 205, 120, 40);
        salirBut.setBounds(20, 250, 120, 40);
		
        
		
		
		this.add(panelito);	
		panelito7.add(inicioBut);
		panelito7.add(productosBut);
		panelito7.add(comprasBut);
		panelito7.add(platosBut);
		panelito7.add(menusBut);
		panelito7.add(salirBut);
	    contenido.add(tituloInicio);
	    contenido.add(bienvenida1);
	    contenido.add(bienvenida2);
	    contenido.add(productosReg);
	    contenido.add(productosReg2);
	    contenido.add(comprasReg);
	    contenido.add(comprasReg2);
	    contenido.add(menusReg);
	    contenido.add(menusReg2);
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
	        g.drawRect(463, 295, 200, 100);
	        
	        g.setColor(Color.BLACK);
	        g.drawRect(703, 295, 200, 100);
	        
	        g.setColor(Color.BLACK);
	        g.drawRect(215, 295, 200, 100);
	        
	        g.setColor(Color.BLACK);
	        g.drawRect(0, 105, 175, 574);
	        
	        g.setColor(Color.BLACK);
	        g.drawRect(200, 175, 700, 95);
	        
	        g.setColor(Color.BLACK);
	        g.drawRect(0, 0, 1366, 105);
	        
	        Graphics2D g2d = (Graphics2D) g;
	        GradientPaint degradado = new GradientPaint(0, 750, new Color(47, 85, 151), 0, 300, new Color(47, 85, 151, 0));
	        g2d.setPaint(degradado);
	        g2d.fillRect(0, 0, getWidth(), getHeight());
	        
	        
	   }
}