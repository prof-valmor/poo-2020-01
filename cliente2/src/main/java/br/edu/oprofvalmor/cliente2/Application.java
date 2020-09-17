/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.oprofvalmor.cliente2;

import br.edu.oprofvalmor.cliente2.modelo.Usuario;
import br.edu.oprofvalmor.cliente2.modelo.Comunicador;
import br.edu.oprofvalmor.cliente2.modelo.Interpretador;
import br.edu.oprofvalmor.cliente2.modelo.MensagemListener;
import java.util.HashMap;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Criamos a classe Application para ser o ponto de entrada do nosso projeto.
 * Esta classe esta' gerenciando as janelas, processando as mensagens que chegam do
 * Servidor e permitindo que as janelas enviem mensagens usando a interface SenderInterface.
 * 
 */
public class Application implements MensagemListener, SenderInterface {

    Comunicador comunicador = new Comunicador();
    Interpretador interpretador = Interpretador.getInstance();
    //
    JanelaPrincipal jp;// = new JanelaPrincipal();
    JanelaContatos jc;
    JanelaMensagem jm;
    
    HashMap<String, String> mensagens = new HashMap<>();

    public Application() {
         comunicador.addListener(interpretador);
         interpretador.addObservador(this);

         jp = new JanelaPrincipal(this);
         jm = new JanelaMensagem(this);

         //
         java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    jp.setVisible(true);
                }
            });
    }
    
        
    public void openMessage(String user) {
        jm.setUsuario(user);
        jm.setTitle("Bate-papo com " + user);
        jm.setMessages(user, mensagens.get(user));
        jm.setVisible(true);
    }

    @Override
    public void onListaDeUsuariosChegando(List<String> usuarios) {
        if(jc == null) jc = new JanelaContatos(this, usuarios);  // verificar se eh null senao cria o JanelaContatos.
        else jc.setLista(usuarios);
        
        jc.setVisible(true);
        jp.setVisible(false);
    }

    @Override
    public void onMensagemChegando(String remetente, String texto) {
           jc.marcarUsuario(remetente);
           mensagens.put(remetente, texto);
    }

    @Override
    public void onMensagemDeErroChegando(String motivo) {

    }

    @Override
    public void enviarMensagem(String mensagem) {
        comunicador.enfileraMensagem(mensagem);
    }

    void enviarMensagem(String destinatario, String texto) {
        String header  = "{ \"message\": { \"sender\":\"";
        String middle  = "\", \"receiver\": \""; 
        String middle2 = "\", \"content\" : \"";
        String tail    = "\" } }";
        String mensagem = header + Usuario.getInstance().getUserId() + middle + destinatario + middle2 + texto + tail;
        //
        comunicador.enfileraMensagem(mensagem);
    }

    @Override
    public void enviarMensagemDeLogin(String userId) {
        String header = "{ \"login\": { \"user-id\":\"";
        String tail   = "\" } }";
        String mensagem = header + userId + tail;
        //Atualizando o id do Usuario.
        Usuario.getInstance().setUserId(userId);
        //
        comunicador.enfileraMensagem(mensagem);
        //
        Timer t = new Timer();
        t.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                enviarMensagemDePing();
            }
        }, 0, 15000);
    }
    
    private void enviarMensagemDePing() {
        String header = "{ \"ping\": { \"user-id\":\""; 
        String tail = "\" } }";
        
        String message = header + Usuario.getInstance().getUserId() + tail;
        enviarMensagem(message);
    }
    
    
    // Aqui eh onde o projeto se inicia.
    public static void main(String args[]) {
        Application app = new Application();
    }

}
