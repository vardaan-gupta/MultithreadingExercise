package com.vardaan.threeNum.withLock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class NumberRunnerWithLock implements Runnable {

	private static int number = 0;
	private int maxNUMBER = 100;
	private int remainder;
	private static Lock lock = new ReentrantLock();
	private static Condition condition = lock.newCondition();

	public NumberRunnerWithLock(int remainder) {
		super();
		this.remainder = remainder;
	}

	@Override
	public void run() {
		while (number <= maxNUMBER) {

			if (lock.tryLock()) {
				lock.lock();

				if (number % 3 != remainder) {
					try {
						condition.signalAll();
						condition.await();
					} catch (Exception e) {
						e.printStackTrace();

					}
				}
				number++;
				System.out.println(Thread.currentThread().getName() + " " + number);
				condition.signalAll();
				lock.unlock();

			}

		}
	}

}
