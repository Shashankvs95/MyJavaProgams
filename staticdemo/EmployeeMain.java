package com.technoelevate.staticdemo;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.id = 1;
		e1.name = "Shashank";
		e1.salary = 50000;
		
		Employee e2 = new Employee();
		e2.id = 2;
		e2.name = "Sandeep";
		e2.salary = 45000;
		
		System.out.println(e1.id);
		System.out.println(e1.name);
		System.out.println(e1.salary);
		System.out.println(e1.company);
		System.out.println();
		
		
		System.out.println(e2.id);
		System.out.println(e2.name);
		System.out.println(e2.salary);
		System.out.println(e2.company);
		System.out.println();
		
		System.out.println(e1.count);
		System.out.println(e2.count);
		
		
	}

}
