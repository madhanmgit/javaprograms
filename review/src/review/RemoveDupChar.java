package review;
import java.io.*;
public class RemoveDupChar {
	 
	
	    public static void main(String args[])throws IOException
	    {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        System.out.print("Enter any word : ");
	        String s = br.readLine();
	        int l = s.length();
	        char ch;
	        StringBuffer ans=new StringBuffer();
	         for(int j=0;j<l;j++)
	         {
	        	 ch=s.charAt(j);
	         
	        for(int i=0; i<l; i++)
	        {
	            
	            if(ch==s.charAt(i+1))
	            	ans.append(ch);
	                ans.append(s.charAt(i));
	            //s = s.replace(ch,' '); //Replacing all occurrence of the current character by a space
	        }
	         }
	 
	       System.out.println("Word after removing duplicate characters : " + ans);
	    }
	}


