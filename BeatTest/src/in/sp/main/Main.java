package in.sp.main;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Person;

public class Main {

	public static void main(String [] args) {
		
	 String config_loc= "/in/sp/resources/applicationContext.xml";
	 ApplicationContext context = new ClassPathXmlApplicationContext(config_loc);
	 
	 Person per = (Person) context.getBean("SF");
	 per.display();
	
	 
	}
	
}
