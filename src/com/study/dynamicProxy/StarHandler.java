package com.study.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class StarHandler implements InvocationHandler{
	
	private Star star;
	
	public StarHandler(Star star) {
		this.star=star;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("谈判");
		if(method.getName().equals("sing")) {
			method.invoke(star, args);
		}
		System.out.println("付钱");
		return null;
	}

}
