package chapter5.LesClassesAbstraites;

public abstract class Animal { // Animal est un concept abstrait
	
	int age;
	String espece;
	
	public void manger()
	{
		System.out.println("J'ai faim");
	}
	
	public void dormir()
	{
		System.out.println("Il est temps de faire dodo");
	}
	
	public abstract void seDeplacer();
	


}
