package Final;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Product_Input extends JFrame {

    //Referencia al gestor
    gestor g = new gestor();

    public Product_Input(Product_List v4) {
    	String[] Unidades = {"kg", "L", "docena"};
        String[] Sectores = {"Cámara", "Despensa", "Freezer"};
        
        //Configuración de la ventana
        this.setTitle("Product Input");
        this.setSize(1366, 688);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
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

        JPanel rectanguloBlanco = new JPanel(null);
        rectanguloBlanco.setBackground(Color.WHITE);
        rectanguloBlanco.setBounds(30, 93, 760, 210);

        //JLabels y sus configuraciones
        JLabel tituloInicio = new JLabel("Productos");
        tituloInicio.setBounds(30, 25, 300, 35);
        tituloInicio.setFont(new Font("Arial", Font.BOLD, 24));

        JLabel barraSuperior = new JLabel("Sistema de Gestión del Comedor");
        barraSuperior.setFont(new Font("Arial", Font.BOLD, 24));
        barraSuperior.setBounds(30, 20, 500, 40);
        barraSuperior.setForeground(Color.WHITE);

        JLabel barraSuperior2 = new JLabel("UTU Arrayanes");
        barraSuperior2.setBounds(1215, 20, 250, 40);
        barraSuperior2.setForeground(Color.WHITE);

        JLabel tituloAgregarP = new JLabel("Agregar Producto");
        tituloAgregarP.setBounds(30, 20, 300, 35);
        tituloAgregarP.setFont(new Font("Arial", Font.BOLD, 24));

        JLabel subTCodigo = new JLabel("Código:");
        subTCodigo.setBounds(30, 60, 300, 35);

        JLabel subTNombre = new JLabel("Nombre:");
        subTNombre.setBounds(30, 110, 300, 35);

        JLabel subTStock = new JLabel("Stock:");
        subTStock.setBounds(30, 160, 300, 35);

        JLabel subTUnidad = new JLabel("Unidad:");
        subTUnidad.setBounds(400, 60, 300, 35);

        JLabel subTSector = new JLabel("Sector:");
        subTSector.setBounds(400, 110, 200, 40);

        //Textfields y sus ubicaciones
        JTextField Stock = new JTextField(20);
        Stock.setBounds(100, 160, 200, 40);

        JTextField Codigo = new JTextField(20);
        Codigo.setBounds(100, 60, 200, 40);

        JTextField Nombre = new JTextField(20);
        Nombre.setBounds(100, 110, 200, 40);


        JComboBox<String> comboSectores = new JComboBox<>(Sectores);
        comboSectores.setBounds(470, 110, 200, 40);
        
        JComboBox<String> comboUnidades = new JComboBox<>(Unidades);
        comboUnidades.setBounds(470, 60, 200, 40);
        
        comboUnidades.setLightWeightPopupEnabled(false);
        comboSectores.setLightWeightPopupEnabled(false);

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

        JButton GuardarPBut = new JButton("Guardar");
        GuardarPBut.setBackground(new Color(148, 255, 140));
        GuardarPBut.setFont(new Font("Arial", Font.BOLD, 15));

        JButton CancelarGBut = new JButton("Cancelar");
        CancelarGBut.setBackground(new Color(255, 140, 140));
        CancelarGBut.setFont(new Font("Arial", Font.BOLD, 15));

        //Ubicación de los botones
        inicioBut.setBounds(20, 25, 120, 40);
        productosBut.setBounds(20, 70, 120, 40);
        comprasBut.setBounds(20, 115, 120, 40);
        platosBut.setBounds(20, 160, 120, 40);
        menusBut.setBounds(20, 205, 120, 40);
        salirBut.setBounds(20, 250, 120, 40);

        GuardarPBut.setBounds(30, 320, 200, 55);
        CancelarGBut.setBounds(280, 320, 200, 55);

        //Action Listeners y funcionamiento de los botones
        comprasBut.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Food_List ventana = new Food_List();
                ventana.setVisible(true);
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

        CancelarGBut.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                dispose();
                v4.setVisible(true);

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

        GuardarPBut.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                String c = Codigo.getText().trim();
                String n = Nombre.getText().trim();
                String st = Stock.getText().trim();
                String u = comboUnidades.getSelectedItem().toString();
                String sector = comboSectores.getSelectedItem().toString();

                if (c.isEmpty() || n.isEmpty() || st.isEmpty() || u.isEmpty()) {

                    JOptionPane.showMessageDialog(null, "Falta rellenar información...");

                } else {

                    try {

                        int codigo = Integer.parseInt(c);
                        int stock = Integer.parseInt(st);

                        boolean guardado = g.altaProducto(codigo, n, stock, u, sector);

                        if (guardado) {

                            JOptionPane.showMessageDialog(null, "Producto guardado correctamente");

                            dispose();
                            v4.setVisible(true);

                        }

                    } catch (NumberFormatException ex) {

                        JOptionPane.showMessageDialog(null, "El código y el stock deben ser números enteros");

                    }
                }
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
        contenido.add(GuardarPBut);
        contenido.add(CancelarGBut);

        contenido.add(rectanguloBlanco);

        rectanguloBlanco.add(tituloAgregarP);
        rectanguloBlanco.add(subTCodigo);
        rectanguloBlanco.add(subTNombre);
        rectanguloBlanco.add(subTUnidad);
        rectanguloBlanco.add(subTSector);
        rectanguloBlanco.add(subTStock);
        rectanguloBlanco.add(Stock);
        rectanguloBlanco.add(Codigo);
        rectanguloBlanco.add(Nombre);
        rectanguloBlanco.add(comboUnidades);
        rectanguloBlanco.add(comboSectores);

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
        g.drawRect(205, 200, 760, 210);

        Graphics2D g2d = (Graphics2D) g;

        GradientPaint degradado = new GradientPaint(
            0, 750, new Color(47, 85, 151, 0),
            0, 300, new Color(47, 85, 151, 0)
        );

        g2d.setPaint(degradado);
        g2d.fillRect(0, 0, getWidth(), getHeight());
    }
}