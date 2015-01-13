package com.paypal.DozerMapping;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDozer {
	private Mapper mapper;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		Source source = new Source();
		source.setName("Dozer");
		source.setPrice("4");
		source.setNametest("test");

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		Mapper mapper = (Mapper)context.getBean("org.dozer.Mapper");
		Destination destObject = 
			    mapper.map(source, Destination.class);

		System.out.println(destObject.nam);
		System.out.println(destObject.name);
		System.out.println(destObject.price);
	}
}
