/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypaint;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;
import static java.awt.image.ImageObserver.WIDTH;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author old_adam
 */
public class MyPanel extends Canvas {
    
    private Component componenteSelecionado;
    private ArrayList<Component> listaComponentes = new ArrayList<>();

    public MyPanel() {
        super();
        
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                componenteSelecionado = null;
                for(Component c : listaComponentes) {
                    if(c.contains(e.getPoint())){
                        componenteSelecionado = c;
                        System.out.println("Selecting...");
                    }
                }
            }    
        });
        
        addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                if(componenteSelecionado != null) {
                    componenteSelecionado.setLocation(e.getPoint());
                    repaint();
                    System.out.println("Dragging...");
                }
            }
        });
        
    }

    public void add(Component comp) {
        listaComponentes.add(comp);
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
        for(Component c : listaComponentes) {
            c.paint(g);
        }
    }
    
    
  
}
