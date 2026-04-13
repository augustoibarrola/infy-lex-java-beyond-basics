package com.infy.io;

public class Address extends EmployeeDTO {
	
	private String city;
	private int pincode;
	
	public Address(String empId, String name, String designation, int jobLevel, String city, int pincode) {
		super(empId, name, designation, jobLevel);
		this.city = city;
		this.pincode = pincode;
	}

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

	@Override
	public String toString() {
		return "Address [city=" + city + ", pincode=" + pincode + "]";
	}

}
