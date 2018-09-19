package com.study.observer;

public class ConcreteObserver1 implements Observer{

	@Override
	public void update(int state) {
		System.out.println("ConcreteObserver1 know state had changed to " + state);
		doSomething();
	}
	
	
	public void doSomething() {
		System.out.println("ConcreteObserver1 is to do something");
	}
}
