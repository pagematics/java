package exception.com.unchecked;

import java.util.Stack;

public class EmptyStackException 
{

	public static class EmptyStackExceptionExample {
	    public static void main(String args[]) {
	        Stack s = new Stack();
	        s.pop();
	    }
	}

}
