package com.tnsif.Multithreading_ThreadClass;

	public class child_1 extends Thread{
		@Override
		public void run() {
			System.out.println("In side run() Thread is alive or not? " + this.isAlive());
			int no = 1;
			while (no < 10) {
				no++;
				System.out.println("number = " + no);
				try {
					sleep(800);

				} catch (InterruptedException exp) {
					System.err.println("Thread Interrupted ...");
				}
			}
		}
	}


