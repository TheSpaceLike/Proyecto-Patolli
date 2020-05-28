/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import javax.swing.JOptionPane;
import global.Global;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import patollimaster.Dado;
import patollimaster.Patolli;
import patollimaster.ControlTablero;
import patollimaster.Casilla;

/**
 *
 * @author Alan Acatictla M.
 */
public class Tablero extends javax.swing.JFrame {

    Dado dado = new Dado();
    Patolli patolli;
    ControlTablero controlTablero;

    /**
     * Creates new form Tablero
     */
    public Tablero() {
        initComponents();
        this.jPlayer1.setVisible(false);
        this.jPlayer2.setVisible(false);
        this.jPlayer3.setVisible(false);
        this.jPlayer4.setVisible(false);
        //Initialize patolli
        this.patolli = new Patolli();

        //Componnets
        switch (Global.jugadores.size()) {
            case 4:
                this.jPlayer4.setVisible(true);
                this.labelPlayer4.setText(Global.jugadores.get(3).getNombre());
                this.Avatar3.setIcon(new ImageIcon(this.getClass().getResource("/Imagenes/" + Global.jugadores.get(3).getRutaAvatar())));
            case 3:
                this.jPlayer3.setVisible(true);
                this.labelPlayer3.setText(Global.jugadores.get(2).getNombre());
                this.Avatar4.setIcon(new ImageIcon(this.getClass().getResource("/Imagenes/" + Global.jugadores.get(2).getRutaAvatar())));
            case 2:
                this.jPlayer2.setVisible(true);
                this.labelPlayer2.setText(Global.jugadores.get(1).getNombre());
                this.Avatar2.setIcon(new ImageIcon(this.getClass().getResource("/Imagenes/" + Global.jugadores.get(1).getRutaAvatar())));
            case 1:
                System.out.println("1");
                this.jPlayer1.setVisible(true);
                this.labelPlayer1.setText(Global.jugadores.get(0).getNombre());
                this.Avatar1.setIcon(new ImageIcon(this.getClass().getResource("/Imagenes/" + Global.jugadores.get(0).getRutaAvatar())));
                break;
        }

        //Control del tablero
        this.controlTablero = ControlTablero.crearInstancia();
        this.controlTablero.crearBlancas();
        //Set panels
        this.controlTablero.setPanelCasilla(0, this.box1);
        this.controlTablero.setPanelCasilla(1, this.box2);
        this.controlTablero.setPanelCasilla(2, this.box3);
        this.controlTablero.setPanelCasilla(3, this.box4);
        this.controlTablero.setPanelCasilla(4, this.box5);
        this.controlTablero.setPanelCasilla(5, this.box6);
        this.controlTablero.setPanelCasilla(6, this.box7);
        this.controlTablero.setPanelCasilla(7, this.box8);
        this.controlTablero.setPanelCasilla(8, this.box9);
        this.controlTablero.setPanelCasilla(9, this.box10);
        this.controlTablero.setPanelCasilla(10, this.box11);
        this.controlTablero.setPanelCasilla(11, this.box12);
        this.controlTablero.setPanelCasilla(12, this.box13);
        this.controlTablero.setPanelCasilla(13, this.box14);
        this.controlTablero.setPanelCasilla(14, this.box15);
        this.controlTablero.setPanelCasilla(15, this.box16);
        this.controlTablero.setPanelCasilla(16, this.box17);
        this.controlTablero.setPanelCasilla(17, this.box18);
        this.controlTablero.setPanelCasilla(18, this.box19);
        this.controlTablero.setPanelCasilla(19, this.box20);
        this.controlTablero.setPanelCasilla(20, this.box21);
        this.controlTablero.setPanelCasilla(21, this.box22);
        this.controlTablero.setPanelCasilla(22, this.box23);
        this.controlTablero.setPanelCasilla(23, this.box24);
        this.controlTablero.setPanelCasilla(24, this.box25);
        this.controlTablero.setPanelCasilla(25, this.box26);
        this.controlTablero.setPanelCasilla(26, this.box27);
        this.controlTablero.setPanelCasilla(27, this.box28);
        this.controlTablero.setPanelCasilla(28, this.box29);
        this.controlTablero.setPanelCasilla(29, this.box30);
        this.controlTablero.setPanelCasilla(30, this.box31);
        this.controlTablero.setPanelCasilla(31, this.box32);
        this.controlTablero.setPanelCasilla(32, this.box33);
        this.controlTablero.setPanelCasilla(33, this.box34);
        this.controlTablero.setPanelCasilla(34, this.box35);
        this.controlTablero.setPanelCasilla(35, this.box36);
        this.controlTablero.setPanelCasilla(36, this.box37);
        this.controlTablero.setPanelCasilla(37, this.box38);
        this.controlTablero.setPanelCasilla(34, this.box35);
        this.controlTablero.setPanelCasilla(35, this.box36);
        this.controlTablero.setPanelCasilla(36, this.box37);
        this.controlTablero.setPanelCasilla(37, this.box38);
        this.controlTablero.setPanelCasilla(38, this.box39);
        this.controlTablero.setPanelCasilla(39, this.box40);
        this.controlTablero.setPanelCasilla(40, this.box41);
        this.controlTablero.setPanelCasilla(41, this.box42);
        this.controlTablero.setPanelCasilla(42, this.box43);
        this.controlTablero.setPanelCasilla(43, this.box44);
        this.controlTablero.setPanelCasilla(44, this.box45);
        this.controlTablero.setPanelCasilla(45, this.box46);
        this.controlTablero.setPanelCasilla(46, this.box47);
        this.controlTablero.setPanelCasilla(47, this.box48);
        this.controlTablero.setPanelCasilla(48, this.box49);
        this.controlTablero.setPanelCasilla(49, this.box50);
        this.controlTablero.setPanelCasilla(50, this.box51);
        this.controlTablero.setPanelCasilla(51, this.box52);
        this.controlTablero.setPanelCasilla(52, this.box53);
        this.controlTablero.setPanelCasilla(53, this.box54);
        this.controlTablero.setPanelCasilla(54, this.box55);
        this.controlTablero.setPanelCasilla(55, this.box56);
        this.controlTablero.setPanelCasilla(56, this.box57);
        this.controlTablero.setPanelCasilla(57, this.box58);
        this.controlTablero.setPanelCasilla(58, this.box59);
        this.controlTablero.setPanelCasilla(59, this.box60);

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
        jPlayer1 = new javax.swing.JPanel();
        Avatar1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        labelPlayer1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPlayer2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        Avatar2 = new javax.swing.JLabel();
        labelPlayer2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JPanel();
        txtSalir = new javax.swing.JLabel();
        jPlayer4 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        Avatar4 = new javax.swing.JLabel();
        labelPlayer4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPlayer3 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        Avatar3 = new javax.swing.JLabel();
        labelPlayer3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        box60 = new javax.swing.JPanel();
        box1 = new javax.swing.JPanel();
        box2 = new javax.swing.JPanel();
        box3 = new javax.swing.JPanel();
        box59 = new javax.swing.JPanel();
        box58 = new javax.swing.JPanel();
        box4 = new javax.swing.JPanel();
        box57 = new javax.swing.JPanel();
        box5 = new javax.swing.JPanel();
        box56 = new javax.swing.JPanel();
        box6 = new javax.swing.JPanel();
        box55 = new javax.swing.JPanel();
        box7 = new javax.swing.JPanel();
        box54 = new javax.swing.JPanel();
        box8 = new javax.swing.JPanel();
        box53 = new javax.swing.JPanel();
        box23 = new javax.swing.JPanel();
        box24 = new javax.swing.JPanel();
        box25 = new javax.swing.JPanel();
        box38 = new javax.swing.JPanel();
        box37 = new javax.swing.JPanel();
        box36 = new javax.swing.JPanel();
        box26 = new javax.swing.JPanel();
        box35 = new javax.swing.JPanel();
        box27 = new javax.swing.JPanel();
        box34 = new javax.swing.JPanel();
        box28 = new javax.swing.JPanel();
        box33 = new javax.swing.JPanel();
        box29 = new javax.swing.JPanel();
        box32 = new javax.swing.JPanel();
        box30 = new javax.swing.JPanel();
        box31 = new javax.swing.JPanel();
        box10 = new javax.swing.JPanel();
        box21 = new javax.swing.JPanel();
        box22 = new javax.swing.JPanel();
        box9 = new javax.swing.JPanel();
        box11 = new javax.swing.JPanel();
        box12 = new javax.swing.JPanel();
        box19 = new javax.swing.JPanel();
        box20 = new javax.swing.JPanel();
        box13 = new javax.swing.JPanel();
        box14 = new javax.swing.JPanel();
        box17 = new javax.swing.JPanel();
        box18 = new javax.swing.JPanel();
        box15 = new javax.swing.JPanel();
        box16 = new javax.swing.JPanel();
        box52 = new javax.swing.JPanel();
        box39 = new javax.swing.JPanel();
        box51 = new javax.swing.JPanel();
        box40 = new javax.swing.JPanel();
        box50 = new javax.swing.JPanel();
        box41 = new javax.swing.JPanel();
        box49 = new javax.swing.JPanel();
        box42 = new javax.swing.JPanel();
        box48 = new javax.swing.JPanel();
        box43 = new javax.swing.JPanel();
        box47 = new javax.swing.JPanel();
        box44 = new javax.swing.JPanel();
        box46 = new javax.swing.JPanel();
        box45 = new javax.swing.JPanel();
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
        jPanel2 = new javax.swing.JPanel();
        jToggleButton1 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(2000, 1400));
        setMinimumSize(new java.awt.Dimension(2000, 1400));
        setPreferredSize(new java.awt.Dimension(2000, 1400));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jPlayer1.setBackground(new java.awt.Color(255, 255, 255));

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

        labelPlayer1.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        labelPlayer1.setText("PLAYER 1");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        jLabel4.setText("SCORE");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        jLabel9.setText("0");

        javax.swing.GroupLayout jPlayer1Layout = new javax.swing.GroupLayout(jPlayer1);
        jPlayer1.setLayout(jPlayer1Layout);
        jPlayer1Layout.setHorizontalGroup(
            jPlayer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPlayer1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(Avatar1)
                .addGap(49, 49, 49)
                .addComponent(labelPlayer1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addGroup(jPlayer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPlayer1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(37, 37, 37)))
                .addGap(45, 45, 45))
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPlayer1Layout.setVerticalGroup(
            jPlayer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPlayer1Layout.createSequentialGroup()
                .addGroup(jPlayer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPlayer1Layout.createSequentialGroup()
                        .addGroup(jPlayer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPlayer1Layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(jLabel4)
                                .addGap(19, 19, 19))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPlayer1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(labelPlayer1)
                                .addGap(6, 6, 6)))
                        .addComponent(jLabel9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPlayer1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Avatar1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
        );

        jPlayer2.setBackground(new java.awt.Color(255, 255, 255));

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

        labelPlayer2.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        labelPlayer2.setText("PLAYER 2");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        jLabel7.setText("SCORE");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        jLabel10.setText("0");

        javax.swing.GroupLayout jPlayer2Layout = new javax.swing.GroupLayout(jPlayer2);
        jPlayer2.setLayout(jPlayer2Layout);
        jPlayer2Layout.setHorizontalGroup(
            jPlayer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPlayer2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(Avatar2)
                .addGroup(jPlayer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPlayer2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(36, 36, 36))
                    .addGroup(jPlayer2Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(labelPlayer2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addGap(72, 72, 72))))
        );
        jPlayer2Layout.setVerticalGroup(
            jPlayer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPlayer2Layout.createSequentialGroup()
                .addGroup(jPlayer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPlayer2Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel7)
                        .addGap(13, 13, 13)
                        .addGroup(jPlayer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelPlayer2)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPlayer2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Avatar2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92))
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

        jPlayer4.setBackground(new java.awt.Color(255, 255, 255));

        jPanel7.setBackground(new java.awt.Color(0, 204, 51));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 595, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        Avatar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/avatar2.PNG"))); // NOI18N

        labelPlayer4.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        labelPlayer4.setText("PLAYER 4");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        jLabel8.setText("SCORE");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        jLabel11.setText("0");

        javax.swing.GroupLayout jPlayer4Layout = new javax.swing.GroupLayout(jPlayer4);
        jPlayer4.setLayout(jPlayer4Layout);
        jPlayer4Layout.setHorizontalGroup(
            jPlayer4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPlayer4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Avatar4)
                .addGap(36, 36, 36)
                .addComponent(labelPlayer4)
                .addGap(65, 65, 65)
                .addGroup(jPlayer4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel11))
                .addContainerGap())
        );
        jPlayer4Layout.setVerticalGroup(
            jPlayer4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPlayer4Layout.createSequentialGroup()
                .addGroup(jPlayer4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPlayer4Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel8)
                        .addGap(13, 13, 13)
                        .addGroup(jPlayer4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelPlayer4)
                            .addComponent(jLabel11)))
                    .addGroup(jPlayer4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Avatar4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPlayer3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel9.setBackground(new java.awt.Color(255, 153, 51));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 595, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        Avatar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/avatar2.PNG"))); // NOI18N

        labelPlayer3.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        labelPlayer3.setText("PLAYER 3");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        jLabel12.setText("SCORE");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        jLabel20.setText("0");

        javax.swing.GroupLayout jPlayer3Layout = new javax.swing.GroupLayout(jPlayer3);
        jPlayer3.setLayout(jPlayer3Layout);
        jPlayer3Layout.setHorizontalGroup(
            jPlayer3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPlayer3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Avatar3, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(labelPlayer3)
                .addGap(62, 62, 62)
                .addGroup(jPlayer3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel20))
                .addContainerGap())
        );
        jPlayer3Layout.setVerticalGroup(
            jPlayer3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPlayer3Layout.createSequentialGroup()
                .addGroup(jPlayer3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPlayer3Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel12)
                        .addGap(13, 13, 13)
                        .addGroup(jPlayer3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelPlayer3)
                            .addComponent(jLabel20)))
                    .addGroup(jPlayer3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Avatar3, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPlayer2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPlayer1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPlayer3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPlayer4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPlayer1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPlayer2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPlayer3, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPlayer4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(244, 244, 244)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(303, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 610, 1440);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        box60.setBackground(new java.awt.Color(200, 200, 200));
        box60.setPreferredSize(new java.awt.Dimension(55, 55));

        javax.swing.GroupLayout box60Layout = new javax.swing.GroupLayout(box60);
        box60.setLayout(box60Layout);
        box60Layout.setHorizontalGroup(
            box60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );
        box60Layout.setVerticalGroup(
            box60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );

        box1.setBackground(new java.awt.Color(200, 200, 200));
        box1.setPreferredSize(new java.awt.Dimension(55, 55));

        javax.swing.GroupLayout box1Layout = new javax.swing.GroupLayout(box1);
        box1.setLayout(box1Layout);
        box1Layout.setHorizontalGroup(
            box1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );
        box1Layout.setVerticalGroup(
            box1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );

        box2.setBackground(new java.awt.Color(200, 200, 200));
        box2.setPreferredSize(new java.awt.Dimension(55, 55));

        javax.swing.GroupLayout box2Layout = new javax.swing.GroupLayout(box2);
        box2.setLayout(box2Layout);
        box2Layout.setHorizontalGroup(
            box2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );
        box2Layout.setVerticalGroup(
            box2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );

        box3.setBackground(new java.awt.Color(200, 200, 200));
        box3.setPreferredSize(new java.awt.Dimension(55, 55));

        javax.swing.GroupLayout box3Layout = new javax.swing.GroupLayout(box3);
        box3.setLayout(box3Layout);
        box3Layout.setHorizontalGroup(
            box3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );
        box3Layout.setVerticalGroup(
            box3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );

        box59.setBackground(new java.awt.Color(200, 200, 200));
        box59.setPreferredSize(new java.awt.Dimension(55, 55));

        javax.swing.GroupLayout box59Layout = new javax.swing.GroupLayout(box59);
        box59.setLayout(box59Layout);
        box59Layout.setHorizontalGroup(
            box59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );
        box59Layout.setVerticalGroup(
            box59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );

        box58.setBackground(new java.awt.Color(200, 200, 200));
        box58.setPreferredSize(new java.awt.Dimension(55, 55));

        javax.swing.GroupLayout box58Layout = new javax.swing.GroupLayout(box58);
        box58.setLayout(box58Layout);
        box58Layout.setHorizontalGroup(
            box58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );
        box58Layout.setVerticalGroup(
            box58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );

        box4.setBackground(new java.awt.Color(200, 200, 200));
        box4.setPreferredSize(new java.awt.Dimension(55, 55));

        javax.swing.GroupLayout box4Layout = new javax.swing.GroupLayout(box4);
        box4.setLayout(box4Layout);
        box4Layout.setHorizontalGroup(
            box4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );
        box4Layout.setVerticalGroup(
            box4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );

        box57.setBackground(new java.awt.Color(200, 200, 200));
        box57.setPreferredSize(new java.awt.Dimension(55, 55));

        javax.swing.GroupLayout box57Layout = new javax.swing.GroupLayout(box57);
        box57.setLayout(box57Layout);
        box57Layout.setHorizontalGroup(
            box57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );
        box57Layout.setVerticalGroup(
            box57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );

        box5.setBackground(new java.awt.Color(200, 200, 200));
        box5.setPreferredSize(new java.awt.Dimension(55, 55));

        javax.swing.GroupLayout box5Layout = new javax.swing.GroupLayout(box5);
        box5.setLayout(box5Layout);
        box5Layout.setHorizontalGroup(
            box5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );
        box5Layout.setVerticalGroup(
            box5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );

        box56.setBackground(new java.awt.Color(200, 200, 200));
        box56.setPreferredSize(new java.awt.Dimension(55, 55));

        javax.swing.GroupLayout box56Layout = new javax.swing.GroupLayout(box56);
        box56.setLayout(box56Layout);
        box56Layout.setHorizontalGroup(
            box56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );
        box56Layout.setVerticalGroup(
            box56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );

        box6.setBackground(new java.awt.Color(200, 200, 200));
        box6.setPreferredSize(new java.awt.Dimension(55, 55));

        javax.swing.GroupLayout box6Layout = new javax.swing.GroupLayout(box6);
        box6.setLayout(box6Layout);
        box6Layout.setHorizontalGroup(
            box6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );
        box6Layout.setVerticalGroup(
            box6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );

        box55.setBackground(new java.awt.Color(200, 200, 200));
        box55.setPreferredSize(new java.awt.Dimension(55, 55));

        javax.swing.GroupLayout box55Layout = new javax.swing.GroupLayout(box55);
        box55.setLayout(box55Layout);
        box55Layout.setHorizontalGroup(
            box55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );
        box55Layout.setVerticalGroup(
            box55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );

        box7.setBackground(new java.awt.Color(200, 200, 200));
        box7.setPreferredSize(new java.awt.Dimension(55, 55));

        javax.swing.GroupLayout box7Layout = new javax.swing.GroupLayout(box7);
        box7.setLayout(box7Layout);
        box7Layout.setHorizontalGroup(
            box7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );
        box7Layout.setVerticalGroup(
            box7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );

        box54.setBackground(new java.awt.Color(200, 200, 200));
        box54.setPreferredSize(new java.awt.Dimension(55, 55));

        javax.swing.GroupLayout box54Layout = new javax.swing.GroupLayout(box54);
        box54.setLayout(box54Layout);
        box54Layout.setHorizontalGroup(
            box54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );
        box54Layout.setVerticalGroup(
            box54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );

        box8.setBackground(new java.awt.Color(200, 200, 200));
        box8.setPreferredSize(new java.awt.Dimension(55, 55));

        javax.swing.GroupLayout box8Layout = new javax.swing.GroupLayout(box8);
        box8.setLayout(box8Layout);
        box8Layout.setHorizontalGroup(
            box8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );
        box8Layout.setVerticalGroup(
            box8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );

        box53.setBackground(new java.awt.Color(200, 200, 200));
        box53.setPreferredSize(new java.awt.Dimension(55, 55));

        javax.swing.GroupLayout box53Layout = new javax.swing.GroupLayout(box53);
        box53.setLayout(box53Layout);
        box53Layout.setHorizontalGroup(
            box53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );
        box53Layout.setVerticalGroup(
            box53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );

        box23.setBackground(new java.awt.Color(200, 200, 200));
        box23.setPreferredSize(new java.awt.Dimension(55, 55));

        javax.swing.GroupLayout box23Layout = new javax.swing.GroupLayout(box23);
        box23.setLayout(box23Layout);
        box23Layout.setHorizontalGroup(
            box23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );
        box23Layout.setVerticalGroup(
            box23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );

        box24.setBackground(new java.awt.Color(200, 200, 200));
        box24.setPreferredSize(new java.awt.Dimension(55, 55));

        javax.swing.GroupLayout box24Layout = new javax.swing.GroupLayout(box24);
        box24.setLayout(box24Layout);
        box24Layout.setHorizontalGroup(
            box24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );
        box24Layout.setVerticalGroup(
            box24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );

        box25.setBackground(new java.awt.Color(200, 200, 200));
        box25.setPreferredSize(new java.awt.Dimension(55, 55));

        javax.swing.GroupLayout box25Layout = new javax.swing.GroupLayout(box25);
        box25.setLayout(box25Layout);
        box25Layout.setHorizontalGroup(
            box25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );
        box25Layout.setVerticalGroup(
            box25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );

        box38.setBackground(new java.awt.Color(200, 200, 200));
        box38.setPreferredSize(new java.awt.Dimension(55, 55));

        javax.swing.GroupLayout box38Layout = new javax.swing.GroupLayout(box38);
        box38.setLayout(box38Layout);
        box38Layout.setHorizontalGroup(
            box38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );
        box38Layout.setVerticalGroup(
            box38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );

        box37.setBackground(new java.awt.Color(200, 200, 200));
        box37.setPreferredSize(new java.awt.Dimension(55, 55));

        javax.swing.GroupLayout box37Layout = new javax.swing.GroupLayout(box37);
        box37.setLayout(box37Layout);
        box37Layout.setHorizontalGroup(
            box37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );
        box37Layout.setVerticalGroup(
            box37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );

        box36.setBackground(new java.awt.Color(200, 200, 200));
        box36.setPreferredSize(new java.awt.Dimension(55, 55));

        javax.swing.GroupLayout box36Layout = new javax.swing.GroupLayout(box36);
        box36.setLayout(box36Layout);
        box36Layout.setHorizontalGroup(
            box36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );
        box36Layout.setVerticalGroup(
            box36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );

        box26.setBackground(new java.awt.Color(200, 200, 200));
        box26.setPreferredSize(new java.awt.Dimension(55, 55));

        javax.swing.GroupLayout box26Layout = new javax.swing.GroupLayout(box26);
        box26.setLayout(box26Layout);
        box26Layout.setHorizontalGroup(
            box26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );
        box26Layout.setVerticalGroup(
            box26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );

        box35.setBackground(new java.awt.Color(200, 200, 200));
        box35.setPreferredSize(new java.awt.Dimension(55, 55));

        javax.swing.GroupLayout box35Layout = new javax.swing.GroupLayout(box35);
        box35.setLayout(box35Layout);
        box35Layout.setHorizontalGroup(
            box35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );
        box35Layout.setVerticalGroup(
            box35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );

        box27.setBackground(new java.awt.Color(200, 200, 200));
        box27.setPreferredSize(new java.awt.Dimension(55, 55));

        javax.swing.GroupLayout box27Layout = new javax.swing.GroupLayout(box27);
        box27.setLayout(box27Layout);
        box27Layout.setHorizontalGroup(
            box27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );
        box27Layout.setVerticalGroup(
            box27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );

        box34.setBackground(new java.awt.Color(200, 200, 200));
        box34.setPreferredSize(new java.awt.Dimension(55, 55));

        javax.swing.GroupLayout box34Layout = new javax.swing.GroupLayout(box34);
        box34.setLayout(box34Layout);
        box34Layout.setHorizontalGroup(
            box34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );
        box34Layout.setVerticalGroup(
            box34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );

        box28.setBackground(new java.awt.Color(200, 200, 200));
        box28.setPreferredSize(new java.awt.Dimension(55, 55));

        javax.swing.GroupLayout box28Layout = new javax.swing.GroupLayout(box28);
        box28.setLayout(box28Layout);
        box28Layout.setHorizontalGroup(
            box28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );
        box28Layout.setVerticalGroup(
            box28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );

        box33.setBackground(new java.awt.Color(200, 200, 200));
        box33.setPreferredSize(new java.awt.Dimension(55, 55));

        javax.swing.GroupLayout box33Layout = new javax.swing.GroupLayout(box33);
        box33.setLayout(box33Layout);
        box33Layout.setHorizontalGroup(
            box33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );
        box33Layout.setVerticalGroup(
            box33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );

        box29.setBackground(new java.awt.Color(200, 200, 200));
        box29.setPreferredSize(new java.awt.Dimension(55, 55));

        javax.swing.GroupLayout box29Layout = new javax.swing.GroupLayout(box29);
        box29.setLayout(box29Layout);
        box29Layout.setHorizontalGroup(
            box29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );
        box29Layout.setVerticalGroup(
            box29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );

        box32.setBackground(new java.awt.Color(200, 200, 200));
        box32.setPreferredSize(new java.awt.Dimension(55, 55));

        javax.swing.GroupLayout box32Layout = new javax.swing.GroupLayout(box32);
        box32.setLayout(box32Layout);
        box32Layout.setHorizontalGroup(
            box32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );
        box32Layout.setVerticalGroup(
            box32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );

        box30.setBackground(new java.awt.Color(200, 200, 200));
        box30.setPreferredSize(new java.awt.Dimension(55, 55));

        javax.swing.GroupLayout box30Layout = new javax.swing.GroupLayout(box30);
        box30.setLayout(box30Layout);
        box30Layout.setHorizontalGroup(
            box30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );
        box30Layout.setVerticalGroup(
            box30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );

        box31.setBackground(new java.awt.Color(200, 200, 200));
        box31.setPreferredSize(new java.awt.Dimension(55, 55));

        javax.swing.GroupLayout box31Layout = new javax.swing.GroupLayout(box31);
        box31.setLayout(box31Layout);
        box31Layout.setHorizontalGroup(
            box31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );
        box31Layout.setVerticalGroup(
            box31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );

        box10.setBackground(new java.awt.Color(200, 200, 200));
        box10.setPreferredSize(new java.awt.Dimension(55, 55));

        javax.swing.GroupLayout box10Layout = new javax.swing.GroupLayout(box10);
        box10.setLayout(box10Layout);
        box10Layout.setHorizontalGroup(
            box10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );
        box10Layout.setVerticalGroup(
            box10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );

        box21.setBackground(new java.awt.Color(200, 200, 200));
        box21.setPreferredSize(new java.awt.Dimension(55, 55));

        javax.swing.GroupLayout box21Layout = new javax.swing.GroupLayout(box21);
        box21.setLayout(box21Layout);
        box21Layout.setHorizontalGroup(
            box21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );
        box21Layout.setVerticalGroup(
            box21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );

        box22.setBackground(new java.awt.Color(200, 200, 200));
        box22.setPreferredSize(new java.awt.Dimension(55, 55));

        javax.swing.GroupLayout box22Layout = new javax.swing.GroupLayout(box22);
        box22.setLayout(box22Layout);
        box22Layout.setHorizontalGroup(
            box22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );
        box22Layout.setVerticalGroup(
            box22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );

        box9.setBackground(new java.awt.Color(200, 200, 200));
        box9.setPreferredSize(new java.awt.Dimension(55, 55));

        javax.swing.GroupLayout box9Layout = new javax.swing.GroupLayout(box9);
        box9.setLayout(box9Layout);
        box9Layout.setHorizontalGroup(
            box9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );
        box9Layout.setVerticalGroup(
            box9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );

        box11.setBackground(new java.awt.Color(200, 200, 200));
        box11.setPreferredSize(new java.awt.Dimension(55, 55));

        javax.swing.GroupLayout box11Layout = new javax.swing.GroupLayout(box11);
        box11.setLayout(box11Layout);
        box11Layout.setHorizontalGroup(
            box11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );
        box11Layout.setVerticalGroup(
            box11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );

        box12.setBackground(new java.awt.Color(200, 200, 200));
        box12.setPreferredSize(new java.awt.Dimension(55, 55));

        javax.swing.GroupLayout box12Layout = new javax.swing.GroupLayout(box12);
        box12.setLayout(box12Layout);
        box12Layout.setHorizontalGroup(
            box12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );
        box12Layout.setVerticalGroup(
            box12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );

        box19.setBackground(new java.awt.Color(200, 200, 200));
        box19.setPreferredSize(new java.awt.Dimension(55, 55));

        javax.swing.GroupLayout box19Layout = new javax.swing.GroupLayout(box19);
        box19.setLayout(box19Layout);
        box19Layout.setHorizontalGroup(
            box19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );
        box19Layout.setVerticalGroup(
            box19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );

        box20.setBackground(new java.awt.Color(200, 200, 200));
        box20.setPreferredSize(new java.awt.Dimension(55, 55));

        javax.swing.GroupLayout box20Layout = new javax.swing.GroupLayout(box20);
        box20.setLayout(box20Layout);
        box20Layout.setHorizontalGroup(
            box20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );
        box20Layout.setVerticalGroup(
            box20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );

        box13.setBackground(new java.awt.Color(200, 200, 200));
        box13.setPreferredSize(new java.awt.Dimension(55, 55));

        javax.swing.GroupLayout box13Layout = new javax.swing.GroupLayout(box13);
        box13.setLayout(box13Layout);
        box13Layout.setHorizontalGroup(
            box13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );
        box13Layout.setVerticalGroup(
            box13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );

        box14.setBackground(new java.awt.Color(200, 200, 200));
        box14.setPreferredSize(new java.awt.Dimension(55, 55));

        javax.swing.GroupLayout box14Layout = new javax.swing.GroupLayout(box14);
        box14.setLayout(box14Layout);
        box14Layout.setHorizontalGroup(
            box14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );
        box14Layout.setVerticalGroup(
            box14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );

        box17.setBackground(new java.awt.Color(200, 200, 200));
        box17.setPreferredSize(new java.awt.Dimension(55, 55));

        javax.swing.GroupLayout box17Layout = new javax.swing.GroupLayout(box17);
        box17.setLayout(box17Layout);
        box17Layout.setHorizontalGroup(
            box17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );
        box17Layout.setVerticalGroup(
            box17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );

        box18.setBackground(new java.awt.Color(200, 200, 200));
        box18.setPreferredSize(new java.awt.Dimension(55, 55));

        javax.swing.GroupLayout box18Layout = new javax.swing.GroupLayout(box18);
        box18.setLayout(box18Layout);
        box18Layout.setHorizontalGroup(
            box18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );
        box18Layout.setVerticalGroup(
            box18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );

        box15.setBackground(new java.awt.Color(200, 200, 200));
        box15.setPreferredSize(new java.awt.Dimension(55, 55));

        javax.swing.GroupLayout box15Layout = new javax.swing.GroupLayout(box15);
        box15.setLayout(box15Layout);
        box15Layout.setHorizontalGroup(
            box15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );
        box15Layout.setVerticalGroup(
            box15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );

        box16.setBackground(new java.awt.Color(200, 200, 200));
        box16.setPreferredSize(new java.awt.Dimension(55, 55));

        javax.swing.GroupLayout box16Layout = new javax.swing.GroupLayout(box16);
        box16.setLayout(box16Layout);
        box16Layout.setHorizontalGroup(
            box16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );
        box16Layout.setVerticalGroup(
            box16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );

        box52.setBackground(new java.awt.Color(200, 200, 200));
        box52.setPreferredSize(new java.awt.Dimension(55, 55));

        javax.swing.GroupLayout box52Layout = new javax.swing.GroupLayout(box52);
        box52.setLayout(box52Layout);
        box52Layout.setHorizontalGroup(
            box52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );
        box52Layout.setVerticalGroup(
            box52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );

        box39.setBackground(new java.awt.Color(200, 200, 200));
        box39.setPreferredSize(new java.awt.Dimension(55, 55));

        javax.swing.GroupLayout box39Layout = new javax.swing.GroupLayout(box39);
        box39.setLayout(box39Layout);
        box39Layout.setHorizontalGroup(
            box39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );
        box39Layout.setVerticalGroup(
            box39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );

        box51.setBackground(new java.awt.Color(200, 200, 200));
        box51.setPreferredSize(new java.awt.Dimension(55, 55));

        javax.swing.GroupLayout box51Layout = new javax.swing.GroupLayout(box51);
        box51.setLayout(box51Layout);
        box51Layout.setHorizontalGroup(
            box51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );
        box51Layout.setVerticalGroup(
            box51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );

        box40.setBackground(new java.awt.Color(200, 200, 200));
        box40.setPreferredSize(new java.awt.Dimension(55, 55));

        javax.swing.GroupLayout box40Layout = new javax.swing.GroupLayout(box40);
        box40.setLayout(box40Layout);
        box40Layout.setHorizontalGroup(
            box40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );
        box40Layout.setVerticalGroup(
            box40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );

        box50.setBackground(new java.awt.Color(200, 200, 200));
        box50.setPreferredSize(new java.awt.Dimension(55, 55));

        javax.swing.GroupLayout box50Layout = new javax.swing.GroupLayout(box50);
        box50.setLayout(box50Layout);
        box50Layout.setHorizontalGroup(
            box50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );
        box50Layout.setVerticalGroup(
            box50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );

        box41.setBackground(new java.awt.Color(200, 200, 200));
        box41.setPreferredSize(new java.awt.Dimension(55, 55));

        javax.swing.GroupLayout box41Layout = new javax.swing.GroupLayout(box41);
        box41.setLayout(box41Layout);
        box41Layout.setHorizontalGroup(
            box41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );
        box41Layout.setVerticalGroup(
            box41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );

        box49.setBackground(new java.awt.Color(200, 200, 200));
        box49.setPreferredSize(new java.awt.Dimension(55, 55));

        javax.swing.GroupLayout box49Layout = new javax.swing.GroupLayout(box49);
        box49.setLayout(box49Layout);
        box49Layout.setHorizontalGroup(
            box49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );
        box49Layout.setVerticalGroup(
            box49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );

        box42.setBackground(new java.awt.Color(200, 200, 200));
        box42.setPreferredSize(new java.awt.Dimension(55, 55));

        javax.swing.GroupLayout box42Layout = new javax.swing.GroupLayout(box42);
        box42.setLayout(box42Layout);
        box42Layout.setHorizontalGroup(
            box42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );
        box42Layout.setVerticalGroup(
            box42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );

        box48.setBackground(new java.awt.Color(200, 200, 200));
        box48.setPreferredSize(new java.awt.Dimension(55, 55));

        javax.swing.GroupLayout box48Layout = new javax.swing.GroupLayout(box48);
        box48.setLayout(box48Layout);
        box48Layout.setHorizontalGroup(
            box48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );
        box48Layout.setVerticalGroup(
            box48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );

        box43.setBackground(new java.awt.Color(200, 200, 200));
        box43.setPreferredSize(new java.awt.Dimension(55, 55));

        javax.swing.GroupLayout box43Layout = new javax.swing.GroupLayout(box43);
        box43.setLayout(box43Layout);
        box43Layout.setHorizontalGroup(
            box43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );
        box43Layout.setVerticalGroup(
            box43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );

        box47.setBackground(new java.awt.Color(200, 200, 200));
        box47.setPreferredSize(new java.awt.Dimension(55, 55));

        javax.swing.GroupLayout box47Layout = new javax.swing.GroupLayout(box47);
        box47.setLayout(box47Layout);
        box47Layout.setHorizontalGroup(
            box47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );
        box47Layout.setVerticalGroup(
            box47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );

        box44.setBackground(new java.awt.Color(200, 200, 200));
        box44.setPreferredSize(new java.awt.Dimension(55, 55));

        javax.swing.GroupLayout box44Layout = new javax.swing.GroupLayout(box44);
        box44.setLayout(box44Layout);
        box44Layout.setHorizontalGroup(
            box44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );
        box44Layout.setVerticalGroup(
            box44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );

        box46.setBackground(new java.awt.Color(200, 200, 200));
        box46.setPreferredSize(new java.awt.Dimension(55, 55));

        javax.swing.GroupLayout box46Layout = new javax.swing.GroupLayout(box46);
        box46.setLayout(box46Layout);
        box46Layout.setHorizontalGroup(
            box46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );
        box46Layout.setVerticalGroup(
            box46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );

        box45.setBackground(new java.awt.Color(200, 200, 200));
        box45.setPreferredSize(new java.awt.Dimension(55, 55));

        javax.swing.GroupLayout box45Layout = new javax.swing.GroupLayout(box45);
        box45.setLayout(box45Layout);
        box45Layout.setHorizontalGroup(
            box45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );
        box45Layout.setVerticalGroup(
            box45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(box15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(box16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(box14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(box17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(box13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(box18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(box12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(box19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(box11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(box20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(box10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(box21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(box9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(box22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(box30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(box31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(box29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(box32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(box7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(box54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel10Layout.createSequentialGroup()
                            .addComponent(box6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(box55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(box5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(box56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(box4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(box57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(box3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(box58, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(box1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(box2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(box60, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(box59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel10Layout.createSequentialGroup()
                                    .addComponent(box28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(box33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addComponent(box27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(box34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addComponent(box26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(box35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addComponent(box25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(box36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(box23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(box24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(box38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(box37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(box8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(box53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(box52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(box39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(box51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(box40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(box50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(box41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(box49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(box42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(box48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(box43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(box47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(box44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(box46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(box45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(357, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(box1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(box60, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(box59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(box2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(box3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(box58, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(box4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(box57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(box5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(box56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(box6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(box55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(box7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(box54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(box15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(box16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(box14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(box13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(box18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(box17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(box12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(box11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(box20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(box19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(box8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(box53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(box23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(box38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(box10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(box9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(box22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(box21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(box52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(box39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(box51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(box50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(box41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(box40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(box49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(box48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(box43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(box42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(box47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(box46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(box45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(box44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(box37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(box24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(box25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(box36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(box26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(box35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(box27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(box34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(box28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(box33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(box29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(box32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(box30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(box31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel10);
        jPanel10.setBounds(610, 0, 1400, 1070);

        apostar25.setBackground(new java.awt.Color(247, 226, 72));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("25");

        javax.swing.GroupLayout apostar25Layout = new javax.swing.GroupLayout(apostar25);
        apostar25.setLayout(apostar25Layout);
        apostar25Layout.setHorizontalGroup(
            apostar25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(apostar25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(apostar25Layout.createSequentialGroup()
                    .addGap(0, 35, Short.MAX_VALUE)
                    .addComponent(jLabel16)
                    .addGap(0, 35, Short.MAX_VALUE)))
        );
        apostar25Layout.setVerticalGroup(
            apostar25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
            .addGroup(apostar25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(apostar25Layout.createSequentialGroup()
                    .addGap(0, 18, Short.MAX_VALUE)
                    .addComponent(jLabel16)
                    .addGap(0, 18, Short.MAX_VALUE)))
        );

        getContentPane().add(apostar25);
        apostar25.setBounds(1110, 1080, 100, 70);

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
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(apostar5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(apostar5Layout.createSequentialGroup()
                    .addGap(0, 42, Short.MAX_VALUE)
                    .addComponent(jLabel15)
                    .addGap(0, 43, Short.MAX_VALUE)))
        );
        apostar5Layout.setVerticalGroup(
            apostar5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
            .addGroup(apostar5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(apostar5Layout.createSequentialGroup()
                    .addGap(0, 18, Short.MAX_VALUE)
                    .addComponent(jLabel15)
                    .addGap(0, 18, Short.MAX_VALUE)))
        );

        getContentPane().add(apostar5);
        apostar5.setBounds(890, 1080, 100, 70);

        apostar10.setBackground(new java.awt.Color(175, 221, 42));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("10");

        javax.swing.GroupLayout apostar10Layout = new javax.swing.GroupLayout(apostar10);
        apostar10.setLayout(apostar10Layout);
        apostar10Layout.setHorizontalGroup(
            apostar10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(apostar10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(apostar10Layout.createSequentialGroup()
                    .addGap(0, 35, Short.MAX_VALUE)
                    .addComponent(jLabel17)
                    .addGap(0, 35, Short.MAX_VALUE)))
        );
        apostar10Layout.setVerticalGroup(
            apostar10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
            .addGroup(apostar10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(apostar10Layout.createSequentialGroup()
                    .addGap(0, 18, Short.MAX_VALUE)
                    .addComponent(jLabel17)
                    .addGap(0, 18, Short.MAX_VALUE)))
        );

        getContentPane().add(apostar10);
        apostar10.setBounds(1000, 1080, 100, 70);

        apostar50.setBackground(new java.awt.Color(244, 160, 8));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("50");

        javax.swing.GroupLayout apostar50Layout = new javax.swing.GroupLayout(apostar50);
        apostar50.setLayout(apostar50Layout);
        apostar50Layout.setHorizontalGroup(
            apostar50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(apostar50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(apostar50Layout.createSequentialGroup()
                    .addGap(0, 35, Short.MAX_VALUE)
                    .addComponent(jLabel18)
                    .addGap(0, 35, Short.MAX_VALUE)))
        );
        apostar50Layout.setVerticalGroup(
            apostar50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
            .addGroup(apostar50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(apostar50Layout.createSequentialGroup()
                    .addGap(0, 18, Short.MAX_VALUE)
                    .addComponent(jLabel18)
                    .addGap(0, 18, Short.MAX_VALUE)))
        );

        getContentPane().add(apostar50);
        apostar50.setBounds(1220, 1080, 100, 70);

        apostar100.setBackground(new java.awt.Color(255, 102, 102));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("100");

        javax.swing.GroupLayout apostar100Layout = new javax.swing.GroupLayout(apostar100);
        apostar100.setLayout(apostar100Layout);
        apostar100Layout.setHorizontalGroup(
            apostar100Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(apostar100Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel19)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        apostar100Layout.setVerticalGroup(
            apostar100Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, apostar100Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel19)
                .addContainerGap())
        );

        getContentPane().add(apostar100);
        apostar100.setBounds(1330, 1080, 100, 70);

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
                .addGap(62, 62, 62)
                .addComponent(jLabel13)
                .addContainerGap(66, Short.MAX_VALUE))
        );
        btnPasarLayout.setVerticalGroup(
            btnPasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnPasarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(btnPasar);
        btnPasar.setBounds(630, 1170, 210, 80);

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        btnTirarDados.setBounds(630, 1080, 210, 80);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 100, 100);

        jToggleButton1.setText("jToggleButton1");
        getContentPane().add(jToggleButton1);
        jToggleButton1.setBounds(0, 0, 141, 29);

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
        int confirm = JOptionPane.showConfirmDialog(this, "¿Seguro que quieres salir del tablero?", "Confirmación", JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            System.exit(0);
        }

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
    private javax.swing.JPanel box1;
    private javax.swing.JPanel box10;
    private javax.swing.JPanel box11;
    private javax.swing.JPanel box12;
    private javax.swing.JPanel box13;
    private javax.swing.JPanel box14;
    private javax.swing.JPanel box15;
    private javax.swing.JPanel box16;
    private javax.swing.JPanel box17;
    private javax.swing.JPanel box18;
    private javax.swing.JPanel box19;
    private javax.swing.JPanel box2;
    private javax.swing.JPanel box20;
    private javax.swing.JPanel box21;
    private javax.swing.JPanel box22;
    private javax.swing.JPanel box23;
    private javax.swing.JPanel box24;
    private javax.swing.JPanel box25;
    private javax.swing.JPanel box26;
    private javax.swing.JPanel box27;
    private javax.swing.JPanel box28;
    private javax.swing.JPanel box29;
    private javax.swing.JPanel box3;
    private javax.swing.JPanel box30;
    private javax.swing.JPanel box31;
    private javax.swing.JPanel box32;
    private javax.swing.JPanel box33;
    private javax.swing.JPanel box34;
    private javax.swing.JPanel box35;
    private javax.swing.JPanel box36;
    private javax.swing.JPanel box37;
    private javax.swing.JPanel box38;
    private javax.swing.JPanel box39;
    private javax.swing.JPanel box4;
    private javax.swing.JPanel box40;
    private javax.swing.JPanel box41;
    private javax.swing.JPanel box42;
    private javax.swing.JPanel box43;
    private javax.swing.JPanel box44;
    private javax.swing.JPanel box45;
    private javax.swing.JPanel box46;
    private javax.swing.JPanel box47;
    private javax.swing.JPanel box48;
    private javax.swing.JPanel box49;
    private javax.swing.JPanel box5;
    private javax.swing.JPanel box50;
    private javax.swing.JPanel box51;
    private javax.swing.JPanel box52;
    private javax.swing.JPanel box53;
    private javax.swing.JPanel box54;
    private javax.swing.JPanel box55;
    private javax.swing.JPanel box56;
    private javax.swing.JPanel box57;
    private javax.swing.JPanel box58;
    private javax.swing.JPanel box59;
    private javax.swing.JPanel box6;
    private javax.swing.JPanel box60;
    private javax.swing.JPanel box7;
    private javax.swing.JPanel box8;
    private javax.swing.JPanel box9;
    private javax.swing.JPanel btnPasar;
    private javax.swing.JPanel btnSalir;
    private javax.swing.JPanel btnTirarDados;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPlayer1;
    private javax.swing.JPanel jPlayer2;
    private javax.swing.JPanel jPlayer3;
    private javax.swing.JPanel jPlayer4;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel labelPlayer1;
    private javax.swing.JLabel labelPlayer2;
    private javax.swing.JLabel labelPlayer3;
    private javax.swing.JLabel labelPlayer4;
    private javax.swing.JLabel txtSalir;
    // End of variables declaration//GEN-END:variables
}
