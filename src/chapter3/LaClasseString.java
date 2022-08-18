package chapter3;

public class LaClasseString {

	public static void main(String[] args) {
		/*
		String formation = "OCA";  // immutable(on ne peut pas changer le contenu)
		
		//formation = formation.concat("-OCP");
		formation.concat("-OCP");
		System.out.println(formation);
		
		StringBuilder sb = new StringBuilder("OCA");  //mutable(qu'on peut modifier)
		sb.append("-OCP");
		
		System.out.println(sb);
		*/
		/*
		String ch1 = "oca";
		String ch2 = new String("oca");
		String ch3 = "oca";
		
		System.out.println(ch1==ch2); // == comparer les adresses
		System.out.println(ch1==ch3);  
		
		System.out.println(ch1.equals(ch2));  // equals : comparer le contenu
		System.out.println(ch1.equals(ch3));*/
		
		String ch1 = "OCA"+6+4;
		System.out.println(ch1);
		
		String ch2 = 6+4+"OCA";  //10+"OCA"
		System.out.println(ch2);
		
		String ch3 = 6+4+"OCA"+3+9;
		System.out.println(ch3);
		String ch = true+"oca";
		System.out.println(ch);

	}

}
