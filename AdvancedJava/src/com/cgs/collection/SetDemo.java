package com.cgs.collection;

import java.util.*;

public class SetDemo {

	public static void main(String[] args) {

		LinkedList lst = new LinkedList();
		lst.add("Java");
		lst.add("AWS");
		lst.add("Spring");
		lst.add("Microservice");
		lst.add("Microservice");
		System.out.println(lst);
		System.out.println("**********");
		// TODO Auto-generated method stub
		HashSet cars = new HashSet();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		System.out.println(cars.add("Mazda"));
		System.out.println(cars);
		System.out.println("**********");
		Set numberSet = new LinkedHashSet();
		// Adding elements to the set
		numberSet.add(new Integer(12));
		numberSet.add(24);
		numberSet.add(12);

		numberSet.add(56);
		numberSet.add(37);
		numberSet.add(86);
		numberSet.add(42);
		numberSet.add(78);
		// Displaying the Set
		System.out.println(numberSet);
		System.out.println("**********");
		TreeSet courseSet = new TreeSet();
		// Adding elements to the Set
		courseSet.add("Java");
		courseSet.add("Hibernate");
		courseSet.add("Angular JS");
		courseSet.add("Angular JS");

		// Iterating over the set using enhanced for loop
		for (Object s : courseSet) {
			System.out.println(s);
		}
		
		System.out.println(courseSet.first());

	}

}
