package exception.com.custom;


public class CustomException 
{
	class InvalidAgeException  extends Exception  
	{  
	    public InvalidAgeException (String str)  
	    {  
	        super(str);  
	    }  
	}  
	    
	public static class TestCustomException1  
	{  
	    static void validate (int age) throws Exception{    
	       if(age < 18){  
	        throw new Exception("age is not valid to vote");    
	    }  
	       else {   
	        System.out.println("welcome to vote");   
	        }   
	     }    
	  
	    // main method  
	    public static void main(String args[]) throws Exception  
	    {  
	        try  
	        {  
	            validate(14);  
	        }  
	        catch (InvalidAgeException ex)  
	        {  
	            System.out.println("Caught the exception");  
	            System.out.println("Exception occured: " + ex);  
	        }  
	        System.out.println("rest of the code...");    
	    }  
	}  
}
