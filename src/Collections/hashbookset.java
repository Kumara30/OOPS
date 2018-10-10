package Collections;

import java.util.HashSet;

public class hashbookset {

	public static void main(String[] args) {
		Books b1 = new Books(10,"Kumar","general","TNPC",6);
		Books b2 = new Books(20,"Ashok","gen","APC",8);
		Books b3 = new Books(30,"nav","fluent","ctrPC",10);
		
		HashSet<Books> set = new HashSet<>();
		set.add(b1);
		set.add(b2);
		set.add(b3);
		
		for (Books x : set) 
		{
		System.out.println(x.id+" "+x.name+" "+x.author+" "+x.publisher+" "+x.quantity+"\n");	
		}
	}

}
