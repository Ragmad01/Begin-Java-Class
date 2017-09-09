/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algebraproblem;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author venra
 */
public class AlgebraProblem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Random myRandom = new Random();
        int adder = 0;
        System.out.println("You can print 7 different x values and the program will solve for y");
        do {
            System.out.println("The problem is y = 9x - 21");
            System.out.print("Enter any x value here and get the coordinate answer: ");
            int xValue = myScanner.nextInt();
            int yValue = calcProb(xValue);
            System.out.print("The full answer is (" + xValue + ", " + yValue + ").");
            adder++;
        }
        while (adder <=7);
    }
    public static int calcProb(int x){
        System.out.println("The first step to solving this problem is doing 9x.");
        x = 9*x;
        System.out.println("The answer is " + x);
        System.out.println(" Then we do x - 21");
        x = x - 21;
        System.out.println("The answer to that is " + x);
        System.out.println("So, our final y anwer is " + x);
        return (x);
    }
    
}
