/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardwars;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author venra
 */
public class CardWars {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        playOrNo();
    }
    /*
    Card Display
    Beginning Java
    */
    public static int cardDisplay(int n){
        //given card number n (0-51), prints discription and returns numeric value.
        String suit;
        String[] value = new String [13];
        value[0] = "Two";
        value[1] = "Three";
        value[2] = "Four";
        value[3] = "Five";
        value[4] = "Six";
        value[5] = "Seven";
        value[6] = "Eight";
        value[7] = "Nine";
        value[8] = "Ten";
        value[9] = "Jack";
        value[10] = "Queen";
        value[11] = "King";
        value[12] = "Ace";
        // determine card's suit, adjust nuumberic value n.
        if (n>=0 && n<=12){
            suit = "Hearts";
        }
        else if (n>=13 && n<=25){
            suit = "Diamonds";
            n = n - 13;
        }
        else if (n>=26 && n<=38){
            suit = "Clubs";
            n=n-26;
        }
        else{
            suit = "Spades";
            n=n-39;
        }
        //print description
        System.out.println(value[n] + " of " + suit);
        // return numeric value
        return(n);
    }
    /*
    Shuffle Method
    */
    public static int[] nIntegers (int n){
        int nArray[] = new int[n];
        int temp, s;
        Random myRandom = new Random();
        //initializa array from 0 - n - 1
        for (int i=0; i<n; i++){
            nArray [i] = i;
        }
        // perform one card shuffle
        // i is the numebr of items remaining in the list
        // s is the random selection from that list
        // we swap last time i - 1 with selection s
        for (int i=n; i>=1; i--){
            s = myRandom.nextInt(i);
            temp = nArray[s];
            nArray[s] = nArray[i-1];
            nArray[i-1]=temp;
        }
        return(nArray);
    }
    public static void playOrNo (){
        Scanner nextScanner = new Scanner (System.in);
        System.out.println("Computer here!");
        System.out.println("If you would like to play a nice game of");
        System.out.println("card war with me, type yes.");
        System.out.println("If not type no.");
        System.out.println("I DEFINETELY won't mind");
        System.out.print("Answer: ");
        String input = nextScanner.next();
        if (input.equalsIgnoreCase("yes")){
             //declare the needed variables
        int cardIndex = 0;
        int computerScore = 0;
        int yourScore = 0;
        int computerCard;
        int yourCard;
        int[] myCards = new int[52];
        Scanner myScanner = new Scanner (System.in);
        //shuffle the cards
        myCards = nIntegers(52);
        //do loop
        do{
            //display computer card, then your card.
            System.out.print("My card: ");
            computerCard = cardDisplay(myCards[cardIndex]);
            System.out.print("Your card: ");
            yourCard = cardDisplay(myCards[cardIndex +1]);
            //see who won
            if (yourCard>computerCard){
                System.out.println("You win!");
                yourScore = yourScore + 2;
            }
            else if (computerCard>yourCard){
                System.out.println("I win!");
                computerScore = computerScore + 2;
            }
            else{
                System.out.println("It's a tie.");
                yourScore = yourScore + 1;
                computerScore = computerScore + 1;
            }
            System.out.println("My Score: " + computerScore);
            System.out.println("Your Score: " + yourScore);
            cardIndex = cardIndex + 2;
            System.out.println("There are " + (52-cardIndex) + " cards remaining");
            System.out.println("Press the enter key. ");
            myScanner.nextLine();
        }
        while ((52-cardIndex)>0);
        System.out.println("Game over");
        }
        else{
            System.out.println("Why are you here?");
            System.out.println("You just said you don't want to play so please, just stop bothering me");
            System.out.println("and just shut down the program and test some other program.");
            System.out.println("....................................");
            System.out.println("....................................");
            System.out.println("....................................");
            System.out.println("....................................");
            System.out.println("....................................");
            System.out.println("....................................");
            System.out.println("....................................");
            System.out.println("....................................");
            System.out.println("....................................");
            System.out.println("....................................");
            System.out.println("Still there? Well feast on this.");
            System.out.println("I am about to create an endless loop which will make it so you will");
            System.out.println("be stuck loading the word leave endlessly!");
            System.out.println("Mwha ha ha ha haaa heh heh *cough* *cough*");
            System.out.println("GET READY!!!!");
            System.out.println("Computing");
            System.out.println("01000101001010100101010100101011010101101010010");
            System.out.println("01001011110101010010101011010101000010101101000");
            System.out.println("11111101001001001010101010010111010101001010111");
            System.out.println("10010100101010100101010100101010101010101001010");
            System.out.println("00000000000000000000000000000000000000000000000");
            System.out.println("Computing done");
            int g = 0;
            while (g<=10){
                System.out.println("Leave!");
                g++;
            }
            System.out.println("Oh wait you can just turn off the program.");
            System.out.println("Well now that I have calmed down, I'll see you later.");
            System.out.println("And um, uhhhhhh, I may have accidentaly set a self destruction");
            System.out.println("mechanism that will arm in 20 seconds.");
            System.out.println("SOOOOOO sorry. Gotta go. Just stop the program and the computer");
            System.out.println("will not blow up.");
        }
    }
}
