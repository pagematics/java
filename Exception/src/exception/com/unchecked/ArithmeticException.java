package exception.com.unchecked;

public class ArithmeticException 
{
	static class ArithmeticException_Demo
	{
		public static void main(String args[])
		{
			try {
				int a = 40, b = 0;
				int c = a/b; // cannot divide by zero
				System.out.println ("Result = " + c);
			}
			catch(Exception e) 
			{
				System.out.println (e);
				System.out.println ("A number cannot be divided by 0.");
			}
		}
	}

}
