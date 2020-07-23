/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logger;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * Esta classe vai copiar as Strings que forem digitadas no teclado e vai escreve-las num arquivo.
 * 
 * @author old_adam
 */
public class Logger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);
        //Criar uma referencia para o OutputStream.
        PrintStream output;
        try {
           output = new PrintStream("poo0001.txt");
        } catch(FileNotFoundException e) {
            output = System.out;
        }
        
        String texto = scanner.nextLine();
        
        while(!texto.equalsIgnoreCase("sair")) {
            output.println(texto);
            texto = scanner.nextLine();
        }
        
        scanner.close();
    }
    
}
