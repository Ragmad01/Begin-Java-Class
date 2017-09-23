/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excersises7;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author venra
 */
public class Excersises7 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Table of contents");
        System.out.println("1. This is an example using a for each loop--------------------------");
        System.out.println("2. This prints the steps to and prints the sum of the numbers 1-100--");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.print("What excersise do you want to do (specify number): ");
        Scanner excerciseNum = new Scanner (System.in);
        int exNum = excerciseNum.nextInt();
        if (exNum == 1){
            forEachLoop();
        }
        else if (exNum == 2){
            oneToOneHundNoArray();
        }
        else if (exNum == 3){
        oneToOneHundArray();           
        }
        else if (exNum == 4){
            
        }
        else if (exNum == 5){
            
        }
        else if (exNum == 6){
            
        }
        else{
            System.out.println("The number you have entered does not have a linked method.");
        }
    }
    public static void forEachLoop(){
        int sum = 0;
    int [] array = {2,4,6,8};
    for (int i:array){
    sum=i+sum;
}
    System.out.println(sum);
    }
    public static void oneToOneHundNoArray(){
        int [] nums = new int [100];
        int sum = 0;
        int addStep=1;
        for (int f = 1; f<=nums.length; f++){
            sum = f+sum;
            System.out.println("Step " + addStep + " = " + sum);
            addStep++;
        }
        System.out.println("The sum of the number 1-100 is: " + sum);
    }
    public static void oneToOneHundArray(){
        int [] mahin = new int [100];
        for (int i = 0; i<mahin.length; i++){
            mahin[i]=i+1;
        }
        int sum = 0;
        for(int y : mahin){
            sum+=y;
        }
        System.out.println(sum);
    }
    
}
