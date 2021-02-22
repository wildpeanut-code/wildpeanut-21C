package ph.com.metrobank.template;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TemplateApplication {

	private static final Logger LOGGER = Logger.getLogger(TemplateApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(TemplateApplication.class, args);
		
		LOGGER.debug("This is test for log4j");
	}

}
