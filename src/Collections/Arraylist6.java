package Collections;

import java.util.ArrayList;
import java.util.List;

public class Arraylist6 {

	public static void main(String[] args) {
		// Remove the index value
		//10,20,30,40,50,60
		
		List<Integer> emp = new ArrayList<Integer>();
		emp.add(10);
		emp.add(20);
		emp.add(30);
		emp.add(40);
		emp.add(50);
		emp.add(60);
		
		System.out.println("Before removing the index value :" +emp);
		
		System.out.println("Removing the 2nd index value :" +emp.remove(2));
		
		System.out.println("After removed the index value :" +emp);
		
	
		List<Integer> memo = new ArrayList<Integer>();
		memo.add(105);
		memo.add(205);
		memo.add(305);
		memo.add(405);
		memo.add(505);
		try {
			System.out.println("Removing the 10 index values :"+memo.remove(10));

		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println(e.toString());
		}

	}

}
