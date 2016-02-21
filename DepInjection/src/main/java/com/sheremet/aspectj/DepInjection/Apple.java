package com.sheremet.aspectj.DepInjection;

public class Apple implements Corporation{
	private Worker worker;
	private String currentModel;
	private IPhoneFactory factory = new IPhoneFactory();
	public Apple() {
	}
	public Production product() {
		return worker.createProduction(currentModel, factory);
	}
	public void setWorker(Worker w) {
		this.worker=w;
	}
	public void setProductionModel(String model) {
		currentModel=model;
	}
}
