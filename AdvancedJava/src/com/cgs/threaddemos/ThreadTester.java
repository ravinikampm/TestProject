package com.cgs.threaddemos;

class Thread1 extends Thread {
	@Override
	public void run() {
	    System.out.println("inside Thread1");
		for(int i=0;i<3;i++)
		{
		    System.out.println("inside Thread1: "+i); 
		}
		System.out.println("Thread1 finished");
	}
}

class Thread2 extends Thread {
	@Override
	public void run() {
		System.out.println("inside Thread2");
		for(int i=0;i<3;i++)
		{
		    System.out.println("inside Thread2: "+i);
		}
		System.out.println("Thread2 finished");
	}
}

public class ThreadTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread1 thread1 = new Thread1();
		Thread2 thread2 = new Thread2();
		thread1.setPriority(Thread.MIN_PRIORITY);
		thread2.setPriority(Thread.MAX_PRIORITY);
		thread1.start();
		thread2.start();
	}

}
