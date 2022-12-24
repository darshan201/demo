package com.app.demo;

class Address implements Cloneable {
	int number;
	String street;
	int post;

	public Address(int number, String street, int post) {
		this.number = number;
		this.street = street;
		this.post = post;
	}

	public Object clone() throws CloneNotSupportedException {
		
		return super.clone();

	}
}

class Employee implements Cloneable {
	Address address;
	int id;
	String name;

	public Employee(Address address, int id, String name) {
		this.address = address;
		this.id = id;
		this.name = name;
	}

	protected Object clone() throws CloneNotSupportedException {
		Employee emp=(Employee)super.clone();
		emp.address = (Address)address.clone();
		
		return super.clone();
	}
}

public class Company {

	public static void main(String[] args) throws CloneNotSupportedException {
		Address add = new Address(83, "rosamon", 1234);
		Employee employee1 = new Employee(add, 1, "darsan");
		Employee employee2 = null;
		
		add.number=22;
		
		employee2 = (Employee) employee1.clone();

		System.out.println(employee1.address.number);
		System.out.println(employee2.address.number);
		
	}

}
