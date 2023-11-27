/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.itson.t_server;

import com.itson.compartidos.SolicitudDTO;
import com.itson.dominiodtos.Sala;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author xeron
 */
public class T_Server {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        final int PORT = 6942;
        ServerSocket socket;
        String solicitud;
        Sala sala = null;

        try {
            socket = new ServerSocket(PORT);
            System.out.println("Esperando jugadores...");

            while (true) {
                Socket socketCliente = socket.accept();
                System.out.println("que onda plebes del: "
                        + socketCliente.getInetAddress());

                ObjectInputStream is = new ObjectInputStream(
                        socketCliente.getInputStream());

                ObjectOutputStream os = new ObjectOutputStream(
                        socketCliente.getOutputStream());

                Object solicitudObject = is.readObject();

                if (solicitudObject instanceof SolicitudDTO solicitudDTO) {
                    solicitud = solicitudDTO.getSolicitud();
                    Object objeto = solicitudDTO.getObjeto();

                    try {
                        if (solicitud.equals("CREAR_SALA") && objeto instanceof Sala) {
                            sala = (Sala) objeto;
                            System.out.println("Sala creada con el código: " + sala.getCodigo());
                            
                        }
                        if (solicitud.equals("CODIGO_SALA") && objeto instanceof String) {
                            String codigo = (String) objeto;
                            if (codigo.equals(sala.getCodigo())) {
                                System.out.println("Código correcto!");
                                os.writeBoolean(true);
                                os.flush();

                            } else {
                                System.out.println("Código incorrecto");
                                os.writeBoolean(false);
                                os.flush();
                            }
                        }
                    } catch (NullPointerException e) {
                        System.err.println("Error por nulo: " + e.getMessage());

                    } catch (ClassCastException e) {
                        System.err.println("Error al castear: " + e.getMessage());

                    } catch (IOException e) {
                        System.err.println("Error desconocido: " + e.getMessage());

                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Ocurrió un error: " + e.getMessage());
        }

    }

}
