package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("vehicle")
public class Vehicle {
//Has_A_property
	@Autowired
	@Qualifier("eEngg")
	private Engine engine;
	public Vehicle() {
		System.out.println("vehicle:0-param constructor");
		
	}
	public void move(String sourcePlace,String destPlace)
	{
		engine.start();
		System.out.println("journey start from:"+sourcePlace);
		System.out.println("journey continue");
		engine.stop();
		System.out.println("Journey stop At:"+destPlace);
		
	}
	
}
