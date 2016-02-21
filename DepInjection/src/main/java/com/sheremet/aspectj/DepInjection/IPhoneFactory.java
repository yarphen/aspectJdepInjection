package com.sheremet.aspectj.DepInjection;

public class IPhoneFactory implements ProductionFactory {
	private static final String TYPE = "iPhone";
	public Production getNewInstance(String model, Machine machine) {
		return new IPhone(model, machine);
	}
	public String getProductionType() {
		return TYPE;
	}

}
