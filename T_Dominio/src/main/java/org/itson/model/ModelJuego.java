/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.model;

//import org.itson.dominio.Juego;
//import org.itson.dominio.Jugador;
import org.itson.model.interfaces.IModelJuego;
import com.itson.dominio.Juego;
import com.itson.dominio.Jugador;

/**
 *
 * @author ildex
 */
public class ModelJuego implements IModelJuego {

    private static ModelJuego modelJuego;

    /**
     * Método que regresa una instancia de la clase. Usa el patrón Singleton.
     *
     * @return instancia de la clase.
     */
    public static ModelJuego getInstance() {
        if (ModelJuego.modelJuego == null) {
            ModelJuego.modelJuego = new ModelJuego();
        }
        return ModelJuego.modelJuego;
    }

    @Override
    public Juego crearJuego(String[][] jugadores) throws Exception {
        Juego juego = new Juego();
        Jugador[] lista = new Jugador[jugadores.length];
        for (int i = 0; i < jugadores.length; i++) {
            lista[i] = modelJuego.crearJugadores(jugadores[i][0]);
            lista[i].setAvatar(jugadores[i][1]);
        }
        juego.setJugadores(lista);
        return juego;
    }

    @Override
    public Jugador crearJugadores(String nombre) throws Exception {
        return new Jugador(nombre);
    }
}
