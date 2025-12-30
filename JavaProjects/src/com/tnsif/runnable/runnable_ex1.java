package com.tnsif.runnable;

public class runnable_ex1 {
	
		public static void main(String[] args) {

			runnable_ex obj = new runnable_ex(5, 10, "Hello");
			

			Runnable runnable = new Runnable() {
				@Override
				public void run() { 
					System.out.println("Runnable with Anonymous Class");
				}
			};
			Thread thread = new Thread(runnable);
			thread.start();
			

			runnable = () -> { 
				System.out.println("Runnable with Lambda Expression");
			};
			
			new Thread(runnable).start();

			System.out.println("---------------");
			int n=5;
			runnable = () -> {
				try {
					for (int i = 1; i <= n; i++) {
						System.out.println("Loop iteration: " + i);
						Thread.sleep(1000);
					}
				} catch (InterruptedException e) {
					System.err.println("Task interrupted.");
				}
			};

	
			new Thread(runnable).start();

		}
	}
