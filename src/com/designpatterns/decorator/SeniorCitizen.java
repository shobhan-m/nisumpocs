package com.designpatterns.decorator;

public class SeniorCitizen extends AccountDecorator{
	
	Account account;
	
	public SeniorCitizen(Account account) {
		super();
		this.account = account;
	}

	@Override
	public String getTotalBenefits() {
		// TODO Auto-generated method stub
		return account.getTotalBenefits() + " other benefits are "+applyOtherBenefits();
	}

	@Override
	String applyOtherBenefits() {
		// TODO Auto-generated method stub
		return " an Medical insurance of up to $1,00 for Senior Citizen";
	}

}
