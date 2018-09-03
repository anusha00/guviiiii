import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class palindrome
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		String s=scanner.nextLine();
		int len=sc.length();
		int a=0;
		for(int i=0;i<len/2;i++)
		{
			if(s.charAt(i)!=s.charAt(len-i-1))
			{
				a++;
			}
		}
		if(a==1)
		  System.out.println("yes");
		 else
		   System.out.println("no");
		
	}
}
