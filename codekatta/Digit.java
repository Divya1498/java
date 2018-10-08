import java.util.*;
import java.io.*;
class Digit{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a,c=0;
	    while(n>0)
	    {
	    	a=n%10;
	    	c++;
	    	n=n/10;
	    }
	    System.out.print(c);
	}
}
