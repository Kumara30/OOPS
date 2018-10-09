package Collections;

public class Array {

	public static void main(String[] args)
	{
		// Creating object for storing the value in array
		
		int[] emp = new int[5]; //fixed the size as 5 
		
		//adding the values in emp
		
		emp[0]=10;
		emp[1]=30;
		emp[2]=20;
		emp[3]=50;
		emp[4]=90;
		
		// print the particular value by giving index position
		System.out.println("Particular Index value :"+emp[2]);
				
		// print the size of the values in emp
		System.out.println("Length of an emp :" +emp.length);
		
		// print the values which was available in emp
		for(int i=0;i<emp.length;i++)
		{
			System.out.println("Values in Emp :" +emp[i]);
		}
		
		// or
		
		for (int x : emp) 
		{
		System.out.println("Emp  values :" +x);	
		}

	}

}
