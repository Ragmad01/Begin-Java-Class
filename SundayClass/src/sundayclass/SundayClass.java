/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sundayclass;
import java.util.Scanner;
/**
 *
 * @author venra
 */
public class SundayClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        orginization();
    }
    public static void orginization (){
        System.out.println("Table of contents");
        System.out.println("1. Print out numbers 1-6 and add them together");
        System.out.println("2. Print out the numbers 10-20");
        System.out.println();
        Scanner excerciseNum = new Scanner (System.in);
        System.out.print("What excersise do you want to do (specify number): ");
        int exNum = excerciseNum.nextInt();
        System.out.println();
        System.out.println();
        if (exNum == 1){
            printOut();
        }
        else if (exNum == 2){
            printOut2();
        }
        else if (exNum == 3){
            
        }
    }
    public static void printOut(){
        //initialize
        System.out.println("Review and practice excersise");
        int a = 6;
        int sum = 0;
        while (a>0){//test condition
            sum = a + sum;
            System.out.print(a + "+");
            a--;//update
        }
        System.out.print("=");
        System.out.println(sum);
    }
    public static void printOut2(){
        System.out.println("Review and practice excersise");
        int a = 10;
        do {
            System.out.print("[" + a + "] ");
            a++;
        }
        while (a>10 && a<21);
    }
    
    
}
