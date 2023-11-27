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
import org.itson.model.interfaces.ICliente;

/**
 *
 * @author xeron
 */
public class Cliente implements ICliente {

    private ObjectOutputStream os;
    private ObjectInputStream is;
    private static Cliente cliente;

    public static Cliente getInstance() {
        if (cliente == null) {
            cliente = new Cliente();
        }
        return cliente;
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

    @Override
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

    public boolean mandarCodigo(String solicitud, String codigo) throws ClassNotFoundException {
        try {
            SolicitudDTO soli = new SolicitudDTO(solicitud, codigo);

            if (os != null) {
                os.writeObject(soli);
                os.flush();

                Object respuesta = is.readObject();

                if (respuesta instanceof Boolean) {
                    return (boolean) respuesta;
                } else {
                    System.err.println("Error: La respuesta del servidor no es un booleano.");
                }
            }
        } catch (IOException e) {
            System.err.println("Error al enviar código: " + e.getMessage());
        }
        return false;
    }
}

