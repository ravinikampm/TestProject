package com.cgs.generics;

//Java program to show working of user defined
//Generic classes

//We use < > to specify Parameter type
class Test<T> {
	// An object of type T is declared
	T obj;

	Test(T obj) {
		this.obj = obj;
	} // constructor
	
	public T getObject() {
		return this.obj;
	}
}

class Student {
	String studid;

	public Student(String studid) {
		super();
		this.studid = studid;
	}

	public String getStudid() {
		return studid;
	}

	@Override
	public String toString() {
		return "Student [studid=" + studid + "]";
	}
}

public class GenericClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// instance of Integer type
		Test<Integer> iObj = new Test<Integer>(15);
		System.out.println(iObj.getObject());
		
		//Test<int> iObj = new Test<int>(15);
		//System.out.println(iObj.getObject());		

		// instance of String type
		Test<String> sObj = new Test<String>("GeeksForGeeks");
		System.out.println(sObj.getObject());
		
		Test<Student> stud = new Test<Student>(new Student("Test"));
		System.out.println(stud.getObject());
		
		
		Student s = new Student("Juee");
		
		//Integer obj = new Student(10);
		
	}

}
