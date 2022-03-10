package week22;

import java.util.Scanner;
public class StackOfCharsTest 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		final String oppeningBrackets = "([{";
		final String closingBrackets = ")]}";
		boolean isValid = true;
		
		Scanner scanner = new Scanner(System.in);
		String brackets;
		brackets = scanner.next();
		scanner.close();
		
		StackOfChars stack = new StackOfChars();
		
		for (int i = 0; i < brackets.length(); i++) 
		{
			if (oppeningBrackets.indexOf(brackets.charAt(i)) != -1) 
			{
				stack.push(brackets.charAt(i));
			}
			else if (closingBrackets.indexOf(brackets.charAt(i)) != -1) 
			{
				if (stack.empty() || closingBrackets.indexOf(brackets.charAt(i)) != oppeningBrackets.indexOf(stack.pop())) {
					isValid = false;
					break;
				}
			}
		}
		
		if (isValid && stack.empty())
		{
			System.out.println("valid");
		}
		else
		{
			System.out.println("invalid");
		}
	}

}
