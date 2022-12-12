package exception.com.unchecked;

import java.util.Scanner; 

public class InputMismatchException 
{
	// create class InputMismatchExample1 to understand how Scanner throws InputMismatchException  
	public static class InputMismatchExample1 {     
	    public static void main(String[] args) {  
	        Scanner sc = new Scanner(System.in);  
	        try {  
	            System.out.println("Enter value of a number to get its square value:");  
	            Integer a = sc.nextInt(); // we give any float value as input    
	            System.out.println((a*a));  
	        }   
	        catch (Exception ex) {  
	            System.out.println(ex);  
	         }  
	    }  
	}  

}
