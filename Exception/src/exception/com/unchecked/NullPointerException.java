package exception.com.unchecked;

public class NullPointerException 
{
	static class NullPointer_Demo
	{
		public static void main(String args[])
		{
			try {
				String ab = null; //null value
				System.out.println(ab.charAt(0));
			} catch(Exception e) {
				System.out.println(e);
			}
		}
	}

}
