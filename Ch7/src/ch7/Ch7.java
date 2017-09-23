/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch7;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author venra
 */
public class Ch7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Table of contents");
        System.out.println("1. This prints the numbers one through ten.-------------");
        System.out.println("2. This prints the names of everyone in beginner java.--");
        System.out.println("3. This prints 1,2,3,4,5 backwards.---------------------");
        System.out.println("4. This shows examples of what I learned from chapter 7.");
        System.out.println("5. This prints out the odd numbers from 1-14.-----------");
        System.out.println("6. This prints out all the even number frim 1-14.-------");
        System.out.print("What excersise do you want to do (specify number): ");
        Scanner excerciseNum = new Scanner (System.in);
        int exNum = excerciseNum.nextInt();
        if (exNum == 1){
            forLoopExcersise();
        }
        else if (exNum == 2){
            stringName();
        }
        else if (exNum == 3){
            array2Backwards();
        }
        else if (exNum == 4){
            examples();
        }
        else if (exNum == 5){
            onlyOdd();
        }
        else if (exNum == 6){
            onlyEven();
        }
        else{
            System.out.println("The number you have entered does not have a linked method.");
        }
    }
    public static void forLoopExcersise(){
        for (int r=0; r<11; r++){
            System.out.println(r);
        }
    }
    public static void stringName(){
        String[] names = {"Chaitanya", "Ramya", "Madhu", "Vijay", "Raghav", "Akhil", "Mahin", "Gokul", "Dolica"};
        System.out.println("The people in our class are:");
        for (int n = 0; n<9; n++){
            System.out.println(names[n] + ",");
        }
    }
    public static void array2Backwards (){
        int[] backwards = {1,2,3,4,5};
        for (int e = 4; e>-1; e--){
            System.out.println(backwards[e]);
        }
    }
    public static void examples (){
               //arrays
        int[] xyz = new int [5];
        xyz[0] = 1;
        xyz[1] = 2;
        xyz[2] = 3;
        xyz[3] = 4;
        xyz[4] = 5;
        
        int[] array2 = {1,2,3,4,5};
        System.out.println(array2[2]);
        System.out.println();
        System.out.println();
        System.out.println("For Loops.");
        //For loops
        for (int i=0; i<5; i++){
            System.out.println(xyz[i]);
        }
    }
    public static void onlyOdd(){
        int[] oneThruFrteen = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
        for (int a = 0; a<14; a=a+2){
            System.out.println(oneThruFrteen[a]);
        }
    }
    public static void onlyEven(){
        int[] oneThruFrteen2 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
        for (int b = 1; b<14; b=b+2){
            System.out.println(oneThruFrteen2[b]);
        }
    }
}
    

    

