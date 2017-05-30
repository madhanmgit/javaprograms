import java.util.Scanner;
public class Maincontroller {

		private static Scanner n;

		public static void main(String args[])
		{
		    n = new Scanner(System.in);
		    System.out.println("\nEnter first number: ");
		    int firstNumber = n.nextInt();
		    System.out.println("\nEnter second number: ");
		    int secondNumber =n.nextInt();
		    int sum = firstNumber + secondNumber;
		    if(sum==10)
		    System.out.println("True");
		    else
		    System.out.println("False");
		    
		}
}
