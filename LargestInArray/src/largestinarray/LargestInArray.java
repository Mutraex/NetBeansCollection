/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package largestinarray;
import java.util.Scanner;
/**
 *
 * @author Mutraex
 */
public class LargestInArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final int LENGTH = 100;
        double[] values = new double[LENGTH];
        int currentSize = 0;
        
        
        
        System.out.println("Please enter values, Q to quit");
        Scanner in = new Scanner(System.in);
        while (in.hasNextDouble() && currentSize < values.length)
        {
            
            values[currentSize] = in.nextDouble();
            currentSize++;
           
        }
        
        
        double largest = values[0];
        for (int i= 1; i < currentSize; i++)
        {
            if (values[i] > largest)
            {
                largest = values[i];
            }
        }
        
        
        for (int i = 0; i < currentSize; i++){
            System.out.print(values[i]);
            if (values[i] == largest)
            {
                System.out.print(" <== largest value");
            }
            System.out.println();
        }
        int counter=0;
        for (int i = 0; i < currentSize; i++){
            if (values[i] == 0)
            {
                counter++;
            }
            
        }
        System.out.println(counter+" were zeroes");
        
        
    }
    
}
