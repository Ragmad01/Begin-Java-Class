/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice8;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author venra
 */
public class Practice8 {
static Frame myFrame = new Frame();
static Graphics myGraphics = myFrame.getGraphics();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        myFrame.addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent e){
                int x = e.getX();
                int y = e.getY();
                System.out.println("You clicked at (" + x + ", " + y + ")");
                myGraphics.setColor(Color.red);
                myGraphics.drawLine(0,35,180,200);
            }
        });
    }
    
}
