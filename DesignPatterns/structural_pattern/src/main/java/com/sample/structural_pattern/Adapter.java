package com.sample.structural_pattern;

	// Java implementation of Adapter pattern 

	interface Bird 
	{ 
		// birds implement Bird interface that allows 
		// them to fly and make sounds adaptee interface 
		public void fly(); 
		public void makeSound(); 
	} 

	class Sparrow implements Bird 
	{ 
		// a concrete implementation of bird 
		public void fly() 
		{ 
			System.out.println("Flying"); 
		} 
		public void makeSound() 
		{ 
			System.out.println("Chirp Chirp"); 
		} 
	} 

	interface ToyDuck 
	{ 
		// target interface 
		// toyducks dont fly they just make 
		// squeaking sound 
		public void squeak(); 
	} 

	class PlasticToyDuck implements ToyDuck 
	{ 
		public void squeak() 
		{ 
			System.out.println("Squeak"); 
		} 
	} 

	class BirdAdapter implements ToyDuck 
	{ 
		// You need to implement the interface your 
		// client expects to use. 
		Bird bird; 
		public BirdAdapter(Bird bird) 
		{ 
			// we need reference to the object we 
			// are adapting 
			this.bird = bird; 
		} 

		public void squeak() 
		{ 
			// translate the methods appropriately 
			bird.makeSound(); 
		} 
	} 



