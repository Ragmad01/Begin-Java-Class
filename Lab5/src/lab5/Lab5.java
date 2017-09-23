/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author venra
 */
public class Lab5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /* // TODO code application logic here
        Scanner input = new Scanner (System.in);
        System.out.println("Number 10");
        System.out.print("Please input the first three letters of a month to find out what number the month is in the year: ");
        String monthName = input.next();
        if (monthName.equalsIgnoreCase("Jan")){
            System.out.println("January is the first month.");
        }
        else if (monthName.equalsIgnoreCase("Feb")){
            System.out.println("February is the second month.");
        }
        else if (monthName.equalsIgnoreCase("Mar")){
            System.out.println("March is the third month.");
        }
        else if (monthName.equalsIgnoreCase("Apr")){
            System.out.println("April is the fourth month.");
        }
        else if (monthName.equalsIgnoreCase("May")){
            System.out.println("May is the fifth month.");
        }
        else if (monthName.equalsIgnoreCase("Jun")){
            System.out.println("June is the sixth month.");
        }
        else if (monthName.equalsIgnoreCase("Jul")){
            System.out.println("July is the seventh month.");
        }
        else if (monthName.equalsIgnoreCase("Aug")){
            System.out.println("August is the eighth month.");
        }
        else if (monthName.equalsIgnoreCase("Sep")){
            System.out.println("September is the ninth month.");
        }
        else if (monthName.equalsIgnoreCase("Oct")){
            System.out.println("October is the tenth month");
        }
        else if (monthName.equalsIgnoreCase("Nov")){
            System.out.println("November is the eleventh month");
        }
        else if (monthName.equalsIgnoreCase("Dec")){
            System.out.println("December is the twelvth month");
        }
        else{
            System.out.println("ERROR 13: Invalid input, please restart program");
            System.out.println("The instructions were pretty clear. Enter the first three letters of a month");
        }
        System.out.println();
        System.out.println();
        
        System.out.println("Number 9");*/
        Random randomNum = new Random ();/*
        int n = randomNum.nextInt(1000);
        System.out.println("The number the computer choose for you is " + n);
        if (n%2==0){
            System.out.println(`"This number is divisable by 2");
        }
        if (n%3==0){
            System.out.println("This number is divisable by 3");
        }
        if (n%5==0){
            System.out.println("This number is divisable by 5");
        }
        System.out.println();
        System.out.println();*/
        
        System.out.println("Number 4");
        int x = randomNum.nextInt(1001);
        int y = randomNum.nextInt(1001);
        int z = randomNum.nextInt(1001);
        if ((x>y) && (y>z)){
            System.out.println("The numbers in ascending order are " + z + ", " + y + ", " + x);
        }
        else if ((z>x) && (x>y)){
            System.out.println("The numbers in ascending order are " + y + ", " + x + ", " + z);
        }
        else if ((y>z) && (z>x)){
            System.out.println("The numbers in ascending order are " + x + ", " + z + ", " + y);
        }
        else if ((z>y) && (y>x)){
            System.out.println("The numbers in ascending orfer are " + z + ", " + y + ", " + x);
        }
        else if ((y>x) && (x>z)){
            System.out.println("The numbers in ascending orfer are " + z + ", " + x + ", " + y);
        }
        else{
            System.out.println("ERROR Restart Program");
        }
        /*
        System.out.println();
        System.out.println();
        System.out.println("Number 4");
        double xx = randomNum.nextInt(1001);
        double yy = randomNum.nextInt(1001);
        double zz = randomNum.nextInt(1001);
        if ((xx>yy) && (yy>zz)){
            System.out.println("The numbers in ascending order are " + zz + ", " + yy + ", " + xx);
        }
        else if ((zz>xx) && (xx>yy)){
            System.out.println("The numbers in ascending order are " + yy + ", " + xx + ", " + zz);
        }
        else if ((yy>zz) && (zz>xx)){
            System.out.println("The numbers in ascending order are " + xx + ", " + zz + ", " + yy);
        }
        else{
            System.out.println("ERROR Restart Program");*/
            
        System.out.println("Number 1");
        int theRandom = randomNum.nextInt(1001);
        System.out.println(theRandom);
        if (theRandom<0) {
            System.out.println("This number is negative.");
        }
        else {
            System.out.println("This number is positive.");
        }
        System.out.println();
        System.out.println();
        System.out.println("Number 2");
        int randomRand = randomNum.nextInt(1001);
        int randomRand2 = randomNum.nextInt(1001);
        System.out.println("Random number 1: " + randomRand);
        System.out.println("Random number 2: " + randomRand2);
        if (randomRand<randomRand2){
            System.out.println(randomRand + " is less than " + randomRand2);
        }
        else {
           System.out.println(randomRand2 + " is less than " + randomRand); 
        }
        }
        }
        
        
        
        
    
    

