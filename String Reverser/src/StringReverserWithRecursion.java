//import java.util.ArrayList;
//import java.util.List;

/*
 * Bijon Mathew
 * 26/May/2017
 */
public class StringReverserWithRecursion implements StringReverser {

	public String reverse(String stringToBeReversed) {
		String emptyString = "";
		if (stringToBeReversed.length() < 1) {
			return emptyString;
		} else {
			return reverse(stringToBeReversed.substring(1)) + stringToBeReversed.charAt(0);
		}

	}

	public static void main(String[] args) {
		StringReverserWithRecursion withRecursion = new StringReverserWithRecursion();
		{ // Test 1

			String input = "Terminator";
			String expected = "rotanimreT";
			String output = withRecursion.reverse(input);
			if (output.equals(expected)) {
				System.out.println("Test Passed! expected " + expected + "\nobtained " + output);

			} else {
				System.out.println("Test Failed ! expected " + expected + "\nobtained " + output);
			}
		}

		{
			// Test 2

			String input = "just do it";
			String expected = "ti od tsuj";
			String output = withRecursion.reverse(input);
			if (output.equals(expected)) {
				System.out.println("\nTest Passed! expected " + expected + "\nobtained " + output);

			} else {
				System.out.println("\nTest Failed ! expected " + expected + "\nobtained " + output);
			}

		}
	}

}