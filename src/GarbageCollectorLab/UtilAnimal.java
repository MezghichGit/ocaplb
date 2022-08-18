package GarbageCollectorLab;

public class UtilAnimal {

	public static final void main(String ... args) {
		Animal a1 = new Animal();
		Animal a2 = new Animal();
		Animal a3 = new Animal();
		
		a1 = a3;
		a2 = null;
		System.gc(); // appel vers le garbage collector
		for(int i=0; i<1000; i++)
		{
			System.out.println("i = "+i);
		}
		System.out.println("Fin du programme");
		

	}

}
