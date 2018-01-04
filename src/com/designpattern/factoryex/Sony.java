package com.designpattern.factoryex;

public class Sony implements Mobile{
	private int ramSize;
	private String processor;
	
	public Sony(int ramSize, String processor){
		this.ramSize = ramSize;
		this.processor = processor;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Sony display");
	}
}
