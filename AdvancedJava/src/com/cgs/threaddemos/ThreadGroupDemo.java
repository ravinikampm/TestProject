package com.cgs.threaddemos;

public class ThreadGroupDemo implements Runnable {
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadGroupDemo runnable = new ThreadGroupDemo();
		ThreadGroup tg1 = new ThreadGroup("Parent ThreadGroup");

		Thread t1 = new Thread(tg1, runnable, "one");
		t1.start();
		Thread t2 = new Thread(tg1, runnable, "two");
		t2.start();
		Thread t3 = new Thread(tg1, runnable, "three");
		t3.start();

		//tg1.destroy();
		System.out.println("Thread Group Name: " + tg1.getName());
		tg1.list();
		System.out.println(tg1.activeCount());
		System.out.println(tg1.getParent());
		System.out.println(tg1.activeGroupCount());
		
	}

}
