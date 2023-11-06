/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.model.factory;

import org.itson.model.ModelSala;
import org.itson.model.interfaces.IModelSala;

/**
 *
 * @author ildex
 */
public final class ModelFactory {

    /**
     * Método que regresa una instancia de ModelSala
     *
     * @return instancia de ModelSala
     */
    public static IModelSala getModelSala() {
        return ModelSala.getInstance();
    }

}
