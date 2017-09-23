/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state.capitals;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author venra
 */
public class StateCapitals {
static String op1;
static String op2;
static String op3;
static String op4;
static boolean rightWrong;
static int score = 0;
static Random myRandom;
static Scanner myScanner;
static int stateNum;
static int stateCount;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Welcome to State Caps trrrrivia game show!");
        System.out.println("Choose the right Capital for each state!");
        System.out.println("Getting the answer right will give you a point...");
        System.out.println("But, getting it wrong will take away a point.");
        stateCapsGame();
    }
    public static void stateCapsGame(){
        myRandom = new Random();
        myScanner = new Scanner (System.in);
        stateNum = 50;
        String [] states = {"Alabama","Alaska","Arizona","Arkansas","California","Colorado","Connecticut","Delaware","Florida","Georgia","Hawaii","Idaho","Illinois","Indiana","Iowa","Kansas","Kentucky","Louisiana","Maine","Maryland","Massachusetts","Michigan","Minnesota","Mississippi","Missouri","Monatana","Nebraska","Nevada","New Hampshire","New Jersey","New Mexico","New York","North Carolina","North Dakota","Ohio","Oklahoma","Oregon","Pennsylvania","Rhode Island","South Carolina","South Dakota","Tennessee","Texas","Utah","Vermont","Virginia","Washington","West Virginia","Wisconsin","Wyoming"};
        String [] capitals = {"Montgomery","Juneau","Pheonix","Little Rock","Sacramento","Denver","Hartford","Dover","Tallahassee","Atlanta","Honolulu","Boise","Springfield","Indianapolis","Des Moines","Topeka","Frankfort","Baton Rouge","Augusta","Ammapolis","Boston","Lansing","St. Paul","Jackson","Jefferson City","Helena","Lincoln","Carson City","Concord","Trenton","Santa Fe","Albany","Raleigh","Bismarck","Columbus","Oklahoma City","Salem","Harrisburg","Providence","Columbia","Pierre","Nashville","Austin","Salt Lake City","Montpelier","Richmond","Richmond","Olympia","Charleston","Madison","Cheyenne"};
        int Rand1 = myRandom.nextInt(50);
        int Rand2 = myRandom.nextInt(50);
        int Rand3 = myRandom.nextInt(50);
        int Rand4 = myRandom.nextInt(50);
        stateCount = 50;
        rightWrong = false;
        int x = 0;
        int stateReference = 50;
        int chooseRightOption;
        do{
            int stateRand = myRandom.nextInt(stateNum);
            String stateName = states[stateRand];
            chooseRightOption = myRandom.nextInt(5);
            System.out.println("State is: " + stateName);
            System.out.println();
            if (chooseRightOption == 1){
                op1 = capitals[stateRand];
                System.out.println("1 - " + op1);
                x = 1;
            }
            else{
                op1 = capitals[Rand1];
                System.out.println("1 - " + op1);
            }
            if (chooseRightOption == 1){
                op1 = capitals[stateRand];
                System.out.println("1 - " + op1);
                x = 1;
                }
                if (chooseRightOption == 2){
                op2 = capitals[stateRand];
                System.out.println("2 - " + op2);
                x = 2;
                }
            else{
                    op2 = capitals[Rand2];
                    System.out.println("2 - " + op2);
            }
            if (chooseRightOption == 3){
                    op3 = capitals[stateRand];
                    System.out.println("3 - " + op3);
                    x = 3;
            }
            else{
                    op3 = capitals[Rand3];
                    System.out.println("3 - " + op3);
            }
            if(chooseRightOption == 4){
                    op4 = capitals[stateRand];
                    System.out.println("4 - " + op4);
                    x = 4;
            }
            else{
                    op4 = capitals[Rand4];
                    System.out.println("4 - " + op4);
            }
            System.out.println();
            System.out.print("What is the capitol? (Enter 0 to stop): ");
            int input = myScanner.nextInt();
            if (input == x){
                System.out.println("Yay! You got the right answer");
                score++;
                System.out.println("Your score right now is: " + score);
            }
            else if /*((input<x)&&(input>x)&&(input!=0))*/((input != x)&& (input != 0)){
                System.out.println("Aw man! That wasn't the answer.");
                System.out.println("The right answer was: " + capitals[stateRand]);
                score--;
                System.out.println("Your score right now is: " + score);
            }
            else if(input == 0){
                System.out.println("Thanks for playing!");
                System.out.println("Your final score is: " + score);
                break;
            }
            stateNum--;
            stateReference--;
        }
        while (stateReference>0);
    }
    
}
