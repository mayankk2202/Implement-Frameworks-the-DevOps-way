package com.spring.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		ApplicationContext cont = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		MemberShip memberShip = cont.getBean("membershipObj", MemberShip.class);
		
		System.out.println(memberShip);
		
		((ClassPathXmlApplicationContext) cont).close();
	}

}
