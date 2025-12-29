package com.tnsif.Multithreading_ThreadClass;

public class Threadmethods {
	
	public static void main(String[] args) {
		Child threadOne = new Child(5, "First"); 
		Child threadTwo = new Child(10, "Second");
		System.out.println("Current Thread: " + Thread.currentThread());

		threadOne.start();
		threadTwo.start();
		Thread.currentThread().setName("Parent Thread");
		Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
		System.out.println("Current Thread: " + Thread.currentThread());
		try {
			threadOne.join(); 
			threadTwo.join(2000);
		} catch (InterruptedException e) {
			System.err.println("Thread interrupted: " + e.getMessage());
		}
		System.out.println("End of Main");
	}
}


