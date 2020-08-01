/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypaint;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author old_adam
 */
public class Quadrado extends Component{
    
    private int lastX;
    private int lastY;

    public Quadrado(int x, int y, int lado) {
        super();
        setBounds(x, y, lado, lado);
        lastX = x;
        lastY = y;
    }

    @Override
    public void setLocation(int x, int y) {
        lastX = getX();
        lastY = getY();
        super.setLocation(x, y); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setLocation(Point p) {
        lastX = p.x;
        lastY = p.y;
        super.setLocation(p); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    @Override
    public void paint(Graphics g) {
        //Apaga o desenho anterior.
        g.setColor(Color.white);
        g.fillRect(lastX, lastY, getWidth(), getHeight());
        // desenha na nova posicao.
        g.setColor(Color.red);
        g.fillRect(getX(), getY(), getWidth(), getHeight());
        System.out.println("PAINTING o compomente. x:" + getX() + " y: " + getY() + " w: " + getWidth() + " h: " + getHeight());
    } 
    
}
