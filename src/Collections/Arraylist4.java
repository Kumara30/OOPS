package Collections;

import java.util.ArrayList;
import java.util.List;

public class Arraylist4 {

	public static void main(String[] args) {
		// Print the value which was available in index
		//10,20,30,40,50,60
		
		List<Integer> emp = new ArrayList<Integer>();
		emp.add(10);
		emp.add(20);
		emp.add(30);
		emp.add(40);
		emp.add(50);
		emp.add(60);
		
		System.out.println("The Second index value is : " +emp.get(2));
		
		List<Integer> marks = new ArrayList<Integer>();
		//100,200,300,400,500,600,700
		marks.add(100);
		marks.add(200);
		marks.add(300);
		marks.add(400);
		marks.add(500);
		marks.add(600);
		marks.add(700);
		
		System.out.println("The 4th index value is :"+marks.get(4));
		
		List<Integer> eng = new ArrayList<Integer>();
		eng.add(105);
		eng.add(205);
		eng.add(305);
		eng.add(405);
		eng.add(505);
		eng.add(605);
		eng.add(705);
		eng.add(805);
		eng.add(905);
		eng.add(500);

		System.out.println("8th Index value is :" +eng.get(8));
	}

}
