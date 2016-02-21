package com.sheremet.aspectj.DepInjection;

public interface ProductionFactory {
	Production getNewInstance(String model, Machine machine);
	String getProductionType();
}
