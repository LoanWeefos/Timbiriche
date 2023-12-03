/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.itson.model.interfaces;

//import org.itson.dominio.Sala;
import com.itson.dominio.Sala;

/**
 *
 * @author ildex
 */
public interface IModelSala {
    Sala crearSala(int cantidadJugadores) throws Exception;
    boolean unirseSala(String codigoSala) throws Exception;
    Sala jalarSala() throws Exception;
}
