package chapter4.Surcharge;

public class Etudiant {
 
	 Etudiant()  // d�claration explicite du constructeur par d�faut
	{
		System.out.println("Constructeur par defaut");
	}
	
	public Etudiant(String nom)
	{
		
	}
	public static void main(String[] args) {
		Etudiant e1 = new Etudiant(); // ici on utilise le constructeur par d�faut
		System.out.println("Suite du programme...");

	}

}
