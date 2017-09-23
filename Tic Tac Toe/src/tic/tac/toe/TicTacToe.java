/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tic.tac.toe;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;
import javax.swing.Timer;
/**
 *
 * @author venra
 */
public class TicTacToe {
    static Frame myFrame;
    static Graphics myGraphics;
    static int previousX, previousY;
    static Color drawingColor;
    static boolean drawingOn = false;
    static boolean boxesDrawn = false;
    static boolean Turn = false;
    static String xTurn = ("X's turn");
    static String oTurn = ("O's turn");
    static int x1;
    static int x2;
    static int y1;
    static int y2;
    static int num = 9;
    public static void main(String[] args) {
        myFrame = new Frame();
        myFrame.setSize(400, 400);
        myFrame.setBackground(Color.white);
        myFrame.setVisible(true);
        myGraphics = myFrame.getGraphics();
        myFrame.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
        myFrame.addMouseListener(new MouseAdapter()
        {
            public void mousePressed (MouseEvent e)
            {
                myGraphics.drawLine(125,000, 125, 400);
                myGraphics.drawLine(265,000, 265, 400);
                myGraphics.drawLine(000,125, 400, 125);
                myGraphics.drawLine(000,265, 400, 265);
                System.out.print(e.getX() + ", " + e.getY());
                System.out.println();
                while (num>0){
                    if (num%2 == 0){
                        Turn = false;//false is O
                    }
                    if (num%2 == 1){
                        Turn = true;//true is X
                    }
                    if ((e.getX()>125)&&(e.getY()<125)){
                        if((e.getX()<265)&&(e.getY()>265)){
                            x1 = 125;
                            x2 = 265;
                            y1 = 125;
                            y2 = 265;
                            if (Turn = true){
                                xDrawing(x1, y1, x2, y2);
                            }
                        }
                    }
                    if (Turn = true){
                        xDrawing(x1, y1, x2, y2);
                    }
                }
            }
        });
    }
    public static void xDrawing (int x1, int y1, int x2, int y2){
        myGraphics.setColor(Color.blue);
        myGraphics.drawLine(x1, y1, x2, y2);
        myGraphics.drawLine(x1, x2, y1, y2);
    }
    public static void oDrawing (int x1, int y1, int x2, int y2){
        myGraphics.setColor(Color.red);
        myGraphics.drawOval(x1, y1, x2, y2);
    }
    
}
