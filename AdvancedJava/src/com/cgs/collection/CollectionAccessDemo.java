package com.cgs.collection;

import java.util.*;

class Course {
	String courseName;

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public Course(String courseName) {
		super();
		this.courseName = courseName;
	}

	@Override
	public String toString() {
		return courseName;
	}
}

public class CollectionAccessDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList courseList = new LinkedList();
		courseList.add(new Course("Java"));
		courseList.add(new Course("Hibernate"));
		courseList.add(new Course("AngularJS"));
		courseList.add(new Course("Java"));
		
		/*Iteration using for construct**/
		for(int i=0;i<courseList.size();i++) {
			System.out.println(courseList.get(i));
		}
		
		System.out.println("**************");
		/*Iteration using foreach construct**/
		for(Object c : courseList) {
			System.out.println((Course)c);
		}
		
		System.out.println("**************");
		Iterator courseIterator = courseList.iterator();
		while(courseIterator.hasNext()) {
		      Course c = (Course)courseIterator.next();
		      System.out.println(c);            //  toString() method has been overridden in the Course class
		}
		
		System.out.println("**************");
		ListIterator courseIterator1 = courseList.listIterator();
		while(courseIterator1.hasNext()) {
		      Course c = (Course)courseIterator1.next();
		      System.out.println(c);            //  toString() method has been overridden in the Course class
		}
		
		courseList.add(new Course("Spring"));
		System.out.println("**************");
		/*Iteration using foreach construct**/
		for(Object c : courseList) {
			System.out.println((Course)c);
		}
		
		courseList.addFirst(new Course("Microservices"));
		System.out.println("**************");
		/*Iteration using foreach construct**/
		for(Object c : courseList) {
			System.out.println((Course)c);
		}	
	}
}
