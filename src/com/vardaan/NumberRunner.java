package com.vardaan;

public class NumberRunner implements Runnable{
	
	
	public NumberRunner(int remainder, long startTime) {
		super();
		this.remainder = remainder;
		this.startTime =  startTime;
	}
	static  Object lock = new Object();
	
	private int max_NUMBER=100000;
	private static int number=0;
	private int remainder;
	private long startTime;
	
	
	@Override
	public void run() {			
		while (number <= max_NUMBER ) {

			synchronized (lock) {
				while ( number % 3 != remainder) {			
					try {
						lock.wait();	
					} catch (Exception e) {
						e.printStackTrace();
					}

				}	
				number++;
				System.out.println(Thread.currentThread().getName() +  " " + number);
				lock.notifyAll();
			}
		}
		
		long diff = System.currentTimeMillis()  - startTime;
		System.out.println("time in millis " +  diff );
		
	}
	
}
