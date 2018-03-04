package com.study.staticProxy;

public class StarProxy implements Star {
	
	private Star star;
	
	public StarProxy(Star star) {
		this.star=star;
	}
	
	@Override
	public void conversation() {
		System.out.println("StarProxy.conversation()");
	}

	@Override
	public void signContract() {
		System.out.println("StarProxy.signContract()");
	}

	@Override
	public void bookTicket() {
		System.out.println("StarProxy.bookTicket()");
	}

	@Override
	public void sing() {
		star.sing();
	}

	@Override
	public void collectMoney() {
		System.out.println("StarProxy.collectMoney()");
	}

}
