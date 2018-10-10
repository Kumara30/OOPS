package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayBooklist {

	public static void main(String[] args) {

		Books b1 = new Books(1,"Signals","System","TS",5);
		Books b2 = new Books(2,"Electronics","EEE","SA",4);
		Books b3 = new Books(3,"Analog Systems","ECE","TSDS",7);
		
		ArrayList<Books> book = new ArrayList<>();
		book.add(b1);
		book.add(b2);
		book.add(b3);
		
		Iterator<Books> bookarr = book.iterator();
		
		while(bookarr.hasNext())
		{
			Books bc=(Books) bookarr.next();
			
			System.out.println("Book details are :\n Book Id : "+bc.id+
					"\n Book Name : "+bc.name+
					"\n Book Author : "+bc.author+
					"\n Book Publisher : "+bc.publisher+
					"\n Book Quantity : "+bc.quantity+"\n");;
			
			
		}
		
		
	}

}
