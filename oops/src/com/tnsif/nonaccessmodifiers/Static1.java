package com.tnsif.nonaccessmodifiers;

public class Static1 {
	static int count;
	int variable =40;
	static {
		count=10;
		System.out.println("showing:"+count);
	}
	static void display() {
		System.out.println("static");
		
	}

	public static void main(String[] args) {
	
         System.out.println("show");
         display();
	}

}
