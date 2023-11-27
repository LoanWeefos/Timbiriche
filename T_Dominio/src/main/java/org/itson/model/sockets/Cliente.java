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

    public Cliente() {

    }

    public void unirServidor() throws IOException, ClassNotFoundException {
        final int PORT = 6942;
        Socket socket = new Socket("localhost", PORT);
        is = new ObjectInputStream(socket.getInputStream());
        os = new ObjectOutputStream(socket.getOutputStream());
    }

    /**
     *
     * @param solicitud
     * @param objeto
     */
    @Override
    public void crearSala(Object objeto) {
        String solicitud = "CREAR_SALA";
        try {
            SolicitudDTO soli = new SolicitudDTO(solicitud, objeto);
            os.flush();
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

    /**
     *
     * @param solicitud
     * @param codigo
     * @return
     * @throws ClassNotFoundException
     */
    public boolean mandarCodigo(String solicitud, String codigo) throws ClassNotFoundException {
        try {
            SolicitudDTO soli = new SolicitudDTO(solicitud, codigo);

            if (os != null) {
                os.writeObject(soli);
                os.flush();

                Object respuesta = is.readObject();

                if (respuesta instanceof Boolean) {
                    boolean codigoCorrecto = (boolean) respuesta;

                    return codigoCorrecto;

                } else {
                    System.err.println("Error con ObjectOutputStream no está inicializado correctamente.");
                }
            }
        } catch (IOException e) {
            System.err.println("Error al crear la sala: " + e.getMessage());
        }
        //este es por si acaso.
        return false;
    }

}
