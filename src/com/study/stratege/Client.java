package com.study.stratege;

public class Client {
	public static void main(String[] args) {
		Stratege s=new OldCustomManyStratege();
		Context c=new Context(s);
		c.printPrice(998);
	}
}
