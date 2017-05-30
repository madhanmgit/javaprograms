import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class List {
	public static void main(String[] args)
	{
	ArrayList <Map<Integer,String>> list=new ArrayList<>();
	
	Map<Integer,String> map=new HashMap<Integer,String>();
	map.put(101,"john");
	map.put(102,"ravi");
	map.put(103,"raj");
	
	list.add(map);
	System.out.println("" +map);
	
	}
}

