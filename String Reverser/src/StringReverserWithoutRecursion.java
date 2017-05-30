//import java.util.ArrayList;
//import java.util.List;

/*Bijon Mathew
 * 26/May/2017
 */
public class StringReverserWithoutRecursion implements StringReverser {

	public String reverse(String stringToBeReversed) {
		int length = stringToBeReversed.length();

		String reverse = "";
		int i = 0;
		for (i = length - 1; i >= 0; i--) {
			reverse = reverse + stringToBeReversed.charAt(i);

		}
		return reverse;
		
		

	}
	public static void main(String[] args) {
		StringReverserWithoutRecursion withoutRecursion = new StringReverserWithoutRecursion();
		
		{	//Test 1
		
		String input = "elevator";
		String expected = "rotavele";
		String output = withoutRecursion.reverse(input);
		if (output.equals(expected)){
			System.out.println("Test Passed! expected "+expected+"\nobtained "+output);
			
		}else{
			System.out.println("Test Failed ! expected "+expected+ "\nobtained "+output);
		}
		}
		
		{
			//Test 2
			
			String input = "this is it";
			String expected = "ti si siht";
			String output = withoutRecursion.reverse(input);
			if (output.equals(expected)){
				System.out.println("\nTest Passed! expected "+expected+"\nobtained "+output);
				
			}else{
				System.out.println("\nTest Failed ! expected "+expected+ "\nobtained "+output);
			}
			
		}
	}

	
}
