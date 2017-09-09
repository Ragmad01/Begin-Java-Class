/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch9;
import javax.swing.Timer;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author venra
 */
public class Ch9 extends Frame{
static Frame myFrame;
static Timer myTimer;
static Random myRandom;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        myFrame = new Frame();
        myFrame.setSize(400,300);
        myFrame.setTitle("Timer");
        myFrame.setVisible(true);
        
        myTimer = new Timer(1000, new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Toolkit.getDefaultToolkit().beep();
                
            }
        });
        //add listener for closing frame
        myFrame.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        //add listener for mouse press
        myFrame.addMouseListener(new MouseAdapter(){
            public void mousePressed (MouseEvent e){
                if(myTimer.isRunning()){
                    myTimer.stop();
                }
                else {
                    myTimer.start();
                }
            }
        });
    }
    
}
