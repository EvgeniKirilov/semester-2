package week21;

public class OburnatoChislo 
{	
	public static void main(String[] args)
    {
        System.out.println("The reversed number: ");
        iterativexMethod(1234567);
    }

    public static void iterativexMethod(int n)
    {
        if (n > 0)
        {
            System.out.print(n % 10);
            iterativexMethod(n / 10);
        }
    }
}
