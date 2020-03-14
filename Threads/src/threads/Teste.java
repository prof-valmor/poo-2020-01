/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author udesc
 */
public class Teste extends Thread{
    private int contador = 0;
    private String nome = "";
    
    public Teste(String nome_) {
        nome = nome_;
    }
    @Override
    public void run() {
        while(contador < 1000) {
            System.out.println(nome + " Contando: " + contador);
            contador++;
            try {
                sleep(100);
            } catch (InterruptedException ex) {
                
            }
        }
        System.out.println(nome + " terminou!");
    }
}
