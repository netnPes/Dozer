package com.paypal.customGetSet;

import java.util.ArrayList;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestCustomGetSet {

	public static Mapper mapper = new DozerBeanMapper();
	
	public static void main(String[] args) {
		mapper = new DozerBeanMapper();
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		mapper = (Mapper)context.getBean("org.dozer.Mapper");
		List<AppleComputer> temp = new ArrayList<AppleComputer>();
		AppleComputer t1 = new AppleComputer();
		t1.setModel("t1m1"); t1.setName("t1name");
		AppleComputer t2 = new AppleComputer();
		t2.setModel("t2m1"); t2.setName("t2name");
		temp.add(t1);temp.add(t2);
		AppleComputerWrapper wrap = new AppleComputerWrapper();
		wrap.setAppleComputers(temp);
		Computers comp = new Computers();
		mapper.map(wrap, comp);
		System.out.println(comp.getComputer().size());
		
		
		SourceCustom srcCust = new SourceCustom();
		DestinationCustom destCust = new DestinationCustom();
		srcCust.setName("Netra");
		mapper.map(srcCust, destCust);
		
		System.out.println(destCust.temp);
		
	}

}
