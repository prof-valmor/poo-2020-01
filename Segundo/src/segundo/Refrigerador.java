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
class Refrigerador {
    protected Ventilador ventilador = new Ventilador();
    private Sensor sensor = new Sensor();
    
    public void imprimirElementos() {
         System.out.println("Sou o Refrigerador e contenho: ");
        ventilador.imprimirNome();
        sensor.imprimirNome();
    }
}
