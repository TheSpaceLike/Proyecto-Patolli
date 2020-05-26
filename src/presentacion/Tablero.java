/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import javax.swing.JOptionPane;
import global.Global;
import patollimaster.Dado;

/**
 *
 * @author Alan Acatictla M.
 */
public class Tablero extends javax.swing.JFrame {

    Dado dado = new Dado();

    /**
     * Creates new form Tablero
     */
    public Tablero() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Avatar1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        Avatar2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JPanel();
        txtSalir = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        Avatar3 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        Avatar4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        tableroFondo = new javax.swing.JLabel();
        apostar25 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        apostar5 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        apostar10 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        apostar50 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        apostar100 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        btnPasar = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        btnTirarDados = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(2000, 1400));
        setMinimumSize(new java.awt.Dimension(2000, 1400));
        setPreferredSize(new java.awt.Dimension(2000, 1400));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        Avatar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/avatar1.PNG"))); // NOI18N

        jPanel3.setBackground(new java.awt.Color(212, 90, 90));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        jLabel1.setText("PLAYER 1");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        jLabel4.setText("SCORE");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        jLabel9.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(Avatar1)
                .addGap(49, 49, 49)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(37, 37, 37)))
                .addGap(45, 45, 45))
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Avatar1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel4)
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(96, 162, 202));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        Avatar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/avatar2.PNG"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        jLabel2.setText("PLAYER 2");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        jLabel7.setText("SCORE");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        jLabel10.setText("0");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(Avatar2)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(36, 36, 36))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addGap(72, 72, 72))))
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Avatar2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel7)
                        .addGap(13, 13, 13)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
        );

        btnSalir.setBackground(new java.awt.Color(212, 90, 90));
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
        });

        txtSalir.setBackground(new java.awt.Color(255, 255, 255));
        txtSalir.setFont(new java.awt.Font("Tahoma", 0, 32)); // NOI18N
        txtSalir.setForeground(new java.awt.Color(255, 255, 255));
        txtSalir.setText("SALIR");
        txtSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSalirMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnSalirLayout = new javax.swing.GroupLayout(btnSalir);
        btnSalir.setLayout(btnSalirLayout);
        btnSalirLayout.setHorizontalGroup(
            btnSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnSalirLayout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(txtSalir)
                .addContainerGap(147, Short.MAX_VALUE))
        );
        btnSalirLayout.setVerticalGroup(
            btnSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnSalirLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jPanel7.setBackground(new java.awt.Color(96, 162, 202));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        Avatar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/avatar2.PNG"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        jLabel3.setText("PLAYER 2");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        jLabel8.setText("SCORE");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        jLabel11.setText("0");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Avatar3)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addGap(36, 36, 36))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                        .addComponent(jLabel11)
                        .addGap(72, 72, 72))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel8)
                        .addGap(13, 13, 13)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel11)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Avatar3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        jPanel9.setBackground(new java.awt.Color(96, 162, 202));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        Avatar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/avatar2.PNG"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        jLabel5.setText("PLAYER 2");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        jLabel12.setText("SCORE");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        jLabel20.setText("0");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Avatar4)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12)
                        .addGap(36, 36, 36))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                        .addComponent(jLabel20)
                        .addGap(72, 72, 72))))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel12)
                        .addGap(13, 13, 13)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel20)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Avatar4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 111, Short.MAX_VALUE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(284, 284, 284)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(176, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(589, 589, 589)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(588, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 610, 1440);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        tableroFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ImgTableroFondo.PNG"))); // NOI18N

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(226, 226, 226)
                .addComponent(tableroFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 1059, Short.MAX_VALUE)
                .addGap(115, 115, 115))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tableroFondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1120, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel10);
        jPanel10.setBounds(610, 0, 1400, 1120);

        apostar25.setBackground(new java.awt.Color(247, 226, 72));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("25");

        javax.swing.GroupLayout apostar25Layout = new javax.swing.GroupLayout(apostar25);
        apostar25.setLayout(apostar25Layout);
        apostar25Layout.setHorizontalGroup(
            apostar25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
            .addGroup(apostar25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(apostar25Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel16)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        apostar25Layout.setVerticalGroup(
            apostar25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
            .addGroup(apostar25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(apostar25Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel16)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getContentPane().add(apostar25);
        apostar25.setBounds(1050, 1240, 260, 70);

        apostar5.setBackground(new java.awt.Color(133, 214, 56));
        apostar5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                apostar5MouseClicked(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("5");

        javax.swing.GroupLayout apostar5Layout = new javax.swing.GroupLayout(apostar5);
        apostar5.setLayout(apostar5Layout);
        apostar5Layout.setHorizontalGroup(
            apostar5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
            .addGroup(apostar5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(apostar5Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel15)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        apostar5Layout.setVerticalGroup(
            apostar5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
            .addGroup(apostar5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(apostar5Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel15)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getContentPane().add(apostar5);
        apostar5.setBounds(1050, 1150, 260, 70);

        apostar10.setBackground(new java.awt.Color(175, 221, 42));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("10");

        javax.swing.GroupLayout apostar10Layout = new javax.swing.GroupLayout(apostar10);
        apostar10.setLayout(apostar10Layout);
        apostar10Layout.setHorizontalGroup(
            apostar10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
            .addGroup(apostar10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(apostar10Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel17)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        apostar10Layout.setVerticalGroup(
            apostar10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
            .addGroup(apostar10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(apostar10Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel17)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getContentPane().add(apostar10);
        apostar10.setBounds(1680, 1150, 260, 70);

        apostar50.setBackground(new java.awt.Color(244, 160, 8));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("50");

        javax.swing.GroupLayout apostar50Layout = new javax.swing.GroupLayout(apostar50);
        apostar50.setLayout(apostar50Layout);
        apostar50Layout.setHorizontalGroup(
            apostar50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
            .addGroup(apostar50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(apostar50Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel18)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        apostar50Layout.setVerticalGroup(
            apostar50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
            .addGroup(apostar50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(apostar50Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel18)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getContentPane().add(apostar50);
        apostar50.setBounds(1680, 1240, 260, 70);

        apostar100.setBackground(new java.awt.Color(255, 102, 102));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("100");

        javax.swing.GroupLayout apostar100Layout = new javax.swing.GroupLayout(apostar100);
        apostar100.setLayout(apostar100Layout);
        apostar100Layout.setHorizontalGroup(
            apostar100Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
            .addGroup(apostar100Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(apostar100Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel19)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        apostar100Layout.setVerticalGroup(
            apostar100Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
            .addGroup(apostar100Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(apostar100Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel19)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getContentPane().add(apostar100);
        apostar100.setBounds(1350, 1200, 290, 70);

        btnPasar.setBackground(new java.awt.Color(142, 142, 142));
        btnPasar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPasarMouseClicked(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("PASAR");

        javax.swing.GroupLayout btnPasarLayout = new javax.swing.GroupLayout(btnPasar);
        btnPasar.setLayout(btnPasarLayout);
        btnPasarLayout.setHorizontalGroup(
            btnPasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnPasarLayout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(jLabel13)
                .addContainerGap(117, Short.MAX_VALUE))
        );
        btnPasarLayout.setVerticalGroup(
            btnPasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnPasarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(btnPasar);
        btnPasar.setBounds(650, 1240, 310, 80);

        btnTirarDados.setBackground(new java.awt.Color(13, 134, 201));
        btnTirarDados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTirarDadosMouseClicked(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("TIRAR DADOS");

        javax.swing.GroupLayout btnTirarDadosLayout = new javax.swing.GroupLayout(btnTirarDados);
        btnTirarDados.setLayout(btnTirarDadosLayout);
        btnTirarDadosLayout.setHorizontalGroup(
            btnTirarDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnTirarDadosLayout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(58, 58, 58))
        );
        btnTirarDadosLayout.setVerticalGroup(
            btnTirarDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnTirarDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(btnTirarDados);
        btnTirarDados.setBounds(650, 1140, 310, 80);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSalirMouseClicked
        // TODO add your handling code here:

        int confirm = JOptionPane.showConfirmDialog(this, "¿Seguro que quiere cerrar el juego?", "Confirmación", JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_txtSalirMouseClicked

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        // TODO add your handling code here:

        this.dispose();
    }//GEN-LAST:event_btnSalirMouseClicked

    private void btnTirarDadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTirarDadosMouseClicked
        // TODO add your handling code here:

        dado.tirarDado();
    }//GEN-LAST:event_btnTirarDadosMouseClicked

    private void btnPasarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPasarMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_btnPasarMouseClicked

    private void apostar5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_apostar5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_apostar5MouseClicked

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
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tablero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Avatar1;
    private javax.swing.JLabel Avatar2;
    private javax.swing.JLabel Avatar3;
    private javax.swing.JLabel Avatar4;
    private javax.swing.JPanel apostar10;
    private javax.swing.JPanel apostar100;
    private javax.swing.JPanel apostar25;
    private javax.swing.JPanel apostar5;
    private javax.swing.JPanel apostar50;
    private javax.swing.JPanel btnPasar;
    private javax.swing.JPanel btnSalir;
    private javax.swing.JPanel btnTirarDados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel tableroFondo;
    private javax.swing.JLabel txtSalir;
    // End of variables declaration//GEN-END:variables
}
