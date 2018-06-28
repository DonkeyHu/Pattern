package com.study.adapter;
/**
 * 目标对象
 * （相当于笔记本电脑）
 * @author DonkeyHu
 *
 */
public class Client {
	public void test1(Target t) {
		t.getReq();
	}
	public static void main(String[] args) {
		Client c=new Client();
		//Target tar=new Adapter();
		Adaptee a=new Adaptee();
		Target tar=new Adapter2(a);
		c.test1(tar);
	}
}
