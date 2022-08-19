package chapter5.LesInterfaces;

public interface Scanner {

	
	public void scan();
    public default void info() {
    	System.out.println("Je scan");
    }

}
