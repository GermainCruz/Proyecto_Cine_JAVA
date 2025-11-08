package presentacion;

import java.sql.*;
import java.awt.Color;
import java.awt.Cursor;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class PanelCombos extends javax.swing.JPanel {

    private int idVenta;
    private int idCliente;
    private int idProducto;

    private int cantidadId4;
    private int cantidadId5;
    private int cantidadId6;
    private int cantidadId7;
    private int cantidadId8;
    private int cantidadId9;

    private int totalCombos;
    private double subtotalpelis;
    private double subtotalcombos = 0.0d;
    private double totalPagar;
    
    private int idPelicula;
    
    private String pelihora;
    private int nButacas;

    public PanelCombos() {
        initComponents();
    }

    public PanelCombos(int idCliente, int idVenta, double subtotalpelis, int idPelicula, String pelihora, int nButacas) {
        this.idPelicula = idPelicula;
        this.subtotalpelis = subtotalpelis;
        this.idCliente = idCliente;
        this.idVenta = idVenta;
        this.pelihora = pelihora;
        this.nButacas = nButacas;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        btnComprar1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtASinopsis = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtASinopsis1 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtASinopsis2 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtASinopsis3 = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtASinopsis4 = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        txtASinopsis5 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        id4 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        id5 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        precioid5 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        id6 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        precioid6 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        precioid9 = new javax.swing.JLabel();
        id7 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        precioid7 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        id8 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        precioid8 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        id9 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        precioid4 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(600, 600));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Square721 BT", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 153));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("COMBOS");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, 99, -1));

        btnComprar1.setBackground(new java.awt.Color(255, 51, 51));
        btnComprar1.setFont(new java.awt.Font("Square721 BT", 1, 18)); // NOI18N
        btnComprar1.setForeground(new java.awt.Color(255, 255, 255));
        btnComprar1.setText("Continuar");
        btnComprar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnComprar1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnComprar1MouseExited(evt);
            }
        });
        btnComprar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprar1ActionPerformed(evt);
            }
        });
        add(btnComprar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(486, 545, -1, -1));

        txtASinopsis.setEditable(false);
        txtASinopsis.setColumns(20);
        txtASinopsis.setFont(new java.awt.Font("Square721 BT", 0, 12)); // NOI18N
        txtASinopsis.setLineWrap(true);
        txtASinopsis.setRows(5);
        txtASinopsis.setText("Canchita Grande(Salada) + 1 Bebida (32oz).*Sabor gaseosa sujeto a stock del cine.");
        txtASinopsis.setWrapStyleWord(true);
        txtASinopsis.setBorder(null);
        txtASinopsis.setFocusable(false);
        txtASinopsis.setRequestFocusEnabled(false);
        jScrollPane2.setViewportView(txtASinopsis);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 159, 155, 85));

        txtASinopsis1.setEditable(false);
        txtASinopsis1.setColumns(20);
        txtASinopsis1.setFont(new java.awt.Font("Square721 BT", 0, 12)); // NOI18N
        txtASinopsis1.setLineWrap(true);
        txtASinopsis1.setRows(5);
        txtASinopsis1.setText("Canchita Grande(Dulce) + 1 Bebida (32oz).*Sabor gaseosa sujeto a stock del cine");
        txtASinopsis1.setWrapStyleWord(true);
        txtASinopsis1.setBorder(null);
        txtASinopsis1.setFocusable(false);
        txtASinopsis1.setRequestFocusEnabled(false);
        jScrollPane3.setViewportView(txtASinopsis1);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 159, 191, 85));

        txtASinopsis2.setEditable(false);
        txtASinopsis2.setColumns(20);
        txtASinopsis2.setFont(new java.awt.Font("Square721 BT", 0, 12)); // NOI18N
        txtASinopsis2.setLineWrap(true);
        txtASinopsis2.setRows(5);
        txtASinopsis2.setText("1 Canchita Grande (Salada) + 2 Bebidas Medianas (21 oz). *Sabor gaseosa sujeto a stock del cine");
        txtASinopsis2.setWrapStyleWord(true);
        txtASinopsis2.setBorder(null);
        txtASinopsis2.setFocusable(false);
        txtASinopsis2.setRequestFocusEnabled(false);
        jScrollPane4.setViewportView(txtASinopsis2);

        add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(424, 159, 143, 85));

        txtASinopsis3.setEditable(false);
        txtASinopsis3.setColumns(20);
        txtASinopsis3.setFont(new java.awt.Font("Square721 BT", 0, 12)); // NOI18N
        txtASinopsis3.setLineWrap(true);
        txtASinopsis3.setRows(5);
        txtASinopsis3.setText("1 Canchita Gigante (Dulce) + 2 Bebidas (32oz). *Sabor bebida sujeto a stock / canchita sin refill");
        txtASinopsis3.setWrapStyleWord(true);
        txtASinopsis3.setBorder(null);
        txtASinopsis3.setFocusable(false);
        txtASinopsis3.setRequestFocusEnabled(false);
        jScrollPane5.setViewportView(txtASinopsis3);

        add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 409, 184, 85));

        txtASinopsis4.setEditable(false);
        txtASinopsis4.setColumns(20);
        txtASinopsis4.setFont(new java.awt.Font("Square721 BT", 0, 12)); // NOI18N
        txtASinopsis4.setLineWrap(true);
        txtASinopsis4.setRows(5);
        txtASinopsis4.setText("Canchita Gigante Salada + 2 Bebidas (32oz). *Sabor bebida sujeto a stock / canchita sin refill");
        txtASinopsis4.setWrapStyleWord(true);
        txtASinopsis4.setBorder(null);
        txtASinopsis4.setFocusable(false);
        txtASinopsis4.setRequestFocusEnabled(false);
        jScrollPane6.setViewportView(txtASinopsis4);

        add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 409, 146, -1));

        txtASinopsis5.setEditable(false);
        txtASinopsis5.setColumns(20);
        txtASinopsis5.setFont(new java.awt.Font("Square721 BT", 0, 12)); // NOI18N
        txtASinopsis5.setLineWrap(true);
        txtASinopsis5.setRows(5);
        txtASinopsis5.setText("1 Canchita Gigante (Mix) + 2 Bebidas (32oz). *Sabor bebida sujeto a stock / canchita sin refill");
        txtASinopsis5.setWrapStyleWord(true);
        txtASinopsis5.setBorder(null);
        txtASinopsis5.setFocusable(false);
        txtASinopsis5.setRequestFocusEnabled(false);
        jScrollPane7.setViewportView(txtASinopsis5);

        add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(424, 409, 143, -1));

        jLabel1.setFont(new java.awt.Font("Square721 BT", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Combo 2 Dulce OL CC ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 137, 146, -1));

        jLabel2.setFont(new java.awt.Font("Square721 BT", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 153));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Combo 2 Salado OL CC ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 137, -1, -1));

        jLabel3.setFont(new java.awt.Font("Square721 BT", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 153));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Combo 2 Mix OL CC ");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(431, 137, -1, -1));

        jLabel5.setFont(new java.awt.Font("Square721 BT", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 153));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Com.2 Salado Dob.Gig. OL ");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 386, 146, -1));

        jLabel6.setFont(new java.awt.Font("Square721 BT", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 153));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Com.2 Mix Dob.Gig. OL ");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 386, 146, -1));

        jLabel7.setFont(new java.awt.Font("Square721 BT", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 153));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Com.2 Dulce Dob.Gig. OL ");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(421, 386, 146, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Combo4.jpg"))); // NOI18N
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 291, 146, 83));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Combo1.jpg"))); // NOI18N
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 42, -1, 83));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Combo2.jpg"))); // NOI18N
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 42, -1, 83));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Combo3.jpg"))); // NOI18N
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(431, 42, -1, 83));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Combo5.jpg"))); // NOI18N
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 291, -1, 83));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Combo6.jpg"))); // NOI18N
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(421, 291, 146, 83));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/resta.png"))); // NOI18N
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel14MousePressed(evt);
            }
        });
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 256, 35, 29));

        id4.setFont(new java.awt.Font("Square721 BT", 0, 12)); // NOI18N
        id4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        id4.setText("0");
        add(id4, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 256, 29, 29));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/suma.png"))); // NOI18N
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel16MousePressed(evt);
            }
        });
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 256, -1, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/resta.png"))); // NOI18N
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel18MousePressed(evt);
            }
        });
        add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 256, 35, 29));

        id5.setFont(new java.awt.Font("Square721 BT", 0, 12)); // NOI18N
        id5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        id5.setText("0");
        add(id5, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 256, 29, 29));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/suma.png"))); // NOI18N
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel20MousePressed(evt);
            }
        });
        add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 256, -1, -1));

        precioid5.setText("S/26.50");
        add(precioid5, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 256, -1, 29));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/resta.png"))); // NOI18N
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel22MousePressed(evt);
            }
        });
        add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(424, 256, 35, 29));

        id6.setFont(new java.awt.Font("Square721 BT", 0, 12)); // NOI18N
        id6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        id6.setText("0");
        add(id6, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 256, 29, 29));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/suma.png"))); // NOI18N
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel24MousePressed(evt);
            }
        });
        add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 256, -1, -1));

        precioid6.setText("S/29.00");
        add(precioid6, new org.netbeans.lib.awtextra.AbsoluteConstraints(541, 256, -1, 29));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/resta.png"))); // NOI18N
        jLabel26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel26MousePressed(evt);
            }
        });
        add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 504, 35, 29));

        precioid9.setText("S/43.00");
        add(precioid9, new org.netbeans.lib.awtextra.AbsoluteConstraints(541, 504, -1, 29));

        id7.setFont(new java.awt.Font("Square721 BT", 0, 12)); // NOI18N
        id7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        id7.setText("0");
        add(id7, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 504, 29, 29));

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/suma.png"))); // NOI18N
        jLabel29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel29MousePressed(evt);
            }
        });
        add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 504, -1, -1));

        precioid7.setText("S/43.00");
        add(precioid7, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 504, -1, 29));

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/resta.png"))); // NOI18N
        jLabel31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel31MousePressed(evt);
            }
        });
        add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 504, 35, 29));

        id8.setFont(new java.awt.Font("Square721 BT", 0, 12)); // NOI18N
        id8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        id8.setText("0");
        add(id8, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 504, 29, 29));

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/suma.png"))); // NOI18N
        jLabel33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel33MousePressed(evt);
            }
        });
        add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 504, -1, -1));

        precioid8.setText("S/39.00");
        add(precioid8, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 504, -1, 29));

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/resta.png"))); // NOI18N
        jLabel35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel35MousePressed(evt);
            }
        });
        add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(424, 504, 35, 29));

        id9.setFont(new java.awt.Font("Square721 BT", 0, 12)); // NOI18N
        id9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        id9.setText("0");
        add(id9, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 504, 29, 29));

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/suma.png"))); // NOI18N
        jLabel37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel37MousePressed(evt);
            }
        });
        add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 504, -1, -1));

        precioid4.setText("S/23.00");
        add(precioid4, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 256, -1, 29));
    }// </editor-fold>//GEN-END:initComponents

    private void btnComprar1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnComprar1MouseEntered
        btnComprar1.setBackground(new Color(153, 0, 51));
    }//GEN-LAST:event_btnComprar1MouseEntered

    private void btnComprar1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnComprar1MouseExited
        btnComprar1.setBackground(Color.red);
    }//GEN-LAST:event_btnComprar1MouseExited

    private void btnComprar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprar1ActionPerformed
        Connection connection = null; // Declarar la conexión
        try {
            if (totalCombos == 0) {
                JOptionPane.showMessageDialog(null, "Debes seleccionar al menos un producto.", "ERROR", 0);
                return;
            }

            // Calcular subtotal y total
//            double precioId4 = Double.parseDouble(precioid4.getText().replaceAll(".*S/", "").trim());
//            double precioId5 = Double.parseDouble(precioid5.getText().replaceAll(".*S/", "").trim());
//            double precioId6 = Double.parseDouble(precioid6.getText().replaceAll(".*S/", "").trim());
//            double precioId7 = Double.parseDouble(precioid7.getText().replaceAll(".*S/", "").trim());
//            double precioId8 = Double.parseDouble(precioid8.getText().replaceAll(".*S/", "").trim());
//            double precioId9 = Double.parseDouble(precioid9.getText().replaceAll(".*S/", "").trim());
//            
//            subtotalcombos = cantidadId4 * precioId4
//                    + cantidadId5 * precioId5
//                    + cantidadId6 * precioId6
//                    + cantidadId7 * precioId7
//                    + cantidadId8 * precioId8
//                    + cantidadId9 * precioId9;

            

            // Crear la conexión a la base de datos
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_peliculas", "root", "Hernan77..");

            // Registrar todos los combos seleccionados
            String query = "INSERT INTO detalleventa_productos (idventa, idproducto, cantidad, subtotal) VALUES (?, ?, ?, ?)";
            try (PreparedStatement statement = connection.prepareStatement(query)) {
                registrarProducto(statement,connection, 4, cantidadId4, idVenta);
                registrarProducto(statement,connection, 5, cantidadId5, idVenta);
                registrarProducto(statement,connection, 6, cantidadId6, idVenta);
                registrarProducto(statement,connection, 7, cantidadId7, idVenta);
                registrarProducto(statement,connection, 8, cantidadId8, idVenta);
                registrarProducto(statement,connection, 9, cantidadId9, idVenta);

                totalPagar = subtotalpelis + subtotalcombos;
                actualizarTotalVenta(connection, idVenta, totalPagar);

                JOptionPane.showMessageDialog(null, "Productos registrados correctamente.");
            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error al registrar productos: " + e.getMessage(), "ERROR", 0);
            }

            // Cambiar al formulario de pago
            JFrame frameContenedor = (JFrame) SwingUtilities.getWindowAncestor(this); // Obtiene el JFrame padre
            FrmPago frmPago = new FrmPago(idCliente, idVenta, totalPagar, totalCombos, idPelicula, pelihora, nButacas); // Crea la vista de pago
            frameContenedor.setContentPane(frmPago.getContentPane()); // Cambia al contenido de FrmPago
            frameContenedor.revalidate();
            frameContenedor.repaint();

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error en la conexión a la base de datos: " + e.getMessage(), "ERROR", 0);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ocurrió un error: " + e.getMessage(), "ERROR", 0);
        } finally {
            if (connection != null) {
                try {
                    connection.close(); // Asegúrate de cerrar la conexión
                } catch (SQLException e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Error al cerrar la conexión: " + e.getMessage(), "ERROR", 0);
                }
            }
        }
    }//GEN-LAST:event_btnComprar1ActionPerformed

    private void jLabel16MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MousePressed
        // TODO add your handling code here:
        cantidadId4 = Integer.parseInt(id4.getText());
        cantidadId4++;

        id4.setText(String.valueOf(cantidadId4));
        totalCombos++;
    }//GEN-LAST:event_jLabel16MousePressed

    private void jLabel14MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MousePressed
        if (cantidadId4 > 0) {
            cantidadId4 = Integer.parseInt(id4.getText());
            cantidadId4--;
            id4.setText(String.valueOf(cantidadId4));
            totalCombos--;
        }
    }//GEN-LAST:event_jLabel14MousePressed

    private void jLabel18MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MousePressed
        if (cantidadId5 > 0) {
            cantidadId5 = Integer.parseInt(id5.getText());
            cantidadId5--;
            id5.setText(String.valueOf(cantidadId5));
            totalCombos--;
        }

    }//GEN-LAST:event_jLabel18MousePressed

    private void jLabel20MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MousePressed
        cantidadId5 = Integer.parseInt(id5.getText());
        cantidadId5++;
        id5.setText(String.valueOf(cantidadId5));
        totalCombos++;
    }//GEN-LAST:event_jLabel20MousePressed

    private void jLabel22MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MousePressed
        if (cantidadId6 > 0) {
            cantidadId6 = Integer.parseInt(id6.getText());
            cantidadId6--;
            id6.setText(String.valueOf(cantidadId6));
            totalCombos--;
        }

    }//GEN-LAST:event_jLabel22MousePressed

    private void jLabel24MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MousePressed
        cantidadId6 = Integer.parseInt(id6.getText());
        cantidadId6++;
        id6.setText(String.valueOf(cantidadId6));
        totalCombos++;
    }//GEN-LAST:event_jLabel24MousePressed

    private void jLabel26MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MousePressed
        if (cantidadId7 > 0) {
            cantidadId7 = Integer.parseInt(id7.getText());
            cantidadId7--;
            id7.setText(String.valueOf(cantidadId7));
            totalCombos--;
        }

    }//GEN-LAST:event_jLabel26MousePressed

    private void jLabel29MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel29MousePressed
        cantidadId7 = Integer.parseInt(id7.getText());
        cantidadId7++;
        id7.setText(String.valueOf(cantidadId7));
        totalCombos++;
    }//GEN-LAST:event_jLabel29MousePressed

    private void jLabel31MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel31MousePressed
        if (cantidadId8 > 0) {
            cantidadId8 = Integer.parseInt(id8.getText());
            cantidadId8--;
            id8.setText(String.valueOf(cantidadId8));
            totalCombos--;
        }

    }//GEN-LAST:event_jLabel31MousePressed

    private void jLabel33MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel33MousePressed
        cantidadId8 = Integer.parseInt(id8.getText());
        cantidadId8++;
        id8.setText(String.valueOf(cantidadId8));
        totalCombos++;
    }//GEN-LAST:event_jLabel33MousePressed

    private void jLabel35MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel35MousePressed
        if (cantidadId9 > 0) {
            cantidadId9 = Integer.parseInt(id9.getText());
            cantidadId9--;
            id9.setText(String.valueOf(cantidadId9));
            totalCombos--;
        }

    }//GEN-LAST:event_jLabel35MousePressed

    private void jLabel37MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel37MousePressed
        cantidadId9 = Integer.parseInt(id9.getText());
        cantidadId9++;
        id9.setText(String.valueOf(cantidadId9));
        totalCombos++;
    }//GEN-LAST:event_jLabel37MousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComprar1;
    private javax.swing.JLabel id4;
    private javax.swing.JLabel id5;
    private javax.swing.JLabel id6;
    private javax.swing.JLabel id7;
    private javax.swing.JLabel id8;
    private javax.swing.JLabel id9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JLabel precioid4;
    private javax.swing.JLabel precioid5;
    private javax.swing.JLabel precioid6;
    private javax.swing.JLabel precioid7;
    private javax.swing.JLabel precioid8;
    private javax.swing.JLabel precioid9;
    private javax.swing.JTextArea txtASinopsis;
    private javax.swing.JTextArea txtASinopsis1;
    private javax.swing.JTextArea txtASinopsis2;
    private javax.swing.JTextArea txtASinopsis3;
    private javax.swing.JTextArea txtASinopsis4;
    private javax.swing.JTextArea txtASinopsis5;
    // End of variables declaration//GEN-END:variables

    private void registrarProducto(PreparedStatement statement, Connection connection, int idProducto, int cantidad, int idVenta) throws SQLException {
        if (cantidad > 0) { // Solo registrar si hay al menos un producto seleccionado
            
            double precioUnitario = obtenerPrecioProducto(connection, idProducto); // Obtén el precio del producto
            double subtotal = precioUnitario * cantidad;
            subtotalcombos+=subtotal;
            // Inserta el producto en la base de datos
            statement.setInt(1, idVenta);
            statement.setInt(2, idProducto);
            statement.setInt(3, cantidad);
            statement.setDouble(4, subtotal);

            statement.executeUpdate();
            System.out.printf("Producto registrado: ID=%d, Cantidad=%d, Subtotal=%.2f%n", idProducto, cantidad, subtotal);
        }
    }

    private double obtenerPrecioProducto(Connection connection, int idProducto) {
        String query = "SELECT precioproducto FROM productos WHERE idproducto = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, idProducto);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    return resultSet.getDouble("precioproducto");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0.0; // Retorna 0 si no se encuentra el producto o ocurre un error
    }

    private static void actualizarTotalVenta(Connection connection, int idVenta, double subtotal) throws SQLException {
        String query = "UPDATE venta SET totalventa = ? WHERE idventa = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setDouble(1, subtotal);
            statement.setInt(2, idVenta);
            statement.executeUpdate();
        }
    }

}
