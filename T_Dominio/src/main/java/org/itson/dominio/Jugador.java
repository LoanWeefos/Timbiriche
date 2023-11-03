/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.dominio;

/**
 *
 * @author Equipo 6
 */
public class Jugador {

    private String nombre;
    private String avatar;
    private int puntaje;

    public Jugador() {

    }

    public Jugador(String nombre, String avatar, int puntaje) {
        this.nombre = nombre;
        this.avatar = avatar;
        this.puntaje = puntaje;
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

}
