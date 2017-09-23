/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package makealinetest;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author venra
 */
public class MakeALineTest {
static Frame myFrame = new Frame();
Graphics myGraphics = myFrame.getGraphics();
static int x1;
static int x2;
static int y1;
static 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        myFrame.setSize(400,300);
        myFrame.setTitle("Graphics Testing");
        myFrame.setVisible(true);
    }
    public static int getx1(){
        myFrame.addMouseListener(new MouseAdapter()
        {
            public static void mousePressed(MouseEvent e)
            {
                x = e.getX();
                y = e.getY();
            }
        });
    }
    
}
