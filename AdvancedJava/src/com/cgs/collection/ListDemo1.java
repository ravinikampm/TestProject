package com.cgs.collection;

import java.util.*;

class Student1{
	String sid;
	String name;
	
	public Student1(String sid, String name) {
		super();
		this.sid = sid;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student1 [sid=" + sid + ", name=" + name + "]";
	}
}

public class ListDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		List al = new ArrayList();// creating arraylist
		al.add(new Student1("S01","Juee"));// adding object in arraylist
		al.add(new Student1("S02","Dipti"));
		al.add(new Student1("S03","Vaibhav"));
		al.add(new Student1("S04","Harshal"));

		List al2 = new LinkedList();// creating linkedlist
		al2.add(new Student1("D01","Juee1"));// adding object in arraylist
		al2.add(new Student1("D02","Dipti1"));
		al2.add(new Student1("D03","Vaibhav1"));
		al2.add(new Student1("D04","Harshal1"));

		System.out.println("arraylist: " + al);
		System.out.println("linkedlist: " + al2);
	}

}
