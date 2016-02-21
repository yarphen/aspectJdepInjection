package com.sheremet.aspectj.DepInjection;

import java.util.Random;

public class WinPhone implements Production {
	private static final double BSOD_FREQUENCY = 0.1;
	private Random r = new Random();
	private Machine machine;
	private String model;
	public WinPhone(String model, Machine machine) {
		this.machine=machine;
		this.model=model;
	}
	public String getModel() {
		return model;
	}

	public void work() {
		if (BSOD_FREQUENCY>r.nextDouble()){
			throw new BSODException();
		}
		System.out.println(machine.work()+" "+getModel());
	}

}
