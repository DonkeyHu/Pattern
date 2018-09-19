package com.study.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 被观察者 
 *
 * @author: DonkeyHu
 * @date: 2018-09-19 10:02
 */
public abstract class Subject {
	private List<Observer> observers = new ArrayList<>();
	
	public Subject() {
		
	}
	
	public void attach(Observer o) {
		observers.add(o);
	}
	
	public void detach(Observer o) {
		observers.remove(o);
	}
	// 用一个容器组合偶合，当然可以改变另一个类的状态
	public void notifyObserver(int state) {
		for (Observer observer : observers) {
			observer.update(state);
		}
	}
}
