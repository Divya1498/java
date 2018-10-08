import java.util.*;
import java.io.*;
class Di{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i,k=0;
	     for(i=2;i<n;i++)
	     {
	     	if(n%i==0)
	     	{
	     		k=1;
	     	}
	     }
	     if(k==0)
	    System.out.print("yes");
	    else
	    System.out.println("no");
		
	}
}
