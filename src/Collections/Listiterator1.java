package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Listiterator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names = new ArrayList<>();
		
		names.add("Arun");
		names.add("Surya");
		names.add("vicky");
		names.add(1, "noel");
		
		ListIterator<String> li = names.listIterator();
		
		while(li.hasNext())
		{
			System.out.println("Forward list : " +li.next());
		}

		System.out.println("\n");
		
		while(li.hasPrevious())
		{
			System.out.println("Backward liist : " +li.previous());
		}
	}

}
