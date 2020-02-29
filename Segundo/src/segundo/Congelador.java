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
class Congelador extends Refrigerador{
//    private Ventilador ventilador = new Ventilador();
    private Compressor compressor = new Compressor();
//    private Sensor sensor = new Sensor();
    
    public void imprimirElementos() {
        System.out.println("Sou o Congelador e contenho: ");
        ventilador.imprimirNome();
        compressor.imprimirNome();
        //sensor.imprimirNome();
    }
}
