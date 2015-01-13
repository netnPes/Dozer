package com.paypal.DozerMappingViaAnnotation;

import org.dozer.DozerBeanMapper;

import com.paypal.DozerMapping.Destination;

public class TestDozerAnnotation {

	private static Object mapper = new DozerBeanMapper();

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person person = new Person();
		person.setName("Nethra");
		person.setAge(24);
		Employee employee = 
			    ((DozerBeanMapper) mapper).map(person, Employee.class);
		System.out.println(employee.getEmployeeAge());

	}

}
