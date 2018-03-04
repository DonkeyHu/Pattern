package com.study.staticProxy;

public class JayZ implements Star {

	@Override
	public void conversation() {
		System.out.println("JayZ.conversation()");
	}

	@Override
	public void signContract() {
		System.out.println("JayZ.signContract()");
	}

	@Override
	public void bookTicket() {
		System.out.println("JayZ.bookTicket()");	
	}

	@Override
	public void sing() {
		System.out.println("***周杰伦在唱歌****");
	}

	@Override
	public void collectMoney() {
		System.out.println("JayZ.collectMoney()");
	}

}
