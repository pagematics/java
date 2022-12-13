package exception.com.checked;

import java.lang.reflect.Method;

public class InvocationTargetException
{
	        public static void main(String[] args) {  
	            TargetInvocation target = new TargetInvocation();  
	  
	            // Accessing all the methods of TargetInvocationClass:  
	            Method[] m = TargetInvocation.class.getMethods();  
	            try {  
	                // Invoking the first method of the TargetInvocatioClass:  
	                m[0].invoke(target);  
	            }  
	            catch(Exception e) {  
	                System.out.println("Wrapper exception: " + e);  
	                System.out.println("Underlying exception: " + e.getCause());  
	            }  
	        }  
	    }  
	  
	    class TargetInvocation{  
	        public void Demo() {  
	            System.out.println(12 / 0);  
	        }  

}
