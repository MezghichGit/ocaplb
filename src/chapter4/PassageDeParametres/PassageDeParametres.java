package chapter4.PassageDeParametres;

public class PassageDeParametres {

	// Exemple 1 :  avec les types primitifs
	/*
	public static void permut(int x, int y) {
		System.out.println("########## Avant permutation...");
		System.out.println("x = "+x);
		System.out.println("y = "+y);
		System.out.println("##########");
		int temp;
		temp = x;
		x = y;
		y = temp;
		System.out.println("########## Après permutation...");
		System.out.println("x = "+x);
		System.out.println("y = "+y);
	}*/
	
	// Exemple 2 :  avec un objet(type réference) mutable
	/*public static void modifStringBuilder(StringBuilder sh)
	{
		sh.append("-Certification");
	}*/
	
	// Exemple 3 :  avec un objet (type réference) immutable
	
	public static String modifString(String sh)
	{
		//sh.concat("-Certification");
		sh = sh.concat("-Certification");
		return sh;
	}
	
	public static void main(String[] args) {
		
		String s = new String("OCA");
		s = modifString(s);
		System.out.println(s);
		
		/*
		StringBuilder sb = new StringBuilder("OCA");
		modifStringBuilder(sb);
		System.out.println(sb);*/
		/*
		int a = 20;
		int b = 30;
		permut(a,b);
		System.out.println("a = "+a);
		System.out.println("b = "+b);*/
	}

}
