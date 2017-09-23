/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timertest;
import java.awt.*;
import java.awt.event.*;
import javax.swing.Timer;
import java.util.Random;
/**
 *
 * @author venra
 */
public class TimerTest extends Frame {
static Frame myFrame;
static Timer myTimer;
static Timer myTimer2;
static Timer myTimer3;
static Timer myTimer4;
static Timer myTimer5;
static Timer myTimer6;
static int delta = 0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create frame
        myFrame = new Frame();
        myFrame.setSize(600, 500);
        myFrame.setTitle("Timer testing");
        myFrame.setVisible(true);
        myTimer = new Timer (1000, new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Toolkit.getDefaultToolkit().beep();
                }
        });
        
        myTimer2 = new Timer(50, new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Random myRandom = new Random();
                Color myColor;
                myColor = new Color(myRandom.nextInt(256), myRandom.nextInt(256), myRandom.nextInt(256));
                //myFrame.setBackground(myColor);
                Graphics myGraphics = myFrame.getGraphics();
                myGraphics.setColor(myColor);
                //myGraphics.drawOval(delta, 100, 400 - 2 * delta, 300 - 2 * delta);
                myGraphics.drawOval(50, 50, delta - 1, delta);
                delta++;
                if (delta>1000){
                    delta = 0;
                    myGraphics.clearRect(0,0,400,400);
                }
            }
        });
        myTimer3 = new Timer(50, new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Random myRandom = new Random();
                Color myColor;
                myColor = new Color(myRandom.nextInt(256), myRandom.nextInt(256), myRandom.nextInt(256));
                //myFrame.setBackground(myColor);
                Graphics myGraphics = myFrame.getGraphics();
                myGraphics.setColor(myColor);
                //myGraphics.drawOval(delta, 100, 400 - 2 * delta, 300 - 2 * delta);
                myGraphics.drawRect(delta, delta, 600 - 2 * delta, 500 - 2 * delta);
                delta++;
                if (delta>1000){
                    delta = 0;
                    myGraphics.clearRect(0,0,400,400);
                }
            }
        });
        myTimer4 = new Timer(50, new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Random myRandom = new Random();
                Color myColor;
                myColor = new Color(myRandom.nextInt(256), myRandom.nextInt(256), myRandom.nextInt(256));
                //myFrame.setBackground(myColor);
                Graphics myGraphics = myFrame.getGraphics();
                myGraphics.setColor(myColor);
                //myGraphics.drawOval(delta, 100, 400 - 2 * delta, 300 - 2 * delta);
                myGraphics.drawRect(0, delta, 2000, 2000);
                delta++;
                if (delta>2000){
                    delta = 0;
                    myGraphics.clearRect(0,0,400,400);
                }
            }
        });
        myTimer5 = new Timer(50, new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Random myRandom = new Random();
                Color myColor;
                myColor = new Color(myRandom.nextInt(256), myRandom.nextInt(256), myRandom.nextInt(256));
                //myFrame.setBackground(myColor);
                Graphics myGraphics = myFrame.getGraphics();
                myGraphics.setColor(myColor);
                //myGraphics.drawOval(delta, 100, 400 - 2 * delta, 300 - 2 * delta);
                myGraphics.setFont(new Font("TimesRoman", Font.PLAIN, 30));
                myGraphics.drawString("Slinky thingy", 350, 100);
                myGraphics.drawArc(50, delta, 300, 300, 300, 400);
                delta++;
                if (delta>150){
                    delta = 0;
                    myGraphics.clearRect(0,0,400,1000);
                }
            }
        });
        myTimer6 = new Timer(50, new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Random myRandom = new Random();
                Color myColor;
                myColor = new Color(myRandom.nextInt(256), myRandom.nextInt(256), myRandom.nextInt(256));
                //myFrame.setBackground(myColor);
                Graphics myGraphics = myFrame.getGraphics();
                myGraphics.setColor(myColor);
                //myGraphics.drawOval(delta, 100, 400 - 2 * delta, 300 - 2 * delta);
                myGraphics.drawString("YOLO", 10, delta);
                myGraphics.drawString("YOLO", 45, delta);
                myGraphics.drawString("YOLO", 80, delta);
                myGraphics.drawString("YOLO", 115, delta);
                myGraphics.drawString("YOLO", 150, delta);
                myGraphics.drawString("YOLO", 185, delta);
                myGraphics.drawString("YOLO", 220, delta);
                myGraphics.drawString("YOLO", 255, delta);
                myGraphics.drawString("YOLO", 290, delta);
                myGraphics.drawString("YOLO", 325, delta);
                myGraphics.drawString("YOLO", 360, delta);
                myGraphics.drawString("YOLO", 395, delta);
                delta = delta+10;
                if (delta>1000){
                    delta = 0;
                    myGraphics.clearRect(0,0,400,400);
                }
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
                    myTimer6.stop();
                }
                else {
                    myTimer.start();
                    myTimer6.start();
                }
            }
        });
    }
    
}
