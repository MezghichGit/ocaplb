package chapter5;

public class Oiseau extends Animal{

	int age = 3; 

	public Oiseau() {
		//super(); // appel au constructeur par d�faut de la classe m�re
		super(10);  // appel au constructeur avec 1 param�tre
		System.out.println("Constructeur par d�faut Oiseau");
		
	}
	
	public Oiseau(int age) {
		System.out.println("Constructeur avec 1 param�tre de Oiseau");
	}
	
	
	public void info()
	{
		System.out.println("Nom :"+this.nom+" Age Oiseau :"+this.age+" Age Animal : "+super.age);
	}
	
	{
		System.out.println("Bloc instance Oiseau");
	}
}
