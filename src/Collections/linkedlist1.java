package Collections;

import java.util.LinkedList;
import java.util.List;

public class linkedlist1 {

	public static void main(String[] args) {
		// Find the length of linked list
		
		List<Object> emp = new LinkedList<>();
		
		//Adding the values of 100,200,300,400,500,600,700 to emp
		
		emp.add(100);
		emp.add(200);
		emp.add(300);
		emp.add(400);
		emp.add(500);
		emp.add(600);
		emp.add(700);
		
		// print the emp length
		
		System.out.println("The length of Emp linkedlist :" +emp.size());
		
		

	}

}
