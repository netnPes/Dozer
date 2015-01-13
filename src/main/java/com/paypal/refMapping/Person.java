package com.paypal.refMapping;

public class Person {
	String name;
	Address personAddress;
	
	public Person(){
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getPersonAddress() {
		return personAddress;
	}
	public void setPersonAddress(Address personAddress) {
		this.personAddress = personAddress;
	}
}
