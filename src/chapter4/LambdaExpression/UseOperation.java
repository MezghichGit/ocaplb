package chapter4.LambdaExpression;

public class UseOperation {

	public static void main(String[] args) {
		
		//Operation opSomme = (double x, double y)->{return x+y;};   //expression lambda �tendu
		
		Operation opSomme = (x,y)-> x+y;  //expression lambda r�duite
		
		Operation opProduit= (double x, double y)->{return x*y;};
		
		System.out.println(opSomme.calcul(10, 2));
		System.out.println(opProduit.calcul(10, 2));

	}

}
