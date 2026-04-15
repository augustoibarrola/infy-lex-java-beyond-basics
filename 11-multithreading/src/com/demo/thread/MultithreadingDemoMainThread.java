package com.demo.thread;

public class MultithreadingDemoMainThread {

	public static void main(String[] args) {
		
		Thread thread = Thread.currentThread();
		System.out.println("The name of the thread: " + thread.getName());

	}
}
