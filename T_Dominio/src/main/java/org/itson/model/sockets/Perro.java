/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.model.sockets;

import java.io.Serializable;

/**
 *
 * @author xeron
 */
public class Perro implements Serializable {

    String raza;
    int edad;
    String color;

    public Perro(String raza, int edad, String color) {
        this.raza = raza;
        this.edad = edad;
        this.color = color;
    }

    public Perro() {
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Perro{");
        sb.append("raza=").append(raza);
        sb.append(", edad=").append(edad);
        sb.append(", color=").append(color);
        sb.append('}');
        return sb.toString();
    }

}
