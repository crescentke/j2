/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaoop;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author crescent
 */
public class JavaOOP extends Applet {

    @Override
    public void paint(Graphics g) {
        // setting background and foreground colors
        g.setColor(Color.white);
        g.fillRect(0, 0, getWidth(), getHeight());
        g.setColor(Color.black);

        // drawing the car body
        g.fillRect(100, 110, 60, 10);

        // drawing the wheels
        g.setColor(Color.black);
        g.fillOval(110, 120, 10, 10);     // left wheel
        g.fillOval(140, 120, 10, 10);     // right wheel

        int x[] = {110, 120, 140, 150};   // coordinate arrays for the 
        int y[] = {110, 100, 100, 110};   //   car cabin

        g.setColor(Color.black);
        g.fillPolygon(x, y, 4);           // drawing the cabin in blue

        
    }
}
