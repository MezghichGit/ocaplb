package chapter3;

public class VarArgs {

	public static void somme(int x, int ...t)
	{
		//System.out.println(t.length);
		int res = 0;
		
		for(int i=0; i<t.length; i++)
		{
			res = res + t[i];
		}
		System.out.println("La somme = "+res);
	}
	public static void main(String[] args) {
		//somme();
		somme(10);
		somme(10,1,4,20);

	}

}
