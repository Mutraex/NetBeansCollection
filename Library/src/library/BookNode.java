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
public class BookNode 
{
        Book book;
	BookNode next;

	BookNode(Book b)
	{
		book = b;
		next = null;
	}
	Book getBook()
	{
		return book;
	}
}
