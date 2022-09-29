/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cryptograph1;

/**
 *
 * @author Mutraex
 */
public class Transpose extends Cipher
{
    Transpose(String s)
    {
        super(s);
    }
    @Override
    public String encode(String word)
    {
        StringBuffer result=new StringBuffer(word);
        result.reverse();
        return result.toString();
    }
    @Override
    public String decode(String word)
    {
        StringBuffer result=new StringBuffer(word);
        result.reverse();
        return result.toString();
    }
}
