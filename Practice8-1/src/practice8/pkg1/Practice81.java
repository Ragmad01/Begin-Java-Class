/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice8.pkg1;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;
/**
 *
 * @author venra
 */
public class Practice81 {
static Frame myFrame;
static Graphics myGraphics;
static int previousX;
static int previousY;
static Color drawingColor;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        myFrame = new Frame();
        myFrame.setSize(400,300);
        myFrame.setVisible(true);
        myFrame.setBackground(Color.red);
        myGraphics = myFrame.getGraphics();
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Type what color you want to change it to. ");
        System.out.println("You choices are - red, black, white, magenta, blue and cyan.");
        System.out.print("Answer here: ");
        String input = myScanner.nextLine();
        if (input.equalsIgnoreCase("Red")){
            drawingColor = Color.red;
        }
        else if (input.equalsIgnoreCase("Black")){
            drawingColor = Color.black;
        }
        else if (input.equalsIgnoreCase("White")){
            drawingColor = Color.white;
        }
        else if (input.equalsIgnoreCase("Magenta")){
            drawingColor = Color.magenta;
        }
        else if (input.equalsIgnoreCase("Blue")){
            drawingColor = Color.blue;
        }
        else {
            drawingColor = Color.cyan;
        }
        myFrame.addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent e){
                int x = e.getX();
                int y = e.getY();
                previousX = x;
                previousY = y;
                System.out.println("You clicked at (" + x + ", " + y + ")");
                myGraphics.setColor(Color.white);
                myGraphics.drawLine(0,35,180,200);
            }
        });
        myFrame.addMouseMotionListener(new MouseMotionAdapter(){
            public void mouseDragged(MouseEvent e){
                int xDrag = e.getX();
                int yDrag = e.getY();
                myGraphics.setColor(drawingColor);
                myGraphics.drawLine(previousX, previousY, xDrag, yDrag);
                previousX = xDrag;
                previousY = yDrag;
            }
        });
        myFrame.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
    }
    
}
