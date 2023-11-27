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
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author xeron
 */
public class T_Server {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        final int PORT = 6942;
        ServerSocket socket;
        String solicitud;

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

                    if (solicitud.equals("CREAR_SALA") && objeto instanceof Sala) {
                        Sala sala = (Sala) objeto;
                        guardarSala(os, sala);
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Error papi: " + e.getMessage());
        }

    }

    public static void guardarSala(ObjectOutputStream os, Sala sala) throws IOException{
        sala.getCantidadJugadores();
        sala.getCodigo();
    }
    
    public static void mandarFecha(ObjectOutputStream os) throws IOException {
        SimpleDateFormat fechaChila = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date fechaSarra = new Date();
        String fechaFormateada = fechaChila.format(fechaSarra);
        os.writeObject(fechaFormateada);
        os.flush();
    }
}
