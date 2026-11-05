package Final;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu_Input extends JFrame {

    public Menu_Input(Menu_List v12) {

        //Referencia al gestor
        gestor g = new gestor();

        String[] Estado = {"Planificado", "Pendiente"};

        //Configuración de la ventana
        this.setTitle("Menu Input");
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
        JLabel tituloInicio = new JLabel("Agregar Menú");
        tituloInicio.setBounds(30, 25, 300, 35);
        tituloInicio.setFont(new Font("Arial", Font.BOLD, 24));

        JLabel barraSuperior = new JLabel("Sistema de Gestión del Comedor");
        barraSuperior.setFont(new Font("Arial", Font.BOLD, 24));
        barraSuperior.setBounds(30, 20, 500, 40);
        barraSuperior.setForeground(Color.WHITE);

        JLabel barraSuperior2 = new JLabel("UTU Arrayanes");
        barraSuperior2.setBounds(1215, 20, 250, 40);
        barraSuperior2.setForeground(Color.WHITE);

        JLabel subTDia = new JLabel("Día:");
        subTDia.setBounds(60, 80, 100, 100);

        JLabel subTTurno = new JLabel("Turno:");
        subTTurno.setBounds(55, 147, 100, 100);

        JLabel subTPlato = new JLabel("Plato:");
        subTPlato.setBounds(57, 220, 100, 100);

        JLabel subTPorciones = new JLabel("Porciones:");
        subTPorciones.setBounds(360, 80, 100, 100);

        JLabel subTEstado = new JLabel("Estado:");
        subTEstado.setBounds(360, 149, 100, 100);

        //Textfields y sus ubicaciones
        JTextField DiaText = new JTextField(20);
        DiaText.setBounds(100, 105, 200, 50);

        JTextField TurnoText = new JTextField(20);
        TurnoText.setBounds(100, 175, 200, 50);

        DefaultComboBoxModel<String> modeloPlatos = new DefaultComboBoxModel<>();
        g.listarPlatosParaMenu(modeloPlatos);

        JComboBox<String> comboPlatos = new JComboBox<>(modeloPlatos);
        comboPlatos.setBounds(100, 245, 200, 50);
        
        comboPlatos.setLightWeightPopupEnabled(false);

        JTextField PorcionesText = new JTextField(20);
        PorcionesText.setBounds(435, 105, 200, 50);

        JComboBox<String> comboEstados = new JComboBox<>(Estado);
        comboEstados.setBounds(435, 175, 200, 50);
        
        comboEstados.setLightWeightPopupEnabled(false);

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

        JButton AgregarMBut = new JButton("Guardar Menú");
        AgregarMBut.setBackground(new Color(148, 255, 140));
        AgregarMBut.setFont(new Font("Arial", Font.BOLD, 15));

        JButton CancelarMBut = new JButton("Cancelar preparación");
        CancelarMBut.setBackground(new Color(255, 140, 140));
        CancelarMBut.setFont(new Font("Arial", Font.BOLD, 15));

        //Ubicación de los botones
        inicioBut.setBounds(20, 25, 120, 40);
        productosBut.setBounds(20, 70, 120, 40);
        comprasBut.setBounds(20, 115, 120, 40);
        platosBut.setBounds(20, 160, 120, 40);
        menusBut.setBounds(20, 205, 120, 40);
        salirBut.setBounds(20, 250, 120, 40);
        AgregarMBut.setBounds(50, 360, 200, 55);
        CancelarMBut.setBounds(300, 360, 200, 55);

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

        productosBut.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Product_List ventana = new Product_List();
                ventana.setVisible(true);

            }
        });

        CancelarMBut.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Menu_List ventana = new Menu_List();
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

        AgregarMBut.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String d = DiaText.getText().trim();
                String t = TurnoText.getText().trim();
                String p = comboPlatos.getSelectedItem().toString();
                String po = PorcionesText.getText().trim();
                String es = comboEstados.getSelectedItem().toString();

                if (d.isEmpty() || t.isEmpty() || p.isEmpty() || po.isEmpty() || es.isEmpty()) {

                    JOptionPane.showMessageDialog(null, "Falta rellenar información...");

                } else {

                    try {

                        int porciones = Integer.parseInt(po);

                        boolean guardado = g.altaMenu(d, t, p, porciones, es);

                        if (guardado) {

                            JOptionPane.showMessageDialog(null, "Producto guardado correctamente");

                            dispose();
                            v12.setVisible(true);

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
        contenido.add(AgregarMBut);
        contenido.add(CancelarMBut);
        contenido.add(subTDia);
        contenido.add(subTTurno);
        contenido.add(subTPlato);
        contenido.add(subTPorciones);
        contenido.add(DiaText);
        contenido.add(TurnoText);
        contenido.add(comboPlatos);
        contenido.add(PorcionesText);
        contenido.add(subTEstado);
        contenido.add(comboEstados);

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
        g.drawRect(205, 185, 650, 250);

        Graphics2D g2d = (Graphics2D) g;
        GradientPaint degradado = new GradientPaint(0, 750, new Color(47, 85, 151, 0), 0, 300,
                new Color(47, 85, 151, 0));
        g2d.setPaint(degradado);
        g2d.fillRect(0, 0, getWidth(), getHeight());

    }
}