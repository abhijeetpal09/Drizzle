package com.drizzle.test;

public class Implementation {

	Emp e = new Emp();
	
	public Implementation() {
		// TODO Auto-generated constructor stub
	}

	public Implementation(int id, String name, String address) {
		e.setId(id);
		e.setName(name);
		e.setAddress(address);
	}

	public String getNameOfEmp() {

		return e.getName();

	}

	public String getAddressOfEmp() {

		return e.getAddress();

	}
}
