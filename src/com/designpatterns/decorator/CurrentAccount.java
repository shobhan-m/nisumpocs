package com.designpatterns.decorator;

public class CurrentAccount implements Account{
	
	@Override
	public String getTotalBenefits() {
		return "There is no withdrwal limit for current account";
	}

}