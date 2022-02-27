package week21;

import java.util.Scanner;
public class EvenOrOdd 
{
	   public static void main(String[] args)
	    {
	        int n;
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter number (n): ");
	        n = scanner.nextInt();
	        scanner.close();

	        System.out.printf("odd(%d) -> %b\n", n, odd(n));
	        System.out.printf("even(%d) -> %b\n", n, even(n));
	    }
	    public static boolean even(int x)
	    {
	        if(x==0)
	        {
	            return true;
	        }
	        else
	            return !even(x-1);
	    }
	    public static boolean odd(int x)
	    {
	        if(x==1)
	        {
	            return true;
	        }
	        else
	            return !odd(x-1);
	    }
}
