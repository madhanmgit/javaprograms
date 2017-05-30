package commonarray;

public class Carray {
	private static int arr3[];
	public static void main(String[] args) {
		int arr1[] = { 10, 4, 5, 6, 7 };
		int arr2[] = { 10, 7, 5, 1, 8 };
		
		// try{
		for (int i = 0; i < arr1.length; i++)
		{
			for (int j = 0; j < arr2.length; j++)
			{
				if (arr1[i] == arr2[j]) 
				{
				
					System.out.println(arr1[i]);
					for(int i1=0;i1<arr1.length;i1++)
					{
					 arr3[i1]=arr1[i1];
					}
					//
					//System.out.println(arr3[i]);
				}
			}
		}
	}
}

	
					// res[i] += arr1[i];
					//arr3[i]+= arr1[i];
				
				//System.out.println(arr3[i]);
			

		// catch(Exception e)

	
	

