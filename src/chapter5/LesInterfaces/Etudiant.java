package chapter5.LesInterfaces;

public interface Etudiant {
	
	public void getNumInscripion();
	public double getMoyenne();
	
	public default void info() {
		System.out.println("Je suis un �tudiant");
	}
	
	public static void information() {
		System.out.println("Je suis un �tudiant");
	}

}
