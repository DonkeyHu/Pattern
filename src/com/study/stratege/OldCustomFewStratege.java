package com.study.stratege;

public class OldCustomFewStratege implements Stratege{

	@Override
	public double getPrice(double price) {
		System.out.println("打九折");
		return price*0.9;
	}

}
