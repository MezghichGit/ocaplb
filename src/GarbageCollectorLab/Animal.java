package GarbageCollectorLab;

public class Animal {
	 int age;  // attribut d'instance
	 static int nbr; // attribut de classe
	 Animal() {}
	
	public Animal(int age) {}

	public void finalize()
	{
		System.out.println("Desctruction dun objet Animal");
	}
	
	public static void info()
	{
		//Animal a = new Animal();
		//System.out.println(a.age);
		//System.out.println(age);
	}
}
