/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;
import java.util.Scanner;
/**
 *
 * @author venra
 */
public class Lab7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Table of contents");
        System.out.println("1. This program gets the sum of 10 numbers you enter.");
        System.out.println("2. This program prints an array backwards.");
        System.out.println("3.");
        System.out.println("4.");
        System.out.println("5.This program gets even and odd numbers from 1-20");
        System.out.println("6.");
        System.out.println("7.");
        System.out.println("81. This program figures out whether you know your days of the week.");
        System.out.println("82. This program figures out if you can remember words you enter.");
        System.out.print("What excersise do you want to do (specify number): ");
        Scanner excerciseNum = new Scanner (System.in);
        int exNum = excerciseNum.nextInt();
        if (exNum == 1){
            number1();
        }
        else if (exNum == 2){
            number2();
        }
        else if (exNum == 3){
            
        }
        else if (exNum == 4){
            
        }
        else if (exNum == 5){
            number5();
        }
        else if (exNum == 6){
            
        }
        else if (exNum == 8){
            
        }
        else if (exNum == 81){
            num1ber8();
        }
        else if (exNum == 82){
            number8homework();
        }
        else{
            System.out.println("The number you have entered does not have a linked method.");
        }
    }
    public static void number1(){
        Scanner myScanner = new Scanner (System.in);
        System.out.print("Input number 1 here: ");
        int num1 = myScanner.nextInt();
        System.out.print("Input number 2 here: ");
        int num2 = myScanner.nextInt();
        System.out.print("Input number 3 here: ");
        int num3 = myScanner.nextInt();
        System.out.print("Input number 4 here: ");
        int num4 = myScanner.nextInt();
        System.out.print("Input number 5 here: ");
        int num5 = myScanner.nextInt();
        System.out.print("Input number 6 here: ");
        int num6 = myScanner.nextInt();
        System.out.print("Input number 7 here: ");
        int num7 = myScanner.nextInt();
        System.out.print("Input number 8 here: ");
        int num8 = myScanner.nextInt();
        System.out.print("Input number 9 here: ");
        int num9 = myScanner.nextInt();
        System.out.print("Input number 10 here: ");
        int num10 = myScanner.nextInt();
        int [] tenNums = {num1, num2, num3, num4, num5, num6, num7, num8, num9, num10};
        int total = 0;
        for (int h = 0; h<10; h++){
            total = tenNums[h] + total;
        }
        System.out.println("The sum of all the numbers you entered is " + total);
    }
    public static void number2(){
        int [] yes = {1,2,3,4,5,6,7};
        for (int g = 0; g<7; g++){
            System.out.print(yes[g] + ", ");
        }
        System.out.println();
        System.out.println();
        System.out.println("The same array backwards: ");
        for (int u = 6; u>=0; u--){
            System.out.print(yes[u] + ", ");
        }
    }
    public  static void number5(){
        int [] oddEven = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        System.out.println("This program will figure out how many odd and even numbers");
        System.out.println("there are in between 1 and 20.");
        //find odd numbers
        int oddNums = 0;
        for (int k = 0; k<oddEven.length; k++){
            if (oddEven[k]%2==1){
                oddNums++;
            }
        }
        //find even numbers
        int evenNums = 0;
        for (int w = 0; w<oddEven.length; w++ ){
            if (oddEven[w]%2==0){
                evenNums++;
            }
        }
        System.out.println("The number of even numbers is " + evenNums);
        System.out.println("The number of odd numbers is " +  oddNums);
    }
    public static void num1ber8 (){
        Scanner newScanner = new Scanner(System.in);
        System.out.print("Type long if you want the long version or short if you want the short version: ");
        String what = newScanner.nextLine();
        if (what.equalsIgnoreCase("long")){
            String [] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        Scanner myScanner = new Scanner (System.in);
        System.out.print("Type in a day of the week here: ");
        String input = myScanner.next();
        for (int t = 0; t<7; t++){
            if (input.equalsIgnoreCase(daysOfWeek[t])){
                System.out.println("The day you typed in was " + daysOfWeek[t]);
            }
            else{
                System.out.println("The day you typed in was not " + daysOfWeek[t]);
            }
        }
        System.out.println("Do you want this program to be funny? If yes type yes. If no, type no: ");
        String funny = myScanner.next();
        if (funny.equalsIgnoreCase("yes")){
            System.out.println("Did I get it right?");
            System.out.print("Depending on whether or not it works, type yes or no here: ");
            String scan1 = myScanner.next();
            if (scan1.equalsIgnoreCase("yes")){
                System.out.println("YAY! Congradulate me");
            }
            else {
                System.out.println("AW MAN! I failed life as I computor. You should just throw me away");
            }
        }
        else{
            System.out.println("Program is completed.");
        }
        }
        else{
            Scanner input = new Scanner(System.in);
        String [] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        System.out.print("Enter a day of the week that exists: ");
        String value = input.nextLine();
        boolean x=true;
        for (int i = 0; i<days.length; i++){
            if(value.equalsIgnoreCase(days[i])){
                x = true;
                break;
            }
            else{
                x = false;
            }
        }
        if(x==true){
            System.out.println("You're right! The day you entered exists.");
        }
        else {
            System.out.println("Come back to reality!");
        }
        }
    }
    public static void number8homework(){
        Scanner myScanner = new Scanner (System.in);
        System.out.print("Input word 1 here: ");
        String word1 = myScanner.next();
        System.out.print("Input word 2 here: ");
        String word2 = myScanner.next();
        System.out.print("Input word 3 here: ");
        String word3 = myScanner.next();
        System.out.print("Input word 4 here: ");
        String word4 = myScanner.next();
        System.out.print("Input word 5 here: ");
        String word5 = myScanner.next();
        System.out.print("Input word 6 here: ");
        String word6 = myScanner.next();
        System.out.print("Input word 7 here: ");
        String word7 = myScanner.next();
        System.out.print("Input word 8 here: ");
        String word8 = myScanner.next();
        System.out.print("Input word 9 here: ");
        String word9 = myScanner.next();
        System.out.print("Input word 10 here: ");
        String word10 = myScanner.next();
        System.out.print("Input word 11 here: ");
        String word11 = myScanner.next();
        System.out.print("Input word 12 here: ");
        String word12 = myScanner.next();
        String [] words = {word1, word2, word3, word4, word5, word6, word7, word8, word9, word10, word11, word12};
        System.out.print("Enter a word you typed in that exists within the array: ");
        Scanner scanner = new Scanner (System.in);
        String value = scanner.next();
        for (int j = 0; j<12; j++){
            if (value.equalsIgnoreCase(words[j])){
                System.out.println("The word you typed in was " + words[j] + ". *****");
            }
            else{
                System.out.println("The word you typed is not " + words[j]);
            }
        }
    }
}

