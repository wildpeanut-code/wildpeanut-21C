package ph.com.metrobank.template.configs;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

@Configuration
public class PropertiesConfiguration {

	@Bean
	public PropertySourcesPlaceholderConfigurer properties() {
		PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();
		configurer.setIgnoreResourceNotFound(true);
		
		List<Resource> resourceList = new ArrayList<>();
		resourceList.add(new FileSystemResource("C:/Users/wildpeanut/Documents/Eclipse IDE/Projects Needed Folders/properties-files/application.properties"));
		
		configurer.setLocations(resourceList.toArray(new Resource[] {}));
		
		return configurer;
	}
}
