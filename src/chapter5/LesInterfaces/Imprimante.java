package chapter5.LesInterfaces;

public interface Imprimante {
	
	public void imprimer();
    public default void info() {
    	System.out.println("J'imprime");
    }

}
