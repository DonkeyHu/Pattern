package com.study.observer;

public class ConcreteSubject extends Subject {
	private int subjectState;

	public int getSubjectState() {
		return subjectState;
	}

	public void setSubjectState(int subjectState) {
		this.subjectState = subjectState;
		System.out.println("change the state to "+subjectState);
		this.notifyObserver(subjectState);
	}
	
}
