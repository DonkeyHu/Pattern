package com.study.adapter;
/**
 * 对象适配器（组合关系）
 * (连接PS/2的一端)
 * @author DonkeyHu
 *
 */
public class Adapter2  implements Target{
	private Adaptee a;
	public Adapter2(Adaptee a) {
		this.a=a;
	}
	@Override
	public void getReq() {
		a.request();
	}

}
