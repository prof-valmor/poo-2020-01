/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author udesc
 */
public class Main {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Timer timer1;
        TimerTask task1;
    
        System.out.println("Main!");
        (new Teste("Um")).start();
        (new Teste("Dois")).start();
        (new Teste("Tres")).start();
//        (new JWindow(new JFrame("Titulo 123123"))).show();
        timer1 = new Timer();
        task1 = new TimerTask() {
            @Override
            public void run() {
                System.out.println(">>>>>TICK<<<<<");
            }
        };
        timer1.schedule(task1, 1000, 1000); 
    }
    
}
