package springAnotationOnFieldInjection;

import org.springframework.stereotype.Component;

@Component
public class Address {
	
	private String city;
	private int pincode;
	
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	
}
