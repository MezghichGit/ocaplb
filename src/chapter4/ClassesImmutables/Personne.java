package chapter4.ClassesImmutables;

import java.util.ArrayList;

public final class Personne extends Object{
	
	private final int age;
	private final String nom;
	private final ArrayList<String> foods;  //type reference mutable
	public Personne(int age, String nom, ArrayList<String>repas)
	{
		this.age = age;
		this.nom = nom;
		//this.foods = repas;
		this.foods = new ArrayList(repas);
	}
	@Override
	public String toString() {
		return "Personne [age=" + age + ", nom=" + nom + ", foods=" + foods + "]";
	}
	public ArrayList<String> getFoods() {
		return new ArrayList(foods);
	}
	public int getAge() {
		return age;
	}
	public String getNom() {
		return nom;
	}
	
	
	

}
