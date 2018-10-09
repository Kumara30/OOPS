package Collections;

import java.util.List;
import java.util.Vector;

public class vectorlist1 {

	public static void main(String[] args) {
		// Find the length of vector list
		
		List<Object> emp = new Vector<>();
		
		// adding the values of 105,205,305,405,505,605,705,805 to emp
		emp.add(105);
		emp.add(205);
		emp.add(305);
		emp.add(405);
		emp.add(505);
		emp.add(605);
		emp.add(705);
		emp.add(805);
		
		System.out.println("The Length of Emp vectorList :"+emp.size());
		

	}

}
