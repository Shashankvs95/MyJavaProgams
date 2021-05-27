package com.technoelevate.encapsulation;

public class Student {
	int stu_id;
	
	public Student(int id) {
		this.stu_id = id;
		id = 10;
		System.out.println(this.stu_id);
	}
	public static void main(String[] args) {
		Student s = new Student(10);
		System.out.println(s);
	}

}
