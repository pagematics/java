package myclass;

import org.apache.log4j.Logger; 
  
import java.io.*;  
import java.sql.SQLException;  
  
public class MyClass
{  
  
   static Logger log = Logger.getLogger(MyClass.class.getName());  
     
   public static void main(String[] args)throws IOException,SQLException
   {  
      log.info("Initializing the variables for a mathematical operation"); 
      int y = 2;
      int result = 0;
      for (int j=3; j>=0; j--)   
      {
    	  if (j>y)
    	  {
    		  log.warn("The result will be less than 1");
    	  }
    	  if (j!=0)
    	  {
    	  int dvs = y/j;
    	  log.debug(y+" is divided by "+j+" and the result is "+dvs);
    	  result = result + dvs;
    	  log.debug(dvs+" is added to the result and obtained "+result);
    	  }
    	  else
    	  {
    		  log.error("The divisor is 0");
    	  }
      }
      log.debug("The final result is "+result);
      log.info("The mathematical operation is completed and the result is "+result);
   }  
}