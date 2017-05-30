package review;

public class fun {
	
		 
		public static void main(String args[])
		{
			String name = "apple";
			//String firstChar = String.valueOf(name.charAt(0));
			String resultName = name.substring(1, name.length());
			int addIndex = (name.length() / 2);
			String firstHalf = name.substring(0, addIndex);
			String secondHalf = resultName.substring(addIndex, resultName.length());
			String finalResult = firstHalf+secondHalf;
			
			System.out.println("Result Is : "+finalResult);
		}
	}
	 

