package com.cgs.threaddemos;

class MyThread extends Thread {
	@Override
	public void run() {
		System.out.println("Inside run() method");
	}
}


public class ThreadMethods {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	    System.out.println("Main thread starts");
	    MyThread t = new MyThread();            // MyThread extends Thread
	    t.start();
	    System.out.println(t.isAlive());        // true
	    t.join();                               // main method waits for thread t to complete
	    System.out.println(t.isAlive());        // false
	    Thread.sleep(1000);                     // main method sleeps for 10 seconds
	    System.out.println("Main thread ends");
	}

}
