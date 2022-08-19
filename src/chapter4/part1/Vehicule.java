package chapter4.part1;

public interface Vehicule {
	
	public void information();  // méthode abstraite
	
	default public void info() {
		
	}
	
	static public void info2() {
		
	}

}
