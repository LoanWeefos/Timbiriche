/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.itson.t_modelview.interfaces;

import javax.swing.JFrame;
import org.itson.dominio.Cuadro;
import org.itson.dominio.Juego;
import org.itson.dominio.Sala;
import org.itson.dominio.Tablero;

/**
 *
 * @author ildex
 */
public interface IFachadaViewModel {
    
    Sala crearSala(String nombreJugador, int cantidadJugadores) throws Exception;
    void cambiarInicioMenu() throws Exception;
    void unirseSala(String nombreJugador, String codigoSala) throws Exception;
    void cambiarMenuInicio() throws Exception;
    void cambiarSalaMenu() throws Exception;
    void cambiarTablero(int cantJugadores, String[] iconos) throws Exception;
    void cambiarJuegoSala(JFrame tablero) throws Exception;
    Tablero crearTablero(int dimension) throws Exception;
    void asignarLineaACuadro(int fila, int columna, String orientacion, int turno) throws Exception;
    Juego crearJuego(String[][] jugadores) throws Exception;
    Cuadro[][] getCuadros() throws Exception;
}
