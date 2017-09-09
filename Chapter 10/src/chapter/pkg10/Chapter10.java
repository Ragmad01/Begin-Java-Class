/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter.pkg10;
import java.util.Scanner;
/**
 *
 * @author venra
 */
public class Chapter10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner myScanner = new Scanner (System.in);
       int month;
       int tries;
       do{
            System.out.print("Enter a number that corresponds to a month of the year: ");
            month = myScanner.nextInt();
            switch(month){
            case 1: 
                System.out.println("It's January");
                break;
            case 2:
                System.out.println("It's February");
                break;
            case 3:
                System.out.println("It's March");
                break;
            case 4:
                System.out.println("It's April");
                break;
            case 5:
                System.out.println("It's May");
                break;
            case 6: 
                System.out.println("It's June");
                break;
            case 7: 
                System.out.println("It's July");
                break;
            case 8: 
                System.out.println("It's August");
                break;
            case 9: 
                System.out.println("It's September");
                break;
            case 10:
                System.out.println("It's October");
                break;
            case 11:
                System.out.println("It's November");
                break;
            case 12:
                System.out.println("It's December");
                break;
            default:
                System.out.println("You have entered a number that does not corespond to a month");
                break;
                //tries = tries + 1;
    }
       }
       while(month>12);
       //if (tries )
    }
    
}
