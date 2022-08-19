package chapter4.LambdaExpression;

public class App {

	public static void main(String[] args) {
		//Prediction p1 = (String ch)->{return ch.length()>6;};
		
		
		Prediction p1 = ch->ch.length()>6;  // expression lambda réduite
		
		
		System.out.println(p1.test("OCA"));
		System.out.println(p1.test("OCA-OCP"));

	}

}
