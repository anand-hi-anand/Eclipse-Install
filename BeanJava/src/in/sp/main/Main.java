package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import in.sp.beans.*;
import in.sp.resources.*;

public class Main {

	public static void main (String...args) {
		
		ApplicationContext con = new AnnotationConfigApplicationContext(ConfigFile.class);
		
		Forces f = (Forces) con.getBean("para");
		
		f.display();
		
		
	}
	
	
}
