/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundo;

/**
 *
 * @author udesc
 */
public class Geladeira {
    //Atributos
    private Congelador congelador;
    private Refrigerador refrigerador;

    //Metodo construtor.
    public Geladeira() {
        refrigerador = new Refrigerador();
        congelador = new Congelador();
        
    }

    public void imprimirElementos() {
       System.out.println("Sou a Geladeira. Contenho:");
       congelador.imprimirElementos();
       refrigerador.imprimirElementos();
    }
    
    
    
}
