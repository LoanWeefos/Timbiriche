/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.model;

import org.itson.dominio.Jugador;
import org.itson.model.interfaces.IModelJugador;


/**
 *
 * @author ildex
 */
public class ModelJugador implements IModelJugador {

    private static ModelJugador modelJugador;

    /**
     * Método que regresa una instancia de la clase. Usa el patrón Singleton.
     *
     * @return instancia de la clase.
     */
    public static ModelJugador getInstance() {
        if (ModelJugador.modelJugador == null) {
            ModelJugador.modelJugador = new ModelJugador();
        }
        return ModelJugador.modelJugador;
    }

    @Override
    public Jugador crearJugador(String nombreJugador) throws Exception {
        return new Jugador(nombreJugador);
    }
}
