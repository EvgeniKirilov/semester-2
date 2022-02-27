package week21;

import java.util.Scanner;
public class StepenN 
{
	  public static void main(String[] args)
	    {
	        int n;
	        double x;
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter base (x): ");
	        x = scanner.nextDouble();
	        System.out.print("Enter stepen (n): " );
	        n = scanner.nextInt();
	        scanner.close();

	        System.out.printf("Recursive result: %.2f\n", stepenRecursive(x, n));
	        System.out.printf("Iterative result: %.2f\n", stepenIterative(x, n));
	    }

	    public static double stepenRecursive(double x, int n)
	    {
	        if (n == 0)
	            return 1;
	        else
	            return x * stepenRecursive(x, n - 1);
	    }

	    public static double stepenIterative(double x, int n)
	    {
	        double result = 1;
	        for (int i = 0; i < n; i++)
	            result *= x;
	        return result;
	    }
}
