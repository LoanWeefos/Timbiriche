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
public class Juego implements Serializable{

    private int siguiente;
    private Jugador[] jugadores;
    private Long tiempo;

    public Juego() {
    }

    public Juego(int siguiente, Jugador[] jugadores, Long tiempo) {
        this.siguiente = siguiente;
        this.jugadores = jugadores;
        this.tiempo = tiempo;
    }

    public int getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(int siguiente) {
        this.siguiente = siguiente;
    }

    public Jugador[] getJugadores() {
        return jugadores;
    }

    public void setJugadores(Jugador[] jugadores) {
        this.jugadores = jugadores;
    }

    public Long getTiempo() {
        return tiempo;
    }

    public void setTiempo(Long tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public String toString() {
        return "Juego{" + "siguiente=" + siguiente + ", jugadores=" + jugadores + ", tiempo=" + tiempo + '}';
    }

}
