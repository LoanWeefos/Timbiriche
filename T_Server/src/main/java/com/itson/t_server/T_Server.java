/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.itson.t_server;

import com.itson.compartidos.SolicitudDTO;
import com.itson.dominio.Sala;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author xeron
 */
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class T_Server {

    private static final int PORT = 6942;
    private static Sala sala;

    public static Sala getSala() {
        return sala;
    }

    public static void setSala(Sala sala) {
        T_Server.sala = sala;
    }

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(PORT);
        System.out.println("Esperando jugadores...");

        try {
            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("Conexión entrante desde: " + clientSocket.getInetAddress());

                Thread clientThread = new Thread(new ClientHandler(clientSocket));
                clientThread.start();
            }
        } finally {
            serverSocket.close();
        }
    }

    static class ClientHandler implements Runnable {

        private final Socket clientSocket;

        ClientHandler(Socket socket) {
            this.clientSocket = socket;
        }

        @Override
        public void run() {
            try {
                while (true) {
                    ObjectInputStream is = new ObjectInputStream(clientSocket.getInputStream());
                    ObjectOutputStream os = new ObjectOutputStream(clientSocket.getOutputStream());
                    
                    System.out.println("nigga");

                    Object solicitudObject = is.readObject();

                    System.out.println(solicitudObject);

                    if (solicitudObject instanceof SolicitudDTO) {
                        String solicitud = ((SolicitudDTO) solicitudObject).getSolicitud();
                        Object objeto = ((SolicitudDTO) solicitudObject).getObjeto();
                        String codigo = ((SolicitudDTO) solicitudObject).getCodigo();

                        System.out.println(solicitud);

                        switch (solicitud) {
                            case "CREAR_SALA":
                                T_Server.setSala((Sala) objeto);
                                System.out.println("Sala creada con el código: " + T_Server.getSala().getCodigo());
                                break;
                            case "CODIGO_SALA":
                                System.out.println(codigo);
                                if (codigo != null && codigo.equalsIgnoreCase(T_Server.getSala().getCodigo())) {
                                    os.writeBoolean(true);
                                    os.flush();
                                    System.out.println("Código Correcto!!");
                                } else {
                                    os.writeBoolean(false);
                                    os.flush();
                                    System.out.println("Código Incorrecto :(");
                                }
                                os.flush();
                                break;
                            case "JALAR_SALA":
                                os.writeObject(T_Server.getSala());
                                System.out.println(T_Server.getSala().toString());
                                os.flush();
                                System.out.println("Sala jalada?");
                                break;
                            default:
                                System.err.println("Solicitud desconocida: " + solicitud);
                                break;
                        }
                    }
                }
            } catch (IOException | ClassNotFoundException e) {
                System.err.println("Error en la conexión con el cliente: " + e.getMessage());
            }
        }
    }
}
