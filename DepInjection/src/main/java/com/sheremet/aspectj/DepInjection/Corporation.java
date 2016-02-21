package com.sheremet.aspectj.DepInjection;

public interface Corporation {
	Production product();
	void setWorker(Worker w);
	void setProductionModel(String model);
}
