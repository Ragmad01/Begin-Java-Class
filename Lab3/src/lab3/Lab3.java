/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab3;
import java.util.Scanner;
/**
 *
 * @author venra
 */
public class Lab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Number 6");
        Scanner input = new Scanner(System.in);
        System.out.print("Retail Price:");
        double retailPrice = input.nextDouble();
        System.out.print("What is the Sales Tax:");
        double salesTax = input.nextDouble();
        double priceOfTax = retailPrice * salesTax;
        //calculating the tax
        double totalPrice = retailPrice + priceOfTax;
        //calculating total price
        System.out.print("The retail of the item is $" + retailPrice);
        System.out.println(" and the sales tax is " + salesTax + "%");
        System.out.println("Total price is $" + totalPrice);
        //Printing all of the needed information
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("Number 8");
        double startBal = 30000.0;
        int totalDeposits = 100000;
        int totalWithdraw = 10000;
        double interestRate = 2.23;
        double totalB1 = startBal + totalDeposits - totalWithdraw;
        //starting balance with the deposits and withdrawels
        double totalB2 = totalB1 * interestRate;
        //interst rate that is added onto the totalB1
        double finalBal = totalB1 + totalB2;
        System.out.print("The Grand Total is...$" + finalBal + "0");
        System.out.println("...TA DA");
        System.out.println();
        System.out.println();
        System.out.println();
       
        System.out.println("Number 10");
        System.out.println("Input Fahrenheit");
        double Fahrenhiet = input.nextDouble();
        double celcius;
        double celcius2 = 32-Fahrenhiet;
        double celciusFinal = celcius2/1.8;
        System.out.println("Fahrenheit is:" + Fahrenhiet);
        System.out.println("Celcius is:" + celciusFinal);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Number 11");
        System.out.println("Input math score");
        double math = input.nextDouble();
        System.out.println("Input english score");
        double english = input.nextDouble();
        System.out.println("Input science score");
        double science = input.nextDouble();
        System.out.println("Sam scored " + math + "% in Math");
        System.out.println("Sam scored " + english + "% in English");
        System.out.println("Sam scored " + science + "% in Science");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Number 11");
        System.out.println("My name is Raghav Venkataramani");
        System.out.println("My phone number is 804-360-2497");
        System.out.println("My email is raghavvenkataramani@gmail.com");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Number 13");
        System.out.println("Input math score");
        double mathMe = input.nextDouble();
        System.out.println("Input english score");
        double englishMe = input.nextDouble();
        System.out.println("Input science score");
        double scienceMe = input.nextDouble();
        double preAverage = mathMe*englishMe*scienceMe;
        double average = preAverage/3;
        System.out.println("My average is:" + average);
        
        
        
        
        
                
        
        
        
        
    }
    
}
