package com.tnsif.Multithreading_ThreadClass;


		public class Child extends Thread{
			private int n;
			private String msg;

			public Child(int n, String msg) {
				this.n = n;
				this.msg = msg;
			}

			@Override
			public void run() {
				for (int i = 1; i <= n; i++) {
					try {
						Thread.sleep(300);
					} catch (InterruptedException e) {
						System.err.println("Thread interrupted: " + e.getMessage());
					}
					System.out.println(msg + i + " " + Thread.currentThread().getName());
				}
			}


	}

