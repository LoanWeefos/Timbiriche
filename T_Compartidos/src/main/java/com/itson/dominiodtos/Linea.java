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
public class Linea implements Serializable{
    private int x;
    private int y;
    private Posicion posicion;

    public Linea() {
    }

    public Linea(int x, int y, Posicion posicion) {
        this.x = x;
        this.y = y;
        this.posicion = posicion;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    @Override
    public String toString() {
        return "Linea{" + "x=" + x + ", y=" + y + ", posicion=" + posicion + '}';
    }
    
    
}
