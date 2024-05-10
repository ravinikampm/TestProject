package com.cgs.collection;

import java.lang.Integer;

import java.util.*;

class Student{
	String name;

	public Student(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
}

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] a = {5,6,7,5};
		//Integer[] aa = {new Integer(5), new Integer(6), new Integer(7)};
		
		//Student[] s = {new Student("Juee"), new Student("Dipti"), new Student("Vaibhav")};
		
		//a[4] = 9;
		//System.out.println(a[2]);
		
		//s[3] = new Student("Ravi");
		
		ArrayList al = new ArrayList();
		
		al.add(new Student("Saee"));
		al.add(new Student("Bhavesh"));
		al.add(new Student("Deepali"));
		
		//System.out.println(al.get(0));
		
		al.add(new Student("Ravindra"));
		//System.out.println(al.get(3));
		
		/*ArrayList newal = new ArrayList();
		newal.addAll(al);
		
		System.out.println(newal);
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		for(int y : a) {
			System.out.println(y);
		}*/
		System.out.println(al);
		//al.clear();
		System.out.println("After clear operation:"+al);
		
		
	}
}
