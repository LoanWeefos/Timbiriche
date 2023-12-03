/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.itson.t_modelview.interfaces;

import javax.swing.JFrame;
import com.itson.dominio.Sala;

/**
 *
 * @author ildex
 */
public interface IViewModelSala {
    
    Sala crearSala(String nombreJugador, int cantidadJugadores) throws Exception;
    void unirseSala(String nombreJugador, String codigoSala) throws Exception;
    void cambiarSalaMenu() throws Exception;
    void cambiarTablero(int cantJugadores, String[] iconos) throws Exception;
    void cambiarJuegoSala(JFrame tablero) throws Exception;
}
