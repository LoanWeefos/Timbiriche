/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.dominio;

/**
 *
 * @author Equipo 6
 */
public class Tablero {

    private int dimension;
    private Cuadro cuadros;

    public Tablero() {
    }

    public Tablero(int dimension, Cuadro cuadros) {
        this.dimension = dimension;
        this.cuadros = cuadros;
    }

    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }

    public Cuadro getCuadros() {
        return cuadros;
    }

    public void setCuadros(Cuadro cuadros) {
        this.cuadros = cuadros;
    }

    @Override
    public String toString() {
        return "Tablero{" + "dimension=" + dimension + ", cuadros=" + cuadros + '}';
    }

}
