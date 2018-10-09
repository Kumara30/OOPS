package Collections;

public class Array4 {

	public static void main(String[] args) {
		// Removing duplicate values
		
		int[] dup = new int[] {10,10,20,50,60,80,60,50};
		
		for(int i=0; i<dup.length;i++)
		{
			for(int j=i+1; j<dup.length;j++)
			{
				
				if(dup[i]==dup[j])
				{ 
					System.out.println("Duplicate values :" +dup[i]);
					
				}


			}

		}

	}

}
