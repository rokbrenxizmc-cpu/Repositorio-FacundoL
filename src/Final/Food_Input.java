package Final;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Food_Input extends JFrame {

    public Food_Input(Food_List v7) {

        //Referencia al gestor
        gestor g = new gestor();

        String[] Unidad = {"Kilo", "Litro", "Docena"};

        //Configuración de la ventana
        this.setTitle("Food Input");
        this.setSize(1366, 688);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

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

        //JLabels y sus configuraciones
        JLabel tituloInicio = new JLabel("Registrar compra");
        tituloInicio.setBounds(30, 25, 300, 35);
        tituloInicio.setFont(new Font("Arial", Font.BOLD, 24));

        JLabel Producto = new JLabel("Producto:");
        Producto.setBounds(50, 140, 300, 35);

        JLabel lblCantidad = new JLabel("Cantidad:");
        lblCantidad.setBounds(320, 140, 300, 40);

        JLabel lblUnidad = new JLabel("Unidad:");
        lblUnidad.setBounds(55, 200, 300, 40);

        JLabel lblFecha = new JLabel("Fecha:");
        lblFecha.setBounds(330, 200, 300, 40);

        JLabel lblPrecioUnit = new JLabel("Precio unit.:");
        lblPrecioUnit.setBounds(50, 260, 300, 40);

        JLabel lblVencimiento = new JLabel("Vencimiento:");
        lblVencimiento.setBounds(305, 260, 300, 40);

        JLabel lblSubtotal = new JLabel("Subtotal:");
        lblSubtotal.setBounds(55, 320, 300, 40);

        JLabel barraSuperior = new JLabel("Sistema de Gestión del Comedor");
        barraSuperior.setFont(new Font("Arial", Font.BOLD, 24));
        barraSuperior.setBounds(30, 20, 500, 40);
        barraSuperior.setForeground(Color.WHITE);

        JLabel barraSuperior2 = new JLabel("UTU Arrayanes");
        barraSuperior2.setBounds(1215, 20, 250, 40);
        barraSuperior2.setForeground(Color.WHITE);

        //Textfields y sus ubicaciones
        JTextField ProductoR = new JTextField(20);
        ProductoR.setBounds(140, 140, 160, 40);

        JTextField Cantidad = new JTextField(20);
        Cantidad.setBounds(380, 140, 160, 40);

        JComboBox<String> comboUnidad = new JComboBox<>(Unidad);
        comboUnidad.setBounds(140, 200, 160, 40);
        
        comboUnidad.setLightWeightPopupEnabled(false);

        JTextField Fecha = new JTextField(20);
        Fecha.setBounds(380, 200, 160, 40);

        JTextField PrecioUnit = new JTextField(20);
        PrecioUnit.setBounds(140, 260, 160, 40);

        JTextField Vencimiento = new JTextField(20);
        Vencimiento.setBounds(380, 260, 160, 40);

        JTextField Subtotal = new JTextField(20);
        Subtotal.setBounds(140, 320, 160, 40);

        //JButtons y sus configuraciones
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

        JButton GuardarCBut = new JButton("Guardar compra");
        GuardarCBut.setBackground(new Color(148, 255, 140));
        GuardarCBut.setFont(new Font("Arial", Font.BOLD, 15));

        JButton CancelarPBut = new JButton("Cancelar");
        CancelarPBut.setBackground(new Color(255, 140, 140));
        CancelarPBut.setFont(new Font("Arial", Font.BOLD, 15));

        //Ubicación de los botones
        inicioBut.setBounds(20, 25, 120, 40);
        productosBut.setBounds(20, 70, 120, 40);
        comprasBut.setBounds(20, 115, 120, 40);
        platosBut.setBounds(20, 160, 120, 40);
        menusBut.setBounds(20, 205, 120, 40);
        salirBut.setBounds(20, 250, 120, 40);
        GuardarCBut.setBounds(50, 500, 200, 55);
        CancelarPBut.setBounds(270, 500, 200, 55);

        //Action Listeners y funcionamiento de los botones
        comprasBut.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Food_List ventana = new Food_List();
                ventana.setVisible(true);

            }
        });

        GuardarCBut.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String p = ProductoR.getText().trim();
                String c = Cantidad.getText().trim();
                String u = comboUnidad.getSelectedItem().toString();
                String f = Fecha.getText().trim();
                String pU = PrecioUnit.getText().trim();
                String v = Vencimiento.getText().trim();
                String sb = Subtotal.getText().trim();

                if (p.isEmpty() || c.isEmpty() ||u.isEmpty() || f.isEmpty() || pU.isEmpty() || v.isEmpty() || sb.isEmpty()) {

                    JOptionPane.showMessageDialog(null, "Falta rellenar información...");

                } else {

                    try {

                        int cantidad = Integer.parseInt(c);
                        float precioUnit = Integer.parseInt(pU);
                        float subTotal = Integer.parseInt(sb);

                        boolean guardado = g.altaCompras(p, cantidad, u, f, precioUnit, v, subTotal);

                        if (guardado) {

                            JOptionPane.showMessageDialog(null, "Producto guardado correctamente");

                            dispose();
                            v7.setVisible(true);

                        }

                    } catch (NumberFormatException ex) {

                        JOptionPane.showMessageDialog(null, "El código y el stock deben ser números enteros");

                    }
                }

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

        menusBut.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Menu_List ventana = new Menu_List();
                ventana.setVisible(true);

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

        CancelarPBut.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Food_List ventana = new Food_List();
                ventana.setVisible(true);

            }
        });

        inicioBut.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Home ventana = new Home();
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

        salirBut.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Logout ventana = new Logout();
                ventana.setVisible(true);

            }
        });

        //Adds
        this.add(panelito);

        panelito7.add(inicioBut);
        panelito7.add(productosBut);
        panelito7.add(comprasBut);
        panelito7.add(platosBut);
        panelito7.add(menusBut);
        panelito7.add(salirBut);

        contenido.add(tituloInicio);
        contenido.add(GuardarCBut);
        contenido.add(CancelarPBut);
        contenido.add(Producto);
        contenido.add(ProductoR);
        contenido.add(lblCantidad);
        contenido.add(Cantidad);
        contenido.add(lblUnidad);
        contenido.add(comboUnidad);
        contenido.add(lblFecha);
        contenido.add(Fecha);
        contenido.add(lblPrecioUnit);
        contenido.add(PrecioUnit);
        contenido.add(lblVencimiento);
        contenido.add(Vencimiento);
        contenido.add(lblSubtotal);
        contenido.add(Subtotal);

        panelito8.add(barraSuperior);
        panelito8.add(barraSuperior2);
        panelito8.add(rectanguloAzul);
        panelito7.add(rectanguloAzul2);

        panelito.add(panelito7, BorderLayout.WEST);
        panelito.add(contenido, BorderLayout.CENTER);
        panelito.add(panelito8, BorderLayout.NORTH);
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
        g.drawRect(205, 185, 600, 400);

    }
}