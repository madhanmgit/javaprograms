
/*
 * Madhan Mohan
 * 30 May 2017
 */
public class OneOrSum {
	public static boolean isOneOrSum10(int a, int b) {
		int sum = a + b;
		if (a == 10 || b == 10 || sum == 10)
			return true;
		else
			return false;

	}

	public static void main(String args[]) {
		// test1
		boolean c = isOneOrSum10(9, 10);
		if (c == true) {
			System.out.println("Test pass");
		} else {

			System.out.println("Test fail");
		}

		// }
		// {
		// Test2
		boolean d = isOneOrSum10(9, 9);
		if (d == false) {
			System.out.println("Test pass");
		} else {
			System.out.println("Test fail");
		}

		// }
		// Test3
		// {
		boolean e = isOneOrSum10(1, 9);
		if (e == true) {
			System.out.println("Test pass");
		} else {
			System.out.println("Test fail");
		}

		// }
	}
}
