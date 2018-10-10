package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Arraylist7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
		list.add("Ravi");//Adding object in arraylist  
		list.add("Vijay");  
		list.add("Ravi");  
		list.add("Ajay");  
		//Traversing list through Iterator  
		
		Iterator<String> lis = list.iterator();
		
		while(lis.hasNext())
		{
			System.out.println(lis.next());
		}
		
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		
		Iterator<Integer> b = list1.iterator();
		
		boolean a = b.hasNext();
		
		
		System.out.println(a);
		
		while(b.hasNext())
		{
			System.out.println(b.next());
		}

	}

}
