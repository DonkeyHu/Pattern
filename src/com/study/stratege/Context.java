package com.study.stratege;
/**
 * 这个类主要与客户端进行交互用
 * @author DonkeyHu
 *
 */
public class Context {
	private Stratege stratege;

	public Context(Stratege stratege) {
		super();
		this.stratege = stratege;
	}
	public void setStratege(Stratege stratege) {
		this.stratege = stratege;
	}
	public void printPrice(double s) {
		System.out.println("现在报价为："+stratege.getPrice(s));
	}
}
