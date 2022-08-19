package chapter5.LesClassesAbstraites;

public class App {
	
	public static void infoAnimal(Animal a) //Polymorphisme générique(méthode polymorphe)
	{
		a.seDeplacer();
	}

	public static void main(String[] args) {
		
		Animal tab[] = new Animal[4];  // Polymorphisme générique(structure polymorphe)
		
		tab[0] = new Oiseau();
		tab[1] = new Poisson();
		tab[2] = new Serpent();
		tab[3] = new Chien();
		
		for(Animal a : tab)
		{
			a.seDeplacer();
		}
		
		
		 infoAnimal(new Oiseau());
		 
		 infoAnimal(new Chien());

	}

}
