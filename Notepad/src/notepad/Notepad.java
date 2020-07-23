/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notepad;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import notepad.presenter.Presenter;

/**
 *JFrame
 * @author old_adam
 */
public class Notepad extends JFrame{
    //
    private final Button btCarregar  = new Button("Carregar");
    private final Button btArmazenar = new Button("Armazenar");
    private final TextArea txtArea   = new TextArea();    
    
    public Notepad() {
        super("Notepad");
        setLayout(new BorderLayout());
        add(txtArea, BorderLayout.NORTH);
        add(btCarregar, BorderLayout.CENTER);
        add(btArmazenar, BorderLayout.SOUTH);
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // Adicionando eventos para os botoes:
        btCarregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtArea.setText(Presenter.getInstance().carregarDados());
            }
        });
        btArmazenar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //
                Presenter.getInstance().armazenarTexto(txtArea.getText());
            }
        });
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        (new Notepad()).show(true);
    }
    
}
