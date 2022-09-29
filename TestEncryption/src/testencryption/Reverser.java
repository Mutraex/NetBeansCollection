/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testencryption;
import java.util.ArrayList;
/**
 *
 * @author Mutraex
 */
public class Reverser extends Transpose
{
    public Reverser(String s)
    {
        super(s);
    }
    
    public String reverseText(String word)
    {
        String subject = this.encode(word);
        String temp = "";
        ArrayList store = new ArrayList<String>();
        for(int i=0;i<subject.length();i++)
        {
            if(!word.substring(i,i+1).equals(" "))
            {
                temp += word.substring(i, i+1);
            }
            else
            {
                store.add(temp);
                temp="";
            }
            
        }
        String result="";
        for(int i=store.size()-1;i>-1;i--)
        {
            if(i==0)
                result += store.get(i);
            else
                result += store.get(i)+" ";
        }
        /*String result = "";
        for(int i=word.length()-1; i>-1;i--)
        {
            result += word.substring(i,i+1);
        }*/
        return result;
    }
    
    @Override
    public String decode(String word){
        
        String subject = this.encode(word);
        String temp = "";
        ArrayList store = new ArrayList<String>();
        for(int i=subject.length()-1;i>-1;i--)
        {
            if(i==0)
            {
                temp += word.substring(i, i+1);
                store.add(temp);
                temp="";
            }
            else if(!word.substring(i,i+1).equals(" "))
            {
                temp += word.substring(i, i+1);
            }
            else
            {
                store.add(temp);
                temp="";
            }
        }
        String result="";
        for(int i=0;i<store.size();i++)
        {
            if(i==store.size()-1)
                result += store.get(i);
            else
                result += store.get(i)+" ";
        }
        return result;
    }
    
    
}
