/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itson.t_modelview.facade;

import com.itson.t_modelview.factory.ViewModelFactory;
import com.itson.t_modelview.interfaces.IFachadaViewModel;
import com.itson.t_modelview.interfaces.IViewModelInicio;
import com.itson.t_modelview.interfaces.IViewModelJuego;
import com.itson.t_modelview.interfaces.IViewModelSala;
import javax.swing.JFrame;
import org.itson.dominio.Cuadro;
import org.itson.dominio.Juego;
import org.itson.dominio.Sala;
import org.itson.dominio.Tablero;

/**
 *
 * @author ildex
 */
public final class FachadaViewModel implements IFachadaViewModel {

    private final IViewModelSala viewModelSala;
    private final IViewModelInicio viewModelInicio;
    private final IViewModelJuego viewModelJuego;

    public FachadaViewModel() {
        this.viewModelSala = ViewModelFactory.getViewModelSala();
        this.viewModelInicio = ViewModelFactory.getViewModelInicio();
        this.viewModelJuego = ViewModelFactory.getViewModelJuego();
    }

    @Override
    public Sala crearSala(String nombreJugador, int cantidadJugadores) throws Exception {
        try {
            return this.viewModelSala.crearSala(nombreJugador, cantidadJugadores);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public void cambiarInicioMenu() throws Exception {
        try {
            this.viewModelInicio.cambiarInicioMenu();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public void cambiarMenuInicio() throws Exception {
        try {
            this.viewModelInicio.cambiarMenuInicio();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public void cambiarSalaMenu() throws Exception {
        try {
            this.viewModelSala.cambiarSalaMenu();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public void cambiarTablero(int cantJugadores, String[] iconos) throws Exception {
        try {
            this.viewModelSala.cambiarTablero(cantJugadores, iconos);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public void cambiarJuegoSala(JFrame tablero) throws Exception {
        try {
            this.viewModelSala.cambiarJuegoSala(tablero);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Tablero crearTablero(int dimension) throws Exception {
        try {
            return this.viewModelJuego.crearTablero(dimension);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public void asignarLineaACuadro(int fila, int columna, String orientacion, int turno) throws Exception {
        try {
            this.viewModelJuego.asignarLineaACuadro(fila, columna, orientacion, turno);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Juego crearJuego(String[][] jugadores) throws Exception {
        try {
            return this.viewModelJuego.crearJuego(jugadores);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
    
    @Override
    public Cuadro[][] getCuadros() throws Exception {
        try {
            return this.viewModelJuego.getCuadros();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public void unirseSala(String nombreJugador, String codigoSala) throws Exception {
        try {
            this.viewModelSala.unirseSala();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
