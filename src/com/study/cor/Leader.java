package com.study.cor;
/**
 * 抽象类
 * @author DonkeyHu
 *
 */
public abstract class Leader {
	protected String name;
	protected Leader nextLeader;//责任链的后继对象
	
	public Leader(String name) {
		super();
		this.name = name;
	}
	//设定责任链的后继对象
	public void setNextLeader(Leader nextLeader) {
		this.nextLeader = nextLeader;
	}
	
	/**
	 * 处理请求核心的业务方法
	 * @param request
	 */
	public abstract void handleRequest(LeaveRequest request);
}
