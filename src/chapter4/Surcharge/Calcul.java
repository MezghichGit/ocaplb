package chapter4.Surcharge;

public class Calcul {
	
	//La surcharge de m�thode
	
	public static void somme(int x, int y)
	{
		System.out.println("int x, int y");
	}
	public static void somme(short x, short y)
	{
		System.out.println("short x, short y");
	}
	public static void somme(double x, double y)
	{
		System.out.println("double x, double y");
	}
	public static void somme(Integer x, Integer y)
	{
		System.out.println("Integer x, Integer y");
	}
	public static void somme(int ...x)
	{
		System.out.println("int ...x");
	}

	public static void main(String[] args) {
		somme(10,20);
	}

}
