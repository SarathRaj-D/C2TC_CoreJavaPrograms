package com.tnsif.Multithreading_ThreadClass;

public class ThreadLifecycle {


		public static void main(String[] args) {
			child_1 myThread = new child_1();
			System.out.println("Before Runnable stage Thread is alive or not? " + myThread.isAlive());
			myThread.start();

			try {
				Thread.sleep(2000);
			} catch (InterruptedException exp) {
				System.err.println("Thread is interrupted !");
			}

			System.out.println("After complete execution of Thread ,it is alive or not? " + myThread.isAlive());
		}
	}
