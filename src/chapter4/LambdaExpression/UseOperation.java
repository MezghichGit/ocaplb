package chapter4.LambdaExpression;

public class UseOperation {

	public static void main(String[] args) {
		
		//Operation opSomme = (double x, double y)->{return x+y;};   //expression lambda étendu
		
		Operation opSomme = (x,y)-> x+y;  //expression lambda réduite
		
		Operation opProduit= (double x, double y)->{return x*y;};
		
		System.out.println(opSomme.calcul(10, 2));
		System.out.println(opProduit.calcul(10, 2));

	}

}
