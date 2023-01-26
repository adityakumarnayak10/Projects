package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("pEngg")
public class PetrolEngine implements Engine {

	public PetrolEngine() {
		System.out.println("PetrolEngine:0-Param constructor");
	}
	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("petrolEngine Start");
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("PetrolEngiine Stop");
		
	}

}
