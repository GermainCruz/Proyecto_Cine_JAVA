package presentacion;

import java.awt.Color;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class FrmComprar extends javax.swing.JFrame {
    
    private String titulo;
    private String genero;
    private String censura;
    private String duracion;
    
    private int idCliente;
    private int idPelicula;
    private String pelihora;

    public FrmComprar() {
        initComponents();
        SetImageLabel(lblButacas, "src/imagenes/Butaca.png");
        SetImageLabel(lblButacas2, "src/imagenes/Butaca.png");
        SetImageLabel(lblButacas3, "src/imagenes/Butaca.png");
        SetImageLabel(lblButacas4, "src/imagenes/Butaca.png");
        SetImageLabel(lblButacas5, "src/imagenes/Butaca.png");
        SetImageLabel(lblButacas6, "src/imagenes/Butaca.png");
        SetImageLabel(lblButacas7, "src/imagenes/Butaca.png");
        SetImageLabel(lblButacas8, "src/imagenes/Butaca.png");
        SetImageLabel(lblButacas9, "src/imagenes/Butaca.png");
        SetImageLabel(lblButacas10, "src/imagenes/Butaca.png");
        
        
        lbl5pm.setBorder(BorderFactory.createEmptyBorder());
        lbl5pm.setForeground(Color.WHITE);
        SetImageLabel(lblButacas5, "null");

        lbl6pm.setBorder(BorderFactory.createEmptyBorder());
        lbl6pm.setForeground(Color.WHITE);
        SetImageLabel(lblButacas6, "null");

        lbl4pm.setBorder(BorderFactory.createEmptyBorder());
        lbl4pm.setForeground(Color.WHITE);
        SetImageLabel(lblButacas8, "null");
    }
    
    public FrmComprar(int idCliente, int idPelicula){
        initComponents();
        SetImageLabel(lblButacas, "src/imagenes/Butaca.png");
        SetImageLabel(lblButacas2, "src/imagenes/Butaca.png");
        SetImageLabel(lblButacas3, "src/imagenes/Butaca.png");
        SetImageLabel(lblButacas4, "src/imagenes/Butaca.png");
        SetImageLabel(lblButacas5, "src/imagenes/Butaca.png");
        SetImageLabel(lblButacas6, "src/imagenes/Butaca.png");
        SetImageLabel(lblButacas7, "src/imagenes/Butaca.png");
        SetImageLabel(lblButacas8, "src/imagenes/Butaca.png");
        SetImageLabel(lblButacas9, "src/imagenes/Butaca.png");
        SetImageLabel(lblButacas10, "src/imagenes/Butaca.png");
        
        
        lbl5pm.setBorder(BorderFactory.createEmptyBorder());
        lbl5pm.setForeground(Color.WHITE);
        SetImageLabel(lblButacas5, "null");

        lbl6pm.setBorder(BorderFactory.createEmptyBorder());
        lbl6pm.setForeground(Color.WHITE);
        SetImageLabel(lblButacas6, "null");

        lbl4pm.setBorder(BorderFactory.createEmptyBorder());
        lbl4pm.setForeground(Color.WHITE);
        SetImageLabel(lblButacas8, "null");
        this.idPelicula = idPelicula;
        this.idCliente = idCliente;
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        cbxFecha = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lbl2pm = new javax.swing.JLabel();
        lbl3pm = new javax.swing.JLabel();
        lbl3_4pm = new javax.swing.JLabel();
        lbl4_2pm = new javax.swing.JLabel();
        lblButacas = new javax.swing.JLabel();
        lblButacas2 = new javax.swing.JLabel();
        lblButacas3 = new javax.swing.JLabel();
        lblButacas4 = new javax.swing.JLabel();
        lbl5pm = new javax.swing.JLabel();
        lblButacas5 = new javax.swing.JLabel();
        lbl6pm = new javax.swing.JLabel();
        lblButacas6 = new javax.swing.JLabel();
        lblButacas7 = new javax.swing.JLabel();
        lbl7pm = new javax.swing.JLabel();
        lblButacas9 = new javax.swing.JLabel();
        lblButacas10 = new javax.swing.JLabel();
        lbl9_5pm = new javax.swing.JLabel();
        lbl4pm = new javax.swing.JLabel();
        lblButacas8 = new javax.swing.JLabel();
        lbl7pmPD = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Compra de la Película");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Square721 BT", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 153));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("La función perfecta para ti ");

        cbxFecha.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        cbxFecha.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hoy Viernes ", "Sábado 21", "Domingo 22" }));
        cbxFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxFechaActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Square721 BT", 1, 18)); // NOI18N
        jLabel8.setText("Por fecha:");

        jLabel9.setFont(new java.awt.Font("Square721 BT", 0, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("2D");
        jLabel9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel5.setFont(new java.awt.Font("Square721 BT", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 153));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Cp Trujillo Real Plaza");

        jLabel10.setFont(new java.awt.Font("Square721 BT", 0, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("2D");
        jLabel10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel11.setFont(new java.awt.Font("Square721 BT", 0, 12)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("REGULAR DOBLADA");

        jLabel12.setFont(new java.awt.Font("Square721 BT", 0, 12)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("PRIMER DOBLADA");

        lbl2pm.setFont(new java.awt.Font("Square721 BT", 1, 12)); // NOI18N
        lbl2pm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl2pm.setText("2:00 pm");
        lbl2pm.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        lbl2pm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl2pmMousePressed(evt);
            }
        });
        lbl2pm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lbl2pmKeyPressed(evt);
            }
        });

        lbl3pm.setFont(new java.awt.Font("Square721 BT", 1, 12)); // NOI18N
        lbl3pm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl3pm.setText("3:00 pm");
        lbl3pm.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        lbl3pm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl3pmMousePressed(evt);
            }
        });

        lbl3_4pm.setFont(new java.awt.Font("Square721 BT", 1, 12)); // NOI18N
        lbl3_4pm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl3_4pm.setText("3:40 pm");
        lbl3_4pm.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        lbl3_4pm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl3_4pmMousePressed(evt);
            }
        });

        lbl4_2pm.setFont(new java.awt.Font("Square721 BT", 1, 12)); // NOI18N
        lbl4_2pm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl4_2pm.setText("4:20 pm");
        lbl4_2pm.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        lbl4_2pm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl4_2pmMousePressed(evt);
            }
        });

        lblButacas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblButacasMouseClicked(evt);
            }
        });

        lbl5pm.setFont(new java.awt.Font("Square721 BT", 1, 12)); // NOI18N
        lbl5pm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl5pm.setText("5:00 pm");
        lbl5pm.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        lbl5pm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl5pmMousePressed(evt);
            }
        });

        lbl6pm.setFont(new java.awt.Font("Square721 BT", 1, 12)); // NOI18N
        lbl6pm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl6pm.setText("6:00 pm");
        lbl6pm.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        lbl6pm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl6pmMousePressed(evt);
            }
        });

        lbl7pm.setFont(new java.awt.Font("Square721 BT", 1, 12)); // NOI18N
        lbl7pm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl7pm.setText("7:00 pm");
        lbl7pm.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        lbl7pm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl7pmMousePressed(evt);
            }
        });

        lbl9_5pm.setFont(new java.awt.Font("Square721 BT", 1, 12)); // NOI18N
        lbl9_5pm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl9_5pm.setText("9:50 pm");
        lbl9_5pm.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        lbl9_5pm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl9_5pmMousePressed(evt);
            }
        });

        lbl4pm.setFont(new java.awt.Font("Square721 BT", 1, 12)); // NOI18N
        lbl4pm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl4pm.setText("4:00 pm");
        lbl4pm.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        lbl4pm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl4pmMousePressed(evt);
            }
        });

        lbl7pmPD.setFont(new java.awt.Font("Square721 BT", 1, 12)); // NOI18N
        lbl7pmPD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl7pmPD.setText("7:00 pm");
        lbl7pmPD.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        lbl7pmPD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl7pmPDMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel12))
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lbl2pm, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(lbl5pm, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblButacas5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(29, 29, 29)
                                                .addComponent(lbl6pm, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblButacas6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(33, 33, 33)
                                                .addComponent(lbl7pm, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblButacas7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(lblButacas, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(27, 27, 27)
                                                .addComponent(lbl3pm, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(7, 7, 7)
                                                .addComponent(lblButacas2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(25, 25, 25)
                                                .addComponent(lbl3_4pm, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblButacas3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(30, 30, 30)
                                                .addComponent(lbl4_2pm, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblButacas4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(lbl4pm, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblButacas8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(lbl7pmPD, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblButacas9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(lbl9_5pm, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblButacas10, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(285, 285, 285)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(cbxFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lbl3_4pm, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl4_2pm, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl3pm, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(lbl2pm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblButacas, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblButacas2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblButacas3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblButacas4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl5pm, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl6pm, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblButacas5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblButacas6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl7pm, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblButacas7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl4pm, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl7pmPD, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblButacas8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblButacas9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl9_5pm, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblButacas10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
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

    private void lblButacasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblButacasMouseClicked
        JOptionPane.showMessageDialog(null, "50 butacas disponibles", "Información", 1);
    }//GEN-LAST:event_lblButacasMouseClicked

    private void cbxFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxFechaActionPerformed
        int n = cbxFecha.getSelectedIndex();
        if(n==-1||n==0){
            //Butacas "restauradas"
            lbl2pm.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            lbl2pm.setForeground(Color.BLACK);
            SetImageLabel(lblButacas, "src/imagenes/Butaca.png");             
           
            lbl3pm.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            lbl3pm.setForeground(Color.BLACK);
            SetImageLabel(lblButacas2, "src/imagenes/Butaca.png");             
            
            lbl4_2pm.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            lbl4_2pm.setForeground(Color.BLACK);
            SetImageLabel(lblButacas4, "src/imagenes/Butaca.png");              

            lbl7pm.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            lbl7pm.setForeground(Color.BLACK);
            SetImageLabel(lblButacas9, "src/imagenes/Butaca.png"); 
            
            lbl9_5pm.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            lbl9_5pm.setForeground(Color.BLACK);
            SetImageLabel(lblButacas10, "src/imagenes/Butaca.png");  
            
            //Butacas "borradas"
            lbl5pm.setBorder(BorderFactory.createEmptyBorder());
            lbl5pm.setForeground(Color.WHITE);
            SetImageLabel(lblButacas5, "null");
            
            lbl6pm.setBorder(BorderFactory.createEmptyBorder());
            lbl6pm.setForeground(Color.WHITE);
            SetImageLabel(lblButacas6, "null");

            lbl4pm.setBorder(BorderFactory.createEmptyBorder());
            lbl4pm.setForeground(Color.WHITE);
            SetImageLabel(lblButacas8, "null");
            
        }else if(n==1){
            //Butacas restauradas
            lbl5pm.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            lbl5pm.setForeground(Color.BLACK);
            SetImageLabel(lblButacas5, "src/imagenes/Butaca.png");           

            lbl6pm.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            lbl6pm.setForeground(Color.BLACK);
            SetImageLabel(lblButacas6, "src/imagenes/Butaca.png");
            
            lbl4pm.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            lbl4pm.setForeground(Color.BLACK);
            SetImageLabel(lblButacas8, "src/imagenes/Butaca.png");            
            
            //Butacas "borradas"
            lbl4_2pm.setBorder(BorderFactory.createEmptyBorder());
            lbl4_2pm.setForeground(Color.WHITE);
            SetImageLabel(lblButacas4, "null");
            
            lbl7pm.setBorder(BorderFactory.createEmptyBorder());
            lbl7pm.setForeground(Color.WHITE);
            SetImageLabel(lblButacas7, "null");
            
            lbl9_5pm.setBorder(BorderFactory.createEmptyBorder());
            lbl9_5pm.setForeground(Color.WHITE);
            SetImageLabel(lblButacas10, "null");            
            
        }else{
            //Butacas restauradas
            lbl5pm.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            lbl5pm.setForeground(Color.BLACK);
            SetImageLabel(lblButacas5, "src/imagenes/Butaca.png");           

            lbl6pm.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            lbl6pm.setForeground(Color.BLACK);
            SetImageLabel(lblButacas6, "src/imagenes/Butaca.png");
            
            lbl4pm.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            lbl4pm.setForeground(Color.BLACK);
            SetImageLabel(lblButacas8, "src/imagenes/Butaca.png");             
            
            lbl4_2pm.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            lbl4_2pm.setForeground(Color.BLACK);
            SetImageLabel(lblButacas4, "src/imagenes/Butaca.png");              

            lbl7pm.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            lbl7pm.setForeground(Color.BLACK);
            SetImageLabel(lblButacas9, "src/imagenes/Butaca.png"); 
            
            lbl9_5pm.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            lbl9_5pm.setForeground(Color.BLACK);
            SetImageLabel(lblButacas10, "src/imagenes/Butaca.png");           
            
            //Butacas "borradas"
            lbl2pm.setBorder(BorderFactory.createEmptyBorder());
            lbl2pm.setForeground(Color.WHITE);
            SetImageLabel(lblButacas, "null");
            
            lbl3pm.setBorder(BorderFactory.createEmptyBorder());
            lbl3pm.setForeground(Color.WHITE);
            SetImageLabel(lblButacas2, "null");
        }
    }//GEN-LAST:event_cbxFechaActionPerformed

    private void lbl2pmKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lbl2pmKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_lbl2pmKeyPressed

    private void lbl2pmMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl2pmMousePressed
        // TODO add your handling code here:
        pelihora=lbl2pm.getText();
        FrmButacas f = new FrmButacas(idCliente, idPelicula, pelihora);
        f.setVisible(true);
    }//GEN-LAST:event_lbl2pmMousePressed

    private void lbl3pmMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl3pmMousePressed
        pelihora=lbl3pm.getText();
        FrmButacas f = new FrmButacas(idCliente, idPelicula, pelihora);
        f.setVisible(true);
    }//GEN-LAST:event_lbl3pmMousePressed

    private void lbl3_4pmMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl3_4pmMousePressed
        pelihora=lbl3_4pm.getText();
        FrmButacas f = new FrmButacas(idCliente, idPelicula, pelihora);
        f.setVisible(true);
    }//GEN-LAST:event_lbl3_4pmMousePressed

    private void lbl4_2pmMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl4_2pmMousePressed
        pelihora=lbl4_2pm.getText();
        FrmButacas f = new FrmButacas(idCliente, idPelicula, pelihora);
        f.setVisible(true);
    }//GEN-LAST:event_lbl4_2pmMousePressed

    private void lbl5pmMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl5pmMousePressed
        pelihora=lbl5pm.getText();
        FrmButacas f = new FrmButacas(idCliente, idPelicula, pelihora);
        f.setVisible(true);
    }//GEN-LAST:event_lbl5pmMousePressed

    private void lbl6pmMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl6pmMousePressed
        pelihora=lbl6pm.getText();
        FrmButacas f = new FrmButacas(idCliente, idPelicula, pelihora);
        f.setVisible(true);
    }//GEN-LAST:event_lbl6pmMousePressed

    private void lbl7pmMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl7pmMousePressed
        pelihora=lbl7pm.getText();
        FrmButacas f = new FrmButacas(idCliente, idPelicula, pelihora);
        f.setVisible(true);
    }//GEN-LAST:event_lbl7pmMousePressed

    private void lbl4pmMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl4pmMousePressed
        pelihora=lbl4pm.getText();
        FrmButacas f = new FrmButacas(idCliente, idPelicula, pelihora);
        f.setVisible(true);
    }//GEN-LAST:event_lbl4pmMousePressed

    private void lbl7pmPDMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl7pmPDMousePressed
        pelihora=lbl7pmPD.getText();
        FrmButacas f = new FrmButacas(idCliente, idPelicula, pelihora);
        f.setVisible(true);
    }//GEN-LAST:event_lbl7pmPDMousePressed

    private void lbl9_5pmMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl9_5pmMousePressed
        pelihora=lbl9_5pm.getText();
        FrmButacas f = new FrmButacas(idCliente, idPelicula, pelihora);
        f.setVisible(true);
    }//GEN-LAST:event_lbl9_5pmMousePressed

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
            java.util.logging.Logger.getLogger(FrmComprar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmComprar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmComprar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmComprar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmComprar().setVisible(true);
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
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbxFecha;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl2pm;
    private javax.swing.JLabel lbl3_4pm;
    private javax.swing.JLabel lbl3pm;
    private javax.swing.JLabel lbl4_2pm;
    private javax.swing.JLabel lbl4pm;
    private javax.swing.JLabel lbl5pm;
    private javax.swing.JLabel lbl6pm;
    private javax.swing.JLabel lbl7pm;
    private javax.swing.JLabel lbl7pmPD;
    private javax.swing.JLabel lbl9_5pm;
    private javax.swing.JLabel lblButacas;
    private javax.swing.JLabel lblButacas10;
    private javax.swing.JLabel lblButacas2;
    private javax.swing.JLabel lblButacas3;
    private javax.swing.JLabel lblButacas4;
    private javax.swing.JLabel lblButacas5;
    private javax.swing.JLabel lblButacas6;
    private javax.swing.JLabel lblButacas7;
    private javax.swing.JLabel lblButacas8;
    private javax.swing.JLabel lblButacas9;
    // End of variables declaration//GEN-END:variables
}
