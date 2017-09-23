/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch6lemonadeproject;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author venra
 */
public class Ch6LemonadeProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //define variables
        int dayNumber;
        int temperature;
        int cupPrice;
        int cupsSold;
        double daySales;
        double totalSales;
        Random myRandom = new Random();
        Scanner myScanner = new Scanner (System.in);
        //Start loop of five days
        dayNumber = 1;
        totalSales = 0.0;
        do{
            //pick a random temperature between 60 and 100
            temperature = myRandom.nextInt(41)+60;
            System.out.println("\nWelcome to day " + dayNumber + ", the temperature is " + temperature + " degrees.");
            
            //get price
            System.out.print("How many cents do you want to charge for a cup of lemonade? Whole number please no decimal. ");
            cupPrice = myScanner.nextInt();
            
            //get cups sold, provide sales report
            cupsSold = getSales (temperature, cupPrice);
            daySales = cupsSold*cupPrice/100.0;
            totalSales = daySales + totalSales;
            System.out.println("\nYou sold " + cupsSold + " cups of lemonade earning $" + daySales + ".");
            if (dayNumber > 1){
                System.out.println("Total Sales after " + dayNumber + " days are $" + totalSales + ".");
            }
            
            //go to next day
            dayNumber = dayNumber + 1;
        }
        while (dayNumber<6);
        System.out.println("\nThe lemonade stand is now closed");
    }
    //getSales method
    public static int getSales (int t, double p){
        //t represents temperature
        //p represents price
        double bestPrice;
        double maxSales;
        double adjustment;
        Random anotherRandom = new Random ();
        
        //find best price
        bestPrice = (t-60.0) * (45 - anotherRandom.nextInt(20))/40.0+20.0;
        
        //find maximum sales
        maxSales = (t-60.0) * (230 - anotherRandom.nextInt(100))/40.0+20.0;
        
        //find sales adjustment
        adjustment = 1.0 - Math.abs((p-bestPrice)/bestPrice);
        if (adjustment<0.0){
            adjustment = 0.0;
        }
        //return adjusted sales
        return((int) (adjustment * maxSales));
    }
    
}
//END OF CODE