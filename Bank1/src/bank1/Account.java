/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank1;

import java.util.ArrayList;

/**
 *
 * @author Mutraex
 */
public class Account {
    ArrayList list;
    String firstName, lastName;
    String street, city, zip, state, accountNumber;
    double balance;
    
    Account(String str, String cty, String st, String zp, String accno, 
            String fname, String lname, double bal){
        list = new ArrayList();
        firstName = fname;
        lastName = lname;
        street = str;
        city = cty;
        zip = zp;
        state = st;
        accountNumber = accno;
        balance = bal;
           
    }
    Account()
    {
        System.out.println("Bank Java");
    }
    void display()
    {
        System.out.println("Best bank!");
    }

}
