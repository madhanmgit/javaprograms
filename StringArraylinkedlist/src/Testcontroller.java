/*
 * Madhan Mohan
 * 13 May 2017
 */

import java.util.Collections;
import java.util.LinkedList;

public class Testcontroller {
	public static void main(String[] args)
	{
		//test1
		LinkedList<String> names=new LinkedList<String>();
		names.add("madhan");
		names.add("gokul");
		names.add("magesh");
		names.add("bijion");
		names.add("siddiq");
		//test2
		LinkedList<String> names2=new LinkedList<String>();
		names2.add("dhoni");
		names2.add("raina");
		names2.add("yuvraj");
		names2.add("pandya");
		names2.add("patel");
		//test3
		LinkedList<String> names3=new LinkedList<String>();
		names3.add("crazy");
		names3.add("funny");
		names3.add("idiotic");
		names3.add("genius");
		names3.add("mad");
		//System.out.println("\nBefore sort");
		//for(String name:names)
		//{
		//System.out.println(" " +name);
		//}
		System.out.println("\nExpected out put \n bijion \n gokul \n madhan \n magesh \n siddiq");
        Collections.sort(names);
		System.out.println("\nAfter sort");
		for(String name:names)
		{
			System.out.println(" " +name  );
		}
		System.out.println("\nExpected out put  \n dhoni \n pandya \n patel \n raina  \n yuvraj");
		Collections.sort(names2);
		System.out.println("\nAfter sort");
		for(String name:names2)
		{
			System.out.println(" " +name  );
		}
		System.out.println("\nExpected out put \n crazy \n funny \n genius  \n idiotic \n mad");

		Collections.sort(names3);
		System.out.println("\nAfter sort");
		for(String name:names3)
		{
			System.out.println(" " +name  );
		} }
}


