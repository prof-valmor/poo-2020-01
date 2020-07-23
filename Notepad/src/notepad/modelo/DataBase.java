/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notepad.modelo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * Singleton.
 * @author old_adam
 */
public class DataBase {
    
    private static DataBase instance;
    private DataBase() {
        
    }
    public static DataBase getInstance() {
        if(instance == null) {
            instance = new DataBase();
        }
        return instance;
    }
    //
    
    public String lerTodoOArquivoTexto(String nomeArquivo) {
        String response = "";
        try{
            Scanner reader = new Scanner(new BufferedReader(new FileReader(nomeArquivo)));
            
            while(reader.hasNext()) {
                response += reader.next();
            }
            
            reader.close();
            
        }catch(FileNotFoundException e) {
            
        }
       
        return response;
    }

    public void armazenarArquivoTexto(String nomeArquivo, String texto) {
        try{
            PrintStream ps = new PrintStream(nomeArquivo);
            
            ps.println(texto);
            
            ps.close();
        }catch(FileNotFoundException e) {
            
        }
    }
    
}
