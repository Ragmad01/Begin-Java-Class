/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sandwich;
import java.util.scanner;
/**
 *
 * @author venra
 */
public class Sandwich {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //how many inches a person gets
        int inchesPerPerson = 5;
        //length of sandwich one
        int lengthSandwich1 = 114;
        //length of sandwich two
        int lengthSandwich2 = 93;
        //determine how many peopel can eat each sandwich
        double eaters1 = lengthSandwich1/inchesPerPerson;
        double eaters2 = lengthSandwich2/inchesPerPerson;
        //print results
        System.out.println("Letting each person eat " + inchesPerPerson + " inches...");
        System.out.println((eaters1 + eaters2) + " people can eat these two sandwiches!");
            
    }
    
}
