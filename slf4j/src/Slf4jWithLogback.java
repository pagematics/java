import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Slf4jWithLogback
{
	public static void main(final String[] args)
	{
		Logger logger = LoggerFactory.getLogger(Slf4jWithLogback.class);

		logger.debug("Debug Message Logged !!!");
		logger.info("Info Message Logged !!!");

	}
}

