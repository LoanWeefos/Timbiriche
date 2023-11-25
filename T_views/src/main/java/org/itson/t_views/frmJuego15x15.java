/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.itson.t_views;

import com.itson.t_modelview.facade.FachadaViewModel;
import com.itson.t_modelview.interfaces.IFachadaViewModel;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author wikit
 */
public class frmJuego15x15 extends javax.swing.JFrame {

    private final Color colorDefault = Color.decode("#A69185");
    private Color colorMouseOver = Color.decode("#B13A3A");
    private int filaMouseOver = -1;
    private int filaMouseOver2 = -1;
    private int lineaMouseOver = -1;
    private int lineaMouseOver2 = -1;
    private boolean[][] lineasColoreadas;
    private Color[][] colorLineas;
    private boolean[][] lineasColoreadas2;
    private Color[][] colorLineas2;
    private int turnoJugador = 1;
    private String[][] jugadores;
    private String nombreJugador;
    private int puntosJugador1 = 0;
    private int puntosJugador2 = 0;
    private int puntosJugador3 = 0;

    private static frmJuego15x15 instance = null;
    private final IFachadaViewModel fachadaViewModel;

    /**
     * Creates new form frmJuego
     */
    private frmJuego15x15() {
        this.fachadaViewModel = new FachadaViewModel();
        initComponents();
        generarDatos();
    }

    private void reset() {
        lineasColoreadas = new boolean[15][14];
        colorLineas = new Color[15][14];
        lineasColoreadas2 = new boolean[16][14];
        colorLineas2 = new Color[16][14];
        turnoJugador = 1;
        puntosJugador1 = 0;
        puntosJugador2 = 0;
    }

    public static frmJuego15x15 getInstance() {
        if (instance == null) {
            instance = new frmJuego15x15();
        }
        return instance;
    }

    private void generarDatos() {
        actualizarPuntos(0);
        jugadores = new String[3][3];
        lineasColoreadas = new boolean[15][14];
        colorLineas = new Color[15][14];
        lineasColoreadas2 = new boolean[16][14];
        colorLineas2 = new Color[16][14];
        try {
            fachadaViewModel.crearTablero(15);
            fachadaViewModel.crearJuego(jugadores);
        } catch (Exception ex) {
            Logger.getLogger(frmSala.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void asignarNombre() {
        nombreJugador = jugadores[0][0];
        lblJugador1.setText(nombreJugador);
    }

    public void asignarIconos() {
        lblIcon1.setIcon(new ImageIcon(getClass().getClassLoader().getResource(jugadores[0][1])));
        lblIcon2.setIcon(new ImageIcon(getClass().getClassLoader().getResource(jugadores[1][1])));
        lblIcon3.setIcon(new ImageIcon(getClass().getClassLoader().getResource(jugadores[2][1])));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlSala = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        lblLulu = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        lblLulu1 = new javax.swing.JLabel();
        pnlContenedor = new javax.swing.JPanel();
        lblPuntos1 = new javax.swing.JLabel();
        lblPuntos2 = new javax.swing.JLabel();
        lblPuntos3 = new javax.swing.JLabel();
        pnlIcon1 = new javax.swing.JPanel();
        lblIcon1 = new javax.swing.JLabel();
        pnlIcon2 = new javax.swing.JPanel();
        lblIcon2 = new javax.swing.JLabel();
        pnlIcon3 = new javax.swing.JPanel();
        lblIcon3 = new javax.swing.JLabel();
        lblJugador1 = new javax.swing.JLabel();
        lblJugador3 = new javax.swing.JLabel();
        lblJugador2 = new javax.swing.JLabel();
        pnlTablero = new javax.swing.JPanel();
        lblTablero = new javax.swing.JLabel();
        lblTiempo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        pnlSala.setBackground(new java.awt.Color(216, 227, 242));
        pnlSala.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        btnSalir.setBackground(new java.awt.Color(217, 203, 191));
        btnSalir.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnSalir.setText("X");
        btnSalir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSalir.setContentAreaFilled(false);
        btnSalir.setFocusPainted(false);
        btnSalir.setFocusable(false);
        btnSalir.setOpaque(true);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Sugo Pro Classic Trial", 1, 48)); // NOI18N
        lblTitulo.setText("Timbiriche");

        lblLulu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lulu_2.png"))); // NOI18N

        btnRegresar.setBackground(new java.awt.Color(217, 203, 191));
        btnRegresar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnRegresar.setText("←");
        btnRegresar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRegresar.setContentAreaFilled(false);
        btnRegresar.setFocusPainted(false);
        btnRegresar.setFocusable(false);
        btnRegresar.setOpaque(true);
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        lblLulu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lulu_2.png"))); // NOI18N

        pnlContenedor.setBackground(new java.awt.Color(217, 203, 191));
        pnlContenedor.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblPuntos1.setFont(new java.awt.Font("Poppins SemiBold", 1, 18)); // NOI18N
        lblPuntos1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPuntos1.setPreferredSize(new java.awt.Dimension(100, 40));

        lblPuntos2.setFont(new java.awt.Font("Poppins SemiBold", 1, 18)); // NOI18N
        lblPuntos2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPuntos2.setPreferredSize(new java.awt.Dimension(100, 40));

        lblPuntos3.setFont(new java.awt.Font("Poppins SemiBold", 1, 18)); // NOI18N
        lblPuntos3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPuntos3.setPreferredSize(new java.awt.Dimension(100, 40));

        pnlIcon1.setBackground(new java.awt.Color(177, 58, 58));

        lblIcon1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIcon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lulu.png"))); // NOI18N

        javax.swing.GroupLayout pnlIcon1Layout = new javax.swing.GroupLayout(pnlIcon1);
        pnlIcon1.setLayout(pnlIcon1Layout);
        pnlIcon1Layout.setHorizontalGroup(
            pnlIcon1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblIcon1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        pnlIcon1Layout.setVerticalGroup(
            pnlIcon1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblIcon1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        pnlIcon2.setBackground(new java.awt.Color(48, 184, 86));

        lblIcon2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIcon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lulu2.png"))); // NOI18N

        javax.swing.GroupLayout pnlIcon2Layout = new javax.swing.GroupLayout(pnlIcon2);
        pnlIcon2.setLayout(pnlIcon2Layout);
        pnlIcon2Layout.setHorizontalGroup(
            pnlIcon2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblIcon2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        pnlIcon2Layout.setVerticalGroup(
            pnlIcon2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblIcon2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        pnlIcon3.setBackground(new java.awt.Color(42, 56, 182));

        lblIcon3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIcon3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tyrael.png"))); // NOI18N

        javax.swing.GroupLayout pnlIcon3Layout = new javax.swing.GroupLayout(pnlIcon3);
        pnlIcon3.setLayout(pnlIcon3Layout);
        pnlIcon3Layout.setHorizontalGroup(
            pnlIcon3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 112, Short.MAX_VALUE)
            .addGroup(pnlIcon3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlIcon3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblIcon3, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        pnlIcon3Layout.setVerticalGroup(
            pnlIcon3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 112, Short.MAX_VALUE)
            .addGroup(pnlIcon3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlIcon3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblIcon3, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        lblJugador1.setFont(new java.awt.Font("Poppins SemiBold", 1, 18)); // NOI18N
        lblJugador1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblJugador1.setText("Flayxamax");
        lblJugador1.setPreferredSize(new java.awt.Dimension(100, 40));

        lblJugador3.setFont(new java.awt.Font("Poppins SemiBold", 1, 18)); // NOI18N
        lblJugador3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblJugador3.setText("Wikiteban");
        lblJugador3.setPreferredSize(new java.awt.Dimension(100, 40));

        lblJugador2.setFont(new java.awt.Font("Poppins SemiBold", 1, 18)); // NOI18N
        lblJugador2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblJugador2.setText("LoanWeefos");
        lblJugador2.setPreferredSize(new java.awt.Dimension(100, 40));

        pnlTablero.setBackground(new java.awt.Color(166, 145, 133));

        lblTablero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tablero 15x15.png"))); // NOI18N
        lblTablero.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblTableroMouseMoved(evt);
            }
        });
        lblTablero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTableroMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblTableroMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlTableroLayout = new javax.swing.GroupLayout(pnlTablero);
        pnlTablero.setLayout(pnlTableroLayout);
        pnlTableroLayout.setHorizontalGroup(
            pnlTableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTableroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTablero)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlTableroLayout.setVerticalGroup(
            pnlTableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTableroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTablero)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlContenedorLayout = new javax.swing.GroupLayout(pnlContenedor);
        pnlContenedor.setLayout(pnlContenedorLayout);
        pnlContenedorLayout.setHorizontalGroup(
            pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContenedorLayout.createSequentialGroup()
                .addGroup(pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlContenedorLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblJugador1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlContenedorLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(pnlIcon1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlContenedorLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblJugador3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlContenedorLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlIcon3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPuntos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPuntos3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlTablero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlContenedorLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblJugador2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlContenedorLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(pnlIcon2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlContenedorLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(lblPuntos2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlContenedorLayout.setVerticalGroup(
            pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlContenedorLayout.createSequentialGroup()
                        .addComponent(pnlIcon2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblJugador2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPuntos2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(pnlContenedorLayout.createSequentialGroup()
                            .addComponent(pnlIcon1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblJugador1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblPuntos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPuntos3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(pnlIcon3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblJugador3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(pnlTablero, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblTiempo.setFont(new java.awt.Font("Poppins SemiBold", 1, 24)); // NOI18N
        lblTiempo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTiempo.setText("Tiempo 00:00");
        lblTiempo.setPreferredSize(new java.awt.Dimension(100, 40));

        javax.swing.GroupLayout pnlSalaLayout = new javax.swing.GroupLayout(pnlSala);
        pnlSala.setLayout(pnlSalaLayout);
        pnlSalaLayout.setHorizontalGroup(
            pnlSalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSalaLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pnlSalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSalaLayout.createSequentialGroup()
                        .addComponent(lblLulu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblLulu1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlSalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlSalaLayout.createSequentialGroup()
                                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(pnlContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        pnlSalaLayout.setVerticalGroup(
            pnlSalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSalaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlSalaLayout.createSequentialGroup()
                        .addGroup(pnlSalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlSalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblTitulo)
                        .addGroup(pnlSalaLayout.createSequentialGroup()
                            .addComponent(lblLulu)
                            .addGap(8, 8, 8))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlSalaLayout.createSequentialGroup()
                            .addGap(8, 8, 8)
                            .addComponent(lblLulu1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlSala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlSala, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        try {
            reset();
            fachadaViewModel.cambiarJuegoSala(this);
        } catch (Exception ex) {
            Logger.getLogger(frmJuego10x10.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void lblTableroMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTableroMouseMoved
        checkMouseOverHorizontales(evt.getX() + 220, evt.getY() + 127);
        checkMouseOverVerticales(evt.getX() + 220, evt.getY() + 127);
    }//GEN-LAST:event_lblTableroMouseMoved

    private void lblTableroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTableroMouseExited
        checkMouseOverHorizontales(0, 0);
        checkMouseOverVerticales(0, 0);
    }//GEN-LAST:event_lblTableroMouseExited

    private void lblTableroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTableroMouseClicked
        pintarClick();
    }//GEN-LAST:event_lblTableroMouseClicked

    private void pintarClick() {
        if (filaMouseOver != -1 && lineaMouseOver != -1 && !lineasColoreadas[filaMouseOver][lineaMouseOver]) {
            try {
                lineasColoreadas[filaMouseOver][lineaMouseOver] = true;
                colorLineas[filaMouseOver][lineaMouseOver] = colorMouseOver;
                fachadaViewModel.asignarLineaACuadro(filaMouseOver, lineaMouseOver, "1", turnoJugador);
                cambiarTurno();
                repaint();
            } catch (Exception ex) {
                Logger.getLogger(frmJuego10x10.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (filaMouseOver2 != -1 && lineaMouseOver2 != -1 && !lineasColoreadas2[filaMouseOver2][lineaMouseOver2]) {
            try {
                lineasColoreadas2[filaMouseOver2][lineaMouseOver2] = true;
                colorLineas2[filaMouseOver2][lineaMouseOver2] = colorMouseOver;
                fachadaViewModel.asignarLineaACuadro(lineaMouseOver2, filaMouseOver2, "2", turnoJugador);
                cambiarTurno();
                repaint();
            } catch (Exception ex) {
                Logger.getLogger(frmJuego10x10.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private void checkMouseOverHorizontales(int mouseX, int mouseY) {
        int grosorLinea = 7;
        float startX = 233;
        int startY = 132;
        float distanciaEntreLineas = 16.5f;
        int numeroDeFilas = 15;
        int numeroDeLineas = 14;

        filaMouseOver = -1;
        lineaMouseOver = -1;

        for (int fila = 0; fila < numeroDeFilas; fila++) {
            for (int i = 0; i < numeroDeLineas; i++) {
                float endX = startX + 25;

                float realStartX = startX;
                float realEndX = endX;
                float realStartY = startY - grosorLinea;
                float realEndY = startY + grosorLinea;

                if (mouseX >= realStartX && mouseX <= realEndX && mouseY >= realStartY && mouseY <= realEndY) {
                    filaMouseOver = fila;
                    lineaMouseOver = i;
                    break;
                }

                startX = endX + distanciaEntreLineas;
            }

            if (filaMouseOver != -1) {
                break;
            }

            startX = 233;
            startY += 41.99999f;
        }

        repaint();
    }

    private void checkMouseOverVerticales(int mouseX, int mouseY) {
        int grosorLinea = 7;
        float startX = 225;
        int startY = 140;
        float distanciaEntreLineas = 41.5f;
        int numeroDeFilas = 16;
        int numeroDeLineas = 14;

        filaMouseOver2 = -1;
        lineaMouseOver2 = -1;

        for (int i = 0; i < numeroDeLineas; i++) {
            for (int fila = 0; fila < numeroDeFilas - 1; fila++) {
                float endX = startX;
                float endY = startY + 25;

                float realStartX = startX - grosorLinea;
                float realEndX = endX + grosorLinea;
                float realStartY = startY;
                float realEndY = endY;

                if (mouseX >= realStartX && mouseX <= realEndX && mouseY >= realStartY && mouseY <= realEndY) {
                    filaMouseOver2 = fila;
                    lineaMouseOver2 = i;
                    break;
                }

                startX += distanciaEntreLineas;
            }

            if (filaMouseOver2 != -1) {
                break;
            }

            startX = 225;
            startY += 42;
        }

        repaint();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        pintarHorizontales(g);
        pintarVerticales(g);
    }

    private void pintarHorizontales(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        int grosorLinea = 7;
        g2d.setStroke(new BasicStroke(grosorLinea));

        float startX = 233;
        int startY = 132;
        float distanciaEntreLineas = 16.5f;
        int numeroDeFilas = 15;
        int numeroDeLineas = 14;

        for (int fila = 0; fila < numeroDeFilas; fila++) {
            for (int i = 0; i < numeroDeLineas; i++) {
                float endX = startX + 25;
                float endY = startY;

                Line2D.Float linea = new Line2D.Float(startX, startY, endX, endY);

                if (fila == filaMouseOver && i == lineaMouseOver && !lineasColoreadas[fila][i]) {
                    g2d.setColor(colorMouseOver);
                    g2d.draw(linea);
                } else {
                    if (colorLineas[fila][i] != null) {
                        g2d.setColor(colorLineas[fila][i]);
                    } else {
                        g2d.setColor(lineasColoreadas[fila][i] ? colorDefault : Color.decode("#A69185"));
                    }
                    g2d.draw(linea);
                }

                startX = endX + distanciaEntreLineas;
            }

            startX = 233;
            startY += 42.9;
        }
    }

    private void pintarVerticales(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        int grosorLinea = 7;
        g2d.setStroke(new BasicStroke(grosorLinea));

        float startX = 225;
        int startY = 140;
        float distanciaEntreLineas = 41.5f;
        int numeroDeFilas = 16;
        int numeroDeLineas = 14;

        for (int i = 0; i < numeroDeLineas; i++) {
            for (int fila = 0; fila < numeroDeFilas - 1; fila++) {
                float endX = startX;
                float endY = startY + 25;

                Line2D.Float linea = new Line2D.Float(startX, startY, endX, endY);

                if (fila == filaMouseOver2 && i == lineaMouseOver2 && !lineasColoreadas2[fila][i]) {
                    g2d.setColor(colorMouseOver);
                    g2d.draw(linea);
                } else {
                    if (colorLineas2[fila][i] != null) {
                        g2d.setColor(colorLineas2[fila][i]);
                    } else {
                        g2d.setColor(lineasColoreadas2[fila][i] ? colorDefault : Color.decode("#A69185"));
                    }
                    g2d.draw(linea);
                }

                startX += distanciaEntreLineas;
            }

            startX = 225;
            startY += 42.5;
        }
    }

    private void cambiarTurno() {
        if (turnoJugador == 1) {
            turnoJugador++;
            colorMouseOver = Color.decode("#30B856");
        } else if (turnoJugador == 2) {
            turnoJugador++;
            colorMouseOver = Color.decode("#2A38B6");
        } else if (turnoJugador == 3) {
            turnoJugador = 1;
            colorMouseOver = Color.decode("#B13A3A");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel lblIcon1;
    private javax.swing.JLabel lblIcon2;
    private javax.swing.JLabel lblIcon3;
    private javax.swing.JLabel lblJugador1;
    private javax.swing.JLabel lblJugador2;
    private javax.swing.JLabel lblJugador3;
    private javax.swing.JLabel lblLulu;
    private javax.swing.JLabel lblLulu1;
    private javax.swing.JLabel lblPuntos1;
    private javax.swing.JLabel lblPuntos2;
    private javax.swing.JLabel lblPuntos3;
    private javax.swing.JLabel lblTablero;
    private javax.swing.JLabel lblTiempo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlContenedor;
    private javax.swing.JPanel pnlIcon1;
    private javax.swing.JPanel pnlIcon2;
    private javax.swing.JPanel pnlIcon3;
    private javax.swing.JPanel pnlSala;
    private javax.swing.JPanel pnlTablero;
    // End of variables declaration//GEN-END:variables

    public int getTurnoJugador() {
        return turnoJugador;
    }

    public String[][] getJugadores() {
        return jugadores;
    }

    public void setJugadores(String[][] jugadores) {
        this.jugadores = jugadores;
    }

    public void actualizarPuntos(int turno) {
        if (turno != 0) {

            if (turno == 1) {
                puntosJugador1++;
            }
            if (turno == 2) {
                puntosJugador2++;
            }
            if (turno == 3) {
                puntosJugador3++;
            }
//            if (turno == 4) {
//                puntosJugador4++;
//            }
        }
        lblPuntos1.setText("Puntos: " + puntosJugador1);
        lblPuntos2.setText("Puntos: " + puntosJugador2);
        lblPuntos3.setText("Puntos: " + puntosJugador2);
    }
}
