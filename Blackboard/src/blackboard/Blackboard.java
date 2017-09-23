/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackboard;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author venra
 */
public class Blackboard extends Frame{
    static Frame myFrame;
    static Graphics myGraphics;
    static int previousX, previousY;
    static Color drawingColor;
    static boolean drawingOn = false;
    static boolean boxesDrawn = false;
    public static void main(String[] args) {
        //create frame
        myFrame = new Blackboard();
        myFrame.setSize(600, 400);
        myFrame.setTitle("Blackboard Fun");
        myFrame.setBackground(Color.black);
        myFrame.setVisible(true);
        myGraphics = myFrame.getGraphics();
        
        //add listener for closing frame
        myFrame.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
        //add Listener for clicking mouse
        myFrame.addMouseListener(new MouseAdapter()
        {
            public void mousePressed (MouseEvent e)
            {
                if (!boxesDrawn)
                {
                    boxesDrawn = true;
                    //setup color choice rectangles
                    myGraphics.setColor(Color.white);
                    myGraphics.fillRect(570,30,30,40);
                    myGraphics.setColor(Color.lightGray);
                    myGraphics.fillRect(570,70,30,40);
                    myGraphics.setColor(Color.blue);
                    myGraphics.fillRect(570,110,30,40);
                    myGraphics.setColor(Color.cyan);
                    myGraphics.fillRect(570,150,30,40);
                    myGraphics.setColor(Color.green);
                    myGraphics.fillRect(570,190,30,40);
                    myGraphics.setColor(Color.magenta);
                    myGraphics.fillRect(570,230,30,40);
                    myGraphics.setColor(Color.yellow);
                    myGraphics.fillRect(570,270,30,40);
                    myGraphics.setColor(Color.red);
                    myGraphics.fillRect(570,310,30,40);
                }
                //drawing begins or color is changed
                if (e.getX()> 570){
                    drawingOn = false;
                    //new Color
                    if (e.getY()>350){
                        //Clear drawing area
                        myGraphics.clearRect(0,0,570,400);
                    }
                    else if(e.getY()>310){
                        drawingColor = Color.red;
                        System.out.println("The color has been set to red");
                    }
                    else if(e.getY()>270){
                        drawingColor = Color.yellow;
                        System.out.println("The color has been set to yellow");
                    }
                    else if(e.getY()>230){
                        drawingColor = Color.magenta;
                        System.out.println("The color has been set to magenta");
                    }
                    else if(e.getY()>190){
                        drawingColor = Color.green;
                        System.out.println("The color has been set to green");
                    }
                    else if(e.getY()>150){
                        drawingColor = Color.cyan;
                        System.out.println("The color has been set to white");
                    }
                    else if(e.getY()>110){
                        drawingColor = Color.blue;
                        System.out.println("The color has been set to blue");
                    }
                    else if(e.getY()>70){
                        drawingColor = Color.lightGray;
                        System.out.println("The color has been set to light gray");
                    }
                    else{
                        drawingColor = Color.white;
                        System.out.println("The color has been set to white");
                    }
                    
                }
                else{
                    //drawing begins, save point
                    drawingOn = true;
                    previousX = e.getX();
                    previousY = e.getY();
                    myGraphics.setColor(drawingColor);
                }
            }
        });
        // add listener for dragging mouse
        myFrame.addMouseMotionListener(new MouseMotionAdapter()
        {
            public void mouseDragged (MouseEvent e)
            {
                if (drawingOn){
                    //drawing continues
                    myGraphics.drawLine(previousX, previousY, e.getX(), e.getY());
                     previousX = e.getY();
                     previousY = e.getX();
                }
            }
        });      
    }
}
