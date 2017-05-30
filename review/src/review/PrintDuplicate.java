package review;

import java.util.HashSet;
import java.util.Set;

public class PrintDuplicate {
	public static void main(String[] args){
		String duplicates[] =new String[] {"java"};
		Set nonDuplicateSet=new HashSet<>();
		Set duplicateSet=new HashSet<>();
		for(String string:duplicates )
		{
			if(!nonDuplicateSet.contains(string))
			{
				nonDuplicateSet.add(string);
			}
			else{
				duplicateSet.add(string);
			}
			}
System.out.println(duplicateSet);
		
		
	}
	
	}


