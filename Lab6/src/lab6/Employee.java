/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;
import java.util.ArrayList;

/**
 *
 * @author Mutraex
 */
public abstract class Employee {
    public String lastname;
    public ArrayList description;
    
    public Employee(String ln){
        lastname=ln;
        description= new ArrayList<String>();
    }
    
    public void getDescription(){
        System.out.print(lastname+": ");
        for(int i=0;i<description.size();i++){
            if(i==description.size()-1){
                System.out.print(description.get(i)+" ");
            }
            else{
                System.out.print(description.get(i)+", ");
            }
        }
        System.out.println();
        //System.out.println(description);
    }
}
