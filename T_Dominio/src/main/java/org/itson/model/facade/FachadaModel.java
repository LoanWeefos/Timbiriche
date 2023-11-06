/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.model.facade;

import org.itson.dominio.Sala;
import org.itson.model.factory.ModelFactory;
import org.itson.model.interfaces.IFachadaModel;
import org.itson.model.interfaces.IModelSala;

/**
 *
 * @author ildex
 */
public class FachadaModel implements IFachadaModel{
    private final IModelSala modelSala;

    public FachadaModel() {
        this.modelSala = ModelFactory.getModelSala();
    }

    @Override
    public Sala crearSala(Sala sala) throws Exception {
        try {
            return this.modelSala.crearSala(sala);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
