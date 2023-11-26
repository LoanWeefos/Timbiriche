/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.itson.t_server;

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

                solicitud = (String) is.readObject();

                if (solicitud.equals("FECHA")) {
                    mandarFecha(os);
                }
            }
        } catch (IOException e) {
            System.err.println("Error papi: " + e.getMessage());
        }

    }

    public static void mandarFecha(ObjectOutputStream os) throws IOException {
        SimpleDateFormat fechaChila = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date fechaSarra = new Date();
        String fechaFormateada = fechaChila.format(fechaSarra);
        os.writeObject(fechaFormateada);
        os.flush();
    }
}
