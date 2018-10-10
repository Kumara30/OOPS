package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> name =new ArrayList<>();
		name.add("Ravi");
		name.add("Arun");
		name.add("tarun");
		name.add("mohan");
		
		Iterator<String> listname = name.iterator();
		
		while (listname.hasNext())
		{
			System.out.println("Names in Array List are :" +listname.next());
		}
		
		System.out.println("\n");
		System.out.println("Using for loop to iterate the value \n");
		
		for(int i=0;i<name.size();i++)
		{
			System.out.println("For loop for arraylist :" +name.get(i));
		}
	}

}
