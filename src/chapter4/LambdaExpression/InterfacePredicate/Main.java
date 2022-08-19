package chapter4.LambdaExpression.InterfacePredicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Main {

	public static void main(String[] args) {
		
		Predicate<String>p = (String ch)->{return ch.contains("i");};
		
		ArrayList<String> names = new ArrayList<>();
		names.add("Toto");
		names.add("Amine");
		names.add("Eric");
		names.add("Hugo");
		names.add("Pi�ce");
		System.out.println(names);
		//D�velopper un exerice pour supprimer les noms qui continennent la lettre "i"
		names.removeIf(p);
		System.out.println(names);

	}

}
