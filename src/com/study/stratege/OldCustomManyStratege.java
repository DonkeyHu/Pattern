package com.study.stratege;

public class OldCustomManyStratege implements Stratege{

	@Override
	public double getPrice(double price) {
		System.out.println("老客户,打八折");
		return price*0.8;
	}

}
