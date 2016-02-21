package com.sheremet.aspectj.DepInjection;

import java.util.Random;

public class ChineseWorker implements Worker{
	private static final double MINQ = 0.5;
	private static final double MAXQ = 1;
	private Random r = new Random();
	private final String name;
	public ChineseWorker(String name) {
		this.name = name;
	}
	public Production createProduction(String model, ProductionFactory pf) {
		return pf.getNewInstance(model, new SimpleMachine(pf.getProductionType(),getRandomQuality() ));
	}
	private double getRandomQuality() {
		return r.nextDouble()*(MAXQ-MINQ)+MINQ;
	}
	public String getName() {
		return name;
	}
}
