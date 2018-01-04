package com.designpattern.factoryex;

public class IPhone implements Mobile{
	private int ramSize;
	private String processor;
	private String GPU;
	public IPhone(int ramSize, String processor, String GPU){
		this.ramSize = ramSize;
		this.processor = processor;
		this.GPU = GPU;
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("IPHONE display**");
	}
}
