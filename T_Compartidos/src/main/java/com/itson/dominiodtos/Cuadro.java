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
public class Cuadro implements Serializable {

    private Linea superior;
    private Linea inferior;
    private Linea izquierda;
    private Linea derecha;
    private boolean completo;

    public Cuadro(Linea superior, Linea inferior, Linea izquierda, Linea derecha, boolean completo) {
        this.superior = superior;
        this.inferior = inferior;
        this.izquierda = izquierda;
        this.derecha = derecha;
        this.completo = completo;
    }

    public Cuadro() {
    }

    public Linea getSuperior() {
        return superior;
    }

    public void setSuperior(Linea superior) {
        this.superior = superior;
    }

    public Linea getInferior() {
        return inferior;
    }

    public void setInferior(Linea inferior) {
        this.inferior = inferior;
    }

    public Linea getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(Linea izquierda) {
        this.izquierda = izquierda;
    }

    public Linea getDerecha() {
        return derecha;
    }

    public void setDerecha(Linea derecha) {
        this.derecha = derecha;
    }

    public boolean isCompleto() {
        return completo;
    }

    public void setCompleto(boolean completo) {
        this.completo = completo;
    }

    @Override
    public String toString() {
        return "Cuadro{" + "superior=" + superior + ", inferior=" + inferior + ", izquierda=" + izquierda + ", derecha=" + derecha + ", completo=" + completo + '}';
    }

}
