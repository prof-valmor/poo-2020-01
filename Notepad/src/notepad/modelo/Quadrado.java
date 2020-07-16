/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notepad.modelo;

/**
 *
 * @author old_adam
 */
public class Quadrado {
    protected double lado;
    //! Getter do lado.
    public double getLado() {
        return lado;
    }
    
    //! Construtor
    public Quadrado(double l) {
        lado = l;
    }
    //! Calcula a area do Quadrado.
    public double calcularArea() {
        return lado*lado;
    }
    
}
