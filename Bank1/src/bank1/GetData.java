/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank1;
import javax.swing.JOptionPane;
/**
 *
 * @author Mutraex
 */
public class GetData {
    static double getDouble(String s){
        return Double.parseDouble(getString(s));
    }
    static int getInt(String s){
        return Integer.parseInt(getString(s));
    }
    static String getString(String s)
    {
        return JOptionPane.showInputDialog(s);
    }
}
