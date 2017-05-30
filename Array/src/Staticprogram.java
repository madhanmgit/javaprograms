
public class Staticprogram
{
  static int variable=5;
  public static void main(String[] args)
  {
	  Staticprogram sta=new Staticprogram();
	  sta.value(20);
	  sta.value();
	  
  }
  public void value(int variable)
  {
	  int variable=20;
	  System.out.println("value=" +variable);
  }
  public void value()
  {   int variable=40;
	  System.out.println("value=" +variable);
  }
}
