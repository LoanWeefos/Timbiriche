/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.model.facade;

//import org.itson.dominio.Juego;
//import org.itson.dominio.Jugador;
//import org.itson.dominio.Sala;
//import org.itson.dominio.Tablero;
import com.itson.dominio.Juego;
import com.itson.dominio.Jugador;
import com.itson.dominio.Sala;
import com.itson.dominio.Tablero;
import org.itson.model.factory.ModelFactory;
import org.itson.model.interfaces.IFachadaModel;
import org.itson.model.interfaces.IModelJuego;
import org.itson.model.interfaces.IModelJugador;
import org.itson.model.interfaces.IModelSala;
import org.itson.model.interfaces.IModelTablero;

/**
 *
 * @author ildex
 */
public class FachadaModel implements IFachadaModel {

    private final IModelSala modelSala;
    private final IModelJugador modelJugador;
    private final IModelTablero modelTablero;
    private final IModelJuego modelJuego;

    public FachadaModel() {
        this.modelSala = ModelFactory.getModelSala();
        this.modelJugador = ModelFactory.getModelJugador();
        this.modelTablero = ModelFactory.getModelTablero();
        this.modelJuego = ModelFactory.getModelJuego();
    }

    @Override
    public Sala crearSala(int cantidadJugadores) throws Exception {
        try {
            return this.modelSala.crearSala(cantidadJugadores);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Jugador crearJugador(String nombreJugador) throws Exception {
        try {
            return this.modelJugador.crearJugador(nombreJugador);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Tablero crearTablero(int dimension) throws Exception {
        try {
            return this.modelTablero.crearTablero(dimension);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Juego crearJuego(String[][] jugadores) throws Exception {
        try {
            return this.modelJuego.crearJuego(jugadores);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Jugador crearJugadores(String jugador) throws Exception {
        try {
            return this.modelJuego.crearJugadores(jugador);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public boolean unirseSala(String codigoSala) throws Exception {
        try {
            return this.modelSala.unirseSala(codigoSala);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Sala jalarSala() throws Exception {
        try {
            return this.modelSala.jalarSala();
        } catch (Exception e) {
            throw new Exception(e.getMessage());

        }
    }
}
