package chapter5.PolymorphismeHeritage;

public class Main {

	public static void main(String[] args) {
		
		Animal a = new Animal();
		
		Oiseau o = new Oiseau();
		
		Oiseau o2 = new Oiseau();
		//Upcasting
		a=o2;
		
		// a=o; 
		// o=a;   // DownCating  ==> KO
		 
		 o=(Oiseau)a;  //DownCasting + Cast Explicite => une exception ClassCastException
		 
		 System.out.println("Fin du programme...");

	}

}
