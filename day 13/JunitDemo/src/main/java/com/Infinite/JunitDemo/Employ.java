package com.Infinite.JunitDemo;

import java.util.Date;

public class Employ {

	
	private int empId;
	private String empName;
	private String empMail;
	private String empMobNo;
	private Date empdtJoin;
	private String empDept;
	private int empManagerId;
	private int empAvailLeaveBal;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpMail() {
		return empMail;
	}
	public void setEmpMail(String empMail) {
		this.empMail = empMail;
	}
	public String getEmpMobNo() {
		return empMobNo;
	}
	public void setEmpMobNo(String empMobNo) {
		this.empMobNo = empMobNo;
	}
	public Date getEmpdtJoin() {
		return empdtJoin;
	}
	public void setEmpdtJoin(Date empdtJoin) {
		this.empdtJoin = empdtJoin;
	}
	public String getEmpDept() {
		return empDept;
	}
	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}
	public int getEmpManagerId() {
		return empManagerId;
	}
	public void setEmpManagerId(int empManagerId) {
		this.empManagerId = empManagerId;
	}
	public int getEmpAvailLeaveBal() {
		return empAvailLeaveBal;
	}
	public void setEmpAvailLeaveBal(int empAvailLeaveBal) {
		this.empAvailLeaveBal = empAvailLeaveBal;
	}
	public Employ(int empId, String empName, String empMail, String empMobNo, Date empdtJoin, String empDept,
			int empManagerId, int empAvailLeaveBal) {
		this.empId = empId;
		this.empName = empName;
		this.empMail = empMail;
		this.empMobNo = empMobNo;
		this.empdtJoin = empdtJoin;
		this.empDept = empDept;
		this.empManagerId = empManagerId;
		this.empAvailLeaveBal = empAvailLeaveBal;
	}
	public Employ() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empMail=" + empMail + ", empMobNo=" + empMobNo
				+ ", empdtJoin=" + empdtJoin + ", empDept=" + empDept + ", empManagerId=" + empManagerId
				+ ", empAvailLeaveBal=" + empAvailLeaveBal + "]";
	}
	
	
}