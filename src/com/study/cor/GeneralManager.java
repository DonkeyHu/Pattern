package com.study.cor;

public class GeneralManager extends Leader{
	
	public GeneralManager(String name) {
		super(name);
	}

	@Override
	public void handleRequest(LeaveRequest request) {
		if(request.getLeaveDays()<30) {
			System.out.println("员工："+request.getEmpName()+" ,请假:"+request.getLeaveDays()+" ,理由："+request.getReason());
			System.out.println("总经理:"+this.name+"批准!");
		}else {
			System.out.println("回家滚蛋！");
		}
	}

}
