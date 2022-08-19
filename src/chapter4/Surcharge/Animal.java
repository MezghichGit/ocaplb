package chapter4.Surcharge;

public class Animal {
	
	int age;
	String espece;
	
	public Animal()
	{
		System.out.println("Constructeur par défaut");
	}

	public Animal(int age)
	{
		this(); // un appel au constructeur par defaut
		System.out.println("Constructeur avec un seul paramètre");
		this.age = age;
	}
	
	public Animal(int age, String espece)
	{
		this(10); // un appel au constructeur avec un seul paramètre
		System.out.println("Constructeur avec 2 paramètres");
		this.age = age;
		this.espece = espece;
	}
	
	public static void main(String[] args) {
		//Animal a1 = new Animal(); // appel explicite au constructeur par défaut
		
		Animal a2 = new Animal(20);

	}

}
