/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatserver;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author old_adam
 */
public class ChatServer {
    
    static ServerSocket server;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            System.out.println("1. Criando o Server.");
            server = new ServerSocket(1408);
            System.out.println("2. Esperando conexao.");
            Socket cliente = server.accept();
            System.out.println("3. Cliente conectato " + cliente.getInetAddress().toString());
            ///
            BufferedInputStream br = new BufferedInputStream(cliente.getInputStream());
            Scanner reader = new Scanner(br);
           
            while(reader.hasNext()) {
               System.out.println(">>" + reader.next());
            }
            //
            reader.close();
            cliente.close();
            ///
        }
        catch(IOException w) {
            System.out.println("Erro criando o Server.");
        }
    }
    
}
