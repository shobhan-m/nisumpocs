package com.designpattern.factoryex;

public class MobileFactory {
	public static Mobile createMobile(String type){
		if(type.equals(Mobile.IPHONE)){
			System.out.println("IPHONE Obj::");
			return new IPhone(2, "A9", "A9 GPu");
		}else if(type.equals(Mobile.SONY)){
			return new Sony(2,"ARM");
		}else if(type.equals(Mobile.SAMSUNG)){
			System.out.println("Samsung obj");
			return new Samsung("Intel");
		}else{
			return null;
		}
	}
}
