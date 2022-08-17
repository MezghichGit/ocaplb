package chapter1;

//import Utilitaire.CalculDiff;
//import Utilitaire.Operation;

import Utilitaire.*;
import Utilitaire.complex.*;
import chapter1.Etudiant; // redondant
public class Calcul {

	public static void main(String[] args) {
		Etudiant e = new Etudiant();
		e=null;
		String ch="formation";
		ProduitPro p = new ProduitPro();
		int a = 10;
		int b = 20;
		CalculDiff d = new CalculDiff();
		
		Operation op = new Operation();
		op.somme(a,b);
		System.out.println("OCA");

	}

}
