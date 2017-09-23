/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch5;

import java.util.Scanner;
/**
 *
 * @author venra
 */
public class Ch5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String name = "Raghav";
        String lastName = "Venkataramani";
        //not putting quotation marks will result in a syntax error.
        System.out.println(name);
       // System.out.println(Name); Run time error.
       
       //logic error
       int x = 5+3*2/4+3;
       System.out.println(x);
       x = (5+3)*(2/4)+3;
       System.out.println(x);
       
       
       //another logic errror
       int startBalence = 100;
       int withdraw = 10;
       int total = withdraw - startBalence;
       System.out.println(total);
       //runtime error
       //int y = 5/0;
       //System.out.println(y);
       
       int z = 0/5;
       System.out.println(z);
       
       //runtime error
       double error = Math.sqrt(-4);
       System.out.println(error);
       
       //Comparison Operators
       Boolean tF = 6==7;
       System.out.println(tF);
       
       Boolean notEqual = 9!=9;
       System.out.println(notEqual);
       
       String coffee = "java";
       String language = "Java";
       System.out.println(coffee.equalsIgnoreCase(language));
       System.out.println();       
       System.out.println("Logical Operators: AND");
       int five=5;
       int three = 3;
       int one = 1;
       int fiftyTwo = 52;
       
       boolean compareNum = (five>6) && (one>1);
       boolean compareNum2 = (five>6) && (one>=1);
       boolean compareNum3 = (five<6) && (one>=1);
       
       System.out.println(compareNum +" "+ compareNum2 +" "+ compareNum3);
       System.out.println(compareNum);
       System.out.println(compareNum2);
       System.out.println(compareNum3);
       
       System.out.println();
       System.out.println("Logical Operators: OR");
       
       
       boolean compareOR = (five>6) || (one>1);
       boolean compareOR2 = (five>6) || (one>=1);
       boolean compareOR3 = (five<6) || (one>=1);
       
       System.out.println(compareOR +" "+ compareOR2 +" "+ compareOR3);
       System.out.println(compareOR);
       System.out.println(compareOR2);
       System.out.println(compareOR3);
       
       System.out.println("What is this: ");
       System.out.println(true && true || false);
       
       System.out.println("What is this: ");
       System.out.println(true && false || false);
       
       System.out.println("What is this: ");
       System.out.println(true || false || false);
       
       System.out.println("What is this: ");
       System.out.println(true || true || false);
       System.out.println();
       System.out.println();
       
       System.out.println();
       System.out.println("If-else conditions");
       int age;
       Scanner ageInput = new Scanner(System.in);
       System.out.print("What is your age? ");
       age = ageInput.nextInt();
     /*  
       if (age>5 && age<=49){
           System.out.println("You're in School");
       }
       else if(age>=50){
           System.out.println("Are you not done yet?");
       }
       else{
           System.out.println("Take your time");
       if (age>5){
           System.out.println("You're in School");
       }
       else if(age>=50){
           System.out.println("Are you not done yet?");
       }
       else{
           System.out.println("Take your time");
       }
           System.out.println();
           System.out.println();
           System.out.println();
           System.out.println("Homework Excersise");
           Scanner userInput = new Scanner(System.in);
           System.out.print("Please input first number here: ");
           int num1 = userInput.nextInt();
           System.out.print("Please input your second number here: ");
           int num2 = userInput.nextInt();
           if (num1>num2){
               System.out.println(num1 + " is greater than " + num2 + ".");
           }
           else{
               System.out.println(num2 + " is greater than " + num1 + ".");
           }
           }
       }
       }
    }
    

