package com.itp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.itp.model.Car;
import com.itp.model.Engine;
import com.itp.model.Gear;

@Configuration
@ComponentScan(basePackages = "com.itp.model")
public class MyConfig {

	@Bean(name="eng1")
	@Scope("prototype")
	public Engine engineByCDI()
	{
		return new Engine(1000, 10, "Tata","Petrol");
	}
	
	@Bean(name="eng2")
	public Engine engineBySDI()
	{
		Engine engine1=new Engine();
		engine1.setEngineCC(2000);
		engine1.setEngineLiter(20);
		engine1.setEngineMfg("Honda");
		engine1.setEngineType("Diesel");
		return engine1;
	}
	
	@Bean(name="gear1")
	@Scope("prototype")
	public Gear gearByCDI()
	{
		return new Gear(8, "Automatic", "Tata");
	}
	
	@Bean(name="gear2")
	@Scope("prototype")
	public Gear gearBySDI()
	{
		Gear gear=new Gear();
		gear.setGearLever(12);
		gear.setGearMfg("Volvo");
		gear.setGearType("Manual");
		return gear;
	}
	
	@Bean(name="car1")
//	@Scope("prototype")
	public Car carByCDI()
	{
		return new Car("Q3","Audi" ,"Red",999.90);
	}
}
