package com.cgs.threaddemos;

import java.lang.Thread;


class UploadResult1 implements Runnable {
    @Override
    public void run() {
        // Thread implementation
    	System.out.println("Inside Runnable");
    	salaryProcessing();	
    }
	
	public void salaryProcessing() {
		System.out.println("Inside salaryProcessing");
	}
}

public class RunnableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        UploadResult1 uploadRunnable = new UploadResult1();
        Thread threadObj = new Thread(uploadRunnable);
        threadObj.start();
        
        UploadResult1 uploadRunnable1 = new UploadResult1();
        Thread threadObj1 = new Thread(uploadRunnable1);
        threadObj1.start();
	}
	
	

}
