/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itson.dominio;

import java.io.Serializable;

/**
 *
 * @author Equipo 6
 */
public class Sala implements Serializable {

    private static Sala sala;
    private String codigo;
    private int cantidadJugadores;
    private Jugador jugador;
    private Jugador jugador2;
    private Jugador jugador3;
    private Jugador jugador4;

    public static Sala getInstance() {
        if (Sala.sala == null) {
            Sala.sala = new Sala();
        }
        return Sala.sala;
    }

    public Sala() {
    }

    public Sala(String codigo, int cantidadJugadores, Jugador jugador) {
        this.codigo = codigo;
        this.cantidadJugadores = cantidadJugadores;
        this.jugador = jugador;
    }

    public Sala(int cantidadJugadores, Jugador jugador) {
        this.cantidadJugadores = cantidadJugadores;
        this.jugador = jugador;
    }

    public int getCantidadJugadores() {
        return cantidadJugadores;
    }

    public void setCantidadJugadores(int cantidadJugadores) {
        this.cantidadJugadores = cantidadJugadores;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Jugador getJugador2() {
        return jugador2;
    }

    public void setJugador2(Jugador jugador2) {
        this.jugador2 = jugador2;
    }

    public Jugador getJugador3() {
        return jugador3;
    }

    public void setJugador3(Jugador jugador3) {
        this.jugador3 = jugador3;
    }

    public Jugador getJugador4() {
        return jugador4;
    }

    public void setJugador4(Jugador jugador4) {
        this.jugador4 = jugador4;
    }

    @Override
    public String toString() {
        return "Sala{" + "codigo=" + codigo + ", cantidadJugadores=" + cantidadJugadores + ", jugador=" + jugador + ", jugador2=" + jugador2 + ", jugador3=" + jugador3 + ", jugador4=" + jugador4 + '}';
    }

}
