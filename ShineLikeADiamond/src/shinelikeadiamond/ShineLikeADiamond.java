/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shinelikeadiamond;

/**
 *
 * @author venra
 */
public class ShineLikeADiamond {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        rightSideUp();
        upsideDown();
    }
    public static void rightSideUp(){
                
        int rows = 5;
        int i = 1;
        int j = 1;
        while (i<=rows){
            while(j<=i){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
            j=1;
        }
           
            
    }
    public static void upsideDown(){
                
        int rows = 6;
        int i = 5;
        int j = 1;
        while (i<=rows && i>=1){
            while(j<=i){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i--;
            j=1;
        }
           
            
           
            
    }
}
    

