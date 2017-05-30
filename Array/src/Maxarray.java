
public class Maxarray 
{
	public static void main(String [] args)
	{
		double[] myarrlist={2.0,4.5,6.7,1.2};
		for(int i=0;i<myarrlist.length;i++)
		{
			System.out.println(" " +myarrlist[i]);
		}
		double sumlist=0;
		for(int i=0;i<myarrlist.length;i++)
		{  
			sumlist+=myarrlist[i];
		}
		System.out.println("Sum list" +sumlist);
		
		double minlist;
		minlist=myarrlist[0];
		for(int i=0;i<myarrlist.length;i++)
		{   
			if(myarrlist[i]<minlist)
			minlist=myarrlist[i];
		}
	    System.out.println("Min of the list" +minlist);
	    double maxlist;
	    maxlist=myarrlist[0];
	    for(int i=0;i<myarrlist.length;i++)
	    	if(myarrlist[i]>maxlist)
	    	maxlist=myarrlist[i];
	    System.out.println("Max of the list" +maxlist);
	  }
	
	
}
