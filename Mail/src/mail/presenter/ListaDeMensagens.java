/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mail.presenter;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * Esta Classe representa uma lista de mensagens recebidas.
 * Como vai haver apenas uma lista de mensagens recebidas nesta aplicacao, 
 * vamos implementa-la usando o padrao Singleton.
 * @author prof-valmor
 */
public class ListaDeMensagens {
    //! 1. Para implementar o padrao Singleton, a classe tem que ter o construtor privado.
    private ListaDeMensagens() {
        
    }
    //! 2. A Classe vai precisar de uma referencia para o unico objeto de seu tipo a ser criado.
    private static ListaDeMensagens instancia = null;
    //! 3. A Classe vai precisar fornecer um metodo para que outras Classes e objetos possam usar o objeto ListaDeMensagens q ela instancia.
    public static ListaDeMensagens getInstance() {
        // este metodo verifica se a instancia jah foi criada. Se nao, ele a cria.
        if(instancia == null) {
            instancia = new ListaDeMensagens();
        }
        return instancia;
    }
    //! A partir desse ponto vamos criar metodos que nao sao da Classe.
    /**
     * Gets the content of the INBOX.txt file on the array format.
     * Estou retornando nesse formato porque eh o formato certo para adicionar os elementos no jList usado no JPanel1 - Inbox.
     * @return null in case of failure or the list of strings from the INBOX.txt.
     */
    public String[] getListaDeMensagens() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("INBOX.txt"));
            ArrayList<String> lista = new ArrayList();  //usando arraylist para converter ao final.
            // Fazendo um Loop no arquivo usando o BufferedReader. Tem que tratar as excessoes IOException.
            while(br.ready()) {
                lista.add(br.readLine());                
            }
            //Criando este array apenas para converter o ArrayList para String[].
            String[] a = new String[lista.size()];           
            return lista.toArray(a);
        }
        catch(IOException io) {}        
        
        return null;        
    }
}
