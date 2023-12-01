/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.itson.t_modelview.interfaces;


import com.itson.dominio.Cuadro;
import com.itson.dominio.Tablero;
import com.itson.dominio.Juego;

/**
 *
 * @author wikit
 */
public interface IViewModelJuego {

    Tablero crearTablero(int dimension) throws Exception;

    void asignarLineaACuadro(int fila, int columna, String orientacion, int turno) throws Exception;

    Juego crearJuego(String[][] nombres) throws Exception;
    
    Cuadro[][] getCuadros() throws Exception;
}
