/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itson.t_modelview;

import com.itson.t_modelview.interfaces.IViewModelSala;
import org.itson.dominio.Sala;
import org.itson.model.facade.FachadaModel;
import org.itson.model.interfaces.IFachadaModel;
import org.itson.t_views.frmMenu;
import org.itson.t_views.frmSala;

/**
 *
 * @author Equipo6
 */
public class ViewModelSala implements IViewModelSala {

    private static ViewModelSala viewModelSala;
    private final IFachadaModel fachadaModel;

    public ViewModelSala() {
        this.fachadaModel = new FachadaModel();
    }

    /**
     * Método que regresa una instancia de la clase. Usa el patrón Singleton.
     *
     * @return instancia de la clase.
     */
    public static ViewModelSala getInstance() {
        if (ViewModelSala.viewModelSala == null) {
            ViewModelSala.viewModelSala = new ViewModelSala();
        }
        return ViewModelSala.viewModelSala;
    }

    @Override
    public Sala crearSala(Sala sala) throws Exception {
        fachadaModel.crearSala(sala);
        if (fachadaModel.crearSala(sala) != null) {
            frmSala frame = frmSala.getInstance();
            frmMenu frameM = frmMenu.getInstance();
            frmSala.setNombre(sala.getJugador().getNombre());
            frmSala.setCodigo(sala.getCodigo());
            frame.actualizarVentana();
            frame.setVisible(true);
            frameM.dispose();
        }
        //if(ModelSala(sala) != null
        /*
        frmSala frame = frmSala.getInstance();
        frmMenu frameM = frmMenu.getInstance();
            frame.setNombre(nombreJugador);
            frame.setCodigo(null);
            frame.actualizarVentana();
            frame.setVisible(true);
            frameM.dispose();
         */
        return sala;
    }
}
