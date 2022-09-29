/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

/**
 *
 * @author Mutraex
 */
public class Library {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        // Create a book list object.
        BookList books = new BookList();

        // Create booknodes and add them to the list.
        books.add( new Book("Danger on the Waters") );
        books.add( new Book("Danger on the Waters") );
        books.add( new Book("Paradise Lost"));
        books.add( new Book("Building Bridges"));
        books.add( new Book("Hall Mark of Fame"));
        books.add( new Book("Math for Beginners"));
        books.add( new Book("Java for the Experts"));
        System.out.println(books);
    }
    
}
