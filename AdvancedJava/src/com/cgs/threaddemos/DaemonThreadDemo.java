package com.cgs.threaddemos;

public class DaemonThreadDemo extends Thread {

	public DaemonThreadDemo(String name) {
		super(name);
	}

	@Override
	public void run() {
		if (Thread.currentThread().isDaemon()) {
			System.out.println(getName() + " is Daemon thread");
		} else {
			System.out.println(getName() + " is User thread");
		}
	}

	public static void main(String[] args) {
		DaemonThreadDemo thread1 = new DaemonThreadDemo("thread1");
		DaemonThreadDemo thread2 = new DaemonThreadDemo("thread2");
		DaemonThreadDemo thread3 = new DaemonThreadDemo("thread3");
		// Setting user thread t1 to Daemon
		thread1.setDaemon(true);
		// starting first 2 threads
		thread1.start();
		thread2.start();

		// Setting user thread t3 to Daemon
		thread3.setDaemon(true);
		thread3.start();
	}
}
