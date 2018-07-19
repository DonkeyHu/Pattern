package com.study.cor;
/**
 * 责任链模式
 * 请假流程的批准
 * @author DonkeyHu
 *
 */
public class Client {
	public static void main(String[] args) {
		Leader a=new Director("张三");
		Leader b=new Manager("李四");
		Leader c=new GeneralManager("王五");
		Leader b2=new ViceGeneralManager("胡八");
		//这里才是组织对象，形成责任链的关键
		a.setNextLeader(b);
		b.setNextLeader(b2);
		b2.setNextLeader(c);
		
		LeaveRequest r=new LeaveRequest("Allen", 15, "病假");
		a.handleRequest(r);
	}
}
