package chapter2;

public class ReglesPromotion {
	
	public static void getObject(Object o)
	{
		
	}

	public static void main(String[] args) {
		/*
		byte x = 10;
		byte y = 20;
		int z = x+y;
		
		short x1 = 1;
		short y2 = 3;
		int z2 = x1+y2;*/
		/*short x = 10;
		short y = 3;
		double z = x/y;    
		
		System.out.println("z = "+z);*/
		/*System.out.println(Short.MAX_VALUE);
		                 //32767
		short y = (short)1921222;
		System.out.println("y = "+y);*/
		
		//byte y = (byte)130;
		//System.out.println("y = "+y);
		//short y = (short)1921222;
		/*
		short x = 30000;
		short y = 3;
		short z = (short)(x * y);
		System.out.println("z = "+z);*/
		
		//int x, z = 3;
		//x = z;
		/*int k;
		System.out.println(k);*/
		
		//x *= z;  // x = x*z
		/*
		long x = 10;
		int y = 5;
		//y = (int)(y * x); 
		y*=x;*/
		
		Oiseau o = new Oiseau();
		Canari c = new Canari();
		boolean res = o instanceof Oiseau;  // res = 
		System.out.println("res = "+res);
		boolean res2 = o instanceof Canari; // res2 = 
		System.out.println("res2 = "+res2);
		boolean res3 = c instanceof Oiseau; // res3 =
		System.out.println("res3 = "+res3);
 
	}

}
