/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notepad.presenter;

import java.util.ArrayList;
import notepad.modelo.DataBase;
import notepad.modelo.Quadrado;
import notepad.modelo.Retangulo;

/**
 * Singleton.
 * @author old_adam
 */
public class Presenter {
    //! 1. criar uma referencia (na Classe) para o objeto singleton
    private static Presenter instancia = null;
    //! 2. criar o construtor da classe como private.
    private Presenter() {
        
    }
    //! 3. Criar um metodo Getter da classe para acessar a instancia.
    public static Presenter getInstance() {
        if(instancia == null) {
            instancia = new Presenter();
        }
        return instancia;
    }
    
    //! lista de objetos
    private ArrayList<Quadrado> lista = new ArrayList<>();

    public void criarObjetos() {
        lista.add(new Quadrado(2));
        lista.add(new Retangulo(2, 5));
        lista.add(new Quadrado(100));
        lista.add(new Retangulo(2, 200));
        
    }

    public String getAreas() {
        String areas = "";
        //! Fazendo o loop na lista usando a classe de hierarquia maior para apontar para cada um dos objetos da lista.
        for(Quadrado q : lista) {
            if(q instanceof Retangulo) {
                areas += "\nRetangulo: ";
            }
            else if(q instanceof Quadrado) {
                areas += "\nQuadrado: ";
            }
            //! Dinamyc Binding para encontar o metodo com a implementacao correta.
            areas += q.calcularArea();
        }
        
        return areas;
    }

    public String carregarDados() {
        return DataBase.getInstance().lerTodoOArquivoTexto("poo0001.txt");
    }

    public void armazenarTexto(String text) {
        DataBase.getInstance().armazenarArquivoTexto("poo0001_01.txt", text);
    }
    
    
}
