/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.model;

import org.apache.commons.lang3.RandomStringUtils;
import com.itson.dominio.Tablero;
import org.itson.model.interfaces.IModelSala;
import org.itson.model.interfaces.IModelTablero;

/**
 *
 * @author ildex
 */
public class ModelTablero implements IModelTablero {

    private static ModelTablero modelTablero;

    /**
     * Método que regresa una instancia de la clase. Usa el patrón Singleton.
     *
     * @return instancia de la clase.
     */
    public static ModelTablero getInstance() {
        if (ModelTablero.modelTablero == null) {
            ModelTablero.modelTablero = new ModelTablero();
        }
        return ModelTablero.modelTablero;
    }

    @Override
    public Tablero crearTablero(int dimension) throws Exception {
        Tablero tablero = new Tablero();
        tablero.setDimension(dimension);
        tablero.generarCuadros();
        return tablero;
    }
}
