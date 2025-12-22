package com.tnsif.interface_1;

interface subject{
	void marks();
}

public class interface_demo implements subject{
	public void marks() {
		System.out.println("ALL PASS");
	}
	

	public static void main(String[] args) {
		
		interface_demo inter=new interface_demo() ;
		inter.marks();

	}

}
