package chapter1;

public class Animal {  // c'est type référence
	
	String espece;  // attribut d'instance
	String nom;     // attribut d'instance
	int age;        // attribut d'instance

	static int nbr;  // attribut de classe
	
	
	public static void main(String[] args) {

    int x ;   // variable locale
    //System.out.println(x);
    Animal a1 = new Animal();   //a1 : variable locale
    Animal a2 = new Animal(); 
    System.out.println(a1.espece);
    System.out.println(Animal.nbr);
    a1.nom="toto";
    a2.nom="tata";
    Animal.nbr = 2;
    nbr = 2;
    System.out.println(a1);
    System.out.println(a2);
    
    System.out.println(a1.nom);
    System.out.println(a2.nom);
    
    System.out.println(Animal.nbr);
    System.out.println(a1.nbr);
    System.out.println(a2.nbr);
    
    System.out.println("============ Après modif");
    a1.nbr = 3;
    System.out.println(Animal.nbr);
    System.out.println(a1.nbr);
    System.out.println(a2.nbr);
	}

}
