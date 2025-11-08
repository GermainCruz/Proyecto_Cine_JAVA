package presentacion;
import entidades.Venta;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class FrmPRINCIPAL extends javax.swing.JFrame {
    
    private String nombreCliente;
    private String apellidoCliente;
    private int idCliente;
    
    public FrmPRINCIPAL(int idCliente, String nombre, String apellido) {
        this.nombreCliente=nombre;
        this.apellidoCliente=apellido;
        this.idCliente = idCliente;
        initComponents();
        txtApellidoCliente.setText(apellido);
        txtNombreCliente.setText(nombre+" ,");
        mostrarGlass();
        mostrarPanel(carrusel);
    }
    
    PanelCarrusel carrusel= new PanelCarrusel();
    public FrmPRINCIPAL() {
        idCliente = -1;
        nombreCliente="NA";
        apellidoCliente="NA";
        initComponents();
        mostrarGlass();
        mostrarPanel(carrusel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dspFondo = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtApellidoCliente = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuPelis = new javax.swing.JMenu();
        mnuCines = new javax.swing.JMenu();
        mnuSocio = new javax.swing.JMenu();
        mnuDulceria = new javax.swing.JMenu();
        mnuListados = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        mnuiLogin = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cineplanet");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        dspFondo.setBackground(new java.awt.Color(255, 255, 255));
        dspFondo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel4.setOpaque(false);

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Bienvenido a Cineplanet");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel8MousePressed(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Logo Cineplanet.png"))); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel9MousePressed(evt);
            }
        });

        txtApellidoCliente.setFont(new java.awt.Font("Square721 BT", 1, 36)); // NOI18N
        txtApellidoCliente.setForeground(new java.awt.Color(255, 102, 102));

        txtNombreCliente.setFont(new java.awt.Font("Square721 BT", 1, 36)); // NOI18N
        txtNombreCliente.setForeground(new java.awt.Color(255, 102, 102));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(txtApellidoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addContainerGap(195, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtApellidoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))))
        );

        javax.swing.GroupLayout dspFondoLayout = new javax.swing.GroupLayout(dspFondo);
        dspFondo.setLayout(dspFondoLayout);
        dspFondoLayout.setHorizontalGroup(
            dspFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        dspFondoLayout.setVerticalGroup(
            dspFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dspFondoLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 428, Short.MAX_VALUE))
        );

        jMenuBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuBar1.setBorderPainted(false);
        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuBar1.setFont(new java.awt.Font("Square721 BT", 0, 12)); // NOI18N

        mnuPelis.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Square721 BT", 0, 12))); // NOI18N
        mnuPelis.setText("Películas");
        mnuPelis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuPelisMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mnuPelisMouseEntered(evt);
            }
        });
        jMenuBar1.add(mnuPelis);

        mnuCines.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        mnuCines.setText("Cines");
        mnuCines.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuCinesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mnuCinesMouseEntered(evt);
            }
        });
        jMenuBar1.add(mnuCines);

        mnuSocio.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        mnuSocio.setText("Socio");
        mnuSocio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuSocioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mnuSocioMouseEntered(evt);
            }
        });
        jMenuBar1.add(mnuSocio);

        mnuDulceria.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        mnuDulceria.setText("Dulcería");
        mnuDulceria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuDulceriaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mnuDulceriaMouseEntered(evt);
            }
        });
        jMenuBar1.add(mnuDulceria);

        mnuListados.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        mnuListados.setText("Listados");
        mnuListados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuListadosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mnuListadosMouseEntered(evt);
            }
        });

        jMenuItem1.setText("Películas");
        jMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItem1MousePressed(evt);
            }
        });
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        mnuListados.add(jMenuItem1);

        jMenuItem2.setText("Productos");
        jMenuItem2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem2MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItem2MousePressed(evt);
            }
        });
        mnuListados.add(jMenuItem2);

        jMenuItem3.setText("Socios");
        jMenuItem3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem3MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItem3MousePressed(evt);
            }
        });
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        mnuListados.add(jMenuItem3);

        jMenuItem4.setText("Ventas");
        jMenuItem4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem4MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItem4MousePressed(evt);
            }
        });
        mnuListados.add(jMenuItem4);

        jMenuBar1.add(mnuListados);

        mnuiLogin.setText("LOGIN");
        mnuiLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mnuiLoginMousePressed(evt);
            }
        });
        mnuiLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuiLoginActionPerformed(evt);
            }
        });
        jMenuBar1.add(mnuiLogin);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dspFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dspFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
        
    private void mnuPelisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuPelisMouseClicked
        FrmPeliculas frmPeliculas = new FrmPeliculas(idCliente);
        frmPeliculas.setVisible(true);
    }//GEN-LAST:event_mnuPelisMouseClicked

    private void mnuCinesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuCinesMouseClicked
        FrmCines frmCines = new FrmCines();
        frmCines.setVisible(true);
    }//GEN-LAST:event_mnuCinesMouseClicked

    private void mnuDulceriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuDulceriaMouseClicked
        FrmDulceria frmDulceria = new FrmDulceria();
        frmDulceria.setVisible(true);
    }//GEN-LAST:event_mnuDulceriaMouseClicked

    private void mnuSocioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuSocioMouseClicked
        FrmRegistro frmRegistro = new FrmRegistro();
        frmRegistro.setVisible(true);
    }//GEN-LAST:event_mnuSocioMouseClicked

    private void mnuPelisMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuPelisMouseEntered
        mnuPelis.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_mnuPelisMouseEntered

    private void mnuCinesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuCinesMouseEntered
        mnuCines.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_mnuCinesMouseEntered

    private void mnuSocioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuSocioMouseEntered
        mnuSocio.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_mnuSocioMouseEntered

    private void mnuDulceriaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuDulceriaMouseEntered
        mnuDulceria.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_mnuDulceriaMouseEntered

    private void jLabel9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MousePressed
        
        
    }//GEN-LAST:event_jLabel9MousePressed

    private void jLabel8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MousePressed
        
    }//GEN-LAST:event_jLabel8MousePressed

    private void mnuListadosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuListadosMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuListadosMouseEntered

    private void mnuListadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuListadosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuListadosMouseClicked

    private void jMenuItem1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MouseClicked
        
    }//GEN-LAST:event_jMenuItem1MouseClicked

    private void jMenuItem2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem2MouseClicked
        //Ejecutar frame listado de productos
    }//GEN-LAST:event_jMenuItem2MouseClicked

    private void jMenuItem3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem3MouseClicked
        //Ejecutar frame listado de socios
    }//GEN-LAST:event_jMenuItem3MouseClicked

    private void jMenuItem4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem4MouseClicked
        //Ejecutar frame listado de ventas
    }//GEN-LAST:event_jMenuItem4MouseClicked

    private void jMenuItem1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MousePressed
        String[] nombresPeliculas = {"Los Increíbles","Titanic","Joker", "Moana","Doctor Strange","Batman", "Mufasa","Avengers: Endgame", "El tiempo que tenemos", "Sonic 3","Hasta el ultimo hombre" ,"Spiderman" };
        FrmListadoPeliculas frame= new FrmListadoPeliculas(nombresPeliculas);
        frame.setVisible(true);
    }//GEN-LAST:event_jMenuItem1MousePressed

    private void jMenuItem2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem2MousePressed
        String[] nombresProductos = {"CCBebida Mediana OL ","CCBebida Grande OL ","Agua San Luis sin gas ", "Combo 2 Dulce OL CC ","Combo 2 Salado OL CC ","Combo 2 Mix OL CC ", "Com.2 Salado Dob.Gig. OL ","Com.2 Mix Dob.Gig. OL ", "Com.2 Dulce Dob.Gig. OL "};
        FrmListadoProductos frame= new FrmListadoProductos(nombresProductos);
        frame.setVisible(true);
        
        
        
    }//GEN-LAST:event_jMenuItem2MousePressed

    private void jMenuItem3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem3MousePressed
        String[] nombres = {"Juan", "Ana", "Luis", "Pedro", "Marta"};
        FrmListadoSocios frame= new FrmListadoSocios(nombres);
        frame.setVisible(true);
    }//GEN-LAST:event_jMenuItem3MousePressed

    private void jMenuItem4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem4MousePressed
        int [] idClientes={12345,23456,34567,45678};
        String[] metodoPago={"tarjeta","billetera","tarjeta","tarjeta"};
        double[] totalVenta={140,202.5,43.1,20};Venta[] ventas;
        FrmListadoVentas frame= new FrmListadoVentas();
        frame.setVisible(true);
    }//GEN-LAST:event_jMenuItem4MousePressed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       // DONDE MIERDA ESTA TMR
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void mnuiLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuiLoginActionPerformed
        
    }//GEN-LAST:event_mnuiLoginActionPerformed

    private void mnuiLoginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuiLoginMousePressed
        FrmLogin f = new FrmLogin();
        f.setVisible(true);
    }//GEN-LAST:event_mnuiLoginMousePressed

    private void centrarInternalFrame(JInternalFrame interna) {
        int x = dspFondo.getWidth()/2 - interna.getWidth()/2;
        int y = dspFondo.getHeight()/2 - interna.getHeight()/2;
        if(interna.isShowing())
            interna.setLocation(x, y);
        else {
            dspFondo.add(interna);
            interna.setLocation(x, y);
            interna.show();
        }        
    }    
    
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
            java.util.logging.Logger.getLogger(FrmPRINCIPAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPRINCIPAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPRINCIPAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPRINCIPAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */                
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPRINCIPAL().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel dspFondo;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JMenu mnuCines;
    private javax.swing.JMenu mnuDulceria;
    private javax.swing.JMenu mnuListados;
    private javax.swing.JMenu mnuPelis;
    private javax.swing.JMenu mnuSocio;
    private javax.swing.JMenu mnuiLogin;
    private javax.swing.JLabel txtApellidoCliente;
    private javax.swing.JLabel txtNombreCliente;
    // End of variables declaration//GEN-END:variables
    
    
    public void mostrarPanel(JPanel panel){
        panel.setSize(1107,653);
        panel.setLocation(0, 0);
        panel.setBackground(Color.WHITE);
        dspFondo.removeAll();
        dspFondo.add(panel,BorderLayout.CENTER);
        dspFondo.revalidate();
        dspFondo.repaint();
        
    }
    public void mostrarGlass(){
        jPanel4.setLayout(null);
        jPanel4.setVisible(true);
        jPanel4.setOpaque(false);
        jPanel4.setBounds(0, 0, 1107, 227);
        this.setGlassPane(jPanel4);
        getGlassPane().setVisible(true);
        getGlassPane().setLocation(0, 0);
    }
}
