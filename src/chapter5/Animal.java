package chapter5;

public class Animal {
	
	int age = 1;
	String nom="Toto";
	
	public Animal() {
		System.out.println("Constructeur par d�faut Animal");
	}
	
	public Animal(int age) {
		System.out.println("Constructeur avec 1 param�tre de Animal");
	}
	
	{
		System.out.println("Bloc instance Animal");
	}
}
