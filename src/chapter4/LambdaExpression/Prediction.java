package chapter4.LambdaExpression;

@FunctionalInterface
public abstract interface Prediction {
	
	public abstract boolean test(String s);  //une m�thode abstaite
	
	public default void info() {}   // m�thode concr�te
	
	public static void information() {}   // m�thode concr�te

}
