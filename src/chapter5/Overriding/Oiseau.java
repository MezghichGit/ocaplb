package chapter5.Overriding;

import java.io.IOException;

public class Oiseau extends Animal{

	@Override  // bonne ptratique
	public Oiseau info() throws IOException{
		System.out.println("Oiseau");
		//return new Animal();
		return new Oiseau();
	}
}
