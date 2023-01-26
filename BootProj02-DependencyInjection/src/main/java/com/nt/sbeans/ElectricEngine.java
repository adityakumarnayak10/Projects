package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("eEngg")
public class ElectricEngine implements Engine {

	public ElectricEngine() {
		System.out.println("ElectricEngine:0-param constructor");
	}
	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Electric Engine.start");

	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("ElectricEngine.stop");

	}

}
