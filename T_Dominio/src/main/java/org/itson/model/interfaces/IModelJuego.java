/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.itson.model.interfaces;

//import org.itson.dominio.Juego;
//import org.itson.dominio.Jugador;
import com.itson.dominio.Juego;
import com.itson.dominio.Jugador;

/**
 *
 * @author ildex
 */
public interface IModelJuego {
    Juego crearJuego(String[][] jugadores) throws Exception;
    Jugador crearJugadores(String jugador) throws Exception;
}
