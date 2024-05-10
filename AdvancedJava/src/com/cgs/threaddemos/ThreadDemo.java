package com.cgs.threaddemos;

class UploadResult extends Thread {
	@Override
    public void run() {
         // Thread implementation
    	System.out.println("Inside run method"); 
    	salaryProcessing();	
    }
	
	public void salaryProcessing() {
		System.out.println("Inside salaryProcessing");
	}
}

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UploadResult ur = new UploadResult();
		ur.start();
		
		UploadResult ur1 = new UploadResult();
		ur1.start();
		
		UploadResult ur2 = new UploadResult();
		ur2.start();
		
		UploadResult ur3 = new UploadResult();
		ur3.start();
	}

}
