package com.tnsif.nonaccessmodifiers;

abstract class shape{
	abstract void draw();
}

class square extends shape{
	void draw() {
		System.out.println("Draw a square");
	}
}
public class Abstract1 {

	public static void main(String[] args) {
		shape ex=new square(); // we can also give square and get the same output
		ex.draw();

	}

}
         