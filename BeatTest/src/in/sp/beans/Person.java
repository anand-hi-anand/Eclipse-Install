package in.sp.beans;

public class Person {

	
	private String name;
	private String address;
	private String id;
	
	public void setName(String name) {
		this.name= name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setAddress(String address) {
		this.address=address;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public void setId (String id) {
		
		this.id=id;
	}
	
	public String getId() {
	
		return this.id;
	}
		
	
	public void display() {
		
		System.out.println("Name -" + getName());
		System.out.println("Address -" + getAddress());
		System.out.println("ID -" + getId());
		
		
	}
}
