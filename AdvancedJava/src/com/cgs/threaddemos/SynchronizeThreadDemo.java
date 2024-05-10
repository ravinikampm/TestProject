package com.cgs.threaddemos;

class Course {
	String courseName;
	int numOfSeats;

	public Course(String courseName, int numOfSeats) {
		this.courseName = courseName;
		this.numOfSeats = numOfSeats;
	}

	public synchronized void registerForCourse(int rollNo) {
		//synchronized (this) {
			try {
				if (this.numOfSeats - 1 < 0) {
					throw new Exception("No more seats available for this course");
				}
				System.out.println("Booking successful!");
				this.numOfSeats -= 1;
				System.out.println("Available seats: " + this.numOfSeats);
			} catch (Exception e) {
				System.out.println("Error: " + e.getMessage());
			}
		//}
	}
}

class RegisterThread extends Thread {
	Course c;

	RegisterThread(Course c) {
		this.c = c;
	}

	public void run() {
		c.registerForCourse(1);
	}
}

public class SynchronizeThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course cse = new Course("CSE", 1);
		RegisterThread regObj1 = new RegisterThread(cse);
		regObj1.start();
		RegisterThread regObj2 = new RegisterThread(cse);
		regObj2.start();
	}
}
