package com.sheremet.aspectj.DepInjection;

public class SuperMachine implements Machine{
	private String type;
	public SuperMachine(String type) {
		this.type=type;
	}
	public String work() {
		return type +" is working!";
	}

}
