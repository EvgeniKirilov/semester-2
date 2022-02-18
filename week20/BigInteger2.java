package week20;

import java.math.BigInteger;

public class BigInteger2 
{
		public static void main(String[] args) 
		{
			// TODO Auto-generated method stub
			BigInteger a = new BigInteger("1");
			BigInteger big1 = new BigInteger("1");
			BigInteger big2 = new BigInteger("2");
			int n = 0;
			for (int i = 0; i < 100; i++) 
			{
				a = a.subtract(big1);
				if (a.isProbablePrime(1)) 
				{
					System.out.println(n + ": " + "2^" + i + "-1" + " = " + a.toString());
					n++;
				}
				a = a.add(big1);
				a = a.multiply(big2);
			}
	}

}
