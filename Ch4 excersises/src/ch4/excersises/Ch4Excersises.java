/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch4.excersises;
import java.util.Scanner;
/**
 *
 * @author venra
 */
public class Ch4Excersises {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner num1 = new Scanner(System.in);
        System.out.print("Please input Roll number here: ");
        int rollNo = num1.nextInt();
        System.out.print("Please input your name here: ");
        String name = num1.next();
        System.out.print("Please input a one letter code for your gender here: ");
        String gender = num1.next();
        System.out.print("Please input your fee here: ");
        double Fee = num1.nextDouble();
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Fee: " + Fee);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Number 2");
        System.out.println();
        System.out.print("Please input the celcius temperature herea; ");
        int celcius = num1.nextInt();
        double firstStep = celcius * 1.8;
        double secondStep = firstStep + 36;
        System.out.println("The temperature in Fahrenheit is: " + secondStep);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Number 3");
        System.out.print("Please input height here: ");
        int height = num1.nextInt();
        System.out.print("Please input length here: ");
        int length = num1.nextInt();
        System.out.print("Pkease input width here: ");
        int width = num1.nextInt();
        int vol = length*width*height;
        System.out.println("The volume is " + vol + " feet");
        
        System.out.println("Number 4");
        System.out.print("Please input the distance of the edge here: ");
        double squareEdge = num1.nextDouble();
        double calc1 = Math.pow(squareEdge, 2.0);
        double calc2 = calc1 * 6;
        System.out.println("The surface area is: " + calc2);
        System.out.println();
        System.out.println();
        System.out.println();
        
        System.out.println("Number 5");
        System.out.print("Please input the first number here");
        int number1 = num1.nextInt();
        int number2 = num1.nextInt();
        int addend = number1 + number2;
        System.out.print("The final answer is " + addend + ".");
        
    }
    
}
