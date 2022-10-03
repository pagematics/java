package LogbackProject.LogbackProject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
 
public class LogbackExample 
{
    final static Logger log = LoggerFactory.getLogger(LogbackExample.class);
     
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
