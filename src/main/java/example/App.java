package example;

//import org.apache.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.LoggerContext;
import java.io.*;
  

/**
 * Hello world!
 *
 */
public class App {

    static Logger logger = LogManager.getLogger("App");

    public static void main(String[] args) {

        LoggerContext context = (org.apache.logging.log4j.core.LoggerContext) LogManager.getContext(false);
        File file = new File("/Users/cameroncompton/Documents/Projects/untitled folder/log4j/project2/demo2/src/main/java/example/log4j2.xml"); 
        context.setConfigLocation(file.toURI());
        // System.out.println( "Hello World!" );
        logger.debug("Debug Message Logged !!!");
        logger.info("Info Message Logged !!!");
        logger.error("Error Message Logged !!!");
    }
}
