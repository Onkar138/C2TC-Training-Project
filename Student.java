package com.tns.hybridInh;

public class Student extends Person {

	private String ClgName;
	private int RollNo;
	
	public Student(String name, String address, int age, int phno,String ClgName, int RollNo) {
		super(name, address, age, phno);
		this.ClgName=ClgName;
		this.RollNo=RollNo;
	}
	public String getClgName() {
		return ClgName;
	}

	public void setClgName(String clgName) {
		ClgName = clgName;
	}

	public int getRollNo() {
		return RollNo;
	}

	public void setRollNo(int rollNo) {
		RollNo = rollNo;
	}
	@Override
	public String toString() {
		return "Student [ClgName=" + ClgName + ", RollNo=" + RollNo + ", getName()=" + getName() + ", getAddress()="
				+ getAddress() + ", getAge()=" + getAge() + ", getPhno()=" + getPhno() + "]";
	}
	
	
	
}
