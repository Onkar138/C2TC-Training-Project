package com.tns.hybridInh;

public class Person {
	
	private String name;
	private String address;
	private int age;
	private int phno;
	
	public Person(String name,String address,int age,int phno) {
		this.name=name;
		this.address=address;
		this.age=age;
		this.phno=phno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getPhno() {
		return phno;
	}

	public void setPhno(int phno) {
		this.phno = phno;
	}	
}
