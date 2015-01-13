package com.paypal.customGetSet;

import java.util.ArrayList;
import java.util.List;

public class Computers {
	List<AppleComputer> Computer;
	
	public void addComputer(AppleComputer comp){
		if(Computer == null)
			Computer = new ArrayList<AppleComputer>();
		Computer.add(comp);
	}

	public List<AppleComputer> getComputer() {
		return Computer;
	}
}
