package chapter5.Overriding;

public class App  {

	public static void main(String[] args) throws Exception {
		Animal a = new Animal();
		a.info();
		
		Oiseau o = new Oiseau();
		o.info();
		
		Animal a1 = new Oiseau();  // UpCasting  OK
		a1.info();  // a1 va r�cup�rer la version de la m�thode info de l'objet Oiseau
	}

}
