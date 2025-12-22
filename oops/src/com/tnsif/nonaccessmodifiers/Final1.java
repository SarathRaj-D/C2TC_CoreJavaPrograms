package com.tnsif.nonaccessmodifiers;

public class Final1 {
	final int x=5;
	final void display() {
		System.out.println("value of x :"+x);
	}
	public static void main(String[] args) {
		Final1 e=new Final1()  ;
		e.display();
		
	}

}
