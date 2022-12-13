package exception.com.unchecked;

public class ArrayIndexOutOfBoundsException 
{
	static class ArrayIndexOutOfBound_Demo
	{
		public static void main(String args[])
		{
			try{
				int a[] = new int[5];
				a[6] = 7; 
			}
			catch(Exception e){
				System.out.println (e);
			}
		}
	}

}
