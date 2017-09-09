/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.pkg6;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author venra
 */
public class Ch6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       System.out.println("Guessing Game");
       int randomNum;
       int myGuess;
       Random guess = new Random();
       Scanner input = new Scanner (System.in);
       
       randomNum = guess.nextInt(10) + 1;
       System.out.println("I am thinking of a random number between 1 and 10" + randomNum);
       do {
           System.out.print("My guess is:");
           myGuess = input.nextInt();
           if (myGuess==randomNum){
               System.out.println("Yay, you got it");
           }
           else if (myGuess > randomNum){
               System.out.println("Guess too high. Try a lower number.");
           }
           else{
               System.out.println("You're too low. Try a higher number.");
           }
       }
       while(myGuess != randomNum);
    }
}
