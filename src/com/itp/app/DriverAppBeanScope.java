package com.itp.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itp.model.Car;
import com.itp.model.Engine;

public class DriverAppBeanScope {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext beanFactory = new ClassPathXmlApplicationContext("resources/beanconfigs.xml");
		System.out.println("Hiiii");
		Engine engine1=(Engine)beanFactory.getBean("e1");//const called
		System.out.println(engine1);
		
		Engine engine2=(Engine)beanFactory.getBean("e1"); //const called
		System.out.println(engine2);
		
		System.out.println(engine1==engine2); //false
	}

}
