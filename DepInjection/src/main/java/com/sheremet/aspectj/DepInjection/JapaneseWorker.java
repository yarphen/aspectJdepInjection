package com.sheremet.aspectj.DepInjection;

public class JapaneseWorker implements Worker{
	private final String name;
	public JapaneseWorker(String name) {
		this.name=name;
	}
	public  Production createProduction(String model, ProductionFactory pf) {
		return pf.getNewInstance(model, new SuperMachine(pf.getProductionType()));
	}
	public String getName() {
		return name;
	}

}
