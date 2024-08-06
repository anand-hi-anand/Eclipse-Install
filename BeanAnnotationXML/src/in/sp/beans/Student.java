package in.sp.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.*;

@Component
public class Student{
	
	@Value(value = "Shashwat")
	private String name;
	@Value(value= "29")
	private int roll;
	@Value(value="10th")
	private String standard;
	
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return this.name;
	}	
	
	public void setRoll(int roll) {
		this.roll=roll;
	}
	
	public int getRoll() {
		return this.roll;
	}
	
	public void setStandard(String standard) {
		this.standard=standard;
	}
	
	public String getStandard() {
		return this.standard;
	}
	
	public void display() {
		System.out.println("Name - " +name);
		System.out.println("Roll Number  - "+ roll);
		System.out.println("Standard - "+ standard);
	}
	
	
}