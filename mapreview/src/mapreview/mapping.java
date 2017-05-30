package mapreview;

import java.util.Map;
//import java.util.Map.Entry;
import java.util.HashMap;
//import java.util.HashSet;

public class mapping {
	public static void main(String args[]) {
		Map<String,Boolean> map = new HashMap<String,Boolean>();
		map.put("Rajan",true);
		map.put("Arjun",true);
		map.put("Ramesh",false);
		map.put("dhoni",true);
		//map.put("Arjun", false);
     //System.out.println("Names:" +map);
     System.out.println("Names:" +map.containsKey("Rahul"));
     //System.out.println
   // for(String  key:map.())
     //{
    	 
     //}
	}

}
