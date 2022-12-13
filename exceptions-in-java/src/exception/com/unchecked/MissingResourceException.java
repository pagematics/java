package exception.com.unchecked;

import java.util.ResourceBundle;

public class MissingResourceException 
{
	public static class MissingResourceExceptionExample {
	    public static void main(String args[]) {
	        ResourceBundle myResources = ResourceBundle.getBundle("myresources");
	    }
	}

}
