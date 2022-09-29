/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank1;

/**
 *
 * @author Mutraex
 */
public class Name {
    
    String first,last;
    
    Name(String f, String l)
    {
        first = f;
        last = l;
    }
    
    String getFirst()
    {
        return first;
    }
    String getLast()
    {
        return last;
    }
    void changeLastName(String last)
    {
        this.last = last;
    }
    void changeFirstName(String first){
        this.first = first;
    }
}
