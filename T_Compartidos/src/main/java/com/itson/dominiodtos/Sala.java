/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itson.dominiodtos;

import java.io.Serializable;

/**
 *
 * @author Equipo 6
 */
public class Sala implements Serializable{

    private String codigo;
    private int cantidadJugadores;
    private Jugador jugador;

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

    @Override
    public String toString() {
        return "Sala{" + "codigo=" + codigo + ", cantidadJugadores=" + cantidadJugadores + ", jugador=" + jugador + '}';
    }

}
