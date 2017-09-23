/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package random.number.game.project;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author venra
 */
public class RandomNumberGameProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int computerNumber;
        int yourGuess;
        Random myRandom = new Random();
        Scanner myScanner = new Scanner(System.in);
        computerNumber = myRandom.nextInt(10) + 1;
        System.out.println("I'm thinking of a number between one and ten.");
        System.out.print("What do you think it is? ");
        yourGuess = myScanner.nextInt();
        if (yourGuess == computerNumber){
            System.out.println("Yay, you got it! That's my number");
        }
        else if (yourGuess<computerNumber){
            System.out.println("Your guess was too low. My number was " + computerNumber + ".");
        }
        else {
            System.out.println("Your guess was too high. My number was " + computerNumber + ".");
        }
    }
    
}
