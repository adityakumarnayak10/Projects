package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("DEngg")
public class DieselEngine implements Engine {

	public DieselEngine() {
		System.out.println("ElectricEngine:0-param constructor");
	}
	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("DieselEngine:Start");
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("DieselEngine:Stop");
		
	}

}
