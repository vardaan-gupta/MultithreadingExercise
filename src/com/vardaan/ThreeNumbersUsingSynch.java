package com.vardaan;



public class ThreeNumbersUsingSynch {

	public static void main(String args[]) {
		ThreeNumbersUsingSynch threenum = new ThreeNumbersUsingSynch();
		long startTime = System.currentTimeMillis();
		Thread thread1=  new Thread(new NumberRunner(0, startTime), "First");
		Thread thread2=  new Thread(new NumberRunner(1, startTime), "Second");
		Thread thread3=  new Thread(new NumberRunner(2, startTime), "Third");
		thread1.start();
		thread2.start();
		thread3.start();
	}
	
	
	
}
