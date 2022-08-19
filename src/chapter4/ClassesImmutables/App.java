package chapter4.ClassesImmutables;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		//List<String> myFoods = Arrays.asList("Fish","Escalope","Pizza");
		ArrayList myFoods = new ArrayList();
		myFoods.add("Fish");
		myFoods.add("Escalope");
		myFoods.add("Pizza");
		Personne p = new Personne(20,"Amine",myFoods);
		System.out.println(p);
		myFoods.clear();
		System.out.println(p);
		
		/*
		System.out.println(p);
		myFoods = p.getFoods();
		myFoods.clear();
		System.out.println(p);*/
		//System.out.println(p.toString());

	}

}
