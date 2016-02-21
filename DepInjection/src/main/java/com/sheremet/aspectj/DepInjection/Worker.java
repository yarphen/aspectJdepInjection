package com.sheremet.aspectj.DepInjection;

public interface Worker {
	Production createProduction(String model, ProductionFactory pf);
	String getName();
}
