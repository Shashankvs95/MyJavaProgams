package com.technoelevate.encapsulation;

public class EmployeeMain {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setId(1);
		e.setName("Shashank");
		e.setCompany("TY");
		
		String name = e.getName();
		int id = e.getId();
		String company = e.getCompany();
		
		System.out.println(id);
		System.out.println(name);
		System.out.println(company);
	}

}
