/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itson.t_modelview.facade;

import com.itson.t_modelview.factory.ViewModelFactory;
import com.itson.t_modelview.interfaces.IFachadaViewModel;
import com.itson.t_modelview.interfaces.IViewModelSala;
import org.itson.dominio.Sala;

/**
 *
 * @author ildex
 */
public final class FachadaViewModel implements IFachadaViewModel {

    private final IViewModelSala viewModelSala;

    public FachadaViewModel() {
        this.viewModelSala = ViewModelFactory.getViewModelSala();
    }

    @Override
    public Sala crearSala(Sala sala) throws Exception {
        try {
            return this.viewModelSala.crearSala(sala);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

}
