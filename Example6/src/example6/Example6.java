/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example6;

/**
 *
 * @author venra
 */
public class Example6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x = addNum(1,3);
        System.out.println(x);
        Boolean test = test();
        System.out.println(test);
        printMe();
    }
    public static int addNum(int x, int y){
        return (x+y);
    }
    public static boolean test (){
        return !true && false;
    }
    public static void printMe (){
        System.out.println("Does this work?");
        System.out.println("Yay! I print");
    }
}
