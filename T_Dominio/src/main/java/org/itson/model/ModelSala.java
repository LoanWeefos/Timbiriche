/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.model;

import org.apache.commons.lang3.RandomStringUtils;
//import org.itson.dominio.Sala;
import com.itson.dominio.Sala;
import org.itson.model.interfaces.IModelSala;
import org.itson.model.sockets.Cliente;

/**
 *
 * @author ildex
 */
public class ModelSala implements IModelSala {

    private static ModelSala modelSala;
    Cliente cliente;
    Sala sala;

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
    public Sala crearSala(int cantidadJugadores) throws Exception {
        sala = Sala.getInstance();
        sala.setCantidadJugadores(cantidadJugadores);
        sala.setCodigo(generarCodigoSala());
        cliente = Cliente.getInstance();
        cliente.crearSala(sala);
        System.out.println(sala.toString());
        return sala;
    }

    @Override
    public boolean unirseSala(String codigoSala) {
        try {
            cliente = Cliente.getInstance();
            boolean resultado = cliente.mandarCodigo(codigoSala); // Almacena el resultado
            System.out.println(resultado + " MODEL SALA");
            System.out.println("LLEGA AL MODELSALA");
            return resultado; // Devuelve el resultado almacenado
        } catch (Exception e) {
            System.err.println("Error al intentar unirse a la sala: " + e.getMessage());
            return false;
        }
    }

    @Override
    public Sala jalarSala() throws Exception {
        cliente = Cliente.getInstance();
        return cliente.jalarSala();
    }
    
    @Override
    public void mandarSala(Sala sala) throws Exception {
        cliente = Cliente.getInstance();
        cliente.mandarSala(sala);
    }
}
