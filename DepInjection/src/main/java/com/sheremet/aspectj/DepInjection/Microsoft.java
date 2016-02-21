package com.sheremet.aspectj.DepInjection;

public class Microsoft implements Corporation{
	private Worker worker;
	private String currentModel;
	private WinPhoneFactory factory = new WinPhoneFactory();
	public Microsoft() {
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
