import static java.lang.System.out;
public class Adder {
	public static int addOne(int a)
	{
		return a++;
	}
	public static void main(String args[])
	{
		int a=5;
		int result=Adder.addOne(a++);
		out.println("Adding one to Variable 'a' results in" +result);
		if(result==6)
			out.println("Test Passes");
		else
			out.println("testfails");
	}
}

