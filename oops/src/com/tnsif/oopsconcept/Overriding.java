package com.tnsif.oopsconcept;

class AnimalClass{
	void sound() {
		System.out.println("Animals can make sound");
	}
}


class Lion extends AnimalClass{
	void sound() {
		System.out.println("Lion roars......");
	}
}

public class Overriding {

	public static void main(String[] args) {
	
		Lion ac = new Lion();
		ac.sound();
		
	}
} 
