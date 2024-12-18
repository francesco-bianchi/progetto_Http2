package com.example;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(3000);
        int i=0;
        do {
            Socket s = serverSocket.accept();
            i++;
            System.out.println("Connessione numero: " + i);
            GestoreServer gs = new GestoreServer(s);
            gs.start();
        } while (true);
    }
}