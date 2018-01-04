package com.designpattern.factoryex;

public class Exec {
	 public static void main(String[] args) {
		 Mobile mobile; 
		 mobile = MobileFactory.createMobile(Mobile.SAMSUNG);
		mobile.display();
		mobile = MobileFactory.createMobile(Mobile.IPHONE);
		mobile.display();
	}
}
