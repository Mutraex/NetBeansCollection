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
public class Address {
    String street,city,state,zip;
    Address(String str, String cty, String st, String zp)
    {
        street = st;
        city = cty;
        state = st;
        zip = zp;
    }
    String getStreet()
    {
        return street;
    }
    String getCity(){
        return city;
    }
    String getState()
    {
        return state;
    }
    String getZip()
    {
        return zip;
    }
    void changeStreet(String str){
        this.street = str;
    }
    void changeCity(String ct){
        this.city = ct;
    }
    void changeState(String st){
        this.state = st;
    }
    void changeZip(String zp){
        this.zip = zp;
    }
    void change(String str, String ct, String st, String zp){
        this.street = str;
        this.city = ct;
        this.state = st;
        this.zip = zp;
    }
}
