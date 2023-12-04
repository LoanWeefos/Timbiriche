/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itson.compartidos;

import java.io.Serializable;

/**
 *
 * @author xeron
 */
public class SolicitudDTO implements Serializable {

    private final String solicitud;
    private Object objeto;
    private String codigo;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public SolicitudDTO(String solicitud, Object objeto) {
        this.solicitud = solicitud;
        this.objeto = objeto;
    }

    public SolicitudDTO(String solicitud, String codigo) {
        this.solicitud = solicitud;
        this.codigo = codigo;
    }

    public SolicitudDTO(String solicitud, Object objeto, String codigo) {
        this.solicitud = solicitud;
        this.objeto = objeto;
        this.codigo = codigo;
    }

    public SolicitudDTO(String solicitud) {
        this.solicitud = solicitud;
    }

    public String getSolicitud() {
        return solicitud;
    }

    public Object getObjeto() {
        return objeto;
    }

    @Override
    public String toString() {
        return "SolicitudDTO{" + "solicitud=" + solicitud + ", objeto=" + objeto + ", codigo=" + codigo + '}';
    }

}
