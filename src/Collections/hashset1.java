package Collections;

import java.util.HashSet;
import java.util.Iterator;

public class hashset1 {

	public static void main(String[] args) {

		HashSet<Object> emp = new HashSet<>();
		emp.add("sure");
		emp.add("Kumar");
		emp.add("Varun");
		emp.add("sure");
		
		Iterator<Object> li = emp.iterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
	}

}
