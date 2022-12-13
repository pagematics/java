package exception.com.unchecked;

import java.io.IOException;

public class UndeclaredThrowableException 
{
	public void undeclared() throws IOException {
	    throw new IOException();
	}
}