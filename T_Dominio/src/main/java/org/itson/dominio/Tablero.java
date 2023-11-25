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
    private Cuadro[][] cuadros;

    public Tablero() {
    }

    public Tablero(int dimension, Cuadro[][] cuadros) {
        this.dimension = dimension;
        this.cuadros = cuadros;
    }

    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }

    public Cuadro[][] getCuadros() {
        return cuadros;
    }

    public void setCuadros(Cuadro[][] cuadros) {
        this.cuadros = cuadros;
    }

    public void generarCuadros() {
        cuadros = new Cuadro[dimension - 1][dimension - 1];
        for (int fila = 0; fila < dimension - 1; fila++) {
            for (int columna = 0; columna < dimension - 1; columna++) {
                cuadros[fila][columna] = new Cuadro();
            }
        }
    }

    @Override
    public String toString() {
        return "Tablero{" + "dimension=" + dimension + ", cuadros=" + cuadros + '}';
    }

}
