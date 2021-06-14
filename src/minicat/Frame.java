package minicat;

import minicat.Control;

public class Frame extends javax.swing.JFrame {

    public Frame() {
        initComponents();
    }

    public void addEventos() {
        Control controlador = new Control(this);
      
        bgFiguras.add(rbLinea);
        bgFiguras.add(rbTriangulo);
        bgFiguras.add(rbRectangulo);
        bgFiguras.add(rbPentagono);
        bgFiguras.add(rbPoligono);
        panelPrincipal.addMouseListener(controlador);
        spLado.addChangeListener(controlador);
       // spG.addChangeListener(controlador);
        //spB.addChangeListener(controlador);
        btMasRotar.addActionListener(controlador);
        btMenosRotar.addActionListener(controlador);
        btMasTamanio.addActionListener(controlador);
        btMenosTamanio.addActionListener(controlador);
        btMovimientoArriba.addActionListener(controlador);
        btMovimientoAbajo.addActionListener(controlador);
        btMovimientoDerecha.addActionListener(controlador);
        btMovimientoIzquierda.addActionListener(controlador);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgFiguras = new javax.swing.ButtonGroup();
        rbLinea = new javax.swing.JRadioButton();
        rbTriangulo = new javax.swing.JRadioButton();
        rbRectangulo = new javax.swing.JRadioButton();
        rbPentagono = new javax.swing.JRadioButton();
        lbContador = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        rbPoligono = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        spLado = new javax.swing.JSpinner();
        btMovimientoAbajo = new javax.swing.JButton();
        btMovimientoArriba = new javax.swing.JButton();
        btMovimientoDerecha = new javax.swing.JButton();
        btMovimientoIzquierda = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbFiguras = new javax.swing.JComboBox<>();
        panelPrincipal = new minicat.Panel();
        btMasTamanio = new javax.swing.JButton();
        btMasRotar = new javax.swing.JButton();
        btMenosTamanio = new javax.swing.JButton();
        btMenosRotar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        rbLinea.setSelected(true);
        getContentPane().add(rbLinea);
        rbLinea.setBounds(20, 50, 20, 30);
        getContentPane().add(rbTriangulo);
        rbTriangulo.setBounds(20, 80, 20, 30);
        getContentPane().add(rbRectangulo);
        rbRectangulo.setBounds(20, 110, 20, 30);
        getContentPane().add(rbPentagono);
        rbPentagono.setBounds(20, 140, 21, 30);

        lbContador.setForeground(new java.awt.Color(255, 255, 255));
        lbContador.setText("Puntos: 0");
        getContentPane().add(lbContador);
        lbContador.setBounds(10, 450, 60, 20);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 480, 0, 0);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tamaño.png"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 410, 20, 30);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/rotar.png"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(10, 370, 20, 40);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/linea.png"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(50, 50, 50, 30);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/rectangulo.png"))); // NOI18N
        getContentPane().add(jLabel11);
        jLabel11.setBounds(50, 110, 30, 30);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pentagono.png"))); // NOI18N
        getContentPane().add(jLabel12);
        jLabel12.setBounds(50, 140, 30, 30);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Figuras:");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(20, 30, 60, 14);
        getContentPane().add(rbPoligono);
        rbPoligono.setBounds(20, 170, 20, 30);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/poligono.png"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(50, 170, 30, 30);

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("L:");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(20, 200, 20, 20);

        spLado.setModel(new javax.swing.SpinnerNumberModel(2, 2, 9, 1));
        getContentPane().add(spLado);
        spLado.setBounds(40, 200, 40, 20);

        btMovimientoAbajo.setFont(new java.awt.Font("Monotype Corsiva", 0, 3)); // NOI18N
        btMovimientoAbajo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flechaAbajo.png"))); // NOI18N
        btMovimientoAbajo.setText("ab");
        btMovimientoAbajo.setBorderPainted(false);
        btMovimientoAbajo.setContentAreaFilled(false);
        getContentPane().add(btMovimientoAbajo);
        btMovimientoAbajo.setBounds(40, 340, 20, 20);

        btMovimientoArriba.setFont(new java.awt.Font("Monotype Corsiva", 0, 3)); // NOI18N
        btMovimientoArriba.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flechaArriba.png"))); // NOI18N
        btMovimientoArriba.setText("a");
        btMovimientoArriba.setBorderPainted(false);
        btMovimientoArriba.setContentAreaFilled(false);
        getContentPane().add(btMovimientoArriba);
        btMovimientoArriba.setBounds(40, 300, 20, 20);

        btMovimientoDerecha.setFont(new java.awt.Font("Monotype Corsiva", 0, 3)); // NOI18N
        btMovimientoDerecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flechaDerecha.png"))); // NOI18N
        btMovimientoDerecha.setText("d");
        btMovimientoDerecha.setBorderPainted(false);
        btMovimientoDerecha.setContentAreaFilled(false);
        getContentPane().add(btMovimientoDerecha);
        btMovimientoDerecha.setBounds(60, 320, 20, 20);

        btMovimientoIzquierda.setFont(new java.awt.Font("Monotype Corsiva", 0, 3)); // NOI18N
        btMovimientoIzquierda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flechaIzquierda.png"))); // NOI18N
        btMovimientoIzquierda.setText("i");
        btMovimientoIzquierda.setBorderPainted(false);
        btMovimientoIzquierda.setContentAreaFilled(false);
        btMovimientoIzquierda.setName("i"); // NOI18N
        getContentPane().add(btMovimientoIzquierda);
        btMovimientoIzquierda.setBounds(20, 320, 20, 20);

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/triangulo.png"))); // NOI18N
        getContentPane().add(jLabel19);
        jLabel19.setBounds(50, 80, 30, 30);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Transformaciones:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 240, 100, 14);

        cbFiguras.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Figura..." }));
        cbFiguras.setToolTipText("");
        getContentPane().add(cbFiguras);
        cbFiguras.setBounds(10, 270, 90, 20);

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 780, Short.MAX_VALUE)
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );

        getContentPane().add(panelPrincipal);
        panelPrincipal.setBounds(110, 0, 780, 610);

        btMasTamanio.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        btMasTamanio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mas.png"))); // NOI18N
        btMasTamanio.setText("+t");
        btMasTamanio.setBorderPainted(false);
        btMasTamanio.setContentAreaFilled(false);
        getContentPane().add(btMasTamanio);
        btMasTamanio.setBounds(40, 410, 30, 20);

        btMasRotar.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        btMasRotar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mas.png"))); // NOI18N
        btMasRotar.setText("+r");
        btMasRotar.setBorderPainted(false);
        btMasRotar.setContentAreaFilled(false);
        getContentPane().add(btMasRotar);
        btMasRotar.setBounds(40, 380, 30, 20);

        btMenosTamanio.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        btMenosTamanio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menos.png"))); // NOI18N
        btMenosTamanio.setText("-t");
        btMenosTamanio.setBorderPainted(false);
        btMenosTamanio.setContentAreaFilled(false);
        getContentPane().add(btMenosTamanio);
        btMenosTamanio.setBounds(70, 410, 30, 20);

        btMenosRotar.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        btMenosRotar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menos.png"))); // NOI18N
        btMenosRotar.setText("-r");
        btMenosRotar.setBorderPainted(false);
        btMenosRotar.setContentAreaFilled(false);
        getContentPane().add(btMenosRotar);
        btMenosRotar.setBounds(70, 380, 30, 20);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MiniCat");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 0, 60, 30);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 110, 640);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.ButtonGroup bgFiguras;
    public javax.swing.JButton btMasRotar;
    public javax.swing.JButton btMasTamanio;
    public javax.swing.JButton btMenosRotar;
    public javax.swing.JButton btMenosTamanio;
    private javax.swing.JButton btMovimientoAbajo;
    private javax.swing.JButton btMovimientoArriba;
    private javax.swing.JButton btMovimientoDerecha;
    private javax.swing.JButton btMovimientoIzquierda;
    public javax.swing.JComboBox<String> cbFiguras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JLabel lbContador;
    public minicat.Panel panelPrincipal;
    public javax.swing.JRadioButton rbLinea;
    public javax.swing.JRadioButton rbPentagono;
    public javax.swing.JRadioButton rbPoligono;
    public javax.swing.JRadioButton rbRectangulo;
    public javax.swing.JRadioButton rbTriangulo;
    public javax.swing.JSpinner spLado;
    // End of variables declaration//GEN-END:variables
}
