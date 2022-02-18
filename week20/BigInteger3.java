package week20;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class BigInteger3 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		BigDecimal e = BigDecimal.ONE;
		for (int i = 1; i <= 1000; i++) 
		{
			e = e.add(BigDecimal.ONE.divide(new BigDecimal(factorial(i)), 1000, RoundingMode.HALF_UP));
			if (i == 100 || i == 200 || i == 1000)
			    System.out.println("i = " + i + " " + "e" + " -> " + e.toString());
		}
	}
	public static BigInteger factorial(int n) 
	{
		BigInteger result = BigInteger.ONE;
		for(int i = 1; i <= n; i++)
			result = result.multiply(new BigInteger(Integer.toString(i)));
		return result;
	}
}
