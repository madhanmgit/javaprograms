package count6n9;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Randomnumber
{
	public static int MIN=1;
	public static int MAX=100;
	public static int TOT=100000000;
	static ArrayList<Integer> rand =new ArrayList<Integer>();
	public static ArrayList<Integer> generaterandomnumber()
	{

		for(int i=1;i<=TOT;i++)
		{
			int raad=ThreadLocalRandom.current().nextInt(MIN,MAX+1);
			rand.add(raad);
			System.out.println("Random Nunbers between 1 to 100" +rand);
		}
		return rand;
	}
	public static void main(String[] args)
	{ 
		ArrayList<Integer> call=new ArrayList<Integer>();
		Randomnumber.generaterandomnumber();
		if(rand.size()==TOT)
		{
			System.out.println("Test passes");
		}
		else
		{					
		System.out.println("Test fails");
		}

		}
	}
