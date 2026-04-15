package com.demo.lock;

import java.util.concurrent.locks.StampedLock;

public class DemoStampedLockOptimisticRead {

	public static void main(String[] args) {

//		Create an instance of StampedLock
		StampedLock stampedLock = new StampedLock();
		
//		Acquire writeLock
		long stamp = stampedLock.writeLock();
		
//		Check lock has been exclusively acquired
		System.out.println("Validate acquiring write lock: " + stampedLock.validate(stamp));
		
//		Acquire readLock
//		stampedLock.readLock();
//		System.out.println("Validate trying read lock: " + stampedLock.validate(stamp));
		
//		Try optimistic readLock
		stampedLock.tryOptimisticRead();
//		Check the lock has been exclusively acquired
		System.out.println("Validate trying optimistic read: " + stampedLock.validate(stamp));
		
//		Unlock writeLock
		stampedLock.unlockWrite(stamp);
		System.out.println("Validate after unlocking write lock: " + stampedLock.validate(stamp));

	}

}
