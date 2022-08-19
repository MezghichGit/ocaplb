package chapter5.Overriding;

public class Animal {

	protected Animal info() throws Exception {
		System.out.println("Animal");
		return new Animal();
	}
}
