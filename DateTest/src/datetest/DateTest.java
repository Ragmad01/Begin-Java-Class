/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datetest;
import java.util.Date;
import java.text.DateFormat;
/**
 *
 * @author venra
 */
public class DateTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long myTime = System.currentTimeMillis();
        System.out.println(myTime);
        
        Date today = new Date ();
        System.out.println(today.toString());
        String d = DateFormat.getDateInstance(DateFormat.SHORT).format(today);
        System.out.println(d);
        
    }
    
}
