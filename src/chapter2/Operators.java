package chapter2;

public class Operators {

	public static void main(String[] args) {
		/*int y = 4;
		int z = 20;
		double x = --z+ (3 + 2) * --y; // 19+3+2*3 ==> 19+3+6 = 28
		
		System.out.println("y = "+y);
		System.out.println("x = "+x);*/
		
		
		
		// pré-increment
		/*int x = 10;
		int y = ++x;
		System.out.println("x = "+x);
		System.out.println("y = "+y);*/
		
		// post-increment
		/*int x = 10;
		int y = x++;
		System.out.println("x = "+x);
		System.out.println("y = "+y);*/
		
		//Exercice 1
		
		int x = 10;
		int y = 20;
		int z = 2*--y +y +3*++x - --y +4*x;
		//int z = 2* 19 + 19 + 3*11 -18 +4 *11
		// int z = 38 + 19 +33-18+44
		System.out.println("x = "+x); // 116
		System.out.println("y = "+y); //18
		System.out.println("z = "+z); //11

	}

}
