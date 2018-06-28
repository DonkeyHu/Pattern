package com.study.adapter;
/**
 * 类适配器
 * (连接PS/2的一端)
 * @author DonkeyHu
 *
 */
public class Adapter extends Adaptee implements Target{

	@Override
	public void getReq() {
		super.request();
	}

}
