package com.tnsif.oopsconcept;

public class Overloading {
	
	
	int addition(int a, int b)
	{
		return a + b;
	}
	
	float addition(float a, float b)
	{
		return a + b;
	}

	public static void main(String[] args) {
		
		Overloading mod = new Overloading();
		
		System.out.println("Addtion is: "+mod.addition(25, 18));
		System.out.println("Addtion is: "+mod.addition(6.0f, 8.5f));
		
		
	}

}
