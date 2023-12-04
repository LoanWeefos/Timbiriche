/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.itson.t_views;

import com.itson.t_modelview.facade.FachadaViewModel;
import com.itson.t_modelview.interfaces.IFachadaViewModel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.Timer;
import javax.swing.UIManager;

/**
 *
 * @author Equipo6
 */
public class frmSala extends javax.swing.JFrame {

    private static frmSala instance = null;
    private static String codigo;
    private static String nombre;
    private static int cantJugadores;
    private String[] iconos;
    private String jugador2;
    private String jugador3;
    private String jugador4;
    private String icono2;
    private String icono3;
    private String icono4;

    private int indice;
    private Timer timer;

    private final IFachadaViewModel fachadaViewModel;

    // Constructor privado para evitar instanciación directa
    private frmSala() {
        this.fachadaViewModel = new FachadaViewModel();
        initComponents();
        configurarPaneles();
        actualizarVentana();

        timer = new Timer(1000, (ActionEvent e) -> {
            try {
                if (fachadaViewModel.actualizarSala()) {
                    fachadaViewModel.actualizarDatosSala();
                    fachadaViewModel.actualizarIcono();
                    actualizarVentana();
                }
            } catch (Exception ex) {
                Logger.getLogger(frmSala.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        timer.start();
    }

    // Método para obtener la instancia del Singleton
    public static frmSala getInstance() {
        if (instance == null) {
            instance = new frmSala();
        }
        return instance;
    }

    public void mandarAvatar(String avatar) throws Exception {
        fachadaViewModel.actualizarAvatar(avatar);

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
        lblSala = new javax.swing.JLabel();
        lblIcono = new javax.swing.JLabel();
        pnlIcon1 = new javax.swing.JPanel();
        lblIcon1 = new javax.swing.JLabel();
        pnlIcon2 = new javax.swing.JPanel();
        lblIcon2 = new javax.swing.JLabel();
        pnlIcon3 = new javax.swing.JPanel();
        lblIcon3 = new javax.swing.JLabel();
        pnlIcon4 = new javax.swing.JPanel();
        lblIcon4 = new javax.swing.JLabel();
        btnIzq = new javax.swing.JButton();
        btnDer = new javax.swing.JButton();
        btnIniciar = new javax.swing.JButton();
        lblJugador3 = new javax.swing.JLabel();
        lblJugador2 = new javax.swing.JLabel();
        lblJugador4 = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();

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

        lblSala.setFont(new java.awt.Font("Poppins SemiBold", 1, 24)); // NOI18N
        lblSala.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSala.setText("Sala de espera");
        lblSala.setPreferredSize(new java.awt.Dimension(100, 40));

        lblIcono.setFont(new java.awt.Font("Poppins SemiBold", 1, 24)); // NOI18N
        lblIcono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIcono.setText("Icono");
        lblIcono.setPreferredSize(new java.awt.Dimension(100, 40));

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
            .addComponent(lblIcon3, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        pnlIcon3Layout.setVerticalGroup(
            pnlIcon3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblIcon3, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        pnlIcon4.setBackground(new java.awt.Color(225, 206, 28));

        lblIcon4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIcon4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tyrael2.png"))); // NOI18N

        javax.swing.GroupLayout pnlIcon4Layout = new javax.swing.GroupLayout(pnlIcon4);
        pnlIcon4.setLayout(pnlIcon4Layout);
        pnlIcon4Layout.setHorizontalGroup(
            pnlIcon4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblIcon4, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        pnlIcon4Layout.setVerticalGroup(
            pnlIcon4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblIcon4, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        btnIzq.setBackground(new java.awt.Color(217, 203, 191));
        btnIzq.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnIzq.setText("←");
        btnIzq.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnIzq.setContentAreaFilled(false);
        btnIzq.setFocusPainted(false);
        btnIzq.setFocusable(false);
        btnIzq.setOpaque(true);
        btnIzq.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnIzqMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnIzqMouseReleased(evt);
            }
        });
        btnIzq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzqActionPerformed(evt);
            }
        });

        btnDer.setBackground(new java.awt.Color(217, 203, 191));
        btnDer.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnDer.setText("→");
        btnDer.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDer.setContentAreaFilled(false);
        btnDer.setFocusPainted(false);
        btnDer.setFocusable(false);
        btnDer.setOpaque(true);
        btnDer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnDerMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnDerMouseReleased(evt);
            }
        });
        btnDer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDerActionPerformed(evt);
            }
        });

        btnIniciar.setBackground(new java.awt.Color(217, 203, 191));
        btnIniciar.setFont(new java.awt.Font("Poppins SemiBold", 1, 24)); // NOI18N
        btnIniciar.setText("Iniciar");
        btnIniciar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnIniciar.setContentAreaFilled(false);
        btnIniciar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnIniciar.setFocusPainted(false);
        btnIniciar.setFocusable(false);
        btnIniciar.setOpaque(true);
        btnIniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnIniciarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnIniciarMouseReleased(evt);
            }
        });
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        lblJugador3.setFont(new java.awt.Font("Poppins SemiBold", 1, 18)); // NOI18N
        lblJugador3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblJugador3.setPreferredSize(new java.awt.Dimension(100, 40));

        lblJugador2.setFont(new java.awt.Font("Poppins SemiBold", 1, 18)); // NOI18N
        lblJugador2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblJugador2.setPreferredSize(new java.awt.Dimension(100, 40));

        lblJugador4.setFont(new java.awt.Font("Poppins SemiBold", 1, 18)); // NOI18N
        lblJugador4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblJugador4.setPreferredSize(new java.awt.Dimension(100, 40));

        javax.swing.GroupLayout pnlContenedorLayout = new javax.swing.GroupLayout(pnlContenedor);
        pnlContenedor.setLayout(pnlContenedorLayout);
        pnlContenedorLayout.setHorizontalGroup(
            pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContenedorLayout.createSequentialGroup()
                .addGroup(pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlContenedorLayout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addComponent(lblSala, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlContenedorLayout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addGroup(pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblIcono, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlContenedorLayout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(btnIzq, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pnlIcon1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDer, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(99, 99, 99)
                        .addGroup(pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlIcon2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlIcon3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlIcon4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblJugador3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblJugador2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblJugador4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        pnlContenedorLayout.setVerticalGroup(
            pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlContenedorLayout.createSequentialGroup()
                        .addGroup(pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnDer, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlContenedorLayout.createSequentialGroup()
                                .addComponent(lblIcono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(pnlIcon1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnIzq, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(120, 120, 120)
                        .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlContenedorLayout.createSequentialGroup()
                        .addGroup(pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlContenedorLayout.createSequentialGroup()
                                .addComponent(pnlIcon2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(pnlContenedorLayout.createSequentialGroup()
                                .addComponent(lblJugador2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)))
                        .addGroup(pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlIcon3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlContenedorLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(lblJugador3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlContenedorLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(pnlIcon4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlContenedorLayout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(lblJugador4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(75, Short.MAX_VALUE))
        );

        lblUsuario.setFont(new java.awt.Font("Poppins SemiBold", 1, 24)); // NOI18N
        lblUsuario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblUsuario.setText("Usuario");
        lblUsuario.setPreferredSize(new java.awt.Dimension(100, 40));

        lblCodigo.setFont(new java.awt.Font("Poppins SemiBold", 1, 24)); // NOI18N
        lblCodigo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCodigo.setText("Código");
        lblCodigo.setPreferredSize(new java.awt.Dimension(100, 40));

        javax.swing.GroupLayout pnlSalaLayout = new javax.swing.GroupLayout(pnlSala);
        pnlSala.setLayout(pnlSalaLayout);
        pnlSalaLayout.setHorizontalGroup(
            pnlSalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSalaLayout.createSequentialGroup()
                .addGroup(pnlSalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSalaLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(pnlSalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnlSalaLayout.createSequentialGroup()
                                .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(lblLulu)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTitulo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblLulu1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(pnlContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 19, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSalaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnlSalaLayout.setVerticalGroup(
            pnlSalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSalaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnlSalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlSalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblTitulo)
                        .addGroup(pnlSalaLayout.createSequentialGroup()
                            .addComponent(lblLulu)
                            .addGap(8, 8, 8))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlSalaLayout.createSequentialGroup()
                            .addGap(8, 8, 8)
                            .addComponent(lblLulu1)))
                    .addGroup(pnlSalaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlSalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(4, 4, 4)
                .addComponent(pnlContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
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
        frmMenu frame = frmMenu.getInstance();
        frame.setVisible(true);
        dispose();
        timer.stop();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnIzqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzqActionPerformed
        indice--;
        mostrarImagen();
        String url = obtenerNombreImagen(lblIcon1);
        try {
            mandarAvatar(url);
            System.out.println(url+" frame");
        } catch (Exception ex) {
            Logger.getLogger(frmSala.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnIzqActionPerformed

    private void btnDerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDerActionPerformed
        indice++;
        mostrarImagen();
        String url = obtenerNombreImagen(lblIcon1);
        try {
            mandarAvatar(url);
        } catch (Exception ex) {
            Logger.getLogger(frmSala.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDerActionPerformed

    private void btnIniciarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarMousePressed
        if (btnIniciar.isEnabled()) {
            btnIniciar.setBackground(new Color(166, 145, 133));
        }
    }//GEN-LAST:event_btnIniciarMousePressed

    private void btnIniciarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarMouseReleased
        btnIniciar.setBackground(new Color(217, 203, 191));
    }//GEN-LAST:event_btnIniciarMouseReleased

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        try {
            mandarIconos();
            fachadaViewModel.cambiarTablero(cantJugadores, iconos);
        } catch (Exception ex) {
            Logger.getLogger(frmSala.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void btnDerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDerMousePressed
        if (btnDer.isEnabled()) {
            btnDer.setBackground(new Color(166, 145, 133));
        }
    }//GEN-LAST:event_btnDerMousePressed

    private void btnDerMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDerMouseReleased
        btnDer.setBackground(new Color(217, 203, 191));
    }//GEN-LAST:event_btnDerMouseReleased

    private void btnIzqMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIzqMousePressed
        if (btnIzq.isEnabled()) {
            btnIzq.setBackground(new Color(166, 145, 133));
        }
    }//GEN-LAST:event_btnIzqMousePressed

    private void btnIzqMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIzqMouseReleased
        btnIzq.setBackground(new Color(217, 203, 191));
    }//GEN-LAST:event_btnIzqMouseReleased

    private void configurarPaneles() {
        UIManager UI = new UIManager();
        UI.put("Panel.background", Color.decode("#59493F"));
        UI.put("OptionPane.messageFont", new Font("Poppins SemiBold", Font.BOLD, 24));
        UI.put("OptionPane.messageForeground", Color.decode("#FFFFFF"));
        UI.put("OptionPane.background", Color.decode("#59493F"));
        UI.put("Button.background", Color.decode("#D9CBBF"));
        UI.put("Button.font", new Font("Poppins SemiBold", Font.BOLD, 18));
        UI.put("Button.foreground", Color.decode("#000000"));
    }

    private void nombrarSala() {
        lblCodigo.setText(codigo);
    }

    private void colocarNombre() {
        lblUsuario.setText(nombre);
        lblJugador2.setText(jugador2);
        //System.out.println(jugador2);
    }

    public void actualizarVentana() {
        nombrarSala();
        colocarNombre();
        colocarJugadores();
    }

    public void configurarJugador2() {
        btnIniciar.setEnabled(false);
        pnlIcon1.setBackground(Color.decode("#30B856"));
        pnlIcon2.setBackground(Color.decode("#B13A3A"));
        System.out.println(icono2);
        if (icono2 != null) {
            System.out.println(icono2);
            lblIcon2.setIcon(new ImageIcon(getClass().getClassLoader().getResource(icono2)));
        }
    }

    public void colocarJugadores() {
        lblIcon3.setVisible(cantJugadores > 2);
        pnlIcon3.setVisible(cantJugadores > 2);
        lblJugador3.setVisible(cantJugadores > 2);

        lblIcon4.setVisible(cantJugadores == 4);
        pnlIcon4.setVisible(cantJugadores == 4);
        lblJugador4.setVisible(cantJugadores == 4);
    }

    private void mostrarImagen() {
        mandarIconos();
        if (indice < 0) {
            indice = obtenerImagenes().length - 1;
        } else if (indice >= obtenerImagenes().length) {
            indice = 0;
        }

        ImageIcon imagen = new ImageIcon(getClass().getClassLoader().getResource(obtenerImagenes()[indice]));

        lblIcon1.setIcon(imagen);
        iconos[0] = obtenerImagenes()[indice];
    }

    private void mandarIconos() {
        iconos = new String[cantJugadores];

        iconos[0] = obtenerNombreImagen(lblIcon1);
        iconos[1] = obtenerNombreImagen(lblIcon2);

        if (cantJugadores > 2) {
            iconos[2] = obtenerNombreImagen(lblIcon3);
        }

        if (cantJugadores == 4) {
            iconos[3] = obtenerNombreImagen(lblIcon4);
        }
    }

    private String obtenerNombreImagen(javax.swing.JLabel label) {
        ImageIcon icono = (ImageIcon) label.getIcon();

        String nombreImagen = null;
        if (icono != null) {
            String ruta = icono.getDescription();
            int index = ruta.lastIndexOf("/");
            if (index >= 0) {
                nombreImagen = ruta.substring(index + 1);
            }
        }

        return nombreImagen;
    }

    private String[] obtenerImagenes() {
        return new String[]{"lulu.png", "lulu2.png", "tyrael.png", "tyrael2.png"};
    }

    public static String getCodigo() {
        return codigo;
    }

    public static void setCodigo(String aCodigo) {
        codigo = aCodigo;
    }

    public static String getNombre() {
        return nombre;
    }

    public static void setNombre(String aNombre) {
        nombre = aNombre;
    }

    public static int getCantJugadores() {
        return cantJugadores;
    }

    public static void setCantJugadores(int aCantJugadores) {
        cantJugadores = aCantJugadores;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDer;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnIzq;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblIcon1;
    private javax.swing.JLabel lblIcon2;
    private javax.swing.JLabel lblIcon3;
    private javax.swing.JLabel lblIcon4;
    private javax.swing.JLabel lblIcono;
    private javax.swing.JLabel lblJugador2;
    private javax.swing.JLabel lblJugador3;
    private javax.swing.JLabel lblJugador4;
    private javax.swing.JLabel lblLulu;
    private javax.swing.JLabel lblLulu1;
    private javax.swing.JLabel lblSala;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel pnlContenedor;
    private javax.swing.JPanel pnlIcon1;
    private javax.swing.JPanel pnlIcon2;
    private javax.swing.JPanel pnlIcon3;
    private javax.swing.JPanel pnlIcon4;
    private javax.swing.JPanel pnlSala;
    // End of variables declaration//GEN-END:variables

    public String getJugador2() {
        return jugador2;
    }

    public void setJugador2(String jugador2) {
        this.jugador2 = jugador2;
    }

    public String getJugador3() {
        return jugador3;
    }

    public void setJugador3(String jugador3) {
        this.jugador3 = jugador3;
    }

    public String getJugador4() {
        return jugador4;
    }

    public void setJugador4(String jugador4) {
        this.jugador4 = jugador4;
    }

    public String getIcono2() {
        return icono2;
    }

    public void setIcono2(String icono2) {
        this.icono2 = icono2;
    }

    public String getIcono3() {
        return icono3;
    }

    public void setIcono3(String icono3) {
        this.icono3 = icono3;
    }

    public String getIcono4() {
        return icono4;
    }

    public void setIcono4(String icono4) {
        this.icono4 = icono4;
    }

}
