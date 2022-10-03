package Log4j2Project.Log4j2Project;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
 
public class Log4j2Example
{
 
    private static final Logger log = LogManager.getLogger(Log4j2Example.class);
 
    public static void main(String[] args)
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