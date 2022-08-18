package chapter3;

public class LaClasseStringBuilder {

	public static void main(String[] args) {
		/*
		StringBuilder sb = new StringBuilder();
		sb.append("ocaocpocaocpoca#pocaocpocaocpoca#pzrt");
		System.out.println(sb.capacity());
		System.out.println(sb.length());*/
		
		String formation = "OCA";
		StringBuilder sb = new StringBuilder(formation);
		//ensemble d'instructions...
		sb.append("-OCP");
		formation = sb.toString();

	}

}
