/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itson.t_modelview;

import org.itson.model.facade.FachadaModel;
import org.itson.model.interfaces.IFachadaModel;
import org.itson.t_views.frmInicio;
import org.itson.t_views.frmMenu;
import com.itson.t_modelview.interfaces.IViewModelJuego;
import org.itson.dominio.Cuadro;
import org.itson.dominio.Linea;
import org.itson.dominio.Posicion;
import org.itson.dominio.Tablero;
import org.itson.dominio.Juego;
import org.itson.dominio.Jugador;
import org.itson.t_views.frmJuego10x10;
import org.itson.t_views.frmJuego15x15;
import org.itson.t_views.frmSala;

/**
 *
 * @author wikit
 */
public class ViewModelJuego implements IViewModelJuego {

    private static ViewModelJuego viewModelJuego;
    private final IFachadaModel fachadaModel;
    private Tablero tablero = null;
    private Juego juego = null;

    public ViewModelJuego() {
        this.fachadaModel = new FachadaModel();
    }

    /**
     * Método que regresa una instancia de la clase. Usa el patrón Singleton.
     *
     * @return instancia de la clase.
     */
    public static ViewModelJuego getInstance() {
        if (ViewModelJuego.viewModelJuego == null) {
            ViewModelJuego.viewModelJuego = new ViewModelJuego();
        }
        return ViewModelJuego.viewModelJuego;
    }

    @Override
    public Tablero crearTablero(int dimension) throws Exception {
        tablero = fachadaModel.crearTablero(dimension);
        return tablero;
    }

    @Override
    public Juego crearJuego(String[][] jugadores) throws Exception {
        juego = fachadaModel.crearJuego(jugadores);
        return juego;
    }

    @Override
    public void asignarLineaACuadro(int fila, int columna, String orientacion, int turno) throws Exception {
        Cuadro[][] cuadros = tablero.getCuadros();
        if (orientacion.equals("1")) {
            if (fila > 0) {
                cuadros[fila - 1][columna].setInferior(new Linea(fila, columna, Posicion.HORIZONTAL));
                procesarLinea(cuadros[fila - 1][columna], turno);
            }

            if (fila < 10) {
                cuadros[fila][columna].setSuperior(new Linea(fila + 1, columna, Posicion.HORIZONTAL));
                procesarLinea(cuadros[fila][columna], turno);
            }
        } else if (orientacion.equals("2")) {
            if (columna > 0) {
                cuadros[fila][columna - 1].setDerecha(new Linea(fila, columna, Posicion.VERTICAL));
                procesarLinea(cuadros[fila][columna - 1], turno);
            }

            if (columna < 9) {
                cuadros[fila][columna].setIzquierda(new Linea(fila, columna + 1, Posicion.VERTICAL));
                procesarLinea(cuadros[fila][columna], turno);
            }
        }
        tablero.setCuadros(cuadros);
    }

    public boolean comprobarCuadroCompleto(Cuadro cuadro) {
        Linea superior = cuadro.getSuperior();
        Linea inferior = cuadro.getInferior();
        Linea izquierda = cuadro.getIzquierda();
        Linea derecha = cuadro.getDerecha();

        return (superior != null && inferior != null && izquierda != null && derecha != null);
    }

    public void darPuntos(int turno) {
        Jugador[] jugadores = juego.getJugadores();
        Jugador jugador = jugadores[turno - 1];
        jugador.setPuntaje(jugador.getPuntaje() + 1);
        jugadores[turno - 1] = jugador;
        juego.setJugadores(jugadores);
    }

    public void procesarLinea(Cuadro cuadro, int turno) {
        if (comprobarCuadroCompleto(cuadro)) {
            cuadro.setCompleto(true);
            darPuntos(turno);
            switch (tablero.getDimension()) {
                case 10:
                    frmJuego10x10 frame1 = frmJuego10x10.getInstance();
                    frame1.actualizarPuntos(turno);
                    break;

                case 15:
                    frmJuego15x15 frame2 = frmJuego15x15.getInstance();
                    frame2.actualizarPuntos(turno);
                    break;
                            
//                case 20:
//                    frmJuego20x20 frame3 = frmJuego20x20.getInstance();
//                    frame3.actualizarPuntos(turno);
//                    break;
//                default:
//                    throw new AssertionError();
            }
        }
    }

    @Override
    public Cuadro[][] getCuadros() throws Exception {
        return tablero.getCuadros();
    }
}
