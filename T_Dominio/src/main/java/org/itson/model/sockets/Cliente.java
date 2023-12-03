/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.model.sockets;

import com.itson.compartidos.SolicitudDTO;
import com.itson.dominio.Sala;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 *
 * @author xeron
 */
public class Cliente {

    private ObjectOutputStream os;
    private ObjectInputStream is;
    private static Cliente cliente;

    public static Cliente getInstance() {
        if (Cliente.cliente == null) {
            Cliente.cliente = new Cliente();
        }
        return Cliente.cliente;
    }

    private Cliente() {
        try {
            final int PORT = 6942;
            Socket socket = new Socket("localhost", PORT);
            os = new ObjectOutputStream(socket.getOutputStream());
            is = new ObjectInputStream(socket.getInputStream());
        } catch (IOException e) {
            System.err.println("Error al inicializar los flujos: " + e.getMessage());
        }
    }

    public void crearSala(Object objeto) {
        String solicitud = "CREAR_SALA";
        try {
            SolicitudDTO soli = new SolicitudDTO(solicitud, objeto);
            if (os != null) {
                os.writeObject(soli);
                os.flush();
            } else {
                System.err.println("Error con ObjectOutputStream no está inicializado correctamente.");
            }
        } catch (IOException e) {
            System.err.println("Error al crear la sala: " + e.getMessage());
        }
    }

    public void unirseSala(Object objeto, String codigoSala) {
        String solicitud = "CODIGO_SALA";
        try {
            SolicitudDTO soli = new SolicitudDTO(solicitud, codigoSala);
            if (os != null) {
                os.writeObject(soli);
                os.flush();
            } else {
                System.err.println("Error con ObjectOutputStream no está inicializado correctamente.");
            }
        } catch (IOException e) {
            System.err.println("Error al crear la sala: " + e.getMessage());
        }
    }

    public boolean mandarCodigo(String codigo) throws ClassNotFoundException {
        String solicitud = "CODIGO_SALA";
        try {
            SolicitudDTO soli = new SolicitudDTO(solicitud, codigo);
            if (os != null) {
                os.writeObject(soli);
                os.flush();

                Boolean respuesta = is.readBoolean();
                return respuesta;
            }
        } catch (IOException e) {
            System.err.println("Error al enviar código: " + e.getMessage());
        }
        return false;
    }

    public Sala jalarSala() throws ClassNotFoundException {
        String solicitud = "JALAR_SALA";
        try {
            SolicitudDTO soli = new SolicitudDTO(solicitud);
            System.out.println(soli);
            if (os != null) {
                os.writeObject(soli);
                os.flush();

                Object sala = is.readObject();

                if (sala instanceof Object) {
                    return (Sala) sala;
                } else {
                    System.err.println("Error: La respuesta del servidor no es sala.");
                }
            }
        } catch (IOException e) {
            System.err.println("Error jalar la sala: " + e.getMessage());
        }
        return null;
    }
}
