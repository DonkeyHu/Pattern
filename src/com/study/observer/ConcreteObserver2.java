package com.study.observer;

public class ConcreteObserver2 implements Observer{

	@Override
	public void update(int state) {
		System.out.println("ConcreteObserver2 know state had changed to " + state);
		doSomething();
	}
	
	public void doSomething() {
		System.out.println("ConcreteObserver2 is to do something");
	}
}
