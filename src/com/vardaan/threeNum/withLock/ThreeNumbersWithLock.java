package com.vardaan.threeNum.withLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreeNumbersWithLock {

	
	Lock lock = new ReentrantLock();
	
	public static void main(String args[]) {
		ThreeNumbersWithLock threenum = new ThreeNumbersWithLock();
		Thread thread1=  new Thread(new NumberRunnerWithLock(0), "First");
		Thread thread2=  new Thread(new  NumberRunnerWithLock(1), "Second");
		Thread thread3=  new Thread(new  NumberRunnerWithLock(2), "Third");
		thread1.start();
		thread2.start();
		thread3.start();
	}
	
	
	
}
