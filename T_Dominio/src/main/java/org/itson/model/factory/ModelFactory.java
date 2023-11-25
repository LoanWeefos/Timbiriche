/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.model.factory;

import org.itson.model.ModelJuego;
import org.itson.model.ModelJugador;
import org.itson.model.ModelSala;
import org.itson.model.ModelTablero;
import org.itson.model.interfaces.IModelJuego;
import org.itson.model.interfaces.IModelJugador;
import org.itson.model.interfaces.IModelSala;
import org.itson.model.interfaces.IModelTablero;

/**
 *
 * @author ildex
 */
public final class ModelFactory {

    /**
     * Método que regresa una instancia de ModelSala
     *
     * @return instancia de ModelSala
     */
    public static IModelSala getModelSala() {
        return ModelSala.getInstance();
    }
    
    /**
     * Método que regresa una instancia de ModelJugador
     *
     * @return instancia de ModelJugador
     */
    public static IModelJugador getModelJugador() {
        return ModelJugador.getInstance();
    }
    
    /**
     * Método que regresa una instancia de ModelTablero
     *
     * @return instancia de ModelTablero
     */
    public static IModelTablero getModelTablero() {
        return ModelTablero.getInstance();
    }
    
    /**
     * Método que regresa una instancia de ModelTablero
     *
     * @return instancia de ModelTablero
     */
    public static IModelJuego getModelJuego() {
        return ModelJuego.getInstance();
    }

}
