package oopsConcept;

class Animals{
	public void crying() {
		System.out.println("crying");
	}
}

class Dog extends Animals {
	public void Weeping() {
	System.out.println("Weeping");
}
}
class BabyDog extends  Dog {
	public void barking() {
	System.out.println("barking");
	}
}

public class Animalcrying extends BabyDog {
	public void DogAnimal() {
		System.out.println("DogAnimal");
	}

	public static void main(String[] args) {
		//Multilevel inheritance in java program
      
		Animalcrying a = new Animalcrying();
		a.DogAnimal(); a.barking(); a.Weeping();
		
		BabyDog B =  new BabyDog();
		B.barking(); B.Weeping(); 
		
		
		
	}

}
