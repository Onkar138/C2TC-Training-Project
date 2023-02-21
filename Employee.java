package com.tns.hybridInh;

public class Employee extends Person {

	private String CompanyName;
	private int EmpID;
	
	public Employee(String name, String address, int age, int phno, String CompanyName, int EmpID) {
		super(name, address, age, phno);
		this.CompanyName=CompanyName;
		this.EmpID=EmpID;
	}

	public String getCompanyName() {
		return CompanyName;
	}

	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}

	public int getEmpID() {
		return EmpID;
	}

	public void setEmpID(int empID) {
		EmpID = empID;
	}

	@Override
	public String toString() {
		return "Employee [CompanyName=" + CompanyName + ", EmpID=" + EmpID + ", getName()=" + getName()
				+ ", getAddress()=" + getAddress() + ", getAge()=" + getAge() + ", getPhno()=" + getPhno() + "]";
	}

	
}
