package chapter1;

public class Test {

	public static void main(String[] args) {
		System.out.println("Les 8 types primitfs");
		//Les entiers
		/*
		byte x = 10;
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		
		short y = 200;
		System.out.println(Short.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);
		*/
		int z = 400;
		
		System.out.println(Integer.MAX_VALUE); //2147483647
		System.out.println(Integer.MIN_VALUE);
		
		long v = 400;
		
		System.out.println(Long.MAX_VALUE);  //9223372036854775807
		System.out.println(Long.MIN_VALUE);  //92233720368547
		
		long v1 = 92_233_720_368_5471L; // Le L/l : permet de dire au compilateur d'augmenter la taille jusqu'a 64 bits
		
		///Les types réels
		// Les float
		 float x = 1_2.5f; // le f/F permet de réserver seulement 32 bits
		
		//Les double
		////double y = 12.5;
		
		int nbr = 1_002_560;
		System.out.println(nbr);
		
		int valeur = 0X12f3e; //Nombre exprimé dans la base Hexadécimale
		System.out.println(valeur); // valeur en base décimale
		
		int age = 074; // un nombre exprimé en base Octale
		System.out.println(age); 
		
		int score = 0B111; // un nombre exprimé en base Binaire(0b/0B)
		System.out.println(score); 
		
		boolean test = true;
		System.out.println(!test); 
		char first = 'a';
		System.out.println(++first); 
	}

}
