package presentacion;

import entidades.Cliente;
import entidades.PilaCliente;
import java.sql.*;
import java.awt.Color;
import java.awt.Cursor;
import javax.swing.*;

import java.sql.*;

public class PanelPagoTarjetas extends javax.swing.JPanel {

    private int idCliente;
    private int idVenta;

    public PanelPagoTarjetas() {
        initComponents();
    }

    public PanelPagoTarjetas(int idCliente, int idVenta) {
//        JOptionPane.showMessageDialog(null, "IDCLIENTE: "+idCliente);
//        JOptionPane.showMessageDialog(null, "IDVENTA: "+idVenta);
        this.idCliente = idCliente;
        this.idVenta = idVenta;
        initComponents();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtNroTarjeta = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        panelRound1 = new redondeadoPanel.PanelRound();
        jLabel3 = new javax.swing.JLabel();
        txtNroDocumento = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblTarjeta1 = new javax.swing.JLabel();
        lblTarjeta2 = new javax.swing.JLabel();
        lblTarjeta3 = new javax.swing.JLabel();
        cbxTarjeta = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        cbxMes = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        cbxAño = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        txtCVV = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        cbxDocumento = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(600, 600));

        jLabel1.setFont(new java.awt.Font("Square721 BT", 1, 12)); // NOI18N
        jLabel1.setText("Número de Tarjeta:");

        txtNroTarjeta.setForeground(new java.awt.Color(204, 204, 204));
        txtNroTarjeta.setText("Número de la tarjeta");
        txtNroTarjeta.setBorder(null);
        txtNroTarjeta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNroTarjetaMousePressed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        panelRound1.setBackground(new java.awt.Color(0, 51, 153));
        panelRound1.setRoundBottomLeft(50);
        panelRound1.setRoundBottomRight(50);
        panelRound1.setRoundTopLeft(50);
        panelRound1.setRoundTopRight(50);
        panelRound1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelRound1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelRound1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelRound1MousePressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Square721 BT", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PAGAR");

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel3)
                .addContainerGap(52, Short.MAX_VALUE))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(16, 16, 16))
        );

        txtNroDocumento.setForeground(new java.awt.Color(204, 204, 204));
        txtNroDocumento.setText("Número de documento");
        txtNroDocumento.setBorder(null);
        txtNroDocumento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNroDocumentoMousePressed(evt);
            }
        });

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        jLabel5.setFont(new java.awt.Font("Square721 BT", 1, 12)); // NOI18N
        jLabel5.setText("Número de documento:");

        jLabel4.setFont(new java.awt.Font("Square721 BT", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 153));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Tarjeta de crédito o débito");

        lblTarjeta1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tarjeta Interbank.png"))); // NOI18N
        lblTarjeta1.setPreferredSize(new java.awt.Dimension(61, 31));

        lblTarjeta2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tarjeta Visa.png"))); // NOI18N

        lblTarjeta3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tarjeta mastercard.png"))); // NOI18N

        cbxTarjeta.setFont(new java.awt.Font("Square721 BT", 0, 14)); // NOI18N
        cbxTarjeta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Interbank", "BCP", "MasterCard" }));

        jLabel6.setFont(new java.awt.Font("Square721 BT", 1, 12)); // NOI18N
        jLabel6.setText("Tipo de la tarjeta:");

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));

        cbxMes.setFont(new java.awt.Font("Square721 BT", 0, 14)); // NOI18N
        cbxMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Setiembre", "Octubre", "Noviembre ", "Diciembre" }));

        jLabel7.setFont(new java.awt.Font("Square721 BT", 1, 12)); // NOI18N
        jLabel7.setText("Mes:");

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));

        cbxAño.setFont(new java.awt.Font("Square721 BT", 0, 14)); // NOI18N
        cbxAño.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2024", "2025", "2026", "2027", "2028", "2029", "2030" }));

        jLabel8.setFont(new java.awt.Font("Square721 BT", 1, 12)); // NOI18N
        jLabel8.setText("Año:");

        jSeparator6.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Square721 BT", 1, 12)); // NOI18N
        jLabel2.setText("CVV:");

        txtCVV.setForeground(new java.awt.Color(204, 204, 204));
        txtCVV.setText("CVV");
        txtCVV.setBorder(null);
        txtCVV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCVVMousePressed(evt);
            }
        });

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        cbxDocumento.setFont(new java.awt.Font("Square721 BT", 0, 14)); // NOI18N
        cbxDocumento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DNI", "Carnet de extranjería", "Pasaporte", "Rut" }));

        jLabel9.setFont(new java.awt.Font("Square721 BT", 1, 12)); // NOI18N
        jLabel9.setText("Tipo de Documento:");

        jSeparator7.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));

        jLabel10.setFont(new java.awt.Font("Square721 BT", 0, 12)); // NOI18N
        jLabel10.setText("*No se hacen cambios ni devoluciones");

        jLabel11.setFont(new java.awt.Font("Square721 BT", 0, 12)); // NOI18N
        jLabel11.setText("*Toda la información de pago es segura");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jSeparator1)
                                .addComponent(jLabel1)
                                .addComponent(txtNroTarjeta, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblTarjeta1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(lblTarjeta2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(lblTarjeta3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(67, 67, 67)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cbxTarjeta, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jSeparator4)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addGap(0, 0, Short.MAX_VALUE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel2)
                                                .addComponent(txtCVV, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addGap(55, 55, 55))
                                            .addComponent(txtNroDocumento, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jSeparator3))))
                                .addGap(57, 57, 57))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel7)
                                    .addComponent(cbxMes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(81, 81, 81)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel8)
                                    .addComponent(jSeparator6)
                                    .addComponent(cbxAño, 0, 116, Short.MAX_VALUE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jSeparator7, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cbxDocumento, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(172, 172, 172)
                                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTarjeta2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTarjeta3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel4))
                    .addComponent(lblTarjeta1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNroTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxTarjeta))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbxMes, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbxAño)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(49, 49, 49))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCVV, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtNroDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbxDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addGap(36, 36, 36)
                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtNroTarjetaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNroTarjetaMousePressed
        if (txtNroTarjeta.getText().equals("Número de la tarjeta")) {
            txtNroTarjeta.setText("");
            txtNroTarjeta.setForeground(Color.black);
        }

        if (txtCVV.getText().equals("")) {
            txtCVV.setText("CVV");
            txtCVV.setForeground(Color.decode("#CCCCCC"));
        }

        if (txtNroDocumento.getText().equals("")) {
            txtNroDocumento.setText("Número de documento");
            txtNroDocumento.setForeground(Color.decode("#CCCCCC"));
        }
    }//GEN-LAST:event_txtNroTarjetaMousePressed

    private void panelRound1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRound1MouseEntered
        panelRound1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        panelRound1.setBackground(Color.red);
    }//GEN-LAST:event_panelRound1MouseEntered

    private void txtCVVMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCVVMousePressed
        if (txtNroTarjeta.getText().equals("")) {
            txtNroTarjeta.setText("Número de la tarjeta");
            txtNroTarjeta.setForeground(Color.decode("#CCCCCC"));
        }

        if (txtCVV.getText().equals("CVV")) {
            txtCVV.setText("");
            txtCVV.setForeground(Color.black);
        }

        if (txtNroDocumento.getText().equals("")) {
            txtNroDocumento.setText("Número de documento");
            txtNroDocumento.setForeground(Color.decode("#CCCCCC"));
        }
    }//GEN-LAST:event_txtCVVMousePressed

    private void txtNroDocumentoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNroDocumentoMousePressed
        if (txtNroTarjeta.getText().equals("")) {
            txtNroTarjeta.setText("Número de la tarjeta");
            txtNroTarjeta.setForeground(Color.decode("#CCCCCC"));
        }

        if (txtCVV.getText().equals("")) {
            txtCVV.setText("CVV");
            txtCVV.setForeground(Color.decode("#CCCCCC"));
        }

        if (txtNroDocumento.getText().equals("Número de documento")) {
            txtNroDocumento.setText("");
            txtNroDocumento.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtNroDocumentoMousePressed

    private void panelRound1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRound1MouseExited
        panelRound1.setBackground(new Color(0, 51, 153));
    }//GEN-LAST:event_panelRound1MouseExited

    private void panelRound1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRound1MousePressed
        // TODO add your handling code here:
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_peliculas", "root", "Hernan77..")) {
            // Crear una instancia de la pila de clientes y cargarla con los datos existentes
            PilaCliente pilaClientes = new PilaCliente();
            cargarClientesEnPila(pilaClientes, connection); // Método modificado para recibir la conexión

            // Buscar el cliente por su ID
            Cliente cliente = pilaClientes.buscarPorId(idCliente); // 'idCliente' ya lo tienes como atributo

            // Verificar si se encontró el cliente en la pila
            if (cliente != null) {
                // Si se encuentra, completar los campos cbxDocumento y txtNroDocumento
                String tipoDocumento = cliente.getTipoDocumento();
                cbxDocumento.setSelectedItem(tipoDocumento);
                txtNroDocumento.setText(cliente.getNumeroDocumento());
                cbxDocumento.setEditable(true);
                txtNroDocumento.setEditable(true);
            } else {
                // Si no se encuentra, dejar los campos relacionados con la tarjeta vacíos
                cbxTarjeta.setSelectedIndex(-1); // Sin selección
                txtNroTarjeta.setText("");
                cbxMes.setSelectedIndex(-1);
                cbxAño.setSelectedIndex(-1);
                txtCVV.setText("");
            }

            // Construir la fecha de vencimiento en formato YYYY-MM-DD
            String fechaVencimiento = cbxAño.getSelectedItem().toString() + "-"
                    + String.format("%02d", obtenerMesNumerico(cbxMes.getSelectedItem().toString())) + "-01";

            // Registrar el pago en la base de datos con la fecha de vencimiento
            actualizarVentaConPago(connection, idVenta, "tarjeta", txtNroTarjeta.getText(),
                    txtCVV.getText(), fechaVencimiento, null);

            // Mostrar mensaje de confirmación
            JOptionPane.showMessageDialog(null, "Pago registrado con tarjeta.", "Éxito", JOptionPane.INFORMATION_MESSAGE);

            // Cerrar la pestaña actual y regresar a FrmPrincipal
            JFrame frameContenedor = (JFrame) SwingUtilities.getWindowAncestor(this); // Obtiene el JFrame padre
            frameContenedor.dispose();
            FrmPRINCIPAL f = new FrmPRINCIPAL(idCliente, cliente.getNombre(), cliente.getApellido());
            f.setVisible(true);

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al registrar el pago con tarjeta: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ocurrió un error inesperado: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_panelRound1MousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbxAño;
    private javax.swing.JComboBox<String> cbxDocumento;
    private javax.swing.JComboBox<String> cbxMes;
    private javax.swing.JComboBox<String> cbxTarjeta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel lblTarjeta1;
    private javax.swing.JLabel lblTarjeta2;
    private javax.swing.JLabel lblTarjeta3;
    private redondeadoPanel.PanelRound panelRound1;
    private javax.swing.JTextField txtCVV;
    private javax.swing.JTextField txtNroDocumento;
    private javax.swing.JTextField txtNroTarjeta;
    // End of variables declaration//GEN-END:variables

    public void cargarClientesEnPila(PilaCliente pila, Connection connection) {
        String query = "SELECT * FROM cliente"; // Cambia el nombre de la tabla según tu base de datos
        try (PreparedStatement stmt = connection.prepareStatement(query); ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Cliente cliente = new Cliente(
                        rs.getInt("idcliente"),
                        rs.getString("clinombre"),
                        rs.getString("cliapellido"),
                        rs.getInt("edad"),
                        rs.getString("clicorreo"),
                        rs.getString("clicontraseña"),
                        rs.getString("tipo_documento"),
                        rs.getString("numero_documento"),
                        rs.getString("departamento"),
                        rs.getBoolean("es_socio")
                );
                pila.push(cliente); // Agrega el cliente a la pila
            }
            System.out.println("Clientes cargados en la pila exitosamente.");
        } catch (SQLException e) {
            System.err.println("Error al cargar los clientes: " + e.getMessage());
        }
    }

    private int obtenerMesNumerico(String nombreMes) {
        switch (nombreMes) {
            case "Enero":
                return 1;
            case "Febrero":
                return 2;
            case "Marzo":
                return 3;
            case "Abril":
                return 4;
            case "Mayo":
                return 5;
            case "Junio":
                return 6;
            case "Julio":
                return 7;
            case "Agosto":
                return 8;
            case "Septiembre":
                return 9;
            case "Octubre":
                return 10;
            case "Noviembre":
                return 11;
            case "Diciembre":
                return 12;
            default:
                throw new IllegalArgumentException("Mes no válido: " + nombreMes);
        }
    }

    private static void actualizarVentaConPago(Connection connection, int idVenta, String metodoPago,
            String numeroTarjeta, String cvv, String fechaVencimiento, String numeroCelular) throws SQLException {
        String query = "UPDATE venta SET metodopago = ?, numero_tarjeta = ?, cvv = ?, fecha_vencimiento = ?, numero_celular = ? WHERE idventa = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, metodoPago);
            statement.setString(2, numeroTarjeta);
            statement.setString(3, cvv);
            statement.setString(4, fechaVencimiento);
            statement.setString(5, numeroCelular);
            statement.setInt(6, idVenta);
            statement.executeUpdate();
        }
    }
}
