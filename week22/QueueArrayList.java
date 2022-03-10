package week22;

import java.util.ArrayList;

public class QueueArrayList<E> 
{
	private ArrayList<E> list = new ArrayList<>();
	
	public E peek() 
	{
		if (!this.isEmpty())
			return list.get(0);
		return null;
	} 
	
	public void enqueue(E o) 
	{
		list.add(o);
	}
	
	public E dequeue() 
	{
		if (!this.isEmpty()) 
		{
			E o = list.get(0);
			list.remove(0);
			return o;
		}
		return null;
	}
	
	public int getSize() 
	{
		return list.size();
	}
	
	public boolean isEmpty() 
	{
		return list.isEmpty();
	}
	
	public String toString() 
	{
		return "Queue: " + list.toString();
	}
}

