package exception.com.unchecked;
import java.io.*;

public class IllegalStateException 
{
	static class GFG {
		public static void print(int a,int b)
		{
			System.out.println("Addition of Positive Integers :"+(a+b));
		}
		
		public static void main(String[] args) throws Exception {
		int n1=9;
		int n2=-5;
		if(n1>=0 && n2>=0)
		{
			GFG.print(n1,n2);
		}
		else
		{
			throw new Exception("Either one or two numbers are not Positive Integer");
		}
		}
	}

}