package in.sp.beans;

public class Forces{
	
	private String unit;
	private String armedWing;
	private String country;
	
	public void setUnit(String unit) {
		this.unit=unit;
	}
	
	public String getUnit(){
		return unit;
	}
	
	public String getArmedWing(){
		return this.armedWing;
	} 
	
	public void setArmedWing(String armedWing) {
	    this.armedWing=armedWing;
	}
	
	public void setCountry(String country){
		this.country=country;
	}
	
	public String getCountry() {
		return this.country;
	}
	
	public void Display() {
		
		System.out.println("Unit - " + unit);
		System.out.println("is From " + armedWing);
		System.out.println("Hails from " + country);
		
		
	}
	
}