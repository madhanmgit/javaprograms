/*
 * M.Madhan Mohan
 * 26/May/2017
 */
package mulof3or5;

public class Multipleof3or5 {
	public boolean multipleOf3Or5Only(int n) {
		return (n % 3 == 0 && n % 5 == 0) ? false : (n % 3 == 0 || n % 5 == 0) ? true : false;
	}

	public static void main(String[] args) {
		Multipleof3or5 m = new Multipleof3or5();
		{
			// Test1
			boolean output = m.multipleOf3Or5Only(25);// --> true
			if (output == true)
				System.out.println("TRUE");
			else
				System.out.println("False");
		}
		{
			// Test2
			boolean output = m.multipleOf3Or5Only(26);// false
			if (output == true)
				System.out.println("TRUE");
			else
				System.out.println("False");
		}
		// Test3
		{
			boolean output = m.multipleOf3Or5Only(15);// --> false
			if (output == true)
				System.out.println("TRUE");
			else
				System.out.println("False");
		}
		// Test4
		{
			boolean output = m.multipleOf3Or5Only(6);// --> true
			if (output == true)
				System.out.println("TRUE");
			else
				System.out.println("False");
		}
		// Test5
		{
			boolean output = m.multipleOf3Or5Only(9);// --> true
			if (output == true)
				System.out.println("TRUE");
			else
				System.out.println("False");
		}
		// Test6
		{
			boolean output = m.multipleOf3Or5Only(29);// --> false
			if (output == true)
				System.out.println("TRUE");
			else
				System.out.println("False");
		}
		// Test7
		{
			boolean output = m.multipleOf3Or5Only(18);// --> true
			if (output == true)
				System.out.println("TRUE");
			else
				System.out.println("False");
		}
		// Test8
		{
			boolean output = m.multipleOf3Or5Only(45);// --> false
			if (output == true)
				System.out.println("TRUE");
			else
				System.out.println("False");
		}
		// Test9
		{
			boolean output = m.multipleOf3Or5Only(41);// --> false
			if (output == true)
				System.out.println("TRUE");
			else
				System.out.println("False");
		}
	}

}
