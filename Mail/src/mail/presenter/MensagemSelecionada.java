/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mail.presenter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Esta Classe representa uma mensagem selecionada.
 * Vai haver apenas uma mensagem selecionada em toda a aplicacao, entao
 * vamos implementa-la usando o padrao Singleton.
 * @author prof-valmor
 */
public class MensagemSelecionada {
//! 1. Para implementar o padrao Singleton, a classe tem que ter o construtor privado.
    private MensagemSelecionada() {
        
    }
    //! 2. A Classe vai precisar de uma referencia para o unico objeto de seu tipo a ser criado.
    private static MensagemSelecionada instancia = null;
    //! 3. A Classe vai precisar fornecer um metodo para que outras Classes e objetos possam usar o objeto ListaDeMensagens q ela instancia.
    public static MensagemSelecionada getInstance() {
        // este metodo verifica se a instancia jah foi criada. Se nao, ele a cria.
        if(instancia == null) {
            instancia = new MensagemSelecionada();
        }
        return instancia;
    }
    //! A partir desse ponto vamos criar metodos que nao sao da Classe.
    /**
     * Retorna o conteudo do arquivo com a MensagemSelecionada.
     * @return o conteudo do arquivo com a mensagem selecionada ou null em caso de falha.
     */
    public String getMensagemSelecionada() {
        String conteudo = null;
        try {
            BufferedReader br = new BufferedReader(new FileReader("MENSAGEM_SELECIONADA.txt"));
            conteudo = "";
            // Enquanto o br estiver ready a gente le suas linhas.
            while(br.ready()) {
                conteudo += br.readLine() + "\n";
            }
        }
        catch(IOException e) { conteudo = null; } // Em caso de falha retornamos null.
        
        return conteudo;
    }
}
