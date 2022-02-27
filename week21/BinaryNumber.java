package week21;

import java.util.Scanner;

public class BinaryNumber 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int n;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number(n): ");
		n = scanner.nextInt();
		scanner.close();
		System.out.printf("Number in binary: %s", dec2Bin(n));
	}
	public static String dec2Bin(int value)
	{
		if(value == 1) 
			return "1";
		else 
			return dec2Bin(value / 2) + String.format("%d", value % 2);
	}
}
