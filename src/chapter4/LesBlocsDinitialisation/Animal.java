package chapter4.LesBlocsDinitialisation;

public class Animal {
	
	//Des attributs d'instance
	int age;
	
	//Des attributs de classe
	static int nbr;
	
	//Constructeurs
	public Animal() {System.out.println("Constructeur par défaut");}
	public Animal(int age) {this.age = age;}
	
	//Des methodes d'instance
	public int getAge() {return this.age;}
	//Des methodes de classe
	public static int getNbr(){return nbr;}
	
	//bloc d'initialisation d'instance
	
	{
		System.out.println("Un premier bloc d'instance");
		this.age = 20;
	}
	
	{
		System.out.println("Un deuxième bloc d'instance");
		this.age = 0;
	}
	
	static {
		System.out.println("Un bloc static de la classe");
	}

}
