/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cryptograph1;

import java.util.StringTokenizer;

/**
 *
 * @author Mutraex
 */
public abstract class Cipher
{
    private String message;
    StringBuffer encrypted_message, decrypted_message;
    
    public Cipher(String text)
    {
        message = text;
    }
    public final void encrypt()
    {
        encrypted_message = new StringBuffer();
        StringTokenizer words = new StringTokenizer(message);
        
        while(words.hasMoreTokens())
        {
            String s = words.nextToken();
            s = encode(s) + " ";
            encrypted_message.append(s);
        }
    }
    
    public final void decrypt(String msg)
    {
        decrypted_message = new StringBuffer();
        StringTokenizer words = new StringTokenizer(msg);
        
        while(words.hasMoreTokens())
        {
            String s = words.nextToken();
            s = decode(s) + " ";
            decrypted_message.append(s);
        }
    }
    
    public String getEncodedMessage()
    {
        return encrypted_message.toString();
    }
    
    public String getDecodedMessage()
    {
        return decrypted_message.toString();
    }
    
    public abstract String encode(String s);
    public abstract String decode(String s);
    
    public interface Constants {
        public int WRAP_AROUND = 26;
        public int ENCODE_SHIFT = 3;
        public int DECODE_SHIFT = 23;
    }
}
