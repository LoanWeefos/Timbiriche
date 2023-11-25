/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itson.t_modelview.factory;

import com.itson.t_modelview.ViewModelInicio;
import com.itson.t_modelview.ViewModelSala;
import com.itson.t_modelview.ViewModelJuego;
import com.itson.t_modelview.interfaces.IViewModelInicio;
import com.itson.t_modelview.interfaces.IViewModelJuego;
import com.itson.t_modelview.interfaces.IViewModelSala;

/**
 *
 * @author ildex
 */
public final class ViewModelFactory {
    
    /**
     * Método que regresa una instancia de ViewModelSala
     * 
     * @return instancia de ViewModelSala
     */
    public static IViewModelSala getViewModelSala(){
        return ViewModelSala.getInstance();
    }
    
    public static IViewModelInicio getViewModelInicio(){
        return ViewModelInicio.getInstance();
    }
    
    public static IViewModelJuego getViewModelJuego(){
        return ViewModelJuego.getInstance();
    }
}
