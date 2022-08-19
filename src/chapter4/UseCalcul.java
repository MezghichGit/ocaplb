package chapter4;

// import régulier
//import chapter4.ImportStatique.Calcul;


//import static
/*
import static chapter4.ImportStatique.Calcul.racine;
import static chapter4.ImportStatique.Calcul.PI;*/

import static chapter4.ImportStatique.Calcul.*;
public class UseCalcul {

	public static void main(String[] args) {
		double v = 9;
		double aire = PI*10;
		double res = racine(v);
		
		System.out.println(res);
		System.out.println(aire);

	}

}
