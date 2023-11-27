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
public class SolicitudDTO implements Serializable{
    private final String solicitud;
    private Object objeto;
    private String codigo;
    
    
    public SolicitudDTO(String solicitud, Object objeto) {
        this.solicitud = solicitud;
        this.objeto = objeto;
    }

    public SolicitudDTO(String solicitud, String codigo) {
        this.solicitud = solicitud;
        this.codigo = codigo;
    }
    
    public String getSolicitud() {
        return solicitud;
    }

    public Object getObjeto() {
        return objeto;
    }
    
}

