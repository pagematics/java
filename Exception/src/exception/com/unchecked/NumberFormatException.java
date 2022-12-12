package exception.com.unchecked;

public class NumberFormatException 
{
	static class NumberFormat_Demo
	{
		public static void main(String args[])
		{
			try {
				// "aks" is not a number
				int num = Integer.parseInt ("aks") ;
				System.out.println(num);
			} catch(Exception e) {
				System.out.println(e);
			}
		}
	}

}
