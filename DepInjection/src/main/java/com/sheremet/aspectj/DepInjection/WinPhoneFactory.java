package com.sheremet.aspectj.DepInjection;

public class WinPhoneFactory implements ProductionFactory{
	private static final String TYPE = "WinPhone";
	public Production getNewInstance(String model, Machine machine) {
		return new WinPhone(model, machine);
	}
	public String getProductionType() {
		return TYPE;
	}

}
