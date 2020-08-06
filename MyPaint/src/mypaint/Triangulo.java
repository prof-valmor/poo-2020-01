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
public class Triangulo extends Component {

    private int[] x1 = new int[3];
    private int[] y1 = new int[3];
    
    Triangulo(Point ... p) {
        x1[0] = p[0].x;
        x1[1] = p[1].x;
        x1[2] = p[2].x;
        //
        y1[0] = p[0].y;
        y1[1] = p[1].y;
        y1[2] = p[2].y;
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.CYAN);
        g.fillPolygon(x1, y1, 3);
    }
    
    
    
}
