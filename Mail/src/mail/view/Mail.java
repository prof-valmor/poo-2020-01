/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mail.view;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author prof-valmor
 */
public class Mail extends JFrame {
    
    public Mail() {
        super("Mail");
        setLayout(new BorderLayout());
//        add(new JLabel("Usuario: "), BorderLayout.PAGE_START);
//        add(new JTextField("digite o nome."), BorderLayout.NORTH);
        add(new Inbox(), BorderLayout.CENTER);
        add(new Mensagem(), BorderLayout.SOUTH);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        (new Mail()).setVisible(true);
    }
    
}
