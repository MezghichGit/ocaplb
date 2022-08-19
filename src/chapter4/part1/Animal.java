package chapter4.part1;

public class Animal {
	
	private int age;
	double poids;  // modificateur par défaut: package-private
	protected String nom;
	public String espece;
	
	public void infoAnimal()
	{
		System.out.println("Age = "+ this.age);
		System.out.println("Poids = "+ this.poids);
		System.out.println("Nom = "+ this.nom);
		System.out.println("Espece = "+ this.espece);
	}

}
