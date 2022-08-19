package chapter4.Surcharge;

public class Etudiant {
 
	 Etudiant()  // déclaration explicite du constructeur par défaut
	{
		System.out.println("Constructeur par defaut");
	}
	
	public Etudiant(String nom)
	{
		
	}
	public static void main(String[] args) {
		Etudiant e1 = new Etudiant(); // ici on utilise le constructeur par défaut
		System.out.println("Suite du programme...");

	}

}
