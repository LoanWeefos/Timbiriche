/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.itson.model.interfaces;

import org.itson.dominio.Juego;
import org.itson.dominio.Jugador;
import org.itson.dominio.Sala;
import org.itson.dominio.Tablero;

/**
 *
 * @author ildex
 */
public interface IFachadaModel {

    Sala crearSala(int cantidadJugadores) throws Exception;
    Jugador crearJugador(String nombreJugador) throws Exception;
    Tablero crearTablero(int dimension) throws Exception;
    Juego crearJuego(String[][] jugadores) throws Exception;
    Jugador crearJugadores(String jugador) throws Exception;
}
