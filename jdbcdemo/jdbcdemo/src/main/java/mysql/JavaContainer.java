package mysql;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //This will add the XML Documents
public class JavaContainer {

	@Bean//This will create and return holiday object
	public Holiday getHoliday() throws Exception{
		return new Holiday("Gandhi Jayanti", "2nd October");
		
	}
	
	
	
}
