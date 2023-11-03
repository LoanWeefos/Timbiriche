/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.dominio;

/**
 *
 * @author Equipo 6
 */
public class Sala {

    private Tablero tablero;
    private Juego juego;
    private String codigo;

    public Sala() {
    }

    public Sala(Tablero tablero, Juego juego, String codigo) {
        this.tablero = tablero;
        this.juego = juego;
        this.codigo = codigo;
    }

    public Tablero getTablero() {
        return tablero;
    }

    public void setTablero(Tablero tablero) {
        this.tablero = tablero;
    }

    public Juego getJuego() {
        return juego;
    }

    public void setJuego(Juego juego) {
        this.juego = juego;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Sala{" + "tablero=" + tablero + ", juego=" + juego + ", codigo=" + codigo + '}';
    }

}
