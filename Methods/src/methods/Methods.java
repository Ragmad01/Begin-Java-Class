/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author venra
 */
public class Methods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Please input your first number here: ");
        int x = myScanner.nextInt();
        System.out.print("Please input your second number here: ");
        int y = myScanner.nextInt();
        System.out.print("Please input your third number here: ");
        int z = myScanner.nextInt();
        multAdd(x,y,z);
        System.out.println("This is the one using the int method.");
        int answer = multAdd2(x,y,z);
        System.out.println(answer);
    }
    public static void multAdd(int x, int y, int z){
        x = x*2;
        y = y*2;
        x = z*2;
        int sum;
        sum = x+y+z;
        System.out.println("The numbers you selected, multiplyed by two, then added together = " + sum);
    }
    public static int multAdd2(int x, int y, int z){
        x = x*2;
        y = y*2;
        x = z*2;
        int sum;
        sum = x+y+z;
        return sum;
    }
    
}
