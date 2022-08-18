package chapter2;

import java.util.ArrayList;

enum Saison{
	ETE,HIVER,PRINTEMPS,AUTOMNE
}

public class LesStatements {

	public static void main(String[] args) {
		//int x = 5;
		
		/*if(x = 6)
		{}*/
		//int y = 10;
		//System.out.println((y > 5) ? 21 : "Zebra");
		//int animal = (y < 91) ? 9 : "Horse"; // DOES NOT COMPILE
		/*
		ArrayList<Integer> la = new ArrayList();
		la.add(12);
		la.add(true);
		la.add(15.5);
		la.add("Bonjour");
		System.out.println(la);*/
		int mois = 15;
		final int x = 12;  // final = constante
		//x = 14;
		switch(mois)
		{
		
		case 1 : System.out.println("Janvier"); break;
		case 2 : System.out.println("Février"); break;
		case 10 : System.out.println("Octobre"); break;
		case x : System.out.println("Décembre"); break;
		default : System.out.println("Mois invalide");
		}
		
		System.out.println("Suite du programme...");
		
		String jour="Lundi";
		
		switch(jour)
		{
		
		case "Dimanche" : System.out.println("Tu dois te reposer"); break;
		case "Lundi" : System.out.println("Tu doit travailler"); break;
		case "Mercredi" : System.out.println("Fais du Sport"); break;
		case "Samedi" : System.out.println("Ménage"); break;
		default : System.out.println("Voyage");
		}
		
		Saison period = Saison.HIVER;
		switch(period)
		{
		case ETE : System.out.println("Vaccances");break;
		case HIVER: case AUTOMNE  : System.out.println("Travail");break;
		default : System.out.println("I dont know");
		}

	}

}
