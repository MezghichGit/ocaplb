package chapter6;

public class LesExceptions {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 0;
		
		
		
		//Exception Arithmetique
		//System.out.println("x/y = "+ (x/y));
		
		//
		
		// java.lang.ArrayIndexOutOfBoundsException
		int []tab = {10,20,30};
		try {
		System.out.println(tab[3]);
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			//System.out.println("Attention � l'indice du tableau...");
			System.out.println("Probl�me : "+ex.getMessage());
			//ex.printStackTrace();
			return;
		}
		
		
		catch(NullPointerException ex)
		{
			System.out.println("Null Pointer Exception..."+ ex.getMessage());
		}
		
		catch(Exception ex)
		{
			System.out.println("Oups un probl�me...");
		}
		
		
		
		/*
		String nom=null;
		try {
			System.out.println(nom.length());
		}
		catch(NullPointerException ex)
		{
			System.out.println("Oups un probl�me...");
		}
		*/
		finally { // �a peut un bloc ou on lib�re les ressources.
		System.out.println("Suite du programme...");
		}
	}

}
