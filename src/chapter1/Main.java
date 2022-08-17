package chapter1;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		/*
		 * System.out.println(Personne.maxAge); // invoquer la classe => création des
		 * varaiables static Personne p = new Personne(); Produit pr = new Produit();
		 * System.out.println(pr.libelle);
		 * 
		 * int _ =10; System.out.println(_); int $ = 20; System.out.println($); int k20
		 * = 30;
		 */

		String formation = "Java 8";
		System.out.println(formation.length()); // méthode
		int tab[] = { 10, 14, 22 };
		System.out.println(tab.length);  //property
		
		ArrayList l = new ArrayList();
		l.add("java8");
		l.add("Spring");
		System.out.println(l.size()); // méthode
	}

}
