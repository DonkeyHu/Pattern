package com.study.observer;

public class Client {
	public static void main(String[] args) {
		ConcreteSubject subject = new ConcreteSubject();
		
		Observer observer1 = new ConcreteObserver1();
		Observer observer2 = new ConcreteObserver2();
		
		subject.attach(observer1);
		subject.attach(observer2);
		
		subject.setSubjectState(11);
	}
}
