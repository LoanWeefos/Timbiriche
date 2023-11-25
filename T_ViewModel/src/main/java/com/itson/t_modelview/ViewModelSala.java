/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itson.t_modelview;

import com.itson.t_modelview.interfaces.IViewModelSala;
import javax.swing.JFrame;
import org.itson.dominio.Jugador;
import org.itson.dominio.Sala;
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
        Sala sala = fachadaModel.crearSala(cantidadJugadores);
        Jugador jugador = fachadaModel.crearJugador(nombreJugador);
        if (sala != null) {
            if (jugador != null) {
                sala.setJugador(jugador);
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
}
