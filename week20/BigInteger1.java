package week20;

import java.math.BigInteger;

public class BigInteger1 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		BigInteger a = new BigInteger(Long.toString(Long.MAX_VALUE));
		BigInteger big1 = new BigInteger("1");
		int n = 0;
		while (n < 5) 
		{
			a = a.add(big1);
			if (a.isProbablePrime(1)) 
			{
				System.out.println(a);
				n++;
			}
		}
	}
}
