package com.cgs.collection;

import java.util.*;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List al = new ArrayList();// creating arraylist
		al.add("Ravi");// adding object in arraylist
		al.add("Vijay");
		al.add("Tejas");
		al.add("Ajay");

		List al2 = new LinkedList();// creating linkedlist
		al2.add("James");// adding object in linkedlist
		al2.add("Serena");
		al2.add("Swati");
		al2.add("Junaid");

		System.out.println("arraylist: " + al);
		System.out.println("linkedlist: " + al2);
		
		/*Approaches to access elements in the collection classes**/
		//For
		//for-each
		//Iterator
		
	}
}
