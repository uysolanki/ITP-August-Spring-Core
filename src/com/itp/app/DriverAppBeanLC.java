package com.itp.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itp.model.Car;
import com.itp.model.Engine;
import com.itp.model.Player;

public class DriverAppBeanLC {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext beanFactory = new ClassPathXmlApplicationContext("resources/beanconfigs.xml");
		
		Player player1=beanFactory.getBean("p1",Player.class); //const called
		System.out.println(player1);
		
		player1=null;
		
		System.gc();
		beanFactory.registerShutdownHook();
		
	}

}
