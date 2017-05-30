package review;

public class Test {

	public static void main(String[] args) {

		String s = "madan";
		//int distinct = 0;

		for (int i = 0; i < s.length(); i++) {

			for (int j = 0; j < s.length(); j++) {

				
				if (s.charAt(i) == s.charAt(j)) 
					//distinct++;
				
			String  CharSequence d = s.charAt(i);
			//System.out.println(s.charAt(i));i
			//String d = String.valueOf(s.charAt(i));
			s = s.replace(d, "");
			System.out.println(s);
			//distinct = 0;
		}
	}
}
}