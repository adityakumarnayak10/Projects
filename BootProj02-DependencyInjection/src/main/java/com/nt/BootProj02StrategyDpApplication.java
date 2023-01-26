package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbeans.Vehicle;

@SpringBootApplication
public class BootProj02StrategyDpApplication {
public static void main(String[] args) {
	//get the IOC containor
	ApplicationContext ctx=SpringApplication.run(BootProj02StrategyDpApplication.class, args);
			//get target spring bean class object
			Vehicle vehicle=ctx.getBean("vehicle",Vehicle.class);
			//invoke the business method
			vehicle.move("hydrabad", "Goa");
			//close the containor
			((ConfigurableApplicationContext) ctx).close();
}
}
