package com.itp.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.itp.config.MyConfig;
import com.itp.model.Car;
import com.itp.model.Engine;
import com.itp.model.Player;

public class DriverAppJavaBasedBeans {

	public static void main(String[] args) {
		ApplicationContext beanFactory = new AnnotationConfigApplicationContext(MyConfig.class);
		
		Engine engine1=(Engine)beanFactory.getBean("eng1");//const called
		System.out.println(engine1);
		
		Engine engine11=(Engine)beanFactory.getBean("eng1");//const called
		System.out.println(engine11);
		
		System.out.println(engine1==engine11);
		
		Engine engine2=(Engine)beanFactory.getBean("eng2");//const called
		System.out.println(engine2);
		
		Player player1=(Player)beanFactory.getBean(Player.class);//const called
		System.out.println(player1);
		
		Car car1=beanFactory.getBean("car1",Car.class);//const called
		System.out.println(car1);
	}

}
