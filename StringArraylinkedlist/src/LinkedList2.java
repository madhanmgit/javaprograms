
/*
 * Madhan Mohan
 * 13 May 2017
 */

import java.util.Collections;
import java.util.LinkedList;

public class LinkedList2 {
	public static void main(String[] args)
	{
		LinkedList<String> names=new LinkedList<String>();
		names.add("madhan");
		names.add("gokul");
		names.add("magesh");
		names.add("bijion");
		names.add("siddiq");
		System.out.println("\nBefore sort");
		for(String name:names)
		{
			System.out.println(" " +name);
		}
		System.out.println("\nExpected out put \n bijion \n gokul \n madhan \n magesh \n siddiq");
		Collections.sort(names);
		System.out.println("\nAfter sort");
		for(String name:names)
		{
			System.out.println(" " +name  );
		}   		
	}
}
