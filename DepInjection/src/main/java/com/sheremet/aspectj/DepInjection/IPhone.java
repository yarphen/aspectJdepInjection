package com.sheremet.aspectj.DepInjection;

public class IPhone implements Production {
	private Machine machine;
	private String model;
	public IPhone(String model, Machine machine) {
		this.machine=machine;
		this.model=model;
	}
	public String getModel() {
		return model;
	}
	public void work() {
		System.out.println(machine.work()+" "+getModel());
	}

}
