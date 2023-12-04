/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itson.t_modelview;

import com.itson.t_modelview.interfaces.IViewModelSala;
import javax.swing.JFrame;
import com.itson.dominio.Jugador;
import com.itson.dominio.Sala;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.itson.model.facade.FachadaModel;
import org.itson.model.interfaces.IFachadaModel;
import org.itson.t_views.frmJuego10x10;
import org.itson.t_views.frmJuego15x15;
import org.itson.t_views.frmJuego20x20;
import org.itson.t_views.frmMenu;
import org.itson.t_views.frmSala;

/**
 *
 * @author Equipo6
 */
public class ViewModelSala implements IViewModelSala {

    private static ViewModelSala viewModelSala;
    private final IFachadaModel fachadaModel;
    private Sala sala;
    private Jugador jugador;

    public ViewModelSala() {
        this.fachadaModel = new FachadaModel();
    }

    /**
     * Método que regresa una instancia de la clase. Usa el patrón Singleton.
     *
     * @return instancia de la clase.
     */
    public static ViewModelSala getInstance() {
        if (ViewModelSala.viewModelSala == null) {
            ViewModelSala.viewModelSala = new ViewModelSala();
        }
        return ViewModelSala.viewModelSala;
    }

    @Override
    public Sala crearSala(String nombreJugador, int cantidadJugadores) throws Exception {
        sala = Sala.getInstance();
        jugador = fachadaModel.crearJugador(nombreJugador);
        sala.setJugador(jugador);
        sala = fachadaModel.crearSala(cantidadJugadores);
        if (sala != null) {
            if (sala.getJugador() != null) {
                frmSala frame = frmSala.getInstance();
                frmMenu frameM = frmMenu.getInstance();
                frmSala.setNombre(sala.getJugador().getNombre());
                frmSala.setCodigo(sala.getCodigo());
                frmSala.setCantJugadores(sala.getCantidadJugadores());
                frame.actualizarVentana();
                frame.setVisible(true);
                frameM.dispose();
            }
        }
        return sala;
    }

    @Override
    public void unirseSala(String nombreJugador, String codigoSala) {
        try {
            System.out.println("VIEWMODEL 1");
            jugador = fachadaModel.crearJugador(nombreJugador);
            boolean seUnioASala = fachadaModel.unirseSala(codigoSala);
            System.out.println(seUnioASala + " SI LLEGA AL VIEW MODEL");
            if (seUnioASala) {
                System.out.println("entro if sala");
                sala = fachadaModel.jalarSala();
                sala.setJugador2(jugador);
                fachadaModel.mandarSala(sala);
                System.out.println("jala sala y setea jugador?");
                frmSala frame = frmSala.getInstance();
                frmMenu frameM = frmMenu.getInstance();
                frame.setNombre(nombreJugador);
                frame.setCodigo(codigoSala.toUpperCase());
                frame.setCantJugadores(sala.getCantidadJugadores());
                frame.actualizarVentana();
                frame.setVisible(true);
                frameM.dispose();
                System.out.println(sala.toString());
            }
        } catch (Exception e) {
            System.err.println("Error al intentar unirse a la sala: " + e.getMessage());
        }
    }

    @Override
    public void cambiarSalaMenu() throws Exception {
        frmSala frame = frmSala.getInstance();
        frmMenu frameM = frmMenu.getInstance();
        frameM.setVisible(true);
        frame.dispose();
    }

    @Override
    public void cambiarTablero(int cantJugadores, String[] iconos) throws Exception {
        frmSala frmS = frmSala.getInstance();
        switch (cantJugadores) {
            case 2 -> {
                frmJuego10x10 frm = frmJuego10x10.getInstance();
                frm.setJugadores(asignarJugadores(frmS.getNombre(), iconos));
                frm.asignarNombre();
                frm.asignarIconos();
                frm.setVisible(true);
            }
            case 3 -> {
                frmJuego15x15 frm = frmJuego15x15.getInstance();
                frm.setJugadores(asignarJugadores(frmS.getNombre(), iconos));
                frm.asignarNombre();
                frm.asignarIconos();
                frm.setVisible(true);
            }
            case 4 -> {
                frmJuego20x20 frm = frmJuego20x20.getInstance();
//                frm.setJugadores(asignarJugadores(frmS.getNombre(), iconos));
//                frm.asignarNombre();
                frm.setVisible(true);
            }
            default ->
                throw new AssertionError();
        }
        frmS.dispose();
    }

    @Override
    public void cambiarJuegoSala(JFrame tablero) throws Exception {
        frmSala frame = frmSala.getInstance();
        frame.setVisible(true);
        tablero.dispose();
    }

    private String[][] asignarJugadores(String nombre, String[] iconos) {
        String jugadores[][] = new String[3][2];
        jugadores[0][0] = nombre;
        for (int i = 0; i < iconos.length; i++) {
            jugadores[i][1] = iconos[i];
        }
        return jugadores;
    }

    @Override
    public boolean actualizarSala() throws Exception {
        if (!sala.equals(fachadaModel.jalarSala())) {
            sala = fachadaModel.jalarSala();
            return true;
        }
        return false;
    }

    @Override
    public void actualizarDatosSala() {
        frmSala frame = frmSala.getInstance();
        Jugador j1 = sala.getJugador();
        Jugador j2 = sala.getJugador2();
        if (jugador.equals(j1) && j2 != null) {
            frame.setJugador2(j2.getNombre());
        } else if (jugador.equals(j2)) {
            frame.setJugador2(j1.getNombre());
            frame.configurarJugador2();
        }
        frame.actualizarVentana();
    }

    @Override
    public void actualizarAvatar(String avatar) throws Exception {
        Jugador j1 = sala.getJugador();
        Jugador j2 = sala.getJugador2();
        if (jugador.equals(j1) && j2 != null) {
            jugador.setAvatar(avatar);
            sala.setJugador(jugador);
            fachadaModel.mandarSala(sala);
        } else if (jugador.equals(j2)) {
            jugador.setAvatar(avatar);
            System.out.println(jugador + " JUGADOR ACUTALIZAR AVATAR");
            System.out.println(avatar + "AVATAR DEL ACTYUALIZATR AVATAR");
            sala.setJugador2(jugador);
            fachadaModel.mandarSala(sala);
            System.out.println(fachadaModel.jalarSala()+" SALA ACTUALIZAR PT 1 DESPUES DE MANDAR");
            System.out.println(sala + " SALA DEL ACTUALIZAR AVATAR");
        }
    }

    @Override
    public void actualizarIcono() {
        frmSala frame = frmSala.getInstance();
        try {
            sala = fachadaModel.jalarSala();
            Jugador j1 = sala.getJugador();
            Jugador j2 = sala.getJugador2();
            System.out.println(sala + " SALA ICONO?");
            if (jugador.equals(j1) && j2 != null) {
                frame.setIcono2(j2.getAvatar());
            } else if (jugador.equals(j2)) {
                frame.setIcono2(j1.getAvatar());
                frame.configurarJugador2();
            }
            frame.actualizarVentana();
        } catch (Exception ex) {
            Logger.getLogger(ViewModelSala.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
