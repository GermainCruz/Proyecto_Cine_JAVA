package presentacion;

import java.sql.*;
import java.awt.Color;
import java.awt.Cursor;
import java.sql.Connection;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class PanelBebidas extends javax.swing.JPanel {

    private int idVenta;
    private int idProducto;
    private int idCliente;

    private int cantidadId1;
    private int cantidadId2;
    private int cantidadId3;

    private int totalBebidas;
    private double totalPagar;
    private double subtotalpelis;
    private double subtotalbebidas;
    
    private String pelihora;
    private int idPelicula;
    private int nButacas;

    public PanelBebidas(int idCliente, int idVenta, double subtotalpelis, int idPelicula, String pelihora, int nButacas) {
        initComponents();
        this.idPelicula = idPelicula;
        this.idVenta = idVenta;
        this.idCliente = idCliente;
        this.subtotalpelis = subtotalpelis;
        this.pelihora = pelihora;
        this.nButacas= nButacas;
    }

    public PanelBebidas() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        id1 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        precioid1 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        id2 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        precioid2 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        id3 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        precioid3 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(600, 600));

        jLabel4.setFont(new java.awt.Font("Square721 BT", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 153));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("BEBIDAS");

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
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnComprar1MousePressed(evt);
            }
        });
        btnComprar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprar1ActionPerformed(evt);
            }
        });

        txtASinopsis.setEditable(false);
        txtASinopsis.setColumns(20);
        txtASinopsis.setFont(new java.awt.Font("Square721 BT", 0, 12)); // NOI18N
        txtASinopsis.setLineWrap(true);
        txtASinopsis.setRows(5);
        txtASinopsis.setText("21 oz de puro y refrescante sabor *Sabor gaseosa sujeto a stock del cine.");
        txtASinopsis.setWrapStyleWord(true);
        txtASinopsis.setBorder(null);
        txtASinopsis.setFocusable(false);
        txtASinopsis.setRequestFocusEnabled(false);
        jScrollPane2.setViewportView(txtASinopsis);

        txtASinopsis1.setEditable(false);
        txtASinopsis1.setColumns(20);
        txtASinopsis1.setFont(new java.awt.Font("Square721 BT", 0, 12)); // NOI18N
        txtASinopsis1.setLineWrap(true);
        txtASinopsis1.setRows(5);
        txtASinopsis1.setText("Refréscate con 32 oz de tu bebida favorita *Sabor gaseosa sujeto a stock del cine.");
        txtASinopsis1.setWrapStyleWord(true);
        txtASinopsis1.setBorder(null);
        txtASinopsis1.setFocusable(false);
        txtASinopsis1.setRequestFocusEnabled(false);
        jScrollPane3.setViewportView(txtASinopsis1);

        txtASinopsis2.setEditable(false);
        txtASinopsis2.setColumns(20);
        txtASinopsis2.setFont(new java.awt.Font("Square721 BT", 0, 12)); // NOI18N
        txtASinopsis2.setLineWrap(true);
        txtASinopsis2.setRows(5);
        txtASinopsis2.setText("Agua San Luis sin gas");
        txtASinopsis2.setWrapStyleWord(true);
        txtASinopsis2.setBorder(null);
        txtASinopsis2.setFocusable(false);
        txtASinopsis2.setRequestFocusEnabled(false);
        jScrollPane4.setViewportView(txtASinopsis2);

        jLabel1.setFont(new java.awt.Font("Square721 BT", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CCBebida Mediana OL ");

        jLabel2.setFont(new java.awt.Font("Square721 BT", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 153));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CCBebida Grande OL ");

        jLabel3.setFont(new java.awt.Font("Square721 BT", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 153));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Agua San Luis sin gas ");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bebida1.jpg"))); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bebida2.jpg"))); // NOI18N

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bebida3.jpg"))); // NOI18N

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/resta.png"))); // NOI18N
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel14MousePressed(evt);
            }
        });

        id1.setFont(new java.awt.Font("Square721 BT", 0, 12)); // NOI18N
        id1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        id1.setText("0");

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/suma.png"))); // NOI18N
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel16MousePressed(evt);
            }
        });

        precioid1.setText("S/13.00");

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/resta.png"))); // NOI18N
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel18MousePressed(evt);
            }
        });

        id2.setFont(new java.awt.Font("Square721 BT", 0, 12)); // NOI18N
        id2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        id2.setText("0");

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/suma.png"))); // NOI18N
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel20MousePressed(evt);
            }
        });

        precioid2.setText("S/15.00");

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/resta.png"))); // NOI18N
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel22MousePressed(evt);
            }
        });

        id3.setFont(new java.awt.Font("Square721 BT", 0, 12)); // NOI18N
        id3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        id3.setText("0");

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/suma.png"))); // NOI18N
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel24MousePressed(evt);
            }
        });

        precioid3.setText("S/5.00");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(id1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(precioid1))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel9)))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addGap(21, 21, 21))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(id2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(precioid2))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 18, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel10))
                                .addGap(46, 46, 46)))
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(id3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(precioid3))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel11)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnComprar1)))
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane3)
                                    .addComponent(jScrollPane2)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2)))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(precioid1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(id1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(precioid2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(id2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(precioid3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(id3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                .addComponent(btnComprar1)
                .addGap(88, 88, 88))
        );
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
            if (totalBebidas == 0) {
                JOptionPane.showMessageDialog(null, "Debes seleccionar al menos un producto.", "ERROR", 0);
                return;
            }

            // Crear la conexión a la base de datos
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_peliculas", "root", "Hernan77..");

            // Registrar todos los combos seleccionados
            String query = "INSERT INTO detalleventa_productos (idventa, idproducto, cantidad, subtotal) VALUES (?, ?, ?, ?)";
            try (PreparedStatement statement = connection.prepareStatement(query)) {
                registrarProducto(statement,connection, 1, cantidadId1, idVenta);
                registrarProducto(statement,connection, 2, cantidadId2, idVenta);
                registrarProducto(statement,connection, 3, cantidadId3, idVenta);

                totalPagar = subtotalpelis + subtotalbebidas;
                actualizarTotalVenta(connection, idVenta, totalPagar);

                JOptionPane.showMessageDialog(null, "Productos registrados correctamente.");
            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error al registrar productos: " + e.getMessage(), "ERROR", 0);
            }

            // Cambiar al formulario de pago
            JFrame frameContenedor = (JFrame) SwingUtilities.getWindowAncestor(this); // Obtiene el JFrame padre
            FrmPago frmPago = new FrmPago(idCliente, idVenta, totalPagar, totalBebidas, idPelicula, pelihora, nButacas); // Crea la vista de pago
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

    private void jLabel14MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MousePressed
        // TODO add your handling code here:
        if (cantidadId1 > 0) {
            cantidadId1 = Integer.parseInt(id1.getText());
            cantidadId1--;
            id1.setText(String.valueOf(cantidadId1));
            totalBebidas--;
        }
    }//GEN-LAST:event_jLabel14MousePressed

    private void jLabel16MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MousePressed
        if (cantidadId1 > 0) {
            cantidadId1 = Integer.parseInt(id1.getText());
            cantidadId1++;
            id1.setText(String.valueOf(cantidadId1));
            totalBebidas++;
        }
    }//GEN-LAST:event_jLabel16MousePressed

    private void jLabel18MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MousePressed
        if (cantidadId2 > 0) {
            cantidadId2 = Integer.parseInt(id2.getText());
            cantidadId2--;
            id2.setText(String.valueOf(cantidadId2));
            totalBebidas--;
        }
    }//GEN-LAST:event_jLabel18MousePressed

    private void jLabel20MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MousePressed
        if (cantidadId2 > 0) {
            cantidadId2 = Integer.parseInt(id2.getText());
            cantidadId2++;
            id2.setText(String.valueOf(cantidadId2));
            totalBebidas++;
        }
    }//GEN-LAST:event_jLabel20MousePressed

    private void jLabel22MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MousePressed
        if (cantidadId3 > 0) {
            cantidadId2 = Integer.parseInt(id3.getText());
            cantidadId3--;
            id3.setText(String.valueOf(cantidadId3));
            totalBebidas--;
        }
    }//GEN-LAST:event_jLabel22MousePressed

    private void jLabel24MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MousePressed
        if (cantidadId3 > 0) {
            cantidadId3 = Integer.parseInt(id3.getText());
            cantidadId3++;
            id3.setText(String.valueOf(cantidadId3));
            totalBebidas++;
        }
    }//GEN-LAST:event_jLabel24MousePressed

    private void btnComprar1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnComprar1MousePressed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnComprar1MousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComprar1;
    private javax.swing.JLabel id1;
    private javax.swing.JLabel id2;
    private javax.swing.JLabel id3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel precioid1;
    private javax.swing.JLabel precioid2;
    private javax.swing.JLabel precioid3;
    private javax.swing.JTextArea txtASinopsis;
    private javax.swing.JTextArea txtASinopsis1;
    private javax.swing.JTextArea txtASinopsis2;
    // End of variables declaration//GEN-END:variables

    private void registrarProducto(PreparedStatement statement, Connection connection, int idProducto, int cantidad, int idVenta) throws SQLException {
        if (cantidad > 0) { // Solo registrar si hay al menos un producto seleccionado
            
            double precioUnitario = obtenerPrecioProducto(connection, idProducto); // Obtén el precio del producto
            double subtotal = precioUnitario * cantidad;
            subtotalbebidas+=subtotal;
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
