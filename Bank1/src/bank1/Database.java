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
public class Database {
    ArrayList list;
    
    Database()
    {
        list = new ArrayList<Account>();
    }
    void add(Account b)
    {
        list.add(b);
    }
    void remove(Account b)
    {
        list.remove(b);
    }
}
