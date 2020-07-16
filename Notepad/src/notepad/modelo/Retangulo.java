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
public class Retangulo extends Quadrado {
    //! comprimento do Retangulo.
    private double comprimento;
    //! Construtor.
    public Retangulo(double lado, double comprimento) {
        super(lado);
        this.comprimento = comprimento;
    }
    //! Getter do comprimento.
    public double getComprimento() {
        return comprimento;
    }
    //! Calcula a area do Retangulo.
    public double calcularArea() {
        return lado * comprimento;
    }
 
}
