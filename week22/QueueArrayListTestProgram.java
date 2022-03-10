package week22;

public class QueueArrayListTestProgram 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		QueueArrayList<Character> queue = new QueueArrayList<Character>();
		for (char i = 'b'; i <= 'l'; i++)
		{
			queue.enqueue(i);
		}
		System.out.println(queue.toString());
		System.out.println(queue.getSize());
		System.out.println(queue.isEmpty());
		while (!queue.isEmpty())
		{
			System.out.printf("%s, ", queue.dequeue().toString());
		}
		System.out.println();
		System.out.println(queue.toString());
		System.out.println(queue.isEmpty());
		System.out.println(queue.getSize());
		
		}
}

