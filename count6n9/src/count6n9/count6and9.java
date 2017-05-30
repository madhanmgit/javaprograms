package count6n9;

//import java.util.Scanner;

public class count6and9
{
	//private static Scanner arr;

	public static void main(String[] args)
	{
		int i,count6=0,count9=0;
		int[] array={1,4,6,6,9};
		//count9=0;
		//arr = new Scanner(System.in);
		//System.out.println("Enter array elements");
		//n=arr.nextInt();
		//int a[]=new int[n];
		System.out.println("To print no of occurences of 6 & 9");
		for(i=0;i<array.length;i++)
			{
				if(array[i] == 6)
				{
					count6++; 
					
				}
				else if(array[i] == 9)
				{
					count9++;
				}
				//else if(a[i]==9)
				//{
				//count9++;
				//System.out.println("count 9="+count9);
				//}

			}
		System.out.println("count 6=" +count6);
		System.out.println("count 9=" +count9);

		}
	}






	
