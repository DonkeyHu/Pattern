package com.study.staticProxy;

public class Client {
	public static void main(String[] args) {
		Star jayz=new JayZ();
		Star proxy=new StarProxy(jayz);
		
		proxy.conversation();
		proxy.signContract();
		proxy.bookTicket();
		proxy.sing();
		proxy.collectMoney();
	}
}
