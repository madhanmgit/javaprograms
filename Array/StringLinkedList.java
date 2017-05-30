import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;

public class StringLinkedList {
public static void main(String args[]){
String[] names={"james","madhan","sidique","magesh","Bijion"};
Arrays.sort(names);
Iterator itr=names.iterator();
while(itr.hasNext())
	System.out.println(itr.next());
}
}


