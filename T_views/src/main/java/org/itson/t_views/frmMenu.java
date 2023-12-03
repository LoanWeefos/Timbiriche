/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.itson.t_views;

import com.itson.t_modelview.facade.FachadaViewModel;
import com.itson.t_modelview.interfaces.IFachadaViewModel;
import java.awt.Color;
import java.awt.Font;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import org.jdesktop.swingx.prompt.PromptSupport;

/**
 *
 * @author Equipo6
 */
public class frmMenu extends javax.swing.JFrame {

    // Instancia única del Singleton
    private static frmMenu instance = null;
    private final IFachadaViewModel fachadaViewModel;

    // Constructor privado para evitar instanciación directa
    private frmMenu() {
        this.fachadaViewModel = new FachadaViewModel();
        initComponents();
        validarTamanioNombre();
        configurarPaneles();
        colocarPlaceholder();
    }

    // Método para obtener la instancia del Singleton
    public static frmMenu getInstance() {
        if (instance == null) {
            instance = new frmMenu();
        }
        return instance;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFondo = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        btnCrear = new javax.swing.JButton();
        lblLulu = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        lblLulu1 = new javax.swing.JLabel();
        btnUnirse = new javax.swing.JButton();
        lblUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        pnlFondo.setBackground(new java.awt.Color(216, 227, 242));
        pnlFondo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

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

        btnCrear.setBackground(new java.awt.Color(217, 203, 191));
        btnCrear.setFont(new java.awt.Font("Poppins SemiBold", 1, 24)); // NOI18N
        btnCrear.setText("Crear");
        btnCrear.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCrear.setContentAreaFilled(false);
        btnCrear.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCrear.setEnabled(false);
        btnCrear.setFocusPainted(false);
        btnCrear.setFocusable(false);
        btnCrear.setOpaque(true);
        btnCrear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCrearMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnCrearMouseReleased(evt);
            }
        });
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

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

        btnUnirse.setBackground(new java.awt.Color(217, 203, 191));
        btnUnirse.setFont(new java.awt.Font("Poppins SemiBold", 1, 24)); // NOI18N
        btnUnirse.setText("Unirse");
        btnUnirse.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnUnirse.setContentAreaFilled(false);
        btnUnirse.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnUnirse.setEnabled(false);
        btnUnirse.setFocusPainted(false);
        btnUnirse.setFocusable(false);
        btnUnirse.setOpaque(true);
        btnUnirse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnUnirseMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnUnirseMouseReleased(evt);
            }
        });
        btnUnirse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnirseActionPerformed(evt);
            }
        });

        lblUsuario.setFont(new java.awt.Font("Poppins SemiBold", 1, 24)); // NOI18N
        lblUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsuario.setText("Usuario");
        lblUsuario.setPreferredSize(new java.awt.Dimension(100, 40));

        txtUsuario.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        txtUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pnlFondoLayout = new javax.swing.GroupLayout(pnlFondo);
        pnlFondo.setLayout(pnlFondoLayout);
        pnlFondoLayout.setHorizontalGroup(
            pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFondoLayout.createSequentialGroup()
                .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFondoLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlFondoLayout.createSequentialGroup()
                        .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlFondoLayout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(100, 100, 100)
                                .addComponent(btnUnirse, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlFondoLayout.createSequentialGroup()
                                .addGap(350, 350, 350)
                                .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlFondoLayout.createSequentialGroup()
                                .addGap(262, 262, 262)
                                .addComponent(lblLulu)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTitulo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblLulu1)))
                        .addGap(0, 94, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(pnlFondoLayout.createSequentialGroup()
                .addGap(225, 225, 225)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlFondoLayout.setVerticalGroup(
            pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTitulo)
                    .addGroup(pnlFondoLayout.createSequentialGroup()
                        .addComponent(lblLulu)
                        .addGap(8, 8, 8))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlFondoLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(lblLulu1)))
                .addGap(70, 70, 70)
                .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtUsuario)
                .addGap(129, 129, 129)
                .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUnirse, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(90, 90, 90))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnCrearMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearMousePressed
        if (btnCrear.isEnabled()) {
            btnCrear.setBackground(new Color(166, 145, 133));
        }
    }//GEN-LAST:event_btnCrearMousePressed

    private void btnCrearMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearMouseReleased
        btnCrear.setBackground(new Color(217, 203, 191));
    }//GEN-LAST:event_btnCrearMouseReleased

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        try {
            crearSala();
        } catch (Exception ex) {
            Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        try {
            fachadaViewModel.cambiarMenuInicio();
        } catch (Exception ex) {
            Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnUnirseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUnirseMousePressed
        if (btnUnirse.isEnabled()) {
            btnUnirse.setBackground(new Color(166, 145, 133));
        }
    }//GEN-LAST:event_btnUnirseMousePressed

    private void btnUnirseMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUnirseMouseReleased
        btnUnirse.setBackground(new Color(217, 203, 191));
    }//GEN-LAST:event_btnUnirseMouseReleased

    private void btnUnirseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnirseActionPerformed
        try {
            unirseSala();
        } catch (Exception ex) {
            Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnUnirseActionPerformed

    private void txtUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyTyped
        validarNombreUsuario(evt);
    }//GEN-LAST:event_txtUsuarioKeyTyped

    private void txtUsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyReleased
        validarTamanioNombre();
    }//GEN-LAST:event_txtUsuarioKeyReleased

    private void validarTamanioNombre() {
        if (txtUsuario.getText().length() >= 3 && !txtUsuario.getText().isBlank()) {
            btnCrear.setEnabled(true);
            btnUnirse.setEnabled(true);
        } else {
            btnCrear.setEnabled(false);
            btnUnirse.setEnabled(false);
        }
    }

    private void validarNombreUsuario(java.awt.event.KeyEvent evt) {
        char c = evt.getKeyChar();
        if (c == ' ') {
            evt.consume();
        } else if (txtUsuario.getText().length() >= 10) {
            evt.consume();
        }
    }

    private int preguntarTamanioSala() {
        Icon icono = new ImageIcon(getClass().getClassLoader().getResource("lulu.png"));
        Object[] opciones = {2, 3, 4};
        int jugadores = JOptionPane.showOptionDialog(
                null,
                "Seleccione la cantidad de jugadores:",
                "Crear sala",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                icono,
                opciones,
                JOptionPane.CLOSED_OPTION
        );
        if (jugadores >= 0) {
            return (int) opciones[jugadores];
        } else {
            return 0;
        }
    }

    private String preguntarCodigoSala() {
        Icon icono = new ImageIcon(getClass().getClassLoader().getResource("lulu.png"));
        return (String) JOptionPane.showInputDialog(
                null,
                "Ingrese el código de sala:",
                "Unirse a sala",
                JOptionPane.QUESTION_MESSAGE,
                icono,
                null,
                null
        );
    }

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

    private void colocarPlaceholder() {
        PromptSupport.init("Ingresa tu nombre", Color.LIGHT_GRAY, Color.WHITE, txtUsuario);
        PromptSupport.setFocusBehavior(PromptSupport.FocusBehavior.SHOW_PROMPT, txtUsuario);
    }

    private void crearSala() throws Exception {
        String nombreJugador = txtUsuario.getText();
        int cantidadJugadores = preguntarTamanioSala();
        if (cantidadJugadores != JOptionPane.CLOSED_OPTION) {
            fachadaViewModel.crearSala(nombreJugador, cantidadJugadores);
        }
    }

    private void unirseSala() throws Exception {
        String nombreJugador = txtUsuario.getText();
        String codigoSala = preguntarCodigoSala();
        fachadaViewModel.unirseSala(nombreJugador, codigoSala);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnUnirse;
    private javax.swing.JLabel lblLulu;
    private javax.swing.JLabel lblLulu1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel pnlFondo;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
