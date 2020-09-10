/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.oprofvalmor.cliente2;

/**
 *
 * @author old_adam
 */
interface SenderInterface {
    public void enviarMensagem(String mensagem);

    public void enviarMensagemDeLogin(String text);
}
