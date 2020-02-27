/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeiro;

/**
 *
 * @author udesc
 */
public class Primeiro {

    int meuInt;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Pessoa p = new Pessoa();
        
        p.nome = "Valmor";
        p.idade = 27;
        
        Pessoa p1 = new Pessoa();
        p1.nome = "Andre";
        p1.idade = 18;
        
    }
    
}
