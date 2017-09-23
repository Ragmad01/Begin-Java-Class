/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch6homework;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author venra
 */
public class Ch6Homework {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        number1();
        System.out.print("Type two numbers here that are seperated by a space: ");
        number2();
        int Scan1 = myScanner.nextInt();
        int Scan2 = myScanner.nextInt();
        System.out.print("Type two numbers here that are seperated by a space: ");
        number1Also(Scan1, Scan2);
    }
    public static void number1(){
    Random myRandom=new Random();
    int num1 = myRandom.nextInt(11);
    int num2 = myRandom.nextInt(11);
    if (num1>num2){
        System.out.println(num1 + " is greater than " + num2);
    }
    else {
        System.out.println(num2 + " is greater than " + num1);
    }
}
    public static int number1Also(int x, int y){
 
        if (x>y){
            return x;
        }
        else {
            return y;
        }

     
    }
    public static void number2(){
        Scanner myScanner = new Scanner(System.in);
        int int1 = myScanner.nextInt();
        int int2 = myScanner.nextInt();
        int sub1;
        int sub2;
        System.out.println("The numbers you typed are " + int1 + " and " + int2 + ".");
        sub1 = int1;
        sub2 = int2;
        int1 = int2;
        int2 = sub1;
        System.out.println("After the numbers have been switched: Switcharoonees are " + int1 + " and " + int2 + ".");
    }

        
    
}
