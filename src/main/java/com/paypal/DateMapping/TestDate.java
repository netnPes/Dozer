package com.paypal.DateMapping;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Mapper mapper = new DozerBeanMapper();
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		mapper = (Mapper)context.getBean("org.dozer.Mapper");
		StringWrapper strDate = new StringWrapper();
		strDate.setDateString("12/12/2000 12:12:11");
		DateWrapper date = mapper.map(strDate, DateWrapper.class);
		System.out.println(date.getDate().toString());
		}

	}
