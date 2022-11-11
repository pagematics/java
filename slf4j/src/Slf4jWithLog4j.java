import org.apache.log4j.BasicConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Slf4jWithLog4j
{
   public static void main(String[] args)
   {
	   BasicConfigurator.configure();
      Logger logger = LoggerFactory.getLogger(Slf4jWithLog4j.class);
    //Creating the Logger object
      Integer age = 23;
      
      //Logging the information
      logger.info("At the age of {} ramu got his first job", age);
   }
}




