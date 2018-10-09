package Collections;

public class Array3 {

	public static void main(String[] args) {
		// Finding the average value
		
		int[] arravg = new int[] {1,5,6,7,8,4,6,9,10,15,17};
		
		int sum=0;
		int count=0;
		float avg;
		
		for(int i=0;i<arravg.length;i++)
		{
			count=arravg.length;
			System.out.println("count"+count);
			
			sum = sum+arravg[i];
	
		}
		System.out.println("Total count :" +count);
		System.out.println("Total sum :" +sum);
		
		avg = sum/count;
		
		System.out.println("Avg of total array value :" +avg);

	}

}
