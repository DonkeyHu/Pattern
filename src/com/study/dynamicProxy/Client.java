package com.study.dynamicProxy;

import java.lang.reflect.Proxy;

public class Client {
	public static void main(String[] args) {
		Star jayz=new JayZ();
		StarHandler handler=new StarHandler(jayz);
		Star proxy=(Star) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[] {Star.class}, handler);
		proxy.conversation();
		proxy.sing();
	}
}
