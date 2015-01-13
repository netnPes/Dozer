package com.paypal.inheritanceDozer;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestInheritanceDozer {
	
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		Mapper mapper = (Mapper)context.getBean("org.dozer.Mapper");
		
	
		SubClass1 subClass1 = new SubClass1();
		subClass1.setSub1Attr("subAttr");
		subClass1.setSuperAttr("Superattr");
		SubClass1Prime sub1Prime = new SubClass1Prime();
		mapper.map(subClass1, sub1Prime);
		
		System.out.println(sub1Prime.getSuperAttrPrime()+"  " + "   "+sub1Prime.getSub1PrimeAttr());
		
		
		
	}
}
