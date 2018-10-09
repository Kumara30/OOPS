package Collections;

import java.util.ArrayList;
import java.util.List;

public class Arraylist3 {

	public static <emp> void main(String[] args) {
		// print the last index value for 10
		
		List<Integer> emp = new ArrayList<Integer>();
		
		//10,20,30,90,10,10,40,50
		
		emp.add(10);
		emp.add(20);
		emp.add(30);
		emp.add(90);
		emp.add(10);
		emp.add(10);
		emp.add(40);
		emp.add(50);
		
		int emp1 = emp.lastIndexOf(10);
		System.out.println("Last index value of 10 is :" +emp1);
		
		
		int emp2 = emp.indexOf(50);
		System.out.println("Index value of 50 is :" +emp2);
		
		int emp3 = emp.indexOf(90);
		System.out.println("Index value of 90 is :" +emp3);
		
		
		
		int emp4 = emp.indexOf(10);
		System.out.println("Index value of 10 is :" +emp4);

	}

}
