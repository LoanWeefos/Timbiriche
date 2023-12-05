/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itson.dominio;

import java.io.Serializable;
import java.util.Random;

/**
 *
 * @author Equipo 6
 */
public class Jugador implements Serializable {

    private static final int DIGITOS_ID = 4;

    private int id;
    private String nombre;
    private String avatar;
    private int puntaje;

    public Jugador() {
        this.id = generarIdAleatorio();
    }

    public Jugador(String nombre, String avatar, int puntaje) {
        this.id = generarIdAleatorio();
        this.nombre = nombre;
        this.avatar = avatar;
        this.puntaje = puntaje;
    }

    public Jugador(String nombre) {
        this.id = generarIdAleatorio();
        this.nombre = nombre;
        this.avatar = "";
    }

    private int generarIdAleatorio() {
        Random random = new Random();
        int min = (int) Math.pow(10, DIGITOS_ID - 1);
        int max = (int) Math.pow(10, DIGITOS_ID) - 1;
        return random.nextInt(max - min + 1) + min;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", avatar=" + avatar + ", puntaje=" + puntaje + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Jugador other = (Jugador) obj;
        return this.id == other.id;
    }

}
