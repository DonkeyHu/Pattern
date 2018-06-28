package com.study.stratege;

public class NewCustomFewStratege implements Stratege{

	@Override
	public double getPrice(double price) {
		System.out.println("原价出售");
		return price;
	}

}
