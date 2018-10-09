package Collections;

import java.util.ArrayList;
import java.util.List;

public class Arraylist2 {

	public static void main(String[] args) {
		// print the index based value
		
		ArrayList<Object> emp = new ArrayList<>();
		
		emp.add(10);
		emp.add(20);
		emp.add(30);
		emp.add(40);
		
		//Index value starts from 0 onwards
		
		System.out.println("The Zero index value :" +emp.get(0));

		System.out.println("The First index value :" +emp.get(1));

		
		System.out.println("The Second index value :" +emp.get(2));
		
		System.out.println("The Third index value :" +emp.get(3));


	}

}
