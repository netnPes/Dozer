package com.paypal.refMapping;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestrefMapping {

	private static Mapper mapper;
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		 Mapper mapper = (Mapper)context.getBean("org.dozer.Mapper");
		Person per = new Person();
		
		Address addr = new Address();
		addr.setAddress1("addr1");
		addr.setAddress2("addr2");
		
		per.setPersonAddress(addr);
		per.setName("name");
		
		Employee emp = mapper.map(per, Employee.class);
		System.out.println(per.getPersonAddress());
		System.out.println(emp.getAddress());
		

	}

}
