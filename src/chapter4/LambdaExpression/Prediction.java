package chapter4.LambdaExpression;

@FunctionalInterface
public abstract interface Prediction {
	
	public abstract boolean test(String s);  //une méthode abstaite
	
	public default void info() {}   // méthode concrête
	
	public static void information() {}   // méthode concrête

}
