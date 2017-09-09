/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diceroll;

import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author venra
 */
public class DiceRoll {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println("Welcome to Custom Dice Roller by Raghav Venkataramani.");
        System.out.println("To roll a normal 6 dice type: normalDice");
        System.out.println("To make your own dice, type: newDice");
        Random random = new Random();
        Scanner input = new Scanner (System.in);
        int howManyRolls;
        int Rolls = 0;
        int howManyFace;
        int normalDice;
        int number = 1;
        String whatOption;
        System.out.print("Type your selection here: ");
        whatOption = input.next();
        if (whatOption.equalsIgnoreCase("normalDice")) {
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.print("Please print the number of rolls you would like to initiate: ");
            howManyRolls = input.nextInt();
            while (Rolls<howManyRolls){
                normalDice = random.nextInt(7);
                System.out.println("Roll number " + number + ". The dice says: " + normalDice);
                Rolls = Rolls + 1;
                number = number + 1;
            }
            }
        else if (whatOption.equalsIgnoreCase("newDice")){
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.print("Please type the number of rolls you would like to initiate: ");
            howManyRolls = input.nextInt();
            System.out.print("Please type the amount of sides you would like your dice to have: ");
            howManyFace = input.nextInt();
            while (Rolls<howManyRolls) {
                normalDice = random.nextInt(howManyFace) + 1;
                System.out.println("Roll number " + number + ". The dice says: " + normalDice);
                Rolls = Rolls + 1;
                number = number + 1;
            }
        }
        else {
            System.out.println("You have not entered one of the two options.");
            System.out.println("Please restart the program");
        }
        }
        }
        
        
    
    

