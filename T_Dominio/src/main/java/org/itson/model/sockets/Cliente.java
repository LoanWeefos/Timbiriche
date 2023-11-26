/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.model.sockets;

import com.itson.compartidos.SolicitudDTO;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 *
 * @author xeron
 */
public class Cliente {

    private static Cliente cliente;

    /**
     * Método que regresa una instancia de la clase. Usa el patrón Singleton.
     *
     * @return instancia de la clase.
     */
    public static Cliente getInstance() {
        if (Cliente.cliente == null) {
            Cliente.cliente = new Cliente();
        }
        return Cliente.cliente;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        final int PORT = 6942;
        Socket socket = new Socket("localhost", PORT);

        ObjectInputStream is = new ObjectInputStream(socket.getInputStream());
        ObjectOutputStream os = new ObjectOutputStream(socket.getOutputStream());

    }

    public static void crearSala(ObjectOutputStream os, ObjectInputStream is, String solicitud, Object objeto){
        try{
            SolicitudDTO soli = new SolicitudDTO(solicitud, objeto);
            os.writeObject(soli);
            Object respuesta = is.readObject();
            //AQUI PARA LEER ES UN PEDOTE PERO SI VAMOS A LEER PURO OBJETO
            //SE PUEDE HACER CON UN instanceof Y AHI TAMOS PQ SI QUIERO LEER
            //UN STRING TMB TENGO QUE HACER UN DTO PARA LA RESPUESTA Y LA NETA
            //AHIDILE LULU
        }catch(IOException | ClassNotFoundException e){
            System.err.println("Ocurrió un error al crear la sala...");
        }
    }
    
}