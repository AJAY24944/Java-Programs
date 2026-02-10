package com.inheritance;

class Animal {
	String name , habitat;

	public Animal(String name, String habitat) {
		super();
		this.name = name;
		this.habitat = habitat;
	}
	
	public void displayHabitat() {
		System.out.println(name + " lives in " + habitat);
	}
}

class Mammal extends Animal {
	boolean isWarmBlooded;

	public Mammal(String name, String habitat, boolean isWarmBlooded) {
		super(name, habitat);
		this.isWarmBlooded = isWarmBlooded;
	}
	
	public void displayMammalInfo() {
		System.out.println("Mammal Name : "+name);
		System.out.println("Is Warm Blooded : "+isWarmBlooded);
	}
}

class Bird extends Animal {
	boolean canFly;

	public Bird(String name, String habitat, boolean canFly) {
		super(name, habitat);
		this.canFly = canFly;
	}
	
	public void displayBirdInfo() {
		System.out.println("Bird Name : " + name);
		System.out.println("Can Fly : " + canFly);
	}
	
}

class Reptile extends Animal {
	boolean isColdBlooded;

	public Reptile(String name, String habitat, boolean isColdBlooded) {
		super(name, habitat);
		this.isColdBlooded = isColdBlooded;
	}
	
	public void displayReptileInfo() {
		System.out.println("Reptile Name : " + name);
		System.out.println("Is Cold Blooded : " + isColdBlooded);
	}
}
public class AnimalMain {

	public static void main(String[] args) {
		
		Animal mammal = new Mammal("Lion", "Savannah", true);
		mammal.displayHabitat();
		((Mammal) mammal).displayMammalInfo();
		
		System.out.println("----------------------------------------");
		
		Animal bird = new Bird("Eagle", "Forest", true);
		bird.displayHabitat(); 
		((Bird) bird).displayBirdInfo();
		
		System.out.println("----------------------------------------");

		Animal reptile = new Reptile("Snake", "Desert", true);
		reptile.displayHabitat();
		((Reptile) reptile).displayReptileInfo();
	}

}
