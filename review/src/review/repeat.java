package review;

public class repeat {

	public static void main(String[] args) {

		String ip = "madan";
		String op = "";
		// char[] op=new char[10];

		char[] input = ip.toCharArray();
		System.out.println("Duplicate Characters in string:");
		for (int i = 0; i < ip.length(); i++) {
			for (int j = i+1; j < ip.length(); j++) {
				if (input[i] == input[j]) {
					System.out.print(input[j]);
			

			}
		}
	}

}
}
