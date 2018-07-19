package com.study.cor;
/**
 * 责任链模式
 * 请假条
 * @author DonkeyHu
 *
 */
public class LeaveRequest {
	private String empName;
	private int leaveDays;
	private String reason;
	public LeaveRequest() {
		super();
	}
	public LeaveRequest(String empName, int leaveDays, String reason) {
		super();
		this.empName = empName;
		this.leaveDays = leaveDays;
		this.reason = reason;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getLeaveDays() {
		return leaveDays;
	}
	public void setLeaveDays(int leaveDays) {
		this.leaveDays = leaveDays;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
}
