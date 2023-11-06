/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.model;

import org.apache.commons.lang3.RandomStringUtils;
import org.itson.dominio.Sala;
import org.itson.model.interfaces.IModelSala;

/**
 *
 * @author ildex
 */
public class ModelSala implements IModelSala {

    private static ModelSala modelSala;

    /**
     * Método que regresa una instancia de la clase. Usa el patrón Singleton.
     *
     * @return instancia de la clase.
     */
    public static ModelSala getInstance() {
        if (ModelSala.modelSala == null) {
            ModelSala.modelSala = new ModelSala();
        }
        return ModelSala.modelSala;
    }

    public String generarCodigoSala() {
        String codigo = RandomStringUtils.randomAlphanumeric(6).toUpperCase();
        return codigo;
    }

    @Override
    public Sala crearSala(Sala sala) throws Exception {
        sala.setCodigo(generarCodigoSala());
        return sala;
    }
}
