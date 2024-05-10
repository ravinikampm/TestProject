package com.cgs.collection;

import java.util.*;

class Course1 {
	String name;

	public Course1(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
}

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Course1> courseSet1 = new HashSet<>();
		courseSet1.add(new Course1("Java"));
		courseSet1.add(new Course1("DBMS"));
		Set<Course1> courseSet2 = new HashSet<>();
		courseSet2.add(new Course1("PHP"));
		courseSet2.add(new Course1("HTML"));
		courseSet2.add(new Course1("CSS"));
		Map<Integer, Set<Course1>> studentCourses = new HashMap<>();
		studentCourses.put(65465656, courseSet1);
		studentCourses.put(1003, courseSet2);
		studentCourses.put(1005, courseSet2);
		studentCourses.put(43465454, courseSet2);
		studentCourses.put(1002, courseSet2);
		studentCourses.put(null, courseSet2);
		/*Set courseSet1 = new HashSet();
		courseSet1.add(new Course1("Java"));
		courseSet1.add(new Course1("DBMS"));
		Set courseSet2 = new HashSet();
		courseSet2.add(new Course1("PHP"));
		courseSet2.add(new Course1("HTML"));
		courseSet2.add(new Course1("CSS"));
		Map studentCourses = new HashMap();
		studentCourses.put(new Integer(1001), courseSet1);
		studentCourses.put(new Integer(1002), courseSet2);*/

		//System.out.println(studentCourses);
		
		//Retrieving the set of Courses by studentID using get() method
		/*Set<Course1> courseSet = studentCourses.get(1001);
		System.out.println(courseSet);*

		//Retrieving the set of Courses by studentID using get() method
		/*Set<Course1> courseSetValues = studentCourses.get(1002);
		System.out.println(courseSetValues);*/
		
		// Iterating over the set of keys using for-each loop
		Set<Integer> setOfKeys = studentCourses.keySet();
		System.out.println(setOfKeys);
		/*for(Integer i : setOfKeys) {
		    System.out.println(studentCourses.get(i));
		}*/

		//System.out.println(studentCourses.size());
		//System.out.println(studentCourses.isEmpty());
		
		//studentCourses.remove(1001);
		//System.out.println(studentCourses.size());
		
		// Iterating over the collection using values() method
		/*for(Set<Course1> courseSetVal : studentCourses.values()) {
		    System.out.println(courseSetVal);
		}*/
		
		System.out.println("**********************");
		TreeMap<Integer, Set<Course1>> studentCoursesTree = new TreeMap<>();
		studentCoursesTree.put(65465656, courseSet1);
		studentCoursesTree.put(1003, courseSet2);
		studentCoursesTree.put(1005, courseSet2);
		studentCoursesTree.put(43465454, courseSet2);
		studentCoursesTree.put(1002, courseSet2);
		//studentCoursesTree.put(null, courseSet2);
		// Iterating over the set of keys using for-each loop
		Set<Integer> setOfKeys1 = studentCoursesTree.keySet();
		System.out.println(setOfKeys1);
		/*for(Integer i : setOfKeys1) {
		    System.out.println(studentCoursesTree.get(i));
		}*/
		
		System.out.println("Firstkey::"+studentCoursesTree.firstKey());
		System.out.println("Lastkey::"+studentCoursesTree.lastKey());
		
		System.out.println("**********************");
		Map<Integer, Set<Course1>> linkedhashmap = new LinkedHashMap<>();
		linkedhashmap.put(65465656, courseSet1);
		linkedhashmap.put(1003, courseSet2);
		linkedhashmap.put(1005, courseSet2);
		linkedhashmap.put(43465454, courseSet2);
		linkedhashmap.put(1002, courseSet2);
		// Iterating over the set of keys using for-each loop
		Set<Integer> setOfKeys2 = linkedhashmap.keySet();
		System.out.println(setOfKeys2);
		
	}

}
