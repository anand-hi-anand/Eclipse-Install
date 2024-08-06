package in.sp.beans;

public class Forces {

	private String name;
	private String wing;
	private String country;
	
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setWing(String wing) {
		this.wing= wing;
	}
	
	public String getWing() {
		return this.wing;
	}
	
	public void setCountry(String country) {
		this.country= country;
	}
	
	public String getCountry() {
		return this.country;
	}
	
	public void display() {
		
		System.out.println("Name of the Special forces " + name);
		System.out.println("Belongs to "+ wing );
		System.out.println("Of the country "+ country);
	}
	
}
