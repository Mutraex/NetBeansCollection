/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locreadr1;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;


/**Author     : Javier Gonzalez 
   Course     : Course Name and Times 
   Professor  : Michael Robinson 
   Program    : 2, Purpose/Description 
                       A brief description of the program 
    Due Date : 09/26/2016 

    Certification: I hereby certify that this work is my own alone. 


    ..........{ javier gonzalez }.......... 
 */
public class Locreadr1 
{
    public static String toBinary(String ln)//converts the hex string to binary
    {
        
        char[] tableA = 
        {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        String[] tableB = 
        {
            "0000","0001","0010","0011","0100","0101","0110","0111","1000",
            "1001","1010","1011","1100","1101","1110","1111"
        };
        String binline = "";
        for (int x=0; x<ln.length();x++)
        {
            for (int y=0;y<tableA.length;y++)
            {
                
                if (ln.charAt(x) == tableA[y])
                {
                    binline= binline + tableB[y];
                }
            }
        }
        return binline;
        
    }
    
    public static long toDecimal(String bin)//converts line of binary to decimal
    {
        long deci=0;
        for (int x= bin.length()-1; x> -1; x--)
        {
            char chekr = bin.charAt(x);
            int loc = (bin.length()-1)-x;
            if (chekr == '1')
            {
                deci= deci + (long)Math.pow(2, loc);
            }
        }
        return deci;
    }
    
    public static int findRAM(long deci)//finds the RAM chip
    {
        int locRAM = -1;
        final long bound0 = 8589934584L;
        final long bound1 = 17179869184L;
        final long bound2 = 25769803768L;
        final long bound3 = 34359738368L;
        if (deci <= bound0)
        {
            locRAM = 0;
        }
        else if (deci <= bound1)
        {
            locRAM = 1;
        }
        else if (deci <= bound2)
        {
            locRAM = 2;
        }
        else if (deci <= bound3)
        {
            locRAM = 3;
        }
        return locRAM;
    }

    public static void main(String[] args) throws IOException 
    {
        File inpFile = new File("RAMerrors3.txt");
        Scanner in = new Scanner(inpFile);
        String[] hexcodes = new String[1000];
        int counter=-1;
        while (in.hasNextLine())
        {
            counter++;
            String codeline = in.nextLine();
            hexcodes[counter] = codeline.trim();
        }
        for (int x=0; x<counter; x++)
        {
            System.out.println(hexcodes[x]);
            String binstr = toBinary(hexcodes[x]);
            System.out.println(binstr);
            long dec = toDecimal(binstr);
            System.out.println(dec);
            System.out.println("The error is found on RAM chip "+findRAM(dec));
            
        }
        
        
        
        
    }
    
}
