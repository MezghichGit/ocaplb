package chapter4.part2;

import chapter4.part1.Animal;

public class Oiseau extends Animal{
	
	public void descriptionOiseau() {
		System.out.println(this.nom);
	}
	
	public static void main(String[] args) {
		Oiseau o = new Oiseau();
		System.out.println(o.nom);
	}

}
