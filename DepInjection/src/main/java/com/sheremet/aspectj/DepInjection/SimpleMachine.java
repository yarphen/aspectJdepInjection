package com.sheremet.aspectj.DepInjection;

import java.util.Random;

public class SimpleMachine implements Machine{
	private Random r = new  Random();
	private double quality;
	private String type;
	public SimpleMachine(String type, double quality) {
		this.quality=quality;
		this.type=type;
	}
	public String work() {
		if (r.nextDouble()<quality){
			return type +" is working!";
		}
		throw new BugException();
	}

}
