package week21;

public class SumOneToFive 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Sum is " + iterativeXMethod(5));
	}
	public static int iterativeXMethod(int n)
	{
		int sum = 0;
		for(int i = 0; i<=n; i++)
		{
			sum += i;
		}
		return sum;
	}
}
