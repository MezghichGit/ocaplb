package chapter2;

public class LesBoucles {

	
	public static void main(String[] args) {
		
		for(int i = 0; i<10; i++)
		{
			System.out.println("i = "+i);
		}
		
		String names[]= {"Eric","Amine","R�mi","Hamza","Hugo"};
		//M�thode 1 : Loop classique
		/*for(int i=0; i<names.length; i++)
		{
			System.out.println(names[i]);
		}*/
		
		//M�thode 2 : Loop enhanced
		for(String name : names)
		{
		   System.out.println(name);
		}
	}
}
