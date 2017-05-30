public class StringReverserWithRecursion implements StringReverser {
	public String reverse(String stringToBeReversed) {
		if ((stringToBeReversed == null) || (stringToBeReversed.length() <= 1))
			return stringToBeReversed;
		return reverse(stringToBeReversed.substring(1)) + stringToBeReversed.charAt(0);
	}

	public static void main(String[] args) {
		StringReverserWithRecursion ob = new StringReverserWithRecursion();
		StringReverserWithoutRecursion ob1 = new StringReverserWithoutRecursion();
		String str = "java";
		System.out.println("Reverse of " + str + " with recursion  is " + ob.reverse(str));
		System.out.println("Reverse of " + str + " without recursion  is " + ob1.reverse(str));
	}

}
