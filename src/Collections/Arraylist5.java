package Collections;

import java.util.ArrayList;
import java.util.List;

public class Arraylist5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//105,205,305,405,505,605,705,805
		
		List<Integer> emp = new ArrayList<Integer>();
		
		emp.add(105);
		emp.add(205);
		emp.add(305);
		emp.add(405);
		emp.add(505);
		emp.add(605);
		emp.add(705);
		emp.add(805);
		
		int index = 0;
		
		for (int i=0;i<emp.size();i++)
		{
			int count=index+i;
			System.out.println("The Emp value of index " +count+ " are :" +emp.get(i));
		}
		
		// using enhanced for loop
		
		for (Integer x : emp) {
			System.out.println(x);
		}

	}

}
