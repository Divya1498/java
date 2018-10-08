import java.util.*;
import java.io.*;
class Di{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i,b=sc.nextInt();
		for(i=n+1;i<b;i++)
		{
	     if(i%2!=0)
	    System.out.print(i);
		}
		
	}
}
