package in.sp.Main;

import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.*;

public class Main{
	
	public static void main(String [] args) {
        
		String loc = "in/sp/resources/ApplicationContext.xml";
		ApplicationContext con = new ClassPathXmlApplicationContext(loc);
		Forces forc = (Forces)con.getBean("SF1");
		Forces forc1 = (Forces) con.getBean("SF2");
				
		forc.Display();		
		System.out.println("----------------");
		forc1.Display();
	}
	
}