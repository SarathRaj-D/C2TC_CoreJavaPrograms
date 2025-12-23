package com.tnsif.ExceptionHandling;

public class TryCatch_1 {

		public static void main(String[] args) {
			System.out.println("Main method");
			int result;
			try {

				result = TryCatch.performDivision(20, 0);
				if (result != 0)
					System.out.println("Divisin is " + result);


				result = TryCatch.performDivision(16, 4);
				if (result != 0)
					System.out.println("Division is " + result);

			} catch (ArithmeticException e) {
				System.out.println("I am in catch block: " + e.getMessage());
				
				e.printStackTrace();
			}
			System.out.println(TryCatch.performDivision(18f, 7f));

			System.out.println(TryCatch.performDivision(10f, 0f));

		}
	}


