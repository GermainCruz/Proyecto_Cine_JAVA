package presentacion;

import entidades.Pelicula;
import java.sql.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class FrmDulceria extends javax.swing.JFrame {

    private int idPelicula;
    private String pelihora;
    
    private int idCliente;
    private int idVenta;
    private int idProducto;
    private double subtotalPeli;
    
    int nButacas;
        
    public FrmDulceria(int idCliente, int idVenta, double subtotalpelis, int nButacas, int idPelicula, String peliHora) {
        this.nButacas = nButacas;
        this.subtotalPeli = subtotalpelis;
        this.idVenta = idVenta;
        this.idCliente = idCliente;
        this.idPelicula=idPelicula;
        
        initComponents();
        Pelicula pelicula = obtenerDatosPelicula(idPelicula);        
        SetImageLabel(lblPelicula, pelicula.getLinkImagen());
        lblTitulo.setText(pelicula.getTitulo());
        lblHora.setText(pelihora);
        lblNButacas.setText(String.valueOf(nButacas));
        mostrarPanel(new PanelCombos(this.idCliente, this.idVenta, subtotalPeli, idPelicula, pelihora, nButacas));    
    }
    
    public Pelicula obtenerDatosPelicula(int idPelicula) {
        Pelicula pelicula = null;
        String query = "SELECT pelititulo, pelilinkimagen FROM pelicula WHERE idpelicula = ?";

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_peliculas", "root", "Hernan77.."); PreparedStatement statement = connection.prepareStatement(query)) {

            statement.setInt(1, idPelicula);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                String titulo = resultSet.getString("pelititulo");
                String linkImagen = resultSet.getString("pelilinkimagen");

                pelicula = new Pelicula(titulo, linkImagen);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al obtener los datos de la película: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        return pelicula;
    }
    
    public FrmDulceria() {
        initComponents();
        mostrarPanel(new PanelCombos(this.idCliente, this.idVenta, subtotalPeli, idPelicula, pelihora, nButacas));    
        SetImageLabel(lblPelicula, "src/imagenes/Doctor Strange.jpg");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgFormasPago = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lblPelicula = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        lblTitulo = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblHora = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel19 = new javax.swing.JLabel();
        btnResumenCompra = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        rdbtnCombos = new javax.swing.JRadioButton();
        rdbtnBebidas = new javax.swing.JRadioButton();
        lblNButacas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pagos");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblPelicula.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        lblPelicula.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel2.setFont(new java.awt.Font("Square721 BT", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 153));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Elige tu combo y bebida favorita ;)");

        jSeparator7.setOrientation(javax.swing.SwingConstants.VERTICAL);

        lblTitulo.setFont(new java.awt.Font("Square721 BT", 1, 12)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 51, 153));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Doctor Strange");

        jLabel10.setFont(new java.awt.Font("Square721 BT", 1, 10)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("2D, REGULAR, DOBLADA");

        jLabel11.setFont(new java.awt.Font("Square721 BT", 1, 10)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 51, 153));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("CP MALL DEL SUR");

        jLabel12.setFont(new java.awt.Font("Square721 BT", 1, 10)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("21 de Dic, 2024");

        lblHora.setFont(new java.awt.Font("Square721 BT", 1, 10)); // NOI18N
        lblHora.setForeground(new java.awt.Color(51, 51, 51));
        lblHora.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblHora.setText("8:10 pm");

        jLabel14.setFont(new java.awt.Font("Square721 BT", 1, 10)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setText("SALA 12");

        jLabel19.setFont(new java.awt.Font("Square721 BT", 1, 10)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 51, 153));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel19.setText("Entradas:");

        btnResumenCompra.setBackground(new java.awt.Color(0, 51, 153));
        btnResumenCompra.setFont(new java.awt.Font("Square721 BT", 1, 10)); // NOI18N
        btnResumenCompra.setForeground(new java.awt.Color(255, 255, 255));
        btnResumenCompra.setText("Ver Resumen de Compra");
        btnResumenCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnResumenCompraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnResumenCompraMouseExited(evt);
            }
        });
        btnResumenCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResumenCompraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 599, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 594, Short.MAX_VALUE)
        );

        btgFormasPago.add(rdbtnCombos);
        rdbtnCombos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rdbtnCombos.setForeground(new java.awt.Color(0, 51, 153));
        rdbtnCombos.setSelected(true);
        rdbtnCombos.setText("Combos");
        rdbtnCombos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rdbtnCombosMouseClicked(evt);
            }
        });

        btgFormasPago.add(rdbtnBebidas);
        rdbtnBebidas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rdbtnBebidas.setForeground(new java.awt.Color(0, 51, 153));
        rdbtnBebidas.setText("Bebidas");
        rdbtnBebidas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rdbtnBebidasMouseClicked(evt);
            }
        });

        lblNButacas.setFont(new java.awt.Font("Square721 BT", 1, 10)); // NOI18N
        lblNButacas.setForeground(new java.awt.Color(0, 51, 153));
        lblNButacas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblNButacas.setText(" 1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel19)
                        .addGap(18, 18, 18)
                        .addComponent(lblNButacas, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(36, 36, 36)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lblHora, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel14))
                                            .addGap(0, 0, Short.MAX_VALUE))))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(21, 21, 21)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(6, 6, 6)
                                            .addComponent(lblTitulo))
                                        .addComponent(lblPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGap(9, 9, 9)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel11)
                                            .addGap(14, 14, 14))
                                        .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))))
                            .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnResumenCompra)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(rdbtnCombos, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(rdbtnBebidas))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator7)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblHora, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNButacas, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(97, 97, 97)
                        .addComponent(btnResumenCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdbtnCombos)
                            .addComponent(rdbtnBebidas))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rdbtnCombosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdbtnCombosMouseClicked
        verificar();
    }//GEN-LAST:event_rdbtnCombosMouseClicked

    private void rdbtnBebidasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdbtnBebidasMouseClicked
        verificar();
    }//GEN-LAST:event_rdbtnBebidasMouseClicked

    private void btnResumenCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResumenCompraActionPerformed
        FrmResumenCompra resumenCompra = new FrmResumenCompra();
        resumenCompra.setVisible(true);
    }//GEN-LAST:event_btnResumenCompraActionPerformed

    private void btnResumenCompraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResumenCompraMouseEntered
        btnResumenCompra.setBackground(Color.red);
    }//GEN-LAST:event_btnResumenCompraMouseEntered

    private void btnResumenCompraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResumenCompraMouseExited
        btnResumenCompra.setBackground(new Color(0, 51, 153));
    }//GEN-LAST:event_btnResumenCompraMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmDulceria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmDulceria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmDulceria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmDulceria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmDulceria().setVisible(true);
            }
        });
    }

    private void SetImageLabel(JLabel labelName, String root){
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(
       image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_DEFAULT)
        );
            labelName.setIcon(icon);
            this.repaint();
    }
    
    public void verificar(){
        boolean combos = false;
        boolean bebidas = false;
        if(rdbtnCombos.isSelected())
            combos = true;
        else
            bebidas = true;
        
        if(combos)
            mostrarPanel(new PanelCombos(idCliente, idVenta, subtotalPeli, idPelicula, pelihora, nButacas));
        else
            mostrarPanel(new PanelBebidas(idCliente, idVenta, subtotalPeli, idPelicula, pelihora, nButacas));
    }
    
    public void mostrarPanel(JPanel panel){
        panel.setSize(601,649);
        panel.setLocation(0, 0);
        panel.setBackground(Color.WHITE);
        jPanel2.removeAll();
        jPanel2.add(panel,BorderLayout.CENTER);
        jPanel2.revalidate();
        jPanel2.repaint();
        
    }   
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgFormasPago;
    private javax.swing.JButton btnResumenCompra;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblNButacas;
    private javax.swing.JLabel lblPelicula;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JRadioButton rdbtnBebidas;
    private javax.swing.JRadioButton rdbtnCombos;
    // End of variables declaration//GEN-END:variables
}
