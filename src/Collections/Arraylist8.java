package Collections;

import java.util.ArrayList;

public class Arraylist8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> emp = new ArrayList<>(4);
		emp.add(10);
		emp.add(20);
		emp.add(30);
		emp.add(40);
		
		System.out.println(emp);
		
		//emp.set(3, 50);
		try {
			emp.add(5, 60);
			System.out.println(emp);	
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
		
	}

}
