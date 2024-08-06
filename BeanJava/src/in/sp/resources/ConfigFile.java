package in.sp.resources;

import org.springframework.context.annotation.*;
import in.sp.beans.*;

@Configuration
public class ConfigFile {

	
	@Bean
	public Forces para() {
		
		Forces forc = new Forces();
		
		forc.setName("Para SF");
		forc.setWing("Army");
		forc.setCountry("India");
		
		return forc;
	}
   
	
	
}
