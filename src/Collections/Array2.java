package Collections;

public class Array2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10,11,12};
		
		int sum=0;
		
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
			System.out.println(sum);
		}
		
		System.out.println("Sum of total array : "+sum);
		
		

	}

}
