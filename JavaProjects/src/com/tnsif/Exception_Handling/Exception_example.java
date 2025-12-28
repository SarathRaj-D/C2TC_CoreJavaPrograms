package com.tnsif.Exception_Handling;


	class InvalidBalanceException extends Exception {
	    InvalidBalanceException(String message) {
	        super(message);
	    }
	}

	public class Exception_example {

	    static void withdraw(int balance) throws InvalidBalanceException {
	        if (balance < 2000) {
	            throw new InvalidBalanceException("Insufficient balance");
	        }
	        System.out.println("Withdrawal successful");
	    }

	    public static void main(String[] args) {
	        try {
	            withdraw(2500);
	        } catch (InvalidBalanceException e) {
	            System.out.println(e.getMessage());
	        }
	    }
	}

