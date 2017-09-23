/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author venra
 */
public class Lab6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic her
        System.out.print("What excersise do you want to do (specify number): ");
        Scanner excerciseNum = new Scanner (System.in);
        int exNum = excerciseNum.nextInt();
        if (exNum == 9){
            oddOrEven();
        }
        else if (exNum == 5){
            average();
        }
        else if (exNum == 1){
            primeNum();
        }
        else if (exNum == 7){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please print the two numbers you would like to get a minimun and maximum here");
            System.out.print("Number 1: ");
            int xx = scanner.nextInt();
            System.out.print("Number 2: ");
            int yy = scanner.nextInt();
            minNum(xx, yy);
            maxNum(xx, yy);
        }
    }
    public static void average(){
        Scanner myScanner = new Scanner (System.in);
        int num1, num2, num3, num4, num5;
        System.out.println("This program will calculate the average of 5 numbers of your choice.");
        System.out.println("Please print the numbers here");
        System.out.print("Number 1: ");
        num1 = myScanner.nextInt();
        System.out.print("Number 2: ");
        num2 = myScanner.nextInt();
        System.out.print("Number 3: ");
        num3 = myScanner.nextInt();
        System.out.print("Number 4: ");
        num4 = myScanner.nextInt();
        System.out.print("Number 5: ");
        num5 = myScanner.nextInt();
        int add = num1+num2+num3+num4+num5;
        int average = add/5;
        System.out.println("The average of the 5 numbers is " + average + ".");
    }
    public static void oddOrEven(){
        Scanner input = new Scanner (System.in);
        int num;
        do {
            System.out.println("Enter a number");
            num = input.nextInt();
            if (!(num<=10 && num>0)){
                
            }
            else{
                if (num%2 == 0){
                    System.out.println("You entered an even number");
                }
                else {
                    System.out.println("You entered an odd number");
                }
            }
        }
        while (num<=10 && num<0);
    }
    public static void primeNum(){
    System.out.println("Number 1");
    System.out.println("This program will get a random number and decide if it is a prime number or not.");
    System.out.println();
    Random myRandom = new Random ();
    int runtimeNum = 0;
    while (runtimeNum<=5){
        int randomNum = myRandom.nextInt(100);
        System.out.println("The random number is " + randomNum);
        if (randomNum%2==0){
            System.out.println("This number is not prime.");
            System.out.println();
        }
        else if (randomNum%3==0){
            System.out.println("This number is not prime.");
            System.out.println();
        }
        else if (randomNum%4==0){
            System.out.println("This number is not prime.");
            System.out.println();
        }
        else if (randomNum%5==0){
            System.out.println("This number is not prime.");
            System.out.println();
        }
        else if (randomNum%6==0){
            System.out.println("This number is not prime.");
            System.out.println();
        }
        else if (randomNum%7==0){
            System.out.println("This number is not prime.");
            System.out.println();
        }
        else if (randomNum%8==0){
            System.out.println("This number is not prime.");
            System.out.println();
        }
        else if (randomNum%9==0){
            System.out.println("This number is not prime.");
            System.out.println();
        }
        else if (randomNum%10==0){
            System.out.println("This number is not prime.");
            System.out.println();
        }
        else{
            System.out.println("This number seems to be prime vegetables.");
            System.out.println();
        }
        runtimeNum = runtimeNum + 1;
    }    
}
    public static void minNum(int x, int y){
        System.out.println("The two numbers you have selcected are " + x + " and " + y + ".");
        if (x<y){
            System.out.println(x + " is less than " + y + ".");
        }
        else {
            System.out.println(y + " is less than " + x + ".");
        }
}
    public static void maxNum(int x, int y){
        if (x>y){
            System.out.println(x + " is greater than " + y + ".");
        }
        else {
            System.out.println(y + " is greater than " + x + ".");
        }
    }
}
