/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itson.t_modelview;

import org.itson.model.facade.FachadaModel;
import org.itson.model.interfaces.IFachadaModel;
import org.itson.t_views.frmInicio;
import org.itson.t_views.frmMenu;
import com.itson.t_modelview.interfaces.IViewModelInicio;

/**
 *
 * @author wikit
 */
public class ViewModelInicio implements IViewModelInicio{

    private static ViewModelInicio viewModelInicio;
    private final IFachadaModel fachadaModel;

    public ViewModelInicio() {
        this.fachadaModel = new FachadaModel();
    }

    /**
     * Método que regresa una instancia de la clase. Usa el patrón Singleton.
     *
     * @return instancia de la clase.
     */
    public static ViewModelInicio getInstance() {
        if (ViewModelInicio.viewModelInicio == null) {
            ViewModelInicio.viewModelInicio = new ViewModelInicio();
        }
        return ViewModelInicio.viewModelInicio;
    }

    @Override
    public void cambiarInicioMenu() throws Exception {
        frmInicio frame = frmInicio.getInstance();
        frmMenu frameM = frmMenu.getInstance();
        frameM.setVisible(true);
        frame.dispose();
    }
    
    @Override
    public void cambiarMenuInicio() throws Exception {
        frmInicio frame = frmInicio.getInstance();
        frmMenu frameM = frmMenu.getInstance();
        frame.setVisible(true);
        frameM.dispose();
    }
}
