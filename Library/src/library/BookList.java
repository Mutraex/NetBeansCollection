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
public class BookList 
{
        private BookNode list, rear;

	// This constructor creates an empty list.
	BookList()
	{
            list = null;
	}

	void add(Book b)// In alphabetical order
	{
            BookNode temp = new BookNode(b);
            
            if (list == null)
                list = temp;
            else
            {
                BookNode aux = list;
                BookNode back = null;
                boolean found = false;
                
                while(aux  != null && !found)
                    if(temp.getBook().getTitle().compareTo(aux.getBook().getTitle()) < 0 )
                        found = true;
                    else
                    {
                        back = aux;
                        aux = aux.next;
                    }
                
                temp.next = aux;
                
                if (back == null)
                    list = temp;// Now the first to be in the list
                else
                    back.next = temp;
            }
	}
        
        void append_2_Refs(Book b)// appending
	{
            BookNode temp = new BookNode(b);
            
            if (list == null)
            {
                list = temp;
                rear = temp;
            }
            
            else
            {
                rear.next = temp;
                rear = temp;
            }
	}
        
	void append_1_Ref(Book b)// appending
	{
            BookNode temp = new BookNode(b);

            if (list == null)
                list = temp;
            
            else
            {
                BookNode aux = list;

                while (aux.next != null)
                    aux = aux.next;

                aux.next = temp;
            }
	}
	public String toString()
	{
            String result = "";
            BookNode current = list;
            
            while (current != null)
            {
                result += current.getBook().getTitle() + "\n";
                current = current.next;
            }
            
            return result;
	}
}
