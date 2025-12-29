package com.tnsif.Multithreading_ThreadClass;

public class Thread_ex {

		public static void main(String[] args) {
		    Child One = new Child(5, "First");
		    Child Two = new Child(10, "Second");

			One.start();
			Two.start();

			System.out.println("--End of Main--");
		}
	}

