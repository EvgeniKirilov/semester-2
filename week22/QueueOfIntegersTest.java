package week22;

public class QueueOfIntegersTest 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		QueueOfIntegers queue  = new QueueOfIntegers();
		for (int i = 0; i < 20; i++) 
		{
			queue.enqueue(i);
		}
		for (int i = 0; i < 20; i++) 
		{
			System.out.println(queue.dequeue());
		}
	}

}
