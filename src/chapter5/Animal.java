package chapter5;

public class Animal {
	
	int age = 1;
	String nom="Toto";
	
	public Animal() {
		System.out.println("Constructeur par défaut Animal");
	}
	
	public Animal(int age) {
		System.out.println("Constructeur avec 1 paramètre de Animal");
	}
	
	{
		System.out.println("Bloc instance Animal");
	}
}
